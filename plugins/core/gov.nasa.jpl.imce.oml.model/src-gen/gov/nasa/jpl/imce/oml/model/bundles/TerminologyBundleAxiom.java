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
package gov.nasa.jpl.imce.oml.model.bundles;

import gov.nasa.jpl.imce.oml.model.terminologies.TerminologyAxiom;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminology Bundle Axiom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OML TerminologyBundleAxiom is a TerminologyAxiom that asserts a logical statement in an OML Bundle.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nasa.jpl.imce.oml.model.bundles.TerminologyBundleAxiom#getBundle <em>Bundle</em>}</li>
 * </ul>
 *
 * @see gov.nasa.jpl.imce.oml.model.bundles.BundlesPackage#getTerminologyBundleAxiom()
 * @model abstract="true"
 * @generated
 */
public interface TerminologyBundleAxiom extends TerminologyAxiom {
	/**
	 * Returns the value of the '<em><b>Bundle</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gov.nasa.jpl.imce.oml.model.bundles.Bundle#getBundleAxioms <em>Bundle Axioms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bundle</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle</em>' container reference.
	 * @see #setBundle(Bundle)
	 * @see gov.nasa.jpl.imce.oml.model.bundles.BundlesPackage#getTerminologyBundleAxiom_Bundle()
	 * @see gov.nasa.jpl.imce.oml.model.bundles.Bundle#getBundleAxioms
	 * @model opposite="bundleAxioms" required="true" transient="false"
	 * @generated
	 */
	Bundle getBundle();

	/**
	 * Sets the value of the '{@link gov.nasa.jpl.imce.oml.model.bundles.TerminologyBundleAxiom#getBundle <em>Bundle</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle</em>' container reference.
	 * @see #getBundle()
	 * @generated
	 */
	void setBundle(Bundle value);

} // TerminologyBundleAxiom
