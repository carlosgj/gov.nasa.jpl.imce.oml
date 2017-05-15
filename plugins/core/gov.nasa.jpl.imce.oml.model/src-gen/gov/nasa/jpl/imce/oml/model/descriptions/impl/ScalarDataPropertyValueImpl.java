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
package gov.nasa.jpl.imce.oml.model.descriptions.impl;

import gov.nasa.jpl.imce.oml.model.common.impl.ElementImpl;

import gov.nasa.jpl.imce.oml.model.descriptions.DescriptionBox;
import gov.nasa.jpl.imce.oml.model.descriptions.DescriptionsPackage;
import gov.nasa.jpl.imce.oml.model.descriptions.ScalarDataPropertyValue;
import gov.nasa.jpl.imce.oml.model.descriptions.SingletonInstanceStructuredDataPropertyContext;

import gov.nasa.jpl.imce.oml.model.extensions.OMLExtensions;

import gov.nasa.jpl.imce.oml.model.terminologies.DataRelationshipToScalar;

import java.lang.reflect.InvocationTargetException;

import java.util.UUID;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.xtext.xbase.lib.Pair;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scalar Data Property Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nasa.jpl.imce.oml.model.descriptions.impl.ScalarDataPropertyValueImpl#getStructuredDataPropertyContext <em>Structured Data Property Context</em>}</li>
 *   <li>{@link gov.nasa.jpl.imce.oml.model.descriptions.impl.ScalarDataPropertyValueImpl#getScalarDataProperty <em>Scalar Data Property</em>}</li>
 *   <li>{@link gov.nasa.jpl.imce.oml.model.descriptions.impl.ScalarDataPropertyValueImpl#getScalarPropertyValue <em>Scalar Property Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScalarDataPropertyValueImpl extends ElementImpl implements ScalarDataPropertyValue {
	/**
	 * The cached value of the '{@link #getScalarDataProperty() <em>Scalar Data Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarDataProperty()
	 * @generated
	 * @ordered
	 */
	protected DataRelationshipToScalar scalarDataProperty;

	/**
	 * The default value of the '{@link #getScalarPropertyValue() <em>Scalar Property Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarPropertyValue()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALAR_PROPERTY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScalarPropertyValue() <em>Scalar Property Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarPropertyValue()
	 * @generated
	 * @ordered
	 */
	protected String scalarPropertyValue = SCALAR_PROPERTY_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScalarDataPropertyValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DescriptionsPackage.Literals.SCALAR_DATA_PROPERTY_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonInstanceStructuredDataPropertyContext getStructuredDataPropertyContext() {
		if (eContainerFeatureID() != DescriptionsPackage.SCALAR_DATA_PROPERTY_VALUE__STRUCTURED_DATA_PROPERTY_CONTEXT) return null;
		return (SingletonInstanceStructuredDataPropertyContext)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonInstanceStructuredDataPropertyContext basicGetStructuredDataPropertyContext() {
		if (eContainerFeatureID() != DescriptionsPackage.SCALAR_DATA_PROPERTY_VALUE__STRUCTURED_DATA_PROPERTY_CONTEXT) return null;
		return (SingletonInstanceStructuredDataPropertyContext)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuredDataPropertyContext(SingletonInstanceStructuredDataPropertyContext newStructuredDataPropertyContext, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStructuredDataPropertyContext, DescriptionsPackage.SCALAR_DATA_PROPERTY_VALUE__STRUCTURED_DATA_PROPERTY_CONTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructuredDataPropertyContext(SingletonInstanceStructuredDataPropertyContext newStructuredDataPropertyContext) {
		if (newStructuredDataPropertyContext != eInternalContainer() || (eContainerFeatureID() != DescriptionsPackage.SCALAR_DATA_PROPERTY_VALUE__STRUCTURED_DATA_PROPERTY_CONTEXT && newStructuredDataPropertyContext != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newStructuredDataPropertyContext))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStructuredDataPropertyContext != null)
				msgs = ((InternalEObject)newStructuredDataPropertyContext).eInverseAdd(this, DescriptionsPackage.SINGLETON_INSTANCE_STRUCTURED_DATA_PROPERTY_CONTEXT__SCALAR_DATA_PROPERTY_VALUES, SingletonInstanceStructuredDataPropertyContext.class, msgs);
			msgs = basicSetStructuredDataPropertyContext(newStructuredDataPropertyContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionsPackage.SCALAR_DATA_PROPERTY_VALUE__STRUCTURED_DATA_PROPERTY_CONTEXT, newStructuredDataPropertyContext, newStructuredDataPropertyContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRelationshipToScalar getScalarDataProperty() {
		if (scalarDataProperty != null && ((EObject)scalarDataProperty).eIsProxy()) {
			InternalEObject oldScalarDataProperty = (InternalEObject)scalarDataProperty;
			scalarDataProperty = (DataRelationshipToScalar)eResolveProxy(oldScalarDataProperty);
			if (scalarDataProperty != oldScalarDataProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DescriptionsPackage.SCALAR_DATA_PROPERTY_VALUE__SCALAR_DATA_PROPERTY, oldScalarDataProperty, scalarDataProperty));
			}
		}
		return scalarDataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRelationshipToScalar basicGetScalarDataProperty() {
		return scalarDataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalarDataProperty(DataRelationshipToScalar newScalarDataProperty) {
		DataRelationshipToScalar oldScalarDataProperty = scalarDataProperty;
		scalarDataProperty = newScalarDataProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionsPackage.SCALAR_DATA_PROPERTY_VALUE__SCALAR_DATA_PROPERTY, oldScalarDataProperty, scalarDataProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScalarPropertyValue() {
		return scalarPropertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalarPropertyValue(String newScalarPropertyValue) {
		String oldScalarPropertyValue = scalarPropertyValue;
		scalarPropertyValue = newScalarPropertyValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionsPackage.SCALAR_DATA_PROPERTY_VALUE__SCALAR_PROPERTY_VALUE, oldScalarPropertyValue, scalarPropertyValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionBox descriptionBox() {
		SingletonInstanceStructuredDataPropertyContext _structuredDataPropertyContext = this.getStructuredDataPropertyContext();
		DescriptionBox _descriptionBox = null;
		if (_structuredDataPropertyContext!=null) {
			_descriptionBox=_structuredDataPropertyContext.descriptionBox();
		}
		return _descriptionBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String uuid() {
		SingletonInstanceStructuredDataPropertyContext _structuredDataPropertyContext = this.getStructuredDataPropertyContext();
		String _uuid = null;
		if (_structuredDataPropertyContext!=null) {
			_uuid=_structuredDataPropertyContext.uuid();
		}
		String _string = null;
		if (_uuid!=null) {
			_string=_uuid.toString();
		}
		Pair<String, String> _mappedTo = Pair.<String, String>of("structuredDataPropertyContext", _string);
		DataRelationshipToScalar _scalarDataProperty = this.getScalarDataProperty();
		String _uuid_1 = null;
		if (_scalarDataProperty!=null) {
			_uuid_1=_scalarDataProperty.uuid();
		}
		String _string_1 = null;
		if (_uuid_1!=null) {
			_string_1=_uuid_1.toString();
		}
		Pair<String, String> _mappedTo_1 = Pair.<String, String>of("scalarDataProperty", _string_1);
		UUID _derivedUUID = OMLExtensions.derivedUUID(
			"ScalarDataPropertyValue", _mappedTo, _mappedTo_1);
		String _string_2 = null;
		if (_derivedUUID!=null) {
			_string_2=_derivedUUID.toString();
		}
		return _string_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DescriptionsPackage.SCALAR_DATA_PROPERTY_VALUE__STRUCTURED_DATA_PROPERTY_CONTEXT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStructuredDataPropertyContext((SingletonInstanceStructuredDataPropertyContext)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DescriptionsPackage.SCALAR_DATA_PROPERTY_VALUE__STRUCTURED_DATA_PROPERTY_CONTEXT:
				return basicSetStructuredDataPropertyContext(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DescriptionsPackage.SCALAR_DATA_PROPERTY_VALUE__STRUCTURED_DATA_PROPERTY_CONTEXT:
				return eInternalContainer().eInverseRemove(this, DescriptionsPackage.SINGLETON_INSTANCE_STRUCTURED_DATA_PROPERTY_CONTEXT__SCALAR_DATA_PROPERTY_VALUES, SingletonInstanceStructuredDataPropertyContext.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DescriptionsPackage.SCALAR_DATA_PROPERTY_VALUE__STRUCTURED_DATA_PROPERTY_CONTEXT:
				if (resolve) return getStructuredDataPropertyContext();
				return basicGetStructuredDataPropertyContext();
			case DescriptionsPackage.SCALAR_DATA_PROPERTY_VALUE__SCALAR_DATA_PROPERTY:
				if (resolve) return getScalarDataProperty();
				return basicGetScalarDataProperty();
			case DescriptionsPackage.SCALAR_DATA_PROPERTY_VALUE__SCALAR_PROPERTY_VALUE:
				return getScalarPropertyValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DescriptionsPackage.SCALAR_DATA_PROPERTY_VALUE__STRUCTURED_DATA_PROPERTY_CONTEXT:
				setStructuredDataPropertyContext((SingletonInstanceStructuredDataPropertyContext)newValue);
				return;
			case DescriptionsPackage.SCALAR_DATA_PROPERTY_VALUE__SCALAR_DATA_PROPERTY:
				setScalarDataProperty((DataRelationshipToScalar)newValue);
				return;
			case DescriptionsPackage.SCALAR_DATA_PROPERTY_VALUE__SCALAR_PROPERTY_VALUE:
				setScalarPropertyValue((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DescriptionsPackage.SCALAR_DATA_PROPERTY_VALUE__STRUCTURED_DATA_PROPERTY_CONTEXT:
				setStructuredDataPropertyContext((SingletonInstanceStructuredDataPropertyContext)null);
				return;
			case DescriptionsPackage.SCALAR_DATA_PROPERTY_VALUE__SCALAR_DATA_PROPERTY:
				setScalarDataProperty((DataRelationshipToScalar)null);
				return;
			case DescriptionsPackage.SCALAR_DATA_PROPERTY_VALUE__SCALAR_PROPERTY_VALUE:
				setScalarPropertyValue(SCALAR_PROPERTY_VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DescriptionsPackage.SCALAR_DATA_PROPERTY_VALUE__STRUCTURED_DATA_PROPERTY_CONTEXT:
				return basicGetStructuredDataPropertyContext() != null;
			case DescriptionsPackage.SCALAR_DATA_PROPERTY_VALUE__SCALAR_DATA_PROPERTY:
				return scalarDataProperty != null;
			case DescriptionsPackage.SCALAR_DATA_PROPERTY_VALUE__SCALAR_PROPERTY_VALUE:
				return SCALAR_PROPERTY_VALUE_EDEFAULT == null ? scalarPropertyValue != null : !SCALAR_PROPERTY_VALUE_EDEFAULT.equals(scalarPropertyValue);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DescriptionsPackage.SCALAR_DATA_PROPERTY_VALUE___DESCRIPTION_BOX:
				return descriptionBox();
			case DescriptionsPackage.SCALAR_DATA_PROPERTY_VALUE___UUID:
				return uuid();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (scalarPropertyValue: ");
		result.append(scalarPropertyValue);
		result.append(')');
		return result.toString();
	}

} //ScalarDataPropertyValueImpl