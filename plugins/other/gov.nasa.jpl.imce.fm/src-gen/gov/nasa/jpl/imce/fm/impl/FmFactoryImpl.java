/**
 */
package gov.nasa.jpl.imce.fm.impl;

import gov.nasa.jpl.imce.fm.BinaryCompositeAssociation;
import gov.nasa.jpl.imce.fm.Entity;
import gov.nasa.jpl.imce.fm.EssentialAttribute;
import gov.nasa.jpl.imce.fm.EssentialReference;
import gov.nasa.jpl.imce.fm.Extent;
import gov.nasa.jpl.imce.fm.FmFactory;
import gov.nasa.jpl.imce.fm.FmPackage;
import gov.nasa.jpl.imce.fm.NaturalInteger;
import gov.nasa.jpl.imce.fm.Value;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FmFactoryImpl extends EFactoryImpl implements FmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FmFactory init() {
		try {
			FmFactory theFmFactory = (FmFactory)EPackage.Registry.INSTANCE.getEFactory(FmPackage.eNS_URI);
			if (theFmFactory != null) {
				return theFmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FmPackage.BOOLEAN: return createBoolean();
			case FmPackage.STRING: return createString();
			case FmPackage.INTEGER: return createInteger();
			case FmPackage.NATURAL_INTEGER: return createNaturalInteger();
			case FmPackage.VALUE: return createValue();
			case FmPackage.ENTITY: return createEntity();
			case FmPackage.EXTENT: return createExtent();
			case FmPackage.BINARY_COMPOSITE_ASSOCIATION: return createBinaryCompositeAssociation();
			case FmPackage.ESSENTIAL_REFERENCE: return createEssentialReference();
			case FmPackage.ESSENTIAL_ATTRIBUTE: return createEssentialAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FmPackage.DT_STRING:
				return createDTStringFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FmPackage.DT_STRING:
				return convertDTStringToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.nasa.jpl.imce.fm.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.nasa.jpl.imce.fm.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.nasa.jpl.imce.fm.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalInteger createNaturalInteger() {
		NaturalIntegerImpl naturalInteger = new NaturalIntegerImpl();
		return naturalInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extent createExtent() {
		ExtentImpl extent = new ExtentImpl();
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryCompositeAssociation createBinaryCompositeAssociation() {
		BinaryCompositeAssociationImpl binaryCompositeAssociation = new BinaryCompositeAssociationImpl();
		return binaryCompositeAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EssentialReference createEssentialReference() {
		EssentialReferenceImpl essentialReference = new EssentialReferenceImpl();
		return essentialReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EssentialAttribute createEssentialAttribute() {
		EssentialAttributeImpl essentialAttribute = new EssentialAttributeImpl();
		return essentialAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.nasa.jpl.imce.fm.String createDTStringFromString(EDataType eDataType, String initialValue) {
		return (gov.nasa.jpl.imce.fm.String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDTStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmPackage getFmPackage() {
		return (FmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FmPackage getPackage() {
		return FmPackage.eINSTANCE;
	}

} //FmFactoryImpl
