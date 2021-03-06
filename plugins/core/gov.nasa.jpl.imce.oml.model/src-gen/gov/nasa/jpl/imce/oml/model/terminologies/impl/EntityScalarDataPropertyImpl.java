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
package gov.nasa.jpl.imce.oml.model.terminologies.impl;

import gov.nasa.jpl.imce.oml.model.terminologies.DataRange;
import gov.nasa.jpl.imce.oml.model.terminologies.DataRelationshipDomain;
import gov.nasa.jpl.imce.oml.model.terminologies.DataRelationshipFromEntity;
import gov.nasa.jpl.imce.oml.model.terminologies.DataRelationshipRange;
import gov.nasa.jpl.imce.oml.model.terminologies.DataRelationshipToScalar;
import gov.nasa.jpl.imce.oml.model.terminologies.Datatype;
import gov.nasa.jpl.imce.oml.model.terminologies.Entity;
import gov.nasa.jpl.imce.oml.model.terminologies.EntityScalarDataProperty;
import gov.nasa.jpl.imce.oml.model.terminologies.Term;
import gov.nasa.jpl.imce.oml.model.terminologies.TerminologiesPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Scalar Data Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nasa.jpl.imce.oml.model.terminologies.impl.EntityScalarDataPropertyImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link gov.nasa.jpl.imce.oml.model.terminologies.impl.EntityScalarDataPropertyImpl#isIsIdentityCriteria <em>Is Identity Criteria</em>}</li>
 *   <li>{@link gov.nasa.jpl.imce.oml.model.terminologies.impl.EntityScalarDataPropertyImpl#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityScalarDataPropertyImpl extends DataRelationshipImpl implements EntityScalarDataProperty {
	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected Entity domain;

	/**
	 * The default value of the '{@link #isIsIdentityCriteria() <em>Is Identity Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIdentityCriteria()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_IDENTITY_CRITERIA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsIdentityCriteria() <em>Is Identity Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIdentityCriteria()
	 * @generated
	 * @ordered
	 */
	protected boolean isIdentityCriteria = IS_IDENTITY_CRITERIA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected DataRange range;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityScalarDataPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerminologiesPackage.Literals.ENTITY_SCALAR_DATA_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getDomain() {
		if (domain != null && ((EObject)domain).eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (Entity)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(Entity newDomain) {
		Entity oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsIdentityCriteria() {
		return isIdentityCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIdentityCriteria(boolean newIsIdentityCriteria) {
		boolean oldIsIdentityCriteria = isIdentityCriteria;
		isIdentityCriteria = newIsIdentityCriteria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY__IS_IDENTITY_CRITERIA, oldIsIdentityCriteria, isIdentityCriteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRange getRange() {
		if (range != null && ((EObject)range).eIsProxy()) {
			InternalEObject oldRange = (InternalEObject)range;
			range = (DataRange)eResolveProxy(oldRange);
			if (range != oldRange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY__RANGE, oldRange, range));
			}
		}
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRange basicGetRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(DataRange newRange) {
		DataRange oldRange = range;
		range = newRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY__RANGE, oldRange, range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term source() {
		return this.getDomain();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype target() {
		return this.getRange();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY__IS_IDENTITY_CRITERIA:
				return isIsIdentityCriteria();
			case TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY__RANGE:
				if (resolve) return getRange();
				return basicGetRange();
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
			case TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY__DOMAIN:
				setDomain((Entity)newValue);
				return;
			case TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY__IS_IDENTITY_CRITERIA:
				setIsIdentityCriteria((Boolean)newValue);
				return;
			case TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY__RANGE:
				setRange((DataRange)newValue);
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
			case TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY__DOMAIN:
				setDomain((Entity)null);
				return;
			case TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY__IS_IDENTITY_CRITERIA:
				setIsIdentityCriteria(IS_IDENTITY_CRITERIA_EDEFAULT);
				return;
			case TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY__RANGE:
				setRange((DataRange)null);
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
			case TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY__DOMAIN:
				return domain != null;
			case TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY__IS_IDENTITY_CRITERIA:
				return isIdentityCriteria != IS_IDENTITY_CRITERIA_EDEFAULT;
			case TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY__RANGE:
				return range != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DataRelationshipDomain.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DataRelationshipFromEntity.class) {
			switch (derivedFeatureID) {
				case TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY__DOMAIN: return TerminologiesPackage.DATA_RELATIONSHIP_FROM_ENTITY__DOMAIN;
				case TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY__IS_IDENTITY_CRITERIA: return TerminologiesPackage.DATA_RELATIONSHIP_FROM_ENTITY__IS_IDENTITY_CRITERIA;
				default: return -1;
			}
		}
		if (baseClass == DataRelationshipRange.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DataRelationshipToScalar.class) {
			switch (derivedFeatureID) {
				case TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY__RANGE: return TerminologiesPackage.DATA_RELATIONSHIP_TO_SCALAR__RANGE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DataRelationshipDomain.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DataRelationshipFromEntity.class) {
			switch (baseFeatureID) {
				case TerminologiesPackage.DATA_RELATIONSHIP_FROM_ENTITY__DOMAIN: return TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY__DOMAIN;
				case TerminologiesPackage.DATA_RELATIONSHIP_FROM_ENTITY__IS_IDENTITY_CRITERIA: return TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY__IS_IDENTITY_CRITERIA;
				default: return -1;
			}
		}
		if (baseClass == DataRelationshipRange.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DataRelationshipToScalar.class) {
			switch (baseFeatureID) {
				case TerminologiesPackage.DATA_RELATIONSHIP_TO_SCALAR__RANGE: return TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY__RANGE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY___SOURCE:
				return source();
			case TerminologiesPackage.ENTITY_SCALAR_DATA_PROPERTY___TARGET:
				return target();
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
		result.append(" (isIdentityCriteria: ");
		result.append(isIdentityCriteria);
		result.append(')');
		return result.toString();
	}

} //EntityScalarDataPropertyImpl
