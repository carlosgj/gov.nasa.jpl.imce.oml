/**
 * 
 * Copyright 2017 California Institute of Technology ("Caltech").
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
package gov.nasa.jpl.imce.oml.model.terminologies;

import gov.nasa.jpl.imce.oml.model.common.LiteralValue;
import gov.nasa.jpl.imce.oml.model.common.ValueCrossReferenceTuple;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Scalar Data Property Particular Restriction Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * An OML EntityScalarDataPropertyParticularRestrictionAxiom maps to an OWL2 DataHasValue restriction.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nasa.jpl.imce.oml.model.terminologies.EntityScalarDataPropertyParticularRestrictionAxiom#getLiteralValue <em>Literal Value</em>}</li>
 *   <li>{@link gov.nasa.jpl.imce.oml.model.terminologies.EntityScalarDataPropertyParticularRestrictionAxiom#getValueType <em>Value Type</em>}</li>
 * </ul>
 *
 * @see gov.nasa.jpl.imce.oml.model.terminologies.TerminologiesPackage#getEntityScalarDataPropertyParticularRestrictionAxiom()
 * @model
 * @generated
 */
public interface EntityScalarDataPropertyParticularRestrictionAxiom extends EntityScalarDataPropertyRestrictionAxiom, ValueCrossReferenceTuple {
	/**
	 * Returns the value of the '<em><b>Literal Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Value</em>' containment reference.
	 * @see #setLiteralValue(LiteralValue)
	 * @see gov.nasa.jpl.imce.oml.model.terminologies.TerminologiesPackage#getEntityScalarDataPropertyParticularRestrictionAxiom_LiteralValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LiteralValue getLiteralValue();

	/**
	 * Sets the value of the '{@link gov.nasa.jpl.imce.oml.model.terminologies.EntityScalarDataPropertyParticularRestrictionAxiom#getLiteralValue <em>Literal Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal Value</em>' containment reference.
	 * @see #getLiteralValue()
	 * @generated
	 */
	void setLiteralValue(LiteralValue value);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' reference.
	 * @see #setValueType(DataRange)
	 * @see gov.nasa.jpl.imce.oml.model.terminologies.TerminologiesPackage#getEntityScalarDataPropertyParticularRestrictionAxiom_ValueType()
	 * @model
	 * @generated
	 */
	DataRange getValueType();

	/**
	 * Sets the value of the '{@link gov.nasa.jpl.imce.oml.model.terminologies.EntityScalarDataPropertyParticularRestrictionAxiom#getValueType <em>Value Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' reference.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(DataRange value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="gov.nasa.jpl.imce.oml.model.common.UUID" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%gov.nasa.jpl.imce.oml.model.terminologies.TerminologyBox%&gt; _tbox = this.getTbox();\n&lt;%java.lang.String%&gt; _uuid = null;\nif (_tbox!=null)\n{\n\t_uuid=_tbox.uuid();\n}\n&lt;%org.eclipse.xtext.xbase.lib.Pair%&gt;&lt;&lt;%java.lang.String%&gt;, &lt;%java.lang.String%&gt;&gt; _mappedTo = &lt;%org.eclipse.xtext.xbase.lib.Pair%&gt;.&lt;&lt;%java.lang.String%&gt;, &lt;%java.lang.String%&gt;&gt;of(\"tbox\", _uuid);\n&lt;%gov.nasa.jpl.imce.oml.model.terminologies.Entity%&gt; _restrictedEntity = this.getRestrictedEntity();\n&lt;%java.lang.String%&gt; _uuid_1 = null;\nif (_restrictedEntity!=null)\n{\n\t_uuid_1=_restrictedEntity.uuid();\n}\n&lt;%java.lang.String%&gt; _string = null;\nif (_uuid_1!=null)\n{\n\t_string=_uuid_1.toString();\n}\n&lt;%org.eclipse.xtext.xbase.lib.Pair%&gt;&lt;&lt;%java.lang.String%&gt;, &lt;%java.lang.String%&gt;&gt; _mappedTo_1 = &lt;%org.eclipse.xtext.xbase.lib.Pair%&gt;.&lt;&lt;%java.lang.String%&gt;, &lt;%java.lang.String%&gt;&gt;of(\"restrictedEntity\", _string);\n&lt;%gov.nasa.jpl.imce.oml.model.terminologies.EntityScalarDataProperty%&gt; _scalarProperty = this.getScalarProperty();\n&lt;%java.lang.String%&gt; _uuid_2 = null;\nif (_scalarProperty!=null)\n{\n\t_uuid_2=_scalarProperty.uuid();\n}\n&lt;%java.lang.String%&gt; _string_1 = null;\nif (_uuid_2!=null)\n{\n\t_string_1=_uuid_2.toString();\n}\n&lt;%org.eclipse.xtext.xbase.lib.Pair%&gt;&lt;&lt;%java.lang.String%&gt;, &lt;%java.lang.String%&gt;&gt; _mappedTo_2 = &lt;%org.eclipse.xtext.xbase.lib.Pair%&gt;.&lt;&lt;%java.lang.String%&gt;, &lt;%java.lang.String%&gt;&gt;of(\"scalarProperty\", _string_1);\n&lt;%gov.nasa.jpl.imce.oml.model.common.LiteralValue%&gt; _literalValue = this.getLiteralValue();\n&lt;%java.lang.String%&gt; _value = null;\nif (_literalValue!=null)\n{\n\t_value=_literalValue.value();\n}\n&lt;%org.eclipse.xtext.xbase.lib.Pair%&gt;&lt;&lt;%java.lang.String%&gt;, &lt;%java.lang.String%&gt;&gt; _mappedTo_3 = &lt;%org.eclipse.xtext.xbase.lib.Pair%&gt;.&lt;&lt;%java.lang.String%&gt;, &lt;%java.lang.String%&gt;&gt;of(\"literalValue\", _value);\n&lt;%java.util.UUID%&gt; _derivedUUID = &lt;%gov.nasa.jpl.imce.oml.model.extensions.OMLExtensions%&gt;.derivedUUID(\n\t\"EntityScalarDataPropertyParticularRestrictionAxiom\", _mappedTo, _mappedTo_1, _mappedTo_2, _mappedTo_3);\n&lt;%java.lang.String%&gt; _string_2 = null;\nif (_derivedUUID!=null)\n{\n\t_string_2=_derivedUUID.toString();\n}\nreturn _string_2;'"
	 * @generated
	 */
	String uuid();

} // EntityScalarDataPropertyParticularRestrictionAxiom
