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
package gov.nasa.jpl.imce.oml.model.descriptions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reified Relationship Instance Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML ReifiedRelationshipInstanceRange specifies which OML ConceptualEntitySingletonInstance
 * plays the role of the range for an OML ReifiedRelationshipInstance.
 * An OML ReifiedRelationshipInstanceRange has no intrinsic identity; instead,
 * an OML ReifiedRelationshipInstanceRange is semantically equivalent
 * to another OML ReifiedRelationshipInstanceRange referencing the same property and range.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nasa.jpl.imce.oml.model.descriptions.ReifiedRelationshipInstanceRange#getDescriptionBox <em>Description Box</em>}</li>
 *   <li>{@link gov.nasa.jpl.imce.oml.model.descriptions.ReifiedRelationshipInstanceRange#getReifiedRelationshipInstance <em>Reified Relationship Instance</em>}</li>
 *   <li>{@link gov.nasa.jpl.imce.oml.model.descriptions.ReifiedRelationshipInstanceRange#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see gov.nasa.jpl.imce.oml.model.descriptions.DescriptionsPackage#getReifiedRelationshipInstanceRange()
 * @model
 * @generated
 */
public interface ReifiedRelationshipInstanceRange extends TerminologyInstanceAssertion {
	/**
	 * Returns the value of the '<em><b>Description Box</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gov.nasa.jpl.imce.oml.model.descriptions.DescriptionBox#getReifiedRelationshipInstanceRanges <em>Reified Relationship Instance Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Box</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Box</em>' container reference.
	 * @see #setDescriptionBox(DescriptionBox)
	 * @see gov.nasa.jpl.imce.oml.model.descriptions.DescriptionsPackage#getReifiedRelationshipInstanceRange_DescriptionBox()
	 * @see gov.nasa.jpl.imce.oml.model.descriptions.DescriptionBox#getReifiedRelationshipInstanceRanges
	 * @model opposite="reifiedRelationshipInstanceRanges" required="true" transient="false"
	 * @generated
	 */
	DescriptionBox getDescriptionBox();

	/**
	 * Sets the value of the '{@link gov.nasa.jpl.imce.oml.model.descriptions.ReifiedRelationshipInstanceRange#getDescriptionBox <em>Description Box</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Box</em>' container reference.
	 * @see #getDescriptionBox()
	 * @generated
	 */
	void setDescriptionBox(DescriptionBox value);

	/**
	 * Returns the value of the '<em><b>Reified Relationship Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reified Relationship Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reified Relationship Instance</em>' reference.
	 * @see #setReifiedRelationshipInstance(ReifiedRelationshipInstance)
	 * @see gov.nasa.jpl.imce.oml.model.descriptions.DescriptionsPackage#getReifiedRelationshipInstanceRange_ReifiedRelationshipInstance()
	 * @model required="true"
	 * @generated
	 */
	ReifiedRelationshipInstance getReifiedRelationshipInstance();

	/**
	 * Sets the value of the '{@link gov.nasa.jpl.imce.oml.model.descriptions.ReifiedRelationshipInstanceRange#getReifiedRelationshipInstance <em>Reified Relationship Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reified Relationship Instance</em>' reference.
	 * @see #getReifiedRelationshipInstance()
	 * @generated
	 */
	void setReifiedRelationshipInstance(ReifiedRelationshipInstance value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' reference.
	 * @see #setRange(ConceptualEntitySingletonInstance)
	 * @see gov.nasa.jpl.imce.oml.model.descriptions.DescriptionsPackage#getReifiedRelationshipInstanceRange_Range()
	 * @model required="true"
	 * @generated
	 */
	ConceptualEntitySingletonInstance getRange();

	/**
	 * Sets the value of the '{@link gov.nasa.jpl.imce.oml.model.descriptions.ReifiedRelationshipInstanceRange#getRange <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(ConceptualEntitySingletonInstance value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getDescriptionBox();'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='extent.descriptionBoxOfReifiedRelationshipInstanceRange.get(this)'"
	 * @generated
	 */
	DescriptionBox descriptionBox();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="gov.nasa.jpl.imce.oml.model.common.UUID" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%gov.nasa.jpl.imce.oml.model.descriptions.DescriptionBox%> _descriptionBox = this.descriptionBox();\n<%java.lang.String%> _uuid = null;\nif (_descriptionBox!=null)\n{\n\t_uuid=_descriptionBox.uuid();\n}\n<%java.lang.String%> _string = null;\nif (_uuid!=null)\n{\n\t_string=_uuid.toString();\n}\n<%org.eclipse.xtext.xbase.lib.Pair%><<%java.lang.String%>, <%java.lang.String%>> _mappedTo = <%org.eclipse.xtext.xbase.lib.Pair%>.<<%java.lang.String%>, <%java.lang.String%>>of(\"descriptionBox\", _string);\n<%gov.nasa.jpl.imce.oml.model.descriptions.ReifiedRelationshipInstance%> _reifiedRelationshipInstance = this.getReifiedRelationshipInstance();\n<%java.lang.String%> _uuid_1 = null;\nif (_reifiedRelationshipInstance!=null)\n{\n\t_uuid_1=_reifiedRelationshipInstance.uuid();\n}\n<%java.lang.String%> _string_1 = null;\nif (_uuid_1!=null)\n{\n\t_string_1=_uuid_1.toString();\n}\n<%org.eclipse.xtext.xbase.lib.Pair%><<%java.lang.String%>, <%java.lang.String%>> _mappedTo_1 = <%org.eclipse.xtext.xbase.lib.Pair%>.<<%java.lang.String%>, <%java.lang.String%>>of(\"reifiedRelationshipInstance\", _string_1);\n<%gov.nasa.jpl.imce.oml.model.descriptions.ConceptualEntitySingletonInstance%> _range = this.getRange();\n<%java.lang.String%> _uuid_2 = null;\nif (_range!=null)\n{\n\t_uuid_2=_range.uuid();\n}\n<%java.lang.String%> _string_2 = null;\nif (_uuid_2!=null)\n{\n\t_string_2=_uuid_2.toString();\n}\n<%org.eclipse.xtext.xbase.lib.Pair%><<%java.lang.String%>, <%java.lang.String%>> _mappedTo_2 = <%org.eclipse.xtext.xbase.lib.Pair%>.<<%java.lang.String%>, <%java.lang.String%>>of(\"range\", _string_2);\n<%java.util.UUID%> _derivedUUID = <%gov.nasa.jpl.imce.oml.model.extensions.OMLExtensions%>.derivedUUID(\n\t\"ReifiedRelationshipInstanceRange\", _mappedTo, _mappedTo_1, _mappedTo_2);\n<%java.lang.String%> _string_3 = null;\nif (_derivedUUID!=null)\n{\n\t_string_3=_derivedUUID.toString();\n}\nreturn _string_3;'"
	 * @generated
	 */
	String uuid();

} // ReifiedRelationshipInstanceRange