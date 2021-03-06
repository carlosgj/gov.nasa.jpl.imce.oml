/**
 */
package gov.nasa.jpl.imce.fm.impl;

import gov.nasa.jpl.imce.fm.Entity;
import gov.nasa.jpl.imce.fm.EssentialReference;
import gov.nasa.jpl.imce.fm.FmPackage;
import gov.nasa.jpl.imce.fm.InformationCarryingMetaclass;
import gov.nasa.jpl.imce.fm.Metaclass;
import gov.nasa.jpl.imce.fm.Type;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Essential Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nasa.jpl.imce.fm.impl.EssentialReferenceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link gov.nasa.jpl.imce.fm.impl.EssentialReferenceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link gov.nasa.jpl.imce.fm.impl.EssentialReferenceImpl#getReferenceName <em>Reference Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EssentialReferenceImpl extends BinaryDirectedRelationshipImpl implements EssentialReference {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected InformationCarryingMetaclass source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Entity target;

	/**
	 * The default value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceName()
	 * @generated
	 * @ordered
	 */
	protected static final gov.nasa.jpl.imce.fm.String REFERENCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceName()
	 * @generated
	 * @ordered
	 */
	protected gov.nasa.jpl.imce.fm.String referenceName = REFERENCE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EssentialReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmPackage.Literals.ESSENTIAL_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationCarryingMetaclass getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (InformationCarryingMetaclass)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FmPackage.ESSENTIAL_REFERENCE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationCarryingMetaclass basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(InformationCarryingMetaclass newSource) {
		InformationCarryingMetaclass oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmPackage.ESSENTIAL_REFERENCE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Entity)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FmPackage.ESSENTIAL_REFERENCE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Entity newTarget) {
		Entity oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmPackage.ESSENTIAL_REFERENCE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.nasa.jpl.imce.fm.String getReferenceName() {
		return referenceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceName(gov.nasa.jpl.imce.fm.String newReferenceName) {
		gov.nasa.jpl.imce.fm.String oldReferenceName = referenceName;
		referenceName = newReferenceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmPackage.ESSENTIAL_REFERENCE__REFERENCE_NAME, oldReferenceName, referenceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metaclass domain() {
		return this.getSource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type range() {
		return this.getTarget();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FmPackage.ESSENTIAL_REFERENCE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case FmPackage.ESSENTIAL_REFERENCE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case FmPackage.ESSENTIAL_REFERENCE__REFERENCE_NAME:
				return getReferenceName();
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
			case FmPackage.ESSENTIAL_REFERENCE__SOURCE:
				setSource((InformationCarryingMetaclass)newValue);
				return;
			case FmPackage.ESSENTIAL_REFERENCE__TARGET:
				setTarget((Entity)newValue);
				return;
			case FmPackage.ESSENTIAL_REFERENCE__REFERENCE_NAME:
				setReferenceName((gov.nasa.jpl.imce.fm.String)newValue);
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
			case FmPackage.ESSENTIAL_REFERENCE__SOURCE:
				setSource((InformationCarryingMetaclass)null);
				return;
			case FmPackage.ESSENTIAL_REFERENCE__TARGET:
				setTarget((Entity)null);
				return;
			case FmPackage.ESSENTIAL_REFERENCE__REFERENCE_NAME:
				setReferenceName(REFERENCE_NAME_EDEFAULT);
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
			case FmPackage.ESSENTIAL_REFERENCE__SOURCE:
				return source != null;
			case FmPackage.ESSENTIAL_REFERENCE__TARGET:
				return target != null;
			case FmPackage.ESSENTIAL_REFERENCE__REFERENCE_NAME:
				return REFERENCE_NAME_EDEFAULT == null ? referenceName != null : !REFERENCE_NAME_EDEFAULT.equals(referenceName);
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
			case FmPackage.ESSENTIAL_REFERENCE___DOMAIN:
				return domain();
			case FmPackage.ESSENTIAL_REFERENCE___RANGE:
				return range();
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
		result.append(" (referenceName: ");
		result.append(referenceName);
		result.append(')');
		return result.toString();
	}

} //EssentialReferenceImpl
