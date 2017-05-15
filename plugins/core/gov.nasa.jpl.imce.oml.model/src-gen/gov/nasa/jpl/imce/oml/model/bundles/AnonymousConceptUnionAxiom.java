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
package gov.nasa.jpl.imce.oml.model.bundles;

import gov.nasa.jpl.imce.oml.model.common.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous Concept Union Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML AnonymousConceptUnionAxiom specifies an anonymous logical union of DisjointUnionOfEntityAxioms in a concept taxonomy tree.
 * Although it is semantically anonymous, it is syntactically identified with name whose
 * only purpose is for generating the axiom's namespace UUID.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nasa.jpl.imce.oml.model.bundles.AnonymousConceptUnionAxiom#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see gov.nasa.jpl.imce.oml.model.bundles.BundlesPackage#getAnonymousConceptUnionAxiom()
 * @model annotation="http://imce.jpl.nasa.gov/oml/NamespaceUUID namespace='disjointTaxonomyParent' factors='name'"
 * @generated
 */
public interface AnonymousConceptUnionAxiom extends DisjointUnionOfConceptsAxiom, ConceptTreeDisjunction, Element {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gov.nasa.jpl.imce.oml.model.bundles.BundlesPackage#getAnonymousConceptUnionAxiom_Name()
	 * @model unique="false" dataType="gov.nasa.jpl.imce.oml.model.common.LocalName" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gov.nasa.jpl.imce.oml.model.bundles.AnonymousConceptUnionAxiom#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="gov.nasa.jpl.imce.oml.model.common.UUID" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%gov.nasa.jpl.imce.oml.model.bundles.ConceptTreeDisjunction%> _disjointTaxonomyParent = this.getDisjointTaxonomyParent();\n<%java.lang.String%> _uuid = null;\nif (_disjointTaxonomyParent!=null)\n{\n\t_uuid=_disjointTaxonomyParent.uuid();\n}\n<%java.lang.String%> _string = null;\nif (_uuid!=null)\n{\n\t_string=_uuid.toString();\n}\n<%java.lang.String%> _name = this.getName();\n<%java.lang.String%> _string_1 = null;\nif (_name!=null)\n{\n\t_string_1=_name.toString();\n}\n<%org.eclipse.xtext.xbase.lib.Pair%><<%java.lang.String%>, <%java.lang.String%>> _mappedTo = <%org.eclipse.xtext.xbase.lib.Pair%>.<<%java.lang.String%>, <%java.lang.String%>>of(\"name\", _string_1);\n<%java.util.UUID%> _namespaceUUID = <%gov.nasa.jpl.imce.oml.model.extensions.OMLExtensions%>.namespaceUUID(_string, _mappedTo);\n<%java.lang.String%> _string_2 = null;\nif (_namespaceUUID!=null)\n{\n\t_string_2=_namespaceUUID.toString();\n}\nreturn _string_2;'"
	 * @generated
	 */
	String uuid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%gov.nasa.jpl.imce.oml.model.bundles.ConceptTreeDisjunction%> _disjointTaxonomyParent = this.getDisjointTaxonomyParent();\n<%gov.nasa.jpl.imce.oml.model.bundles.Bundle%> _bundleContainer = null;\nif (_disjointTaxonomyParent!=null)\n{\n\t_bundleContainer=_disjointTaxonomyParent.bundleContainer();\n}\nreturn _bundleContainer;'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='conceptTreeDisjunctionParent().flatMap(_.bundleContainer())'"
	 * @generated
	 */
	Bundle bundleContainer();

} // AnonymousConceptUnionAxiom