/**
 */
package gov.nasa.jpl.imce.oml.oti.provenance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OML2OTI Provenance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A 3 or 4 tuple establishing the provenance between:
 * - an OML Element identified by its primary key: omlUUID or, if it is an OML Resource, by its auxiliary key: omlIRI
 * - an OTI UMLElement (identified by its keys: otiID, otiURL, and, if available, otiUUID)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nasa.jpl.imce.oml.oti.provenance.OML2OTIProvenance#getOmlUUID <em>Oml UUID</em>}</li>
 *   <li>{@link gov.nasa.jpl.imce.oml.oti.provenance.OML2OTIProvenance#getOmlIRI <em>Oml IRI</em>}</li>
 *   <li>{@link gov.nasa.jpl.imce.oml.oti.provenance.OML2OTIProvenance#getOtiID <em>Oti ID</em>}</li>
 *   <li>{@link gov.nasa.jpl.imce.oml.oti.provenance.OML2OTIProvenance#getOtiURL <em>Oti URL</em>}</li>
 *   <li>{@link gov.nasa.jpl.imce.oml.oti.provenance.OML2OTIProvenance#getOtiUUID <em>Oti UUID</em>}</li>
 *   <li>{@link gov.nasa.jpl.imce.oml.oti.provenance.OML2OTIProvenance#getExplanation <em>Explanation</em>}</li>
 * </ul>
 *
 * @see gov.nasa.jpl.imce.oml.oti.provenance.ProvenancePackage#getOML2OTIProvenance()
 * @model
 * @generated
 */
public interface OML2OTIProvenance extends EObject {
	/**
	 * Returns the value of the '<em><b>Oml UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The UUID of an OML Resource mapped to OTI
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oml UUID</em>' attribute.
	 * @see #setOmlUUID(String)
	 * @see gov.nasa.jpl.imce.oml.oti.provenance.ProvenancePackage#getOML2OTIProvenance_OmlUUID()
	 * @model unique="false" dataType="gov.nasa.jpl.imce.oml.oti.provenance.UUID" required="true"
	 * @generated
	 */
	String getOmlUUID();

	/**
	 * Sets the value of the '{@link gov.nasa.jpl.imce.oml.oti.provenance.OML2OTIProvenance#getOmlUUID <em>Oml UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oml UUID</em>' attribute.
	 * @see #getOmlUUID()
	 * @generated
	 */
	void setOmlUUID(String value);

	/**
	 * Returns the value of the '<em><b>Oml IRI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the OML Element is an OML Resource, its IRI otherwise nothing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oml IRI</em>' attribute.
	 * @see #setOmlIRI(String)
	 * @see gov.nasa.jpl.imce.oml.oti.provenance.ProvenancePackage#getOML2OTIProvenance_OmlIRI()
	 * @model unique="false" dataType="gov.nasa.jpl.imce.oml.oti.provenance.OML_IRI"
	 * @generated
	 */
	String getOmlIRI();

	/**
	 * Sets the value of the '{@link gov.nasa.jpl.imce.oml.oti.provenance.OML2OTIProvenance#getOmlIRI <em>Oml IRI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oml IRI</em>' attribute.
	 * @see #getOmlIRI()
	 * @generated
	 */
	void setOmlIRI(String value);

	/**
	 * Returns the value of the '<em><b>Oti ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OTI tool-specific ID of the OTI element mapped from an OML Element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oti ID</em>' attribute.
	 * @see #setOtiID(String)
	 * @see gov.nasa.jpl.imce.oml.oti.provenance.ProvenancePackage#getOML2OTIProvenance_OtiID()
	 * @model unique="false" dataType="gov.nasa.jpl.imce.oml.oti.provenance.OTI_TOOL_SPECIFIC_ID" required="true"
	 * @generated
	 */
	String getOtiID();

	/**
	 * Sets the value of the '{@link gov.nasa.jpl.imce.oml.oti.provenance.OML2OTIProvenance#getOtiID <em>Oti ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oti ID</em>' attribute.
	 * @see #getOtiID()
	 * @generated
	 */
	void setOtiID(String value);

	/**
	 * Returns the value of the '<em><b>Oti URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OTI tool-specific URL of the OTI element mapped from an OML Element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oti URL</em>' attribute.
	 * @see #setOtiURL(String)
	 * @see gov.nasa.jpl.imce.oml.oti.provenance.ProvenancePackage#getOML2OTIProvenance_OtiURL()
	 * @model unique="false" dataType="gov.nasa.jpl.imce.oml.oti.provenance.OTI_TOOL_SPECIFIC_URL" required="true"
	 * @generated
	 */
	String getOtiURL();

	/**
	 * Sets the value of the '{@link gov.nasa.jpl.imce.oml.oti.provenance.OML2OTIProvenance#getOtiURL <em>Oti URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oti URL</em>' attribute.
	 * @see #getOtiURL()
	 * @generated
	 */
	void setOtiURL(String value);

	/**
	 * Returns the value of the '<em><b>Oti UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OTI tool-specific UUID of the OTI element mapped from an OML Element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oti UUID</em>' attribute.
	 * @see #setOtiUUID(String)
	 * @see gov.nasa.jpl.imce.oml.oti.provenance.ProvenancePackage#getOML2OTIProvenance_OtiUUID()
	 * @model unique="false" dataType="gov.nasa.jpl.imce.oml.oti.provenance.OTI_TOOL_SPECIFIC_UUID"
	 * @generated
	 */
	String getOtiUUID();

	/**
	 * Sets the value of the '{@link gov.nasa.jpl.imce.oml.oti.provenance.OML2OTIProvenance#getOtiUUID <em>Oti UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oti UUID</em>' attribute.
	 * @see #getOtiUUID()
	 * @generated
	 */
	void setOtiUUID(String value);

	/**
	 * Returns the value of the '<em><b>Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Explanation of the OML to OTI provenance mapping
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Explanation</em>' attribute.
	 * @see #setExplanation(String)
	 * @see gov.nasa.jpl.imce.oml.oti.provenance.ProvenancePackage#getOML2OTIProvenance_Explanation()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getExplanation();

	/**
	 * Sets the value of the '{@link gov.nasa.jpl.imce.oml.oti.provenance.OML2OTIProvenance#getExplanation <em>Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explanation</em>' attribute.
	 * @see #getExplanation()
	 * @generated
	 */
	void setExplanation(String value);

} // OML2OTIProvenance
