/*
 * Copyright 2017 California Institute of Technology ("Caltech").
 * U.S. Government sponsorship acknowledged.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * License Terms
 */
package gov.nasa.jpl.imce.oml.dsl.scoping

import com.google.common.base.Function
import com.google.common.collect.Lists
import com.google.common.collect.Sets
import com.google.inject.Inject
import gov.nasa.jpl.imce.oml.model.bundles.Bundle
import gov.nasa.jpl.imce.oml.model.bundles.BundledTerminologyAxiom
import gov.nasa.jpl.imce.oml.model.common.AnnotationPropertyValue
import gov.nasa.jpl.imce.oml.model.common.Extent
import gov.nasa.jpl.imce.oml.model.common.Resource
import gov.nasa.jpl.imce.oml.model.descriptions.DescriptionBox
import gov.nasa.jpl.imce.oml.model.extensions.OMLExtensions
import gov.nasa.jpl.imce.oml.model.graphs.ConceptDesignationTerminologyAxiom
import gov.nasa.jpl.imce.oml.model.terminologies.TerminologyBox
import java.util.ArrayList
import java.util.Set
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.SimpleScope
import gov.nasa.jpl.imce.oml.model.common.LogicalElement

class OMLScopeExtensions {
	
	@Inject extension OMLExtensions
	
	@Inject IQualifiedNameConverter qnc
	
	/*
	 * The syntax of Annotation involves "@<annotation property abbrev IRI> = <annotation value>".
	 * Therefore, construct the resolvable scope of AnnotationProperties
	 * in terms of the abbrevIRI of each AnnotationProperty accessible from all imported modules.
	 * 
	 * This scope computation accounts for possible parsing errors resulting in EFeature values being null.
	 */
	def scope_Annotation_property(AnnotationPropertyValue annotation, EReference eRef) {
		val extents =
			annotation.subject?. // may be null!
			moduleContext?. // may be null!
			allImportedModules?. // may be null!
			map[extent]?. // may be null!
			filterNull // remove nulls!
		val annoationProperties = extents.map[annotationProperties]?. // may be null!
			flatten?. // may be null!
			filterNull // remove nulls!
		Scopes.scopeFor(annoationProperties, [qnc.toQualifiedName(it.abbrevIRI)], IScope.NULLSCOPE)
	}
	
	def scope_BundledTerminologyAxiom_bundledTerminology(BundledTerminologyAxiom context) {
		val exts = context.eResource.resourceSet.resources.map[contents.filter(Extent)].flatten
		val tboxes = exts.map[terminologyGraphs + bundles].flatten
		Scopes.scopeFor(
			tboxes,
			[ qnc.toQualifiedName(it.nsPrefix) ],
			IScope.NULLSCOPE)	
	}
	
	def scope_ConceptDesignationTerminologyAxiom_designatedTerminology(ConceptDesignationTerminologyAxiom context) {
		val exts = context.eResource.resourceSet.resources.map[contents.filter(Extent)].flatten
		val tboxes = exts.map[terminologyGraphs + bundles].flatten
		Scopes.scopeFor(
			tboxes,
			[ qnc.toQualifiedName(it.nsPrefix) ],
			IScope.NULLSCOPE)	
	}
	
	def scope_ConceptDesignationTerminologyAxiom_designatedConcept(ConceptDesignationTerminologyAxiom context) {
		context.designatedTerminology.allConceptsScope
	}
	
	def IScope allTerminologies(TerminologyBox context) {
		val exts = context.eResource.resourceSet.resources.map[contents.filter(Extent)].flatten
		val tboxes = exts.map[terminologyGraphs + bundles].flatten
		Scopes.scopeFor(
			tboxes,
			[qnc.toQualifiedName(it.nsPrefix) ], 
			IScope.NULLSCOPE)
	}
	
	def IScope allTerminologies(DescriptionBox context) {
		val exts = context.eResource.resourceSet.resources.map[contents.filter(Extent)].flatten
		val tboxes = exts.map[terminologyGraphs + bundles].flatten
		Scopes.scopeFor(
			tboxes,
			[qnc.toQualifiedName(it.nsPrefix) ], 
			IScope.NULLSCOPE)
	}
	
	def IScope allDescriptions(DescriptionBox context) {
		val exts = context.eResource.resourceSet.resources.map[contents.filter(Extent)].flatten
		val tboxes = exts.map[descriptions].flatten
		Scopes.scopeFor(
			tboxes,
			[qnc.toQualifiedName(it.nsPrefix) ], 
			IScope.NULLSCOPE)
	}
	// =================================================
	
	/*
	 * Computes an IScope for 
	 */
	def <T extends LogicalElement> IScope terminologyScope(
		TerminologyBox tbox,
		Function<TerminologyBox, Iterable<T>> localScopeFunction,
		Function<Pair<TerminologyBox, T>, QualifiedName> nameFunction
	) {
		val ArrayList<IEObjectDescription> result = Lists.newArrayList()
		result.addAll(Scopes.scopedElementsFor(localScopeFunction.apply(tbox)))
		result.addAll(OMLExtensions.allImportedTerminologies(tbox).map[importedTbox|
			Scopes.scopedElementsFor(
				localScopeFunction.apply(importedTbox), 
				[importedThing| nameFunction.apply(Pair.of(importedTbox, importedThing)) ]
			)
		].flatten)
		new SimpleScope(result)
	}
	
	def <T extends Resource> QualifiedName importedResourceNameFunction(Pair<TerminologyBox, T> p) {
		qnc.toQualifiedName(p.key.nsPrefix + ":" + p.value.name())
	}
	
	def <T extends Resource> QualifiedName importedBundleNameFunction(Pair<Bundle, T> p) {
		qnc.toQualifiedName(p.key.nsPrefix + ":" + p.value.name())
	}
	
	def <T extends Resource> QualifiedName importedDescriptionNameFunction(Pair<DescriptionBox, T> p) {
		qnc.toQualifiedName(p.key.nsPrefix + ":" + p.value.name())
	}
	
	def IScope allEntitiesScope(TerminologyBox tbox) {
		terminologyScope(tbox, [localEntities], [importedResourceNameFunction])
	}
	
	def IScope allRangesScope(TerminologyBox tbox) {
		terminologyScope(tbox, [localRanges], [importedResourceNameFunction])
	}
	
	def IScope allStructuresScope(TerminologyBox tbox) {
		terminologyScope(tbox, [localStructures], [importedResourceNameFunction])
	}
	
	def IScope allAspectsScope(TerminologyBox tbox) {
		terminologyScope(tbox, [localAspects], [importedResourceNameFunction])
	}
	
	def IScope allConceptsScope(TerminologyBox tbox) {
		terminologyScope(tbox, [localConcepts], [importedResourceNameFunction])
	}
	
	def IScope allReifiedRelationshipsScope(TerminologyBox tbox) {
		terminologyScope(tbox, [localReifiedRelationships], [importedResourceNameFunction])
	}
	
	def IScope allUnreifiedRelationshipsScope(TerminologyBox tbox) {
		terminologyScope(tbox, [localUnreifiedRelationships], [importedResourceNameFunction])
	}
	
	def IScope allEntityRelationshipsScope(TerminologyBox tbox) {
		terminologyScope(tbox, [localEntityRelationships], [importedResourceNameFunction])
	}
	
	def IScope allEntityScalarDataPropertiesScope(TerminologyBox tbox) {
		terminologyScope(tbox, [localEntityScalarDataProperties], [importedResourceNameFunction])
	}
	
	def IScope allEntityStructuredDataPropertiesScope(TerminologyBox tbox) {
		terminologyScope(tbox, [localEntityStructuredDataProperties], [importedResourceNameFunction])
	}
	
	def IScope allScalarDataPropertiesScope(TerminologyBox tbox) {
		terminologyScope(tbox, [localScalarDataProperties], [importedResourceNameFunction])
	}
	
	def IScope allStructuredDataPropertiesScope(TerminologyBox tbox) {
		terminologyScope(tbox, [localStructuredDataProperties], [importedResourceNameFunction])
	}
	
	def IScope allScalarOneOfRestrictionsScope(TerminologyBox tbox) {
		terminologyScope(tbox, [localScalarOneOfRestrictions], [importedResourceNameFunction])
	}
	
	def <T extends LogicalElement> IScope bundleScope(
		Bundle bundle,
		Function<TerminologyBox, Iterable<T>> localScopeFunction,
		Function<Pair<TerminologyBox, T>, QualifiedName> nameFunction
	) {
		val ArrayList<IEObjectDescription> result = Lists.newArrayList()
		val Set<Bundle> allBundles = Sets.newHashSet()
		allBundles.add(bundle)
		allBundles.addAll(bundle.allImportedBundles)
		
		val Set<TerminologyBox> allTBoxes = Sets.newHashSet()
		allTBoxes.addAll(allBundles)
		allTBoxes.addAll(allBundles.map[b|OMLExtensions.allImportedTerminologies(b)].flatten)
		result.addAll(allTBoxes.map[tbox|
			Scopes.scopedElementsFor(
				localScopeFunction.apply(tbox), 
				[e| nameFunction.apply(Pair.of(tbox, e)) ]
			)
		].flatten)
		new SimpleScope(result)
	}
	
	def IScope allConceptsScope(Bundle b) {
		bundleScope(b, [localConcepts], [importedResourceNameFunction])
	}
	
	// =================================================
	
	def <T extends LogicalElement> IScope descriptionScope(
		DescriptionBox dbox,
		Function<DescriptionBox, Iterable<T>> localScopeFunction,
		Function<Pair<DescriptionBox, T>, QualifiedName> nameFunction
	) {
		val ArrayList<IEObjectDescription> result = Lists.newArrayList()
		result.addAll(Scopes.scopedElementsFor(localScopeFunction.apply(dbox)))
		result.addAll(dbox.allImportedDescriptions.map[importedDbox|
			Scopes.scopedElementsFor(
				localScopeFunction.apply(importedDbox), 
				[importedThing| nameFunction.apply(Pair.of(importedDbox, importedThing)) ]
			)
		].flatten)
		new SimpleScope(result)
	}
	
	def IScope allConceptualEntitySingletonInstanceScope(DescriptionBox dbox) {
		descriptionScope(dbox, [localConceptualEntitySingletonInstances], [importedDescriptionNameFunction])
	}
	
	def IScope allReifiedRelationshipInstancesScope(DescriptionBox dbox) {
		descriptionScope(dbox, [localReifiedRelationshipInstances], [importedDescriptionNameFunction])
	}
	
	def IScope allEntityStructuredDataPropertiesScope(DescriptionBox dbox) {
		val tboxes = dbox.allImportedTerminologiesFromDescription()
		
		val ArrayList<IEObjectDescription> result = Lists.newArrayList()
		val inc = tboxes.map [ tbox |
			Scopes.scopedElementsFor(
				tbox.localEntityStructuredDataProperties,
				[importedThing|importedResourceNameFunction(Pair.of(tbox, importedThing))]
			)
		].flatten
		result.addAll(inc)
		new SimpleScope(result)
	}
	
	def IScope allEntityScalarDataPropertiesScope(DescriptionBox dbox) {
		val tboxes = dbox.allImportedTerminologiesFromDescription()
		
		val ArrayList<IEObjectDescription> result = Lists.newArrayList()
		val inc = tboxes.map [ tbox |
			Scopes.scopedElementsFor(
				tbox.localEntityScalarDataProperties,
				[importedThing|importedResourceNameFunction(Pair.of(tbox, importedThing))]
			)
		].flatten
		result.addAll(inc)
		new SimpleScope(result)
	}
	
	def IScope allStructuredDataPropertiesScope(DescriptionBox dbox) {
		val tboxes = dbox.allImportedTerminologiesFromDescription()
		
		val ArrayList<IEObjectDescription> result = Lists.newArrayList()
		val inc = tboxes.map [ tbox |
			Scopes.scopedElementsFor(
				tbox.localStructuredDataProperties,
				[importedThing|importedResourceNameFunction(Pair.of(tbox, importedThing))]
			)
		].flatten
		result.addAll(inc)
		new SimpleScope(result)
	}
	
	def IScope allScalarDataPropertiesScope(DescriptionBox dbox) {
		val tboxes = dbox.allImportedTerminologiesFromDescription()
		
		val ArrayList<IEObjectDescription> result = Lists.newArrayList()
		val inc = tboxes.map [ tbox |
			Scopes.scopedElementsFor(
				tbox.localScalarDataProperties,
				[importedThing|importedResourceNameFunction(Pair.of(tbox, importedThing))]
			)
		].flatten
		result.addAll(inc)
		new SimpleScope(result)
	}
	
	def IScope allConceptsScope(DescriptionBox dbox) {
		val tboxes = dbox.allImportedTerminologiesFromDescription()
		
		val ArrayList<IEObjectDescription> result = Lists.newArrayList()
		val inc = tboxes.map [ tbox |
			Scopes.scopedElementsFor(
				tbox.localConcepts,
				[importedThing|importedResourceNameFunction(Pair.of(tbox, importedThing))]
			)
		].flatten
		result.addAll(inc)
		new SimpleScope(result)
	}
	
	def IScope allReifiedRelationshipScope(DescriptionBox dbox) {
		val tboxes = dbox.allImportedTerminologiesFromDescription()
		
		val ArrayList<IEObjectDescription> result = Lists.newArrayList()
		val inc = tboxes.map [ tbox |
			Scopes.scopedElementsFor(
				tbox.localReifiedRelationships,
				[importedThing|importedResourceNameFunction(Pair.of(tbox, importedThing))]
			)
		].flatten
		result.addAll(inc)
		new SimpleScope(result)
	}
	
	def IScope allUnreifiedRelationshipScope(DescriptionBox dbox) {
		val tboxes = dbox.allImportedTerminologiesFromDescription()
		
		val ArrayList<IEObjectDescription> result = Lists.newArrayList()
		val inc = tboxes.map [ tbox |
			Scopes.scopedElementsFor(
				tbox.localUnreifiedRelationships,
				[importedThing|importedResourceNameFunction(Pair.of(tbox, importedThing))]
			)
		].flatten
		result.addAll(inc)
		new SimpleScope(result)
	}
}