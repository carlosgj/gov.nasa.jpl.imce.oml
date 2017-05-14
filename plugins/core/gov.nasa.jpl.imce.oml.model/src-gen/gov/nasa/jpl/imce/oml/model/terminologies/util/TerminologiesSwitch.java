/**
 * 
 * Copyright 2016 California Institute of Technology ("Caltech").
 * U.S. Government sponsorship acknowledged.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package gov.nasa.jpl.imce.oml.model.terminologies.util;

import gov.nasa.jpl.imce.oml.model.common.Element;
import gov.nasa.jpl.imce.oml.model.common.Module;
import gov.nasa.jpl.imce.oml.model.common.ModuleEdge;
import gov.nasa.jpl.imce.oml.model.common.ModuleElement;
import gov.nasa.jpl.imce.oml.model.common.Resource;

import gov.nasa.jpl.imce.oml.model.terminologies.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gov.nasa.jpl.imce.oml.model.terminologies.TerminologiesPackage
 * @generated
 */
public class TerminologiesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TerminologiesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologiesSwitch() {
		if (modelPackage == null) {
			modelPackage = TerminologiesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TerminologiesPackage.TERMINOLOGY_BOX: {
				TerminologyBox terminologyBox = (TerminologyBox)theEObject;
				T result = caseTerminologyBox(terminologyBox);
				if (result == null) result = caseModule(terminologyBox);
				if (result == null) result = caseElement(terminologyBox);
				if (result == null) result = caseResource(terminologyBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.TERMINOLOGY_BOX_STATEMENT: {
				TerminologyBoxStatement terminologyBoxStatement = (TerminologyBoxStatement)theEObject;
				T result = caseTerminologyBoxStatement(terminologyBoxStatement);
				if (result == null) result = caseModuleElement(terminologyBoxStatement);
				if (result == null) result = caseElement(terminologyBoxStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.TERMINOLOGY_AXIOM: {
				TerminologyAxiom terminologyAxiom = (TerminologyAxiom)theEObject;
				T result = caseTerminologyAxiom(terminologyAxiom);
				if (result == null) result = caseModuleEdge(terminologyAxiom);
				if (result == null) result = caseElement(terminologyAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.TERMINOLOGY_BOX_AXIOM: {
				TerminologyBoxAxiom terminologyBoxAxiom = (TerminologyBoxAxiom)theEObject;
				T result = caseTerminologyBoxAxiom(terminologyBoxAxiom);
				if (result == null) result = caseTerminologyAxiom(terminologyBoxAxiom);
				if (result == null) result = caseModuleEdge(terminologyBoxAxiom);
				if (result == null) result = caseElement(terminologyBoxAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.TERMINOLOGY_EXTENSION_AXIOM: {
				TerminologyExtensionAxiom terminologyExtensionAxiom = (TerminologyExtensionAxiom)theEObject;
				T result = caseTerminologyExtensionAxiom(terminologyExtensionAxiom);
				if (result == null) result = caseTerminologyBoxAxiom(terminologyExtensionAxiom);
				if (result == null) result = caseTerminologyAxiom(terminologyExtensionAxiom);
				if (result == null) result = caseModuleEdge(terminologyExtensionAxiom);
				if (result == null) result = caseElement(terminologyExtensionAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.TERM: {
				Term term = (Term)theEObject;
				T result = caseTerm(term);
				if (result == null) result = caseTerminologyBoxStatement(term);
				if (result == null) result = caseResource(term);
				if (result == null) result = caseModuleElement(term);
				if (result == null) result = caseElement(term);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.UNARY_TERM_KIND: {
				UnaryTermKind unaryTermKind = (UnaryTermKind)theEObject;
				T result = caseUnaryTermKind(unaryTermKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.DIRECTED_BINARY_RELATIONSHIP_KIND: {
				DirectedBinaryRelationshipKind directedBinaryRelationshipKind = (DirectedBinaryRelationshipKind)theEObject;
				T result = caseDirectedBinaryRelationshipKind(directedBinaryRelationshipKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseTerm(entity);
				if (result == null) result = caseTerminologyBoxStatement(entity);
				if (result == null) result = caseResource(entity);
				if (result == null) result = caseModuleElement(entity);
				if (result == null) result = caseElement(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.CONCEPTUAL_ENTITY: {
				ConceptualEntity conceptualEntity = (ConceptualEntity)theEObject;
				T result = caseConceptualEntity(conceptualEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.ASPECT: {
				Aspect aspect = (Aspect)theEObject;
				T result = caseAspect(aspect);
				if (result == null) result = caseEntity(aspect);
				if (result == null) result = caseUnaryTermKind(aspect);
				if (result == null) result = caseTerm(aspect);
				if (result == null) result = caseTerminologyBoxStatement(aspect);
				if (result == null) result = caseResource(aspect);
				if (result == null) result = caseModuleElement(aspect);
				if (result == null) result = caseElement(aspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.CONCEPT: {
				Concept concept = (Concept)theEObject;
				T result = caseConcept(concept);
				if (result == null) result = caseEntity(concept);
				if (result == null) result = caseConceptualEntity(concept);
				if (result == null) result = caseUnaryTermKind(concept);
				if (result == null) result = caseTerm(concept);
				if (result == null) result = caseTerminologyBoxStatement(concept);
				if (result == null) result = caseResource(concept);
				if (result == null) result = caseModuleElement(concept);
				if (result == null) result = caseElement(concept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.ENTITY_RELATIONSHIP: {
				EntityRelationship entityRelationship = (EntityRelationship)theEObject;
				T result = caseEntityRelationship(entityRelationship);
				if (result == null) result = caseTerm(entityRelationship);
				if (result == null) result = caseDirectedBinaryRelationshipKind(entityRelationship);
				if (result == null) result = caseTerminologyBoxStatement(entityRelationship);
				if (result == null) result = caseResource(entityRelationship);
				if (result == null) result = caseModuleElement(entityRelationship);
				if (result == null) result = caseElement(entityRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.REIFIED_RELATIONSHIP: {
				ReifiedRelationship reifiedRelationship = (ReifiedRelationship)theEObject;
				T result = caseReifiedRelationship(reifiedRelationship);
				if (result == null) result = caseEntityRelationship(reifiedRelationship);
				if (result == null) result = caseEntity(reifiedRelationship);
				if (result == null) result = caseConceptualEntity(reifiedRelationship);
				if (result == null) result = caseTerm(reifiedRelationship);
				if (result == null) result = caseDirectedBinaryRelationshipKind(reifiedRelationship);
				if (result == null) result = caseTerminologyBoxStatement(reifiedRelationship);
				if (result == null) result = caseResource(reifiedRelationship);
				if (result == null) result = caseModuleElement(reifiedRelationship);
				if (result == null) result = caseElement(reifiedRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.UNREIFIED_RELATIONSHIP: {
				UnreifiedRelationship unreifiedRelationship = (UnreifiedRelationship)theEObject;
				T result = caseUnreifiedRelationship(unreifiedRelationship);
				if (result == null) result = caseEntityRelationship(unreifiedRelationship);
				if (result == null) result = caseTerm(unreifiedRelationship);
				if (result == null) result = caseDirectedBinaryRelationshipKind(unreifiedRelationship);
				if (result == null) result = caseTerminologyBoxStatement(unreifiedRelationship);
				if (result == null) result = caseResource(unreifiedRelationship);
				if (result == null) result = caseModuleElement(unreifiedRelationship);
				if (result == null) result = caseElement(unreifiedRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.DATATYPE: {
				Datatype datatype = (Datatype)theEObject;
				T result = caseDatatype(datatype);
				if (result == null) result = caseTerm(datatype);
				if (result == null) result = caseTerminologyBoxStatement(datatype);
				if (result == null) result = caseResource(datatype);
				if (result == null) result = caseModuleElement(datatype);
				if (result == null) result = caseElement(datatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.DATA_RANGE: {
				DataRange dataRange = (DataRange)theEObject;
				T result = caseDataRange(dataRange);
				if (result == null) result = caseDatatype(dataRange);
				if (result == null) result = caseTerm(dataRange);
				if (result == null) result = caseTerminologyBoxStatement(dataRange);
				if (result == null) result = caseResource(dataRange);
				if (result == null) result = caseModuleElement(dataRange);
				if (result == null) result = caseElement(dataRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.SCALAR: {
				Scalar scalar = (Scalar)theEObject;
				T result = caseScalar(scalar);
				if (result == null) result = caseDataRange(scalar);
				if (result == null) result = caseUnaryTermKind(scalar);
				if (result == null) result = caseDatatype(scalar);
				if (result == null) result = caseTerm(scalar);
				if (result == null) result = caseTerminologyBoxStatement(scalar);
				if (result == null) result = caseResource(scalar);
				if (result == null) result = caseModuleElement(scalar);
				if (result == null) result = caseElement(scalar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.DATA_RELATIONSHIP: {
				DataRelationship dataRelationship = (DataRelationship)theEObject;
				T result = caseDataRelationship(dataRelationship);
				if (result == null) result = caseTerm(dataRelationship);
				if (result == null) result = caseDirectedBinaryRelationshipKind(dataRelationship);
				if (result == null) result = caseTerminologyBoxStatement(dataRelationship);
				if (result == null) result = caseResource(dataRelationship);
				if (result == null) result = caseModuleElement(dataRelationship);
				if (result == null) result = caseElement(dataRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.DATA_RELATIONSHIP_DOMAIN: {
				DataRelationshipDomain dataRelationshipDomain = (DataRelationshipDomain)theEObject;
				T result = caseDataRelationshipDomain(dataRelationshipDomain);
				if (result == null) result = caseElement(dataRelationshipDomain);
				if (result == null) result = caseResource(dataRelationshipDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.DATA_RELATIONSHIP_FROM_ENTITY: {
				DataRelationshipFromEntity dataRelationshipFromEntity = (DataRelationshipFromEntity)theEObject;
				T result = caseDataRelationshipFromEntity(dataRelationshipFromEntity);
				if (result == null) result = caseDataRelationshipDomain(dataRelationshipFromEntity);
				if (result == null) result = caseElement(dataRelationshipFromEntity);
				if (result == null) result = caseResource(dataRelationshipFromEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.DATA_RELATIONSHIP_FROM_STRUCTURE: {
				DataRelationshipFromStructure dataRelationshipFromStructure = (DataRelationshipFromStructure)theEObject;
				T result = caseDataRelationshipFromStructure(dataRelationshipFromStructure);
				if (result == null) result = caseDataRelationshipDomain(dataRelationshipFromStructure);
				if (result == null) result = caseElement(dataRelationshipFromStructure);
				if (result == null) result = caseResource(dataRelationshipFromStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.DATA_RELATIONSHIP_RANGE: {
				DataRelationshipRange dataRelationshipRange = (DataRelationshipRange)theEObject;
				T result = caseDataRelationshipRange(dataRelationshipRange);
				if (result == null) result = caseElement(dataRelationshipRange);
				if (result == null) result = caseResource(dataRelationshipRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.DATA_RELATIONSHIP_TO_SCALAR: {
				DataRelationshipToScalar dataRelationshipToScalar = (DataRelationshipToScalar)theEObject;
				T result = caseDataRelationshipToScalar(dataRelationshipToScalar);
				if (result == null) result = caseDataRelationshipRange(dataRelationshipToScalar);
				if (result == null) result = caseElement(dataRelationshipToScalar);
				if (result == null) result = caseResource(dataRelationshipToScalar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.DATA_RELATIONSHIP_TO_STRUCTURE: {
				DataRelationshipToStructure dataRelationshipToStructure = (DataRelationshipToStructure)theEObject;
				T result = caseDataRelationshipToStructure(dataRelationshipToStructure);
				if (result == null) result = caseDataRelationshipRange(dataRelationshipToStructure);
				if (result == null) result = caseElement(dataRelationshipToStructure);
				if (result == null) result = caseResource(dataRelationshipToStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.ENTITY_STRUCTURED_DATA_PROPERTY: {
				EntityStructuredDataProperty entityStructuredDataProperty = (EntityStructuredDataProperty)theEObject;
				T result = caseEntityStructuredDataProperty(entityStructuredDataProperty);
				if (result == null) result = caseDataRelationship(entityStructuredDataProperty);
				if (result == null) result = caseDataRelationshipFromEntity(entityStructuredDataProperty);
				if (result == null) result = caseDataRelationshipToStructure(entityStructuredDataProperty);
				if (result == null) result = caseTerm(entityStructuredDataProperty);
				if (result == null) result = caseDirectedBinaryRelationshipKind(entityStructuredDataProperty);
				if (result == null) result = caseDataRelationshipDomain(entityStructuredDataProperty);
				if (result == null) result = caseDataRelationshipRange(entityStructuredDataProperty);
				if (result == null) result = caseTerminologyBoxStatement(entityStructuredDataProperty);
				if (result == null) result = caseResource(entityStructuredDataProperty);
				if (result == null) result = caseModuleElement(entityStructuredDataProperty);
				if (result == null) result = caseElement(entityStructuredDataProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY: {
				EntityScalarDataProperty entityScalarDataProperty = (EntityScalarDataProperty)theEObject;
				T result = caseEntityScalarDataProperty(entityScalarDataProperty);
				if (result == null) result = caseDataRelationship(entityScalarDataProperty);
				if (result == null) result = caseDataRelationshipFromEntity(entityScalarDataProperty);
				if (result == null) result = caseDataRelationshipToScalar(entityScalarDataProperty);
				if (result == null) result = caseTerm(entityScalarDataProperty);
				if (result == null) result = caseDirectedBinaryRelationshipKind(entityScalarDataProperty);
				if (result == null) result = caseDataRelationshipDomain(entityScalarDataProperty);
				if (result == null) result = caseDataRelationshipRange(entityScalarDataProperty);
				if (result == null) result = caseTerminologyBoxStatement(entityScalarDataProperty);
				if (result == null) result = caseResource(entityScalarDataProperty);
				if (result == null) result = caseModuleElement(entityScalarDataProperty);
				if (result == null) result = caseElement(entityScalarDataProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.STRUCTURED_DATA_PROPERTY: {
				StructuredDataProperty structuredDataProperty = (StructuredDataProperty)theEObject;
				T result = caseStructuredDataProperty(structuredDataProperty);
				if (result == null) result = caseDataRelationship(structuredDataProperty);
				if (result == null) result = caseDataRelationshipFromStructure(structuredDataProperty);
				if (result == null) result = caseDataRelationshipToStructure(structuredDataProperty);
				if (result == null) result = caseTerm(structuredDataProperty);
				if (result == null) result = caseDirectedBinaryRelationshipKind(structuredDataProperty);
				if (result == null) result = caseDataRelationshipDomain(structuredDataProperty);
				if (result == null) result = caseDataRelationshipRange(structuredDataProperty);
				if (result == null) result = caseTerminologyBoxStatement(structuredDataProperty);
				if (result == null) result = caseResource(structuredDataProperty);
				if (result == null) result = caseModuleElement(structuredDataProperty);
				if (result == null) result = caseElement(structuredDataProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.SCALAR_DATA_PROPERTY: {
				ScalarDataProperty scalarDataProperty = (ScalarDataProperty)theEObject;
				T result = caseScalarDataProperty(scalarDataProperty);
				if (result == null) result = caseDataRelationship(scalarDataProperty);
				if (result == null) result = caseDataRelationshipFromStructure(scalarDataProperty);
				if (result == null) result = caseDataRelationshipToScalar(scalarDataProperty);
				if (result == null) result = caseTerm(scalarDataProperty);
				if (result == null) result = caseDirectedBinaryRelationshipKind(scalarDataProperty);
				if (result == null) result = caseDataRelationshipDomain(scalarDataProperty);
				if (result == null) result = caseDataRelationshipRange(scalarDataProperty);
				if (result == null) result = caseTerminologyBoxStatement(scalarDataProperty);
				if (result == null) result = caseResource(scalarDataProperty);
				if (result == null) result = caseModuleElement(scalarDataProperty);
				if (result == null) result = caseElement(scalarDataProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.STRUCTURE: {
				Structure structure = (Structure)theEObject;
				T result = caseStructure(structure);
				if (result == null) result = caseDatatype(structure);
				if (result == null) result = caseUnaryTermKind(structure);
				if (result == null) result = caseTerm(structure);
				if (result == null) result = caseTerminologyBoxStatement(structure);
				if (result == null) result = caseResource(structure);
				if (result == null) result = caseModuleElement(structure);
				if (result == null) result = caseElement(structure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.TERM_AXIOM: {
				TermAxiom termAxiom = (TermAxiom)theEObject;
				T result = caseTermAxiom(termAxiom);
				if (result == null) result = caseTerminologyBoxStatement(termAxiom);
				if (result == null) result = caseModuleElement(termAxiom);
				if (result == null) result = caseElement(termAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.ENTITY_RESTRICTION_AXIOM: {
				EntityRestrictionAxiom entityRestrictionAxiom = (EntityRestrictionAxiom)theEObject;
				T result = caseEntityRestrictionAxiom(entityRestrictionAxiom);
				if (result == null) result = caseTermAxiom(entityRestrictionAxiom);
				if (result == null) result = caseTerminologyBoxStatement(entityRestrictionAxiom);
				if (result == null) result = caseModuleElement(entityRestrictionAxiom);
				if (result == null) result = caseElement(entityRestrictionAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.ENTITY_EXISTENTIAL_RESTRICTION_AXIOM: {
				EntityExistentialRestrictionAxiom entityExistentialRestrictionAxiom = (EntityExistentialRestrictionAxiom)theEObject;
				T result = caseEntityExistentialRestrictionAxiom(entityExistentialRestrictionAxiom);
				if (result == null) result = caseEntityRestrictionAxiom(entityExistentialRestrictionAxiom);
				if (result == null) result = caseTermAxiom(entityExistentialRestrictionAxiom);
				if (result == null) result = caseTerminologyBoxStatement(entityExistentialRestrictionAxiom);
				if (result == null) result = caseModuleElement(entityExistentialRestrictionAxiom);
				if (result == null) result = caseElement(entityExistentialRestrictionAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.ENTITY_UNIVERSAL_RESTRICTION_AXIOM: {
				EntityUniversalRestrictionAxiom entityUniversalRestrictionAxiom = (EntityUniversalRestrictionAxiom)theEObject;
				T result = caseEntityUniversalRestrictionAxiom(entityUniversalRestrictionAxiom);
				if (result == null) result = caseEntityRestrictionAxiom(entityUniversalRestrictionAxiom);
				if (result == null) result = caseTermAxiom(entityUniversalRestrictionAxiom);
				if (result == null) result = caseTerminologyBoxStatement(entityUniversalRestrictionAxiom);
				if (result == null) result = caseModuleElement(entityUniversalRestrictionAxiom);
				if (result == null) result = caseElement(entityUniversalRestrictionAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.SPECIALIZATION_AXIOM: {
				SpecializationAxiom specializationAxiom = (SpecializationAxiom)theEObject;
				T result = caseSpecializationAxiom(specializationAxiom);
				if (result == null) result = caseTermAxiom(specializationAxiom);
				if (result == null) result = caseTerminologyBoxStatement(specializationAxiom);
				if (result == null) result = caseModuleElement(specializationAxiom);
				if (result == null) result = caseElement(specializationAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.ASPECT_SPECIALIZATION_AXIOM: {
				AspectSpecializationAxiom aspectSpecializationAxiom = (AspectSpecializationAxiom)theEObject;
				T result = caseAspectSpecializationAxiom(aspectSpecializationAxiom);
				if (result == null) result = caseSpecializationAxiom(aspectSpecializationAxiom);
				if (result == null) result = caseTermAxiom(aspectSpecializationAxiom);
				if (result == null) result = caseTerminologyBoxStatement(aspectSpecializationAxiom);
				if (result == null) result = caseModuleElement(aspectSpecializationAxiom);
				if (result == null) result = caseElement(aspectSpecializationAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.CONCEPT_SPECIALIZATION_AXIOM: {
				ConceptSpecializationAxiom conceptSpecializationAxiom = (ConceptSpecializationAxiom)theEObject;
				T result = caseConceptSpecializationAxiom(conceptSpecializationAxiom);
				if (result == null) result = caseSpecializationAxiom(conceptSpecializationAxiom);
				if (result == null) result = caseTermAxiom(conceptSpecializationAxiom);
				if (result == null) result = caseTerminologyBoxStatement(conceptSpecializationAxiom);
				if (result == null) result = caseModuleElement(conceptSpecializationAxiom);
				if (result == null) result = caseElement(conceptSpecializationAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.REIFIED_RELATIONSHIP_SPECIALIZATION_AXIOM: {
				ReifiedRelationshipSpecializationAxiom reifiedRelationshipSpecializationAxiom = (ReifiedRelationshipSpecializationAxiom)theEObject;
				T result = caseReifiedRelationshipSpecializationAxiom(reifiedRelationshipSpecializationAxiom);
				if (result == null) result = caseSpecializationAxiom(reifiedRelationshipSpecializationAxiom);
				if (result == null) result = caseTermAxiom(reifiedRelationshipSpecializationAxiom);
				if (result == null) result = caseTerminologyBoxStatement(reifiedRelationshipSpecializationAxiom);
				if (result == null) result = caseModuleElement(reifiedRelationshipSpecializationAxiom);
				if (result == null) result = caseElement(reifiedRelationshipSpecializationAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY_RESTRICTION_AXIOM: {
				EntityScalarDataPropertyRestrictionAxiom entityScalarDataPropertyRestrictionAxiom = (EntityScalarDataPropertyRestrictionAxiom)theEObject;
				T result = caseEntityScalarDataPropertyRestrictionAxiom(entityScalarDataPropertyRestrictionAxiom);
				if (result == null) result = caseTermAxiom(entityScalarDataPropertyRestrictionAxiom);
				if (result == null) result = caseTerminologyBoxStatement(entityScalarDataPropertyRestrictionAxiom);
				if (result == null) result = caseModuleElement(entityScalarDataPropertyRestrictionAxiom);
				if (result == null) result = caseElement(entityScalarDataPropertyRestrictionAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY_EXISTENTIAL_RESTRICTION_AXIOM: {
				EntityScalarDataPropertyExistentialRestrictionAxiom entityScalarDataPropertyExistentialRestrictionAxiom = (EntityScalarDataPropertyExistentialRestrictionAxiom)theEObject;
				T result = caseEntityScalarDataPropertyExistentialRestrictionAxiom(entityScalarDataPropertyExistentialRestrictionAxiom);
				if (result == null) result = caseEntityScalarDataPropertyRestrictionAxiom(entityScalarDataPropertyExistentialRestrictionAxiom);
				if (result == null) result = caseTermAxiom(entityScalarDataPropertyExistentialRestrictionAxiom);
				if (result == null) result = caseTerminologyBoxStatement(entityScalarDataPropertyExistentialRestrictionAxiom);
				if (result == null) result = caseModuleElement(entityScalarDataPropertyExistentialRestrictionAxiom);
				if (result == null) result = caseElement(entityScalarDataPropertyExistentialRestrictionAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY_UNIVERSAL_RESTRICTION_AXIOM: {
				EntityScalarDataPropertyUniversalRestrictionAxiom entityScalarDataPropertyUniversalRestrictionAxiom = (EntityScalarDataPropertyUniversalRestrictionAxiom)theEObject;
				T result = caseEntityScalarDataPropertyUniversalRestrictionAxiom(entityScalarDataPropertyUniversalRestrictionAxiom);
				if (result == null) result = caseEntityScalarDataPropertyRestrictionAxiom(entityScalarDataPropertyUniversalRestrictionAxiom);
				if (result == null) result = caseTermAxiom(entityScalarDataPropertyUniversalRestrictionAxiom);
				if (result == null) result = caseTerminologyBoxStatement(entityScalarDataPropertyUniversalRestrictionAxiom);
				if (result == null) result = caseModuleElement(entityScalarDataPropertyUniversalRestrictionAxiom);
				if (result == null) result = caseElement(entityScalarDataPropertyUniversalRestrictionAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY_PARTICULAR_RESTRICTION_AXIOM: {
				EntityScalarDataPropertyParticularRestrictionAxiom entityScalarDataPropertyParticularRestrictionAxiom = (EntityScalarDataPropertyParticularRestrictionAxiom)theEObject;
				T result = caseEntityScalarDataPropertyParticularRestrictionAxiom(entityScalarDataPropertyParticularRestrictionAxiom);
				if (result == null) result = caseEntityScalarDataPropertyRestrictionAxiom(entityScalarDataPropertyParticularRestrictionAxiom);
				if (result == null) result = caseTermAxiom(entityScalarDataPropertyParticularRestrictionAxiom);
				if (result == null) result = caseTerminologyBoxStatement(entityScalarDataPropertyParticularRestrictionAxiom);
				if (result == null) result = caseModuleElement(entityScalarDataPropertyParticularRestrictionAxiom);
				if (result == null) result = caseElement(entityScalarDataPropertyParticularRestrictionAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.RESTRICTED_DATA_RANGE: {
				RestrictedDataRange restrictedDataRange = (RestrictedDataRange)theEObject;
				T result = caseRestrictedDataRange(restrictedDataRange);
				if (result == null) result = caseDataRange(restrictedDataRange);
				if (result == null) result = caseDatatype(restrictedDataRange);
				if (result == null) result = caseTerm(restrictedDataRange);
				if (result == null) result = caseTerminologyBoxStatement(restrictedDataRange);
				if (result == null) result = caseResource(restrictedDataRange);
				if (result == null) result = caseModuleElement(restrictedDataRange);
				if (result == null) result = caseElement(restrictedDataRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.BINARY_SCALAR_RESTRICTION: {
				BinaryScalarRestriction binaryScalarRestriction = (BinaryScalarRestriction)theEObject;
				T result = caseBinaryScalarRestriction(binaryScalarRestriction);
				if (result == null) result = caseRestrictedDataRange(binaryScalarRestriction);
				if (result == null) result = caseDataRange(binaryScalarRestriction);
				if (result == null) result = caseDatatype(binaryScalarRestriction);
				if (result == null) result = caseTerm(binaryScalarRestriction);
				if (result == null) result = caseTerminologyBoxStatement(binaryScalarRestriction);
				if (result == null) result = caseResource(binaryScalarRestriction);
				if (result == null) result = caseModuleElement(binaryScalarRestriction);
				if (result == null) result = caseElement(binaryScalarRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.IRI_SCALAR_RESTRICTION: {
				IRIScalarRestriction iriScalarRestriction = (IRIScalarRestriction)theEObject;
				T result = caseIRIScalarRestriction(iriScalarRestriction);
				if (result == null) result = caseRestrictedDataRange(iriScalarRestriction);
				if (result == null) result = caseDataRange(iriScalarRestriction);
				if (result == null) result = caseDatatype(iriScalarRestriction);
				if (result == null) result = caseTerm(iriScalarRestriction);
				if (result == null) result = caseTerminologyBoxStatement(iriScalarRestriction);
				if (result == null) result = caseResource(iriScalarRestriction);
				if (result == null) result = caseModuleElement(iriScalarRestriction);
				if (result == null) result = caseElement(iriScalarRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.NUMERIC_SCALAR_RESTRICTION: {
				NumericScalarRestriction numericScalarRestriction = (NumericScalarRestriction)theEObject;
				T result = caseNumericScalarRestriction(numericScalarRestriction);
				if (result == null) result = caseRestrictedDataRange(numericScalarRestriction);
				if (result == null) result = caseDataRange(numericScalarRestriction);
				if (result == null) result = caseDatatype(numericScalarRestriction);
				if (result == null) result = caseTerm(numericScalarRestriction);
				if (result == null) result = caseTerminologyBoxStatement(numericScalarRestriction);
				if (result == null) result = caseResource(numericScalarRestriction);
				if (result == null) result = caseModuleElement(numericScalarRestriction);
				if (result == null) result = caseElement(numericScalarRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.PLAIN_LITERAL_SCALAR_RESTRICTION: {
				PlainLiteralScalarRestriction plainLiteralScalarRestriction = (PlainLiteralScalarRestriction)theEObject;
				T result = casePlainLiteralScalarRestriction(plainLiteralScalarRestriction);
				if (result == null) result = caseRestrictedDataRange(plainLiteralScalarRestriction);
				if (result == null) result = caseDataRange(plainLiteralScalarRestriction);
				if (result == null) result = caseDatatype(plainLiteralScalarRestriction);
				if (result == null) result = caseTerm(plainLiteralScalarRestriction);
				if (result == null) result = caseTerminologyBoxStatement(plainLiteralScalarRestriction);
				if (result == null) result = caseResource(plainLiteralScalarRestriction);
				if (result == null) result = caseModuleElement(plainLiteralScalarRestriction);
				if (result == null) result = caseElement(plainLiteralScalarRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.STRING_SCALAR_RESTRICTION: {
				StringScalarRestriction stringScalarRestriction = (StringScalarRestriction)theEObject;
				T result = caseStringScalarRestriction(stringScalarRestriction);
				if (result == null) result = caseRestrictedDataRange(stringScalarRestriction);
				if (result == null) result = caseDataRange(stringScalarRestriction);
				if (result == null) result = caseDatatype(stringScalarRestriction);
				if (result == null) result = caseTerm(stringScalarRestriction);
				if (result == null) result = caseTerminologyBoxStatement(stringScalarRestriction);
				if (result == null) result = caseResource(stringScalarRestriction);
				if (result == null) result = caseModuleElement(stringScalarRestriction);
				if (result == null) result = caseElement(stringScalarRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.TIME_SCALAR_RESTRICTION: {
				TimeScalarRestriction timeScalarRestriction = (TimeScalarRestriction)theEObject;
				T result = caseTimeScalarRestriction(timeScalarRestriction);
				if (result == null) result = caseRestrictedDataRange(timeScalarRestriction);
				if (result == null) result = caseDataRange(timeScalarRestriction);
				if (result == null) result = caseDatatype(timeScalarRestriction);
				if (result == null) result = caseTerm(timeScalarRestriction);
				if (result == null) result = caseTerminologyBoxStatement(timeScalarRestriction);
				if (result == null) result = caseResource(timeScalarRestriction);
				if (result == null) result = caseModuleElement(timeScalarRestriction);
				if (result == null) result = caseElement(timeScalarRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.SYNONYM_SCALAR_RESTRICTION: {
				SynonymScalarRestriction synonymScalarRestriction = (SynonymScalarRestriction)theEObject;
				T result = caseSynonymScalarRestriction(synonymScalarRestriction);
				if (result == null) result = caseRestrictedDataRange(synonymScalarRestriction);
				if (result == null) result = caseDataRange(synonymScalarRestriction);
				if (result == null) result = caseDatatype(synonymScalarRestriction);
				if (result == null) result = caseTerm(synonymScalarRestriction);
				if (result == null) result = caseTerminologyBoxStatement(synonymScalarRestriction);
				if (result == null) result = caseResource(synonymScalarRestriction);
				if (result == null) result = caseModuleElement(synonymScalarRestriction);
				if (result == null) result = caseElement(synonymScalarRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.SCALAR_ONE_OF_RESTRICTION: {
				ScalarOneOfRestriction scalarOneOfRestriction = (ScalarOneOfRestriction)theEObject;
				T result = caseScalarOneOfRestriction(scalarOneOfRestriction);
				if (result == null) result = caseRestrictedDataRange(scalarOneOfRestriction);
				if (result == null) result = caseDataRange(scalarOneOfRestriction);
				if (result == null) result = caseDatatype(scalarOneOfRestriction);
				if (result == null) result = caseTerm(scalarOneOfRestriction);
				if (result == null) result = caseTerminologyBoxStatement(scalarOneOfRestriction);
				if (result == null) result = caseResource(scalarOneOfRestriction);
				if (result == null) result = caseModuleElement(scalarOneOfRestriction);
				if (result == null) result = caseElement(scalarOneOfRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TerminologiesPackage.SCALAR_ONE_OF_LITERAL_AXIOM: {
				ScalarOneOfLiteralAxiom scalarOneOfLiteralAxiom = (ScalarOneOfLiteralAxiom)theEObject;
				T result = caseScalarOneOfLiteralAxiom(scalarOneOfLiteralAxiom);
				if (result == null) result = caseTermAxiom(scalarOneOfLiteralAxiom);
				if (result == null) result = caseTerminologyBoxStatement(scalarOneOfLiteralAxiom);
				if (result == null) result = caseModuleElement(scalarOneOfLiteralAxiom);
				if (result == null) result = caseElement(scalarOneOfLiteralAxiom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyBox(TerminologyBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Box Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Box Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyBoxStatement(TerminologyBoxStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyAxiom(TerminologyAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Box Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Box Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyBoxAxiom(TerminologyBoxAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Extension Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Extension Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyExtensionAxiom(TerminologyExtensionAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerm(Term object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Term Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Term Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryTermKind(UnaryTermKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Binary Relationship Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Binary Relationship Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedBinaryRelationshipKind(DirectedBinaryRelationshipKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conceptual Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conceptual Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptualEntity(ConceptualEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAspect(Aspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcept(Concept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityRelationship(EntityRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reified Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reified Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReifiedRelationship(ReifiedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unreified Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unreified Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnreifiedRelationship(UnreifiedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatype(Datatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRange(DataRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalar(Scalar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRelationship(DataRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Relationship Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Relationship Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRelationshipDomain(DataRelationshipDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Relationship From Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Relationship From Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRelationshipFromEntity(DataRelationshipFromEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Relationship From Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Relationship From Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRelationshipFromStructure(DataRelationshipFromStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Relationship Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Relationship Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRelationshipRange(DataRelationshipRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Relationship To Scalar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Relationship To Scalar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRelationshipToScalar(DataRelationshipToScalar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Relationship To Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Relationship To Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRelationshipToStructure(DataRelationshipToStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Structured Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Structured Data Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityStructuredDataProperty(EntityStructuredDataProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Scalar Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Scalar Data Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityScalarDataProperty(EntityScalarDataProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Data Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredDataProperty(StructuredDataProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalar Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalar Data Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalarDataProperty(ScalarDataProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructure(Structure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermAxiom(TermAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Restriction Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Restriction Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityRestrictionAxiom(EntityRestrictionAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Existential Restriction Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Existential Restriction Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityExistentialRestrictionAxiom(EntityExistentialRestrictionAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Universal Restriction Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Universal Restriction Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityUniversalRestrictionAxiom(EntityUniversalRestrictionAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specialization Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specialization Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecializationAxiom(SpecializationAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aspect Specialization Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aspect Specialization Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAspectSpecializationAxiom(AspectSpecializationAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Specialization Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Specialization Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConceptSpecializationAxiom(ConceptSpecializationAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reified Relationship Specialization Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reified Relationship Specialization Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReifiedRelationshipSpecializationAxiom(ReifiedRelationshipSpecializationAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Scalar Data Property Restriction Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Scalar Data Property Restriction Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityScalarDataPropertyRestrictionAxiom(EntityScalarDataPropertyRestrictionAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Scalar Data Property Existential Restriction Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Scalar Data Property Existential Restriction Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityScalarDataPropertyExistentialRestrictionAxiom(EntityScalarDataPropertyExistentialRestrictionAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Scalar Data Property Universal Restriction Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Scalar Data Property Universal Restriction Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityScalarDataPropertyUniversalRestrictionAxiom(EntityScalarDataPropertyUniversalRestrictionAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Scalar Data Property Particular Restriction Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Scalar Data Property Particular Restriction Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityScalarDataPropertyParticularRestrictionAxiom(EntityScalarDataPropertyParticularRestrictionAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restricted Data Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restricted Data Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestrictedDataRange(RestrictedDataRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Scalar Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Scalar Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryScalarRestriction(BinaryScalarRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRI Scalar Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRI Scalar Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRIScalarRestriction(IRIScalarRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Scalar Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Scalar Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericScalarRestriction(NumericScalarRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plain Literal Scalar Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plain Literal Scalar Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlainLiteralScalarRestriction(PlainLiteralScalarRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Scalar Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Scalar Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringScalarRestriction(StringScalarRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Scalar Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Scalar Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeScalarRestriction(TimeScalarRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synonym Scalar Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synonym Scalar Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynonymScalarRestriction(SynonymScalarRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalar One Of Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalar One Of Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalarOneOfRestriction(ScalarOneOfRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalar One Of Literal Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalar One Of Literal Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalarOneOfLiteralAxiom(ScalarOneOfLiteralAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleElement(ModuleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleEdge(ModuleEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TerminologiesSwitch
