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

import gov.nasa.jpl.imce.oml.model.common.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML Term map to the declaration of an [OWL2-DL Entity] of some kind.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nasa.jpl.imce.oml.model.terminologies.Term#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see gov.nasa.jpl.imce.oml.model.terminologies.TerminologiesPackage#getTerm()
 * @model abstract="true"
 *        annotation="http://imce.jpl.nasa.gov/oml/NamespaceUUID namespace='tbox' factors='name'"
 * @generated
 */
public interface Term extends TerminologyBoxStatement, Resource {
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
	 * @see gov.nasa.jpl.imce.oml.model.terminologies.TerminologiesPackage#getTerm_Name()
	 * @model unique="false" dataType="gov.nasa.jpl.imce.oml.model.common.LocalName" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gov.nasa.jpl.imce.oml.model.terminologies.Term#getName <em>Name</em>}' attribute.
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
	 * @model dataType="gov.nasa.jpl.imce.oml.model.common.IRI" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%gov.nasa.jpl.imce.oml.model.terminologies.TerminologyBox%> _tbox = this.getTbox();\n<%java.lang.String%> _iri = null;\nif (_tbox!=null)\n{\n\t_iri=_tbox.iri();\n}\n<%java.lang.String%> _plus = (_iri + \"#\");\n<%java.lang.String%> _name = this.name();\nreturn (_plus + _name);'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='extent.terminologyBoxOfTerminologyBoxStatement.get(this).flatMap(_.iri().map(_ + \"#\" + name))'"
	 * @generated
	 */
	String iri();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.lang.String%> _elvis = null;\n<%gov.nasa.jpl.imce.oml.model.terminologies.TerminologyBox%> _tbox = this.getTbox();\n<%java.lang.String%> _nsPrefix = null;\nif (_tbox!=null)\n{\n\t_nsPrefix=_tbox.nsPrefix();\n}\nif (_nsPrefix != null)\n{\n\t_elvis = _nsPrefix;\n} else\n{\n\t_elvis = \"\";\n}\n<%java.lang.String%> _plus = (_elvis + \":\");\n<%java.lang.String%> _name = this.name();\nreturn (_plus + _name);'"
	 *        annotation="http://imce.jpl.nasa.gov/oml/Scala code='extent.terminologyBoxOfTerminologyBoxStatement.get(this).map(tbox => tbox.nsPrefix+\":\"+name)'"
	 * @generated
	 */
	String abbrevIRI();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="gov.nasa.jpl.imce.oml.model.common.LocalName" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getName();'"
	 * @generated
	 */
	String name();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="gov.nasa.jpl.imce.oml.model.common.UUID" unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%gov.nasa.jpl.imce.oml.model.terminologies.TerminologyBox%> _tbox = this.getTbox();\n<%java.lang.String%> _uuid = null;\nif (_tbox!=null)\n{\n\t_uuid=_tbox.uuid();\n}\n<%java.lang.String%> _name = this.name();\n<%java.lang.String%> _string = null;\nif (_name!=null)\n{\n\t_string=_name.toString();\n}\n<%org.eclipse.xtext.xbase.lib.Pair%><<%java.lang.String%>, <%java.lang.String%>> _mappedTo = <%org.eclipse.xtext.xbase.lib.Pair%>.<<%java.lang.String%>, <%java.lang.String%>>of(\"name\", _string);\n<%java.util.UUID%> _namespaceUUID = <%gov.nasa.jpl.imce.oml.model.extensions.OMLExtensions%>.namespaceUUID(_uuid, _mappedTo);\n<%java.lang.String%> _string_1 = null;\nif (_namespaceUUID!=null)\n{\n\t_string_1=_namespaceUUID.toString();\n}\nreturn _string_1;'"
	 * @generated
	 */
	String uuid();

} // Term
