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
package gov.nasa.jpl.imce.oml.model.common.impl;

import gov.nasa.jpl.imce.oml.model.common.AnnotationProperty;
import gov.nasa.jpl.imce.oml.model.common.AnnotationPropertyValue;
import gov.nasa.jpl.imce.oml.model.common.CommonFactory;
import gov.nasa.jpl.imce.oml.model.common.CommonPackage;
import gov.nasa.jpl.imce.oml.model.common.CrossReferencabilityKind;
import gov.nasa.jpl.imce.oml.model.common.CrossReferencableKind;
import gov.nasa.jpl.imce.oml.model.common.ElementCrossReferenceTuple;
import gov.nasa.jpl.imce.oml.model.common.Extent;
import gov.nasa.jpl.imce.oml.model.common.ExtrinsicIdentityKind;
import gov.nasa.jpl.imce.oml.model.common.IdentityKind;
import gov.nasa.jpl.imce.oml.model.common.IntrinsicIdentityKind;
import gov.nasa.jpl.imce.oml.model.common.LiteralBoolean;
import gov.nasa.jpl.imce.oml.model.common.LiteralDateTime;
import gov.nasa.jpl.imce.oml.model.common.LiteralDecimal;
import gov.nasa.jpl.imce.oml.model.common.LiteralFloat;
import gov.nasa.jpl.imce.oml.model.common.LiteralNumber;
import gov.nasa.jpl.imce.oml.model.common.LiteralQuotedString;
import gov.nasa.jpl.imce.oml.model.common.LiteralRational;
import gov.nasa.jpl.imce.oml.model.common.LiteralRawString;
import gov.nasa.jpl.imce.oml.model.common.LiteralReal;
import gov.nasa.jpl.imce.oml.model.common.LiteralString;
import gov.nasa.jpl.imce.oml.model.common.LiteralURI;
import gov.nasa.jpl.imce.oml.model.common.LiteralUUID;
import gov.nasa.jpl.imce.oml.model.common.LiteralValue;
import gov.nasa.jpl.imce.oml.model.common.LogicalElement;
import gov.nasa.jpl.imce.oml.model.common.Module;
import gov.nasa.jpl.imce.oml.model.common.ModuleEdge;
import gov.nasa.jpl.imce.oml.model.common.ModuleElement;
import gov.nasa.jpl.imce.oml.model.common.NonCrossReferencableKind;
import gov.nasa.jpl.imce.oml.model.common.NonLogicalElement;
import gov.nasa.jpl.imce.oml.model.common.Resource;
import gov.nasa.jpl.imce.oml.model.common.ValueCrossReferenceTuple;

import gov.nasa.jpl.imce.oml.model.datatypes.AbstractDecimalValue;
import gov.nasa.jpl.imce.oml.model.datatypes.DateTimeValue;
import gov.nasa.jpl.imce.oml.model.datatypes.DecimalValue;
import gov.nasa.jpl.imce.oml.model.datatypes.FloatValue;
import gov.nasa.jpl.imce.oml.model.datatypes.LanguageTagValue;
import gov.nasa.jpl.imce.oml.model.datatypes.PatternValue;
import gov.nasa.jpl.imce.oml.model.datatypes.PositiveIntegerValue;
import gov.nasa.jpl.imce.oml.model.datatypes.QuotedStringValue;
import gov.nasa.jpl.imce.oml.model.datatypes.RationalValue;
import gov.nasa.jpl.imce.oml.model.datatypes.RawStringValue;
import gov.nasa.jpl.imce.oml.model.datatypes.RealValue;
import gov.nasa.jpl.imce.oml.model.datatypes.StringValue;
import gov.nasa.jpl.imce.oml.model.datatypes.URIValue;
import gov.nasa.jpl.imce.oml.model.datatypes.UUIDValue;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonPackageImpl extends EPackageImpl implements CommonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalDateTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalQuotedStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalRawStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalUUIDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalURIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalRealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalRationalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalFloatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalDecimalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crossReferencabilityKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crossReferencableKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonCrossReferencableKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intrinsicIdentityKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extrinsicIdentityKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementCrossReferenceTupleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueCrossReferenceTupleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonLogicalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationPropertyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iriEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType localNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uuidEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType abbrevIRIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType namespacePrefixEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveIntegerLiteralEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType literalPatternEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType realDataTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rationalDataTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatDataTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType abstractDecimalDataTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType decimalDataTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTimeDataTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType languageTagDataTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringDataTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rawStringDataTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType quotedStringDataTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uuidDataTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriDataTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gov.nasa.jpl.imce.oml.model.common.CommonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommonPackageImpl() {
		super(eNS_URI, CommonFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CommonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommonPackage init() {
		if (isInited) return (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Obtain or create and register package
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommonPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCommonPackage.createPackageContents();

		// Initialize created meta-data
		theCommonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommonPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommonPackage.eNS_URI, theCommonPackage);
		return theCommonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralValue() {
		return literalValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLiteralValue__Value() {
		return literalValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralBoolean() {
		return literalBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralBoolean_Bool() {
		return (EAttribute)literalBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLiteralBoolean__Value() {
		return literalBooleanEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralDateTime() {
		return literalDateTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralDateTime_DateTime() {
		return (EAttribute)literalDateTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLiteralDateTime__Value() {
		return literalDateTimeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralString() {
		return literalStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLiteralString__StringValue() {
		return literalStringEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLiteralString__Value() {
		return literalStringEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralQuotedString() {
		return literalQuotedStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralQuotedString_String() {
		return (EAttribute)literalQuotedStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLiteralQuotedString__StringValue() {
		return literalQuotedStringEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralRawString() {
		return literalRawStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralRawString_String() {
		return (EAttribute)literalRawStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLiteralRawString__StringValue() {
		return literalRawStringEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralUUID() {
		return literalUUIDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralUUID_Uuid() {
		return (EAttribute)literalUUIDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLiteralUUID__Value() {
		return literalUUIDEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralURI() {
		return literalURIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralURI_Uri() {
		return (EAttribute)literalURIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLiteralURI__Value() {
		return literalURIEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralNumber() {
		return literalNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralReal() {
		return literalRealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralReal_Real() {
		return (EAttribute)literalRealEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLiteralReal__Value() {
		return literalRealEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralRational() {
		return literalRationalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralRational_Rational() {
		return (EAttribute)literalRationalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLiteralRational__Value() {
		return literalRationalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralFloat() {
		return literalFloatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralFloat_Float() {
		return (EAttribute)literalFloatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLiteralFloat__Value() {
		return literalFloatEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralDecimal() {
		return literalDecimalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralDecimal_Decimal() {
		return (EAttribute)literalDecimalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLiteralDecimal__Value() {
		return literalDecimalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrossReferencabilityKind() {
		return crossReferencabilityKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrossReferencabilityKind_Uuid() {
		return (EAttribute)crossReferencabilityKindEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCrossReferencabilityKind__Uuid() {
		return crossReferencabilityKindEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrossReferencableKind() {
		return crossReferencableKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonCrossReferencableKind() {
		return nonCrossReferencableKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentityKind() {
		return identityKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntrinsicIdentityKind() {
		return intrinsicIdentityKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIntrinsicIdentityKind__Iri() {
		return intrinsicIdentityKindEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtrinsicIdentityKind() {
		return extrinsicIdentityKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementCrossReferenceTuple() {
		return elementCrossReferenceTupleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueCrossReferenceTuple() {
		return valueCrossReferenceTupleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalElement() {
		return logicalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalElement_Annotations() {
		return (EReference)logicalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLogicalElement__ModuleContext() {
		return logicalElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonLogicalElement() {
		return nonLogicalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResource__Name() {
		return resourceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResource__AbbrevIRI() {
		return resourceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleElement() {
		return moduleElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModuleElement__AllNestedElements() {
		return moduleElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleEdge() {
		return moduleEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModuleEdge__SourceModule() {
		return moduleEdgeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModuleEdge__TargetModule() {
		return moduleEdgeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModuleEdge__ModuleContext() {
		return moduleEdgeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationProperty() {
		return annotationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationProperty_Extent() {
		return (EReference)annotationPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationProperty_Iri() {
		return (EAttribute)annotationPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationProperty_AbbrevIRI() {
		return (EAttribute)annotationPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationProperty__Uuid() {
		return annotationPropertyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationProperty__Iri() {
		return annotationPropertyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationPropertyValue() {
		return annotationPropertyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationPropertyValue_Subject() {
		return (EReference)annotationPropertyValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationPropertyValue_Property() {
		return (EReference)annotationPropertyValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationPropertyValue_Value() {
		return (EReference)annotationPropertyValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnnotationPropertyValue__Uuid() {
		return annotationPropertyValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtent() {
		return extentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtent_Modules() {
		return (EReference)extentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtent_AnnotationProperties() {
		return (EReference)extentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Extent() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Iri() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__ModuleEdges() {
		return moduleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__Iri() {
		return moduleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__NsPrefix() {
		return moduleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__Name() {
		return moduleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__AbbrevIRI() {
		return moduleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__Uuid() {
		return moduleEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__ModuleContext() {
		return moduleEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModule__ModuleElements() {
		return moduleEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIRI() {
		return iriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLocalName() {
		return localNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUUID() {
		return uuidEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAbbrevIRI() {
		return abbrevIRIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNamespacePrefix() {
		return namespacePrefixEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositiveIntegerLiteral() {
		return positiveIntegerLiteralEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLiteralPattern() {
		return literalPatternEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRealDataType() {
		return realDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRationalDataType() {
		return rationalDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloatDataType() {
		return floatDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAbstractDecimalDataType() {
		return abstractDecimalDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDecimalDataType() {
		return decimalDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDateTimeDataType() {
		return dateTimeDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLanguageTagDataType() {
		return languageTagDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStringDataType() {
		return stringDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRawStringDataType() {
		return rawStringDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getQuotedStringDataType() {
		return quotedStringDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUUIDDataType() {
		return uuidDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURIDataType() {
		return uriDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonFactory getCommonFactory() {
		return (CommonFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		literalValueEClass = createEClass(LITERAL_VALUE);
		createEOperation(literalValueEClass, LITERAL_VALUE___VALUE);

		literalBooleanEClass = createEClass(LITERAL_BOOLEAN);
		createEAttribute(literalBooleanEClass, LITERAL_BOOLEAN__BOOL);
		createEOperation(literalBooleanEClass, LITERAL_BOOLEAN___VALUE);

		literalDateTimeEClass = createEClass(LITERAL_DATE_TIME);
		createEAttribute(literalDateTimeEClass, LITERAL_DATE_TIME__DATE_TIME);
		createEOperation(literalDateTimeEClass, LITERAL_DATE_TIME___VALUE);

		literalStringEClass = createEClass(LITERAL_STRING);
		createEOperation(literalStringEClass, LITERAL_STRING___STRING_VALUE);
		createEOperation(literalStringEClass, LITERAL_STRING___VALUE);

		literalQuotedStringEClass = createEClass(LITERAL_QUOTED_STRING);
		createEAttribute(literalQuotedStringEClass, LITERAL_QUOTED_STRING__STRING);
		createEOperation(literalQuotedStringEClass, LITERAL_QUOTED_STRING___STRING_VALUE);

		literalRawStringEClass = createEClass(LITERAL_RAW_STRING);
		createEAttribute(literalRawStringEClass, LITERAL_RAW_STRING__STRING);
		createEOperation(literalRawStringEClass, LITERAL_RAW_STRING___STRING_VALUE);

		literalUUIDEClass = createEClass(LITERAL_UUID);
		createEAttribute(literalUUIDEClass, LITERAL_UUID__UUID);
		createEOperation(literalUUIDEClass, LITERAL_UUID___VALUE);

		literalURIEClass = createEClass(LITERAL_URI);
		createEAttribute(literalURIEClass, LITERAL_URI__URI);
		createEOperation(literalURIEClass, LITERAL_URI___VALUE);

		literalNumberEClass = createEClass(LITERAL_NUMBER);

		literalRealEClass = createEClass(LITERAL_REAL);
		createEAttribute(literalRealEClass, LITERAL_REAL__REAL);
		createEOperation(literalRealEClass, LITERAL_REAL___VALUE);

		literalRationalEClass = createEClass(LITERAL_RATIONAL);
		createEAttribute(literalRationalEClass, LITERAL_RATIONAL__RATIONAL);
		createEOperation(literalRationalEClass, LITERAL_RATIONAL___VALUE);

		literalFloatEClass = createEClass(LITERAL_FLOAT);
		createEAttribute(literalFloatEClass, LITERAL_FLOAT__FLOAT);
		createEOperation(literalFloatEClass, LITERAL_FLOAT___VALUE);

		literalDecimalEClass = createEClass(LITERAL_DECIMAL);
		createEAttribute(literalDecimalEClass, LITERAL_DECIMAL__DECIMAL);
		createEOperation(literalDecimalEClass, LITERAL_DECIMAL___VALUE);

		crossReferencabilityKindEClass = createEClass(CROSS_REFERENCABILITY_KIND);
		createEAttribute(crossReferencabilityKindEClass, CROSS_REFERENCABILITY_KIND__UUID);
		createEOperation(crossReferencabilityKindEClass, CROSS_REFERENCABILITY_KIND___UUID);

		crossReferencableKindEClass = createEClass(CROSS_REFERENCABLE_KIND);

		nonCrossReferencableKindEClass = createEClass(NON_CROSS_REFERENCABLE_KIND);

		identityKindEClass = createEClass(IDENTITY_KIND);

		intrinsicIdentityKindEClass = createEClass(INTRINSIC_IDENTITY_KIND);
		createEOperation(intrinsicIdentityKindEClass, INTRINSIC_IDENTITY_KIND___IRI);

		extrinsicIdentityKindEClass = createEClass(EXTRINSIC_IDENTITY_KIND);

		elementCrossReferenceTupleEClass = createEClass(ELEMENT_CROSS_REFERENCE_TUPLE);

		valueCrossReferenceTupleEClass = createEClass(VALUE_CROSS_REFERENCE_TUPLE);

		logicalElementEClass = createEClass(LOGICAL_ELEMENT);
		createEReference(logicalElementEClass, LOGICAL_ELEMENT__ANNOTATIONS);
		createEOperation(logicalElementEClass, LOGICAL_ELEMENT___MODULE_CONTEXT);

		nonLogicalElementEClass = createEClass(NON_LOGICAL_ELEMENT);

		resourceEClass = createEClass(RESOURCE);
		createEOperation(resourceEClass, RESOURCE___NAME);
		createEOperation(resourceEClass, RESOURCE___ABBREV_IRI);

		moduleElementEClass = createEClass(MODULE_ELEMENT);
		createEOperation(moduleElementEClass, MODULE_ELEMENT___ALL_NESTED_ELEMENTS);

		moduleEdgeEClass = createEClass(MODULE_EDGE);
		createEOperation(moduleEdgeEClass, MODULE_EDGE___SOURCE_MODULE);
		createEOperation(moduleEdgeEClass, MODULE_EDGE___TARGET_MODULE);
		createEOperation(moduleEdgeEClass, MODULE_EDGE___MODULE_CONTEXT);

		annotationPropertyEClass = createEClass(ANNOTATION_PROPERTY);
		createEReference(annotationPropertyEClass, ANNOTATION_PROPERTY__EXTENT);
		createEAttribute(annotationPropertyEClass, ANNOTATION_PROPERTY__IRI);
		createEAttribute(annotationPropertyEClass, ANNOTATION_PROPERTY__ABBREV_IRI);
		createEOperation(annotationPropertyEClass, ANNOTATION_PROPERTY___UUID);
		createEOperation(annotationPropertyEClass, ANNOTATION_PROPERTY___IRI);

		annotationPropertyValueEClass = createEClass(ANNOTATION_PROPERTY_VALUE);
		createEReference(annotationPropertyValueEClass, ANNOTATION_PROPERTY_VALUE__SUBJECT);
		createEReference(annotationPropertyValueEClass, ANNOTATION_PROPERTY_VALUE__PROPERTY);
		createEReference(annotationPropertyValueEClass, ANNOTATION_PROPERTY_VALUE__VALUE);
		createEOperation(annotationPropertyValueEClass, ANNOTATION_PROPERTY_VALUE___UUID);

		extentEClass = createEClass(EXTENT);
		createEReference(extentEClass, EXTENT__MODULES);
		createEReference(extentEClass, EXTENT__ANNOTATION_PROPERTIES);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__EXTENT);
		createEAttribute(moduleEClass, MODULE__IRI);
		createEOperation(moduleEClass, MODULE___MODULE_EDGES);
		createEOperation(moduleEClass, MODULE___IRI);
		createEOperation(moduleEClass, MODULE___NS_PREFIX);
		createEOperation(moduleEClass, MODULE___NAME);
		createEOperation(moduleEClass, MODULE___ABBREV_IRI);
		createEOperation(moduleEClass, MODULE___UUID);
		createEOperation(moduleEClass, MODULE___MODULE_CONTEXT);
		createEOperation(moduleEClass, MODULE___MODULE_ELEMENTS);

		// Create data types
		iriEDataType = createEDataType(IRI);
		localNameEDataType = createEDataType(LOCAL_NAME);
		uuidEDataType = createEDataType(UUID);
		abbrevIRIEDataType = createEDataType(ABBREV_IRI);
		namespacePrefixEDataType = createEDataType(NAMESPACE_PREFIX);
		positiveIntegerLiteralEDataType = createEDataType(POSITIVE_INTEGER_LITERAL);
		literalPatternEDataType = createEDataType(LITERAL_PATTERN);
		realDataTypeEDataType = createEDataType(REAL_DATA_TYPE);
		rationalDataTypeEDataType = createEDataType(RATIONAL_DATA_TYPE);
		floatDataTypeEDataType = createEDataType(FLOAT_DATA_TYPE);
		abstractDecimalDataTypeEDataType = createEDataType(ABSTRACT_DECIMAL_DATA_TYPE);
		decimalDataTypeEDataType = createEDataType(DECIMAL_DATA_TYPE);
		dateTimeDataTypeEDataType = createEDataType(DATE_TIME_DATA_TYPE);
		languageTagDataTypeEDataType = createEDataType(LANGUAGE_TAG_DATA_TYPE);
		stringDataTypeEDataType = createEDataType(STRING_DATA_TYPE);
		rawStringDataTypeEDataType = createEDataType(RAW_STRING_DATA_TYPE);
		quotedStringDataTypeEDataType = createEDataType(QUOTED_STRING_DATA_TYPE);
		uuidDataTypeEDataType = createEDataType(UUID_DATA_TYPE);
		uriDataTypeEDataType = createEDataType(URI_DATA_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		literalBooleanEClass.getESuperTypes().add(this.getLiteralValue());
		literalDateTimeEClass.getESuperTypes().add(this.getLiteralValue());
		literalStringEClass.getESuperTypes().add(this.getLiteralValue());
		literalQuotedStringEClass.getESuperTypes().add(this.getLiteralString());
		literalRawStringEClass.getESuperTypes().add(this.getLiteralString());
		literalUUIDEClass.getESuperTypes().add(this.getLiteralValue());
		literalURIEClass.getESuperTypes().add(this.getLiteralValue());
		literalNumberEClass.getESuperTypes().add(this.getLiteralValue());
		literalRealEClass.getESuperTypes().add(this.getLiteralNumber());
		literalRationalEClass.getESuperTypes().add(this.getLiteralNumber());
		literalFloatEClass.getESuperTypes().add(this.getLiteralNumber());
		literalDecimalEClass.getESuperTypes().add(this.getLiteralNumber());
		crossReferencableKindEClass.getESuperTypes().add(this.getCrossReferencabilityKind());
		nonCrossReferencableKindEClass.getESuperTypes().add(this.getCrossReferencabilityKind());
		identityKindEClass.getESuperTypes().add(this.getCrossReferencabilityKind());
		intrinsicIdentityKindEClass.getESuperTypes().add(this.getIdentityKind());
		intrinsicIdentityKindEClass.getESuperTypes().add(this.getCrossReferencableKind());
		extrinsicIdentityKindEClass.getESuperTypes().add(this.getIdentityKind());
		elementCrossReferenceTupleEClass.getESuperTypes().add(this.getExtrinsicIdentityKind());
		elementCrossReferenceTupleEClass.getESuperTypes().add(this.getCrossReferencableKind());
		elementCrossReferenceTupleEClass.getESuperTypes().add(this.getLogicalElement());
		valueCrossReferenceTupleEClass.getESuperTypes().add(this.getExtrinsicIdentityKind());
		valueCrossReferenceTupleEClass.getESuperTypes().add(this.getNonCrossReferencableKind());
		logicalElementEClass.getESuperTypes().add(this.getIdentityKind());
		nonLogicalElementEClass.getESuperTypes().add(this.getIdentityKind());
		resourceEClass.getESuperTypes().add(this.getLogicalElement());
		resourceEClass.getESuperTypes().add(this.getIntrinsicIdentityKind());
		moduleElementEClass.getESuperTypes().add(this.getLogicalElement());
		moduleEdgeEClass.getESuperTypes().add(this.getElementCrossReferenceTuple());
		annotationPropertyEClass.getESuperTypes().add(this.getIntrinsicIdentityKind());
		annotationPropertyEClass.getESuperTypes().add(this.getNonLogicalElement());
		annotationPropertyValueEClass.getESuperTypes().add(this.getValueCrossReferenceTuple());
		annotationPropertyValueEClass.getESuperTypes().add(this.getNonLogicalElement());
		moduleEClass.getESuperTypes().add(this.getResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(literalValueEClass, LiteralValue.class, "LiteralValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getLiteralValue__Value(), theEcorePackage.getEString(), "value", 1, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(literalBooleanEClass, LiteralBoolean.class, "LiteralBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralBoolean_Bool(), theEcorePackage.getEBoolean(), "bool", null, 0, 1, LiteralBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLiteralBoolean__Value(), theEcorePackage.getEString(), "value", 1, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(literalDateTimeEClass, LiteralDateTime.class, "LiteralDateTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralDateTime_DateTime(), this.getDateTimeDataType(), "dateTime", null, 1, 1, LiteralDateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLiteralDateTime__Value(), theEcorePackage.getEString(), "value", 1, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(literalStringEClass, LiteralString.class, "LiteralString", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getLiteralString__StringValue(), this.getStringDataType(), "stringValue", 1, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getLiteralString__Value(), theEcorePackage.getEString(), "value", 1, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(literalQuotedStringEClass, LiteralQuotedString.class, "LiteralQuotedString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralQuotedString_String(), this.getQuotedStringDataType(), "string", null, 1, 1, LiteralQuotedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLiteralQuotedString__StringValue(), this.getStringDataType(), "stringValue", 1, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(literalRawStringEClass, LiteralRawString.class, "LiteralRawString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralRawString_String(), this.getRawStringDataType(), "string", null, 1, 1, LiteralRawString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLiteralRawString__StringValue(), this.getStringDataType(), "stringValue", 1, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(literalUUIDEClass, LiteralUUID.class, "LiteralUUID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralUUID_Uuid(), this.getUUIDDataType(), "uuid", null, 1, 1, LiteralUUID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLiteralUUID__Value(), theEcorePackage.getEString(), "value", 1, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(literalURIEClass, LiteralURI.class, "LiteralURI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralURI_Uri(), this.getURIDataType(), "uri", null, 1, 1, LiteralURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLiteralURI__Value(), theEcorePackage.getEString(), "value", 1, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(literalNumberEClass, LiteralNumber.class, "LiteralNumber", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalRealEClass, LiteralReal.class, "LiteralReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralReal_Real(), this.getRealDataType(), "real", null, 1, 1, LiteralReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLiteralReal__Value(), theEcorePackage.getEString(), "value", 1, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(literalRationalEClass, LiteralRational.class, "LiteralRational", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralRational_Rational(), this.getRationalDataType(), "rational", null, 1, 1, LiteralRational.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLiteralRational__Value(), theEcorePackage.getEString(), "value", 1, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(literalFloatEClass, LiteralFloat.class, "LiteralFloat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralFloat_Float(), this.getFloatDataType(), "float", null, 1, 1, LiteralFloat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLiteralFloat__Value(), theEcorePackage.getEString(), "value", 1, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(literalDecimalEClass, LiteralDecimal.class, "LiteralDecimal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralDecimal_Decimal(), this.getAbstractDecimalDataType(), "decimal", null, 1, 1, LiteralDecimal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLiteralDecimal__Value(), theEcorePackage.getEString(), "value", 1, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(crossReferencabilityKindEClass, CrossReferencabilityKind.class, "CrossReferencabilityKind", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCrossReferencabilityKind_Uuid(), this.getUUID(), "uuid", null, 1, 1, CrossReferencabilityKind.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getCrossReferencabilityKind__Uuid(), this.getUUID(), "uuid", 1, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(crossReferencableKindEClass, CrossReferencableKind.class, "CrossReferencableKind", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nonCrossReferencableKindEClass, NonCrossReferencableKind.class, "NonCrossReferencableKind", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(identityKindEClass, IdentityKind.class, "IdentityKind", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intrinsicIdentityKindEClass, IntrinsicIdentityKind.class, "IntrinsicIdentityKind", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIntrinsicIdentityKind__Iri(), this.getIRI(), "iri", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(extrinsicIdentityKindEClass, ExtrinsicIdentityKind.class, "ExtrinsicIdentityKind", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementCrossReferenceTupleEClass, ElementCrossReferenceTuple.class, "ElementCrossReferenceTuple", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueCrossReferenceTupleEClass, ValueCrossReferenceTuple.class, "ValueCrossReferenceTuple", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicalElementEClass, LogicalElement.class, "LogicalElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalElement_Annotations(), this.getAnnotationPropertyValue(), this.getAnnotationPropertyValue_Subject(), "annotations", null, 0, -1, LogicalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLogicalElement__ModuleContext(), this.getModule(), "moduleContext", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(nonLogicalElementEClass, NonLogicalElement.class, "NonLogicalElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceEClass, Resource.class, "Resource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getResource__Name(), this.getLocalName(), "name", 1, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getResource__AbbrevIRI(), theEcorePackage.getEString(), "abbrevIRI", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(moduleElementEClass, ModuleElement.class, "ModuleElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getModuleElement__AllNestedElements(), this.getLogicalElement(), "allNestedElements", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(moduleEdgeEClass, ModuleEdge.class, "ModuleEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getModuleEdge__SourceModule(), this.getModule(), "sourceModule", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getModuleEdge__TargetModule(), this.getModule(), "targetModule", 1, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getModuleEdge__ModuleContext(), this.getModule(), "moduleContext", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(annotationPropertyEClass, AnnotationProperty.class, "AnnotationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationProperty_Extent(), this.getExtent(), this.getExtent_AnnotationProperties(), "extent", null, 1, 1, AnnotationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationProperty_Iri(), this.getIRI(), "iri", null, 1, 1, AnnotationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationProperty_AbbrevIRI(), this.getAbbrevIRI(), "abbrevIRI", null, 1, 1, AnnotationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAnnotationProperty__Uuid(), this.getUUID(), "uuid", 1, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getAnnotationProperty__Iri(), this.getIRI(), "iri", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(annotationPropertyValueEClass, AnnotationPropertyValue.class, "AnnotationPropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationPropertyValue_Subject(), this.getLogicalElement(), this.getLogicalElement_Annotations(), "subject", null, 1, 1, AnnotationPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationPropertyValue_Property(), this.getAnnotationProperty(), null, "property", null, 1, 1, AnnotationPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationPropertyValue_Value(), this.getLiteralString(), null, "value", null, 1, 1, AnnotationPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAnnotationPropertyValue__Uuid(), this.getUUID(), "uuid", 1, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(extentEClass, Extent.class, "Extent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtent_Modules(), this.getModule(), this.getModule_Extent(), "modules", null, 0, -1, Extent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtent_AnnotationProperties(), this.getAnnotationProperty(), this.getAnnotationProperty_Extent(), "annotationProperties", null, 0, -1, Extent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, Module.class, "Module", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_Extent(), this.getExtent(), this.getExtent_Modules(), "extent", null, 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Iri(), this.getIRI(), "iri", null, 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getModule__ModuleEdges(), this.getModuleEdge(), "moduleEdges", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getModule__Iri(), this.getIRI(), "iri", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getModule__NsPrefix(), this.getNamespacePrefix(), "nsPrefix", 1, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getModule__Name(), this.getLocalName(), "name", 1, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getModule__AbbrevIRI(), theEcorePackage.getEString(), "abbrevIRI", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getModule__Uuid(), this.getUUID(), "uuid", 1, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getModule__ModuleContext(), this.getModule(), "moduleContext", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getModule__ModuleElements(), this.getModuleElement(), "moduleElements", 0, -1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(iriEDataType, String.class, "IRI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(localNameEDataType, String.class, "LocalName", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uuidEDataType, String.class, "UUID", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(abbrevIRIEDataType, String.class, "AbbrevIRI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(namespacePrefixEDataType, String.class, "NamespacePrefix", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(positiveIntegerLiteralEDataType, PositiveIntegerValue.class, "PositiveIntegerLiteral", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(literalPatternEDataType, PatternValue.class, "LiteralPattern", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(realDataTypeEDataType, RealValue.class, "RealDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rationalDataTypeEDataType, RationalValue.class, "RationalDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(floatDataTypeEDataType, FloatValue.class, "FloatDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(abstractDecimalDataTypeEDataType, AbstractDecimalValue.class, "AbstractDecimalDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(decimalDataTypeEDataType, DecimalValue.class, "DecimalDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateTimeDataTypeEDataType, DateTimeValue.class, "DateTimeDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(languageTagDataTypeEDataType, LanguageTagValue.class, "LanguageTagDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringDataTypeEDataType, StringValue.class, "StringDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rawStringDataTypeEDataType, RawStringValue.class, "RawStringDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(quotedStringDataTypeEDataType, QuotedStringValue.class, "QuotedStringDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uuidDataTypeEDataType, UUIDValue.class, "UUIDDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uriDataTypeEDataType, URIValue.class, "URIDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// http://imce.jpl.nasa.gov/oml/Glossary
		createGlossaryAnnotations();
		// http://imce.jpl.nasa.gov/oml/NotFunctionalAPI
		createNotFunctionalAPIAnnotations();
		// http://imce.jpl.nasa.gov/oml/NotSchema
		createNotSchemaAnnotations();
		// http://imce.jpl.nasa.gov/oml/ImplicitExtent
		createImplicitExtentAnnotations();
		// http://imce.jpl.nasa.gov/oml/IsOrderingKey
		createIsOrderingKeyAnnotations();
		// http://imce.jpl.nasa.gov/oml/Collection
		createCollectionAnnotations();
		// http://imce.jpl.nasa.gov/oml/IRIReference
		createIRIReferenceAnnotations();
		// http://imce.jpl.nasa.gov/oml/ExtentManaged
		createExtentManagedAnnotations();
		// http://imce.jpl.nasa.gov/oml/NamespaceUUID
		createNamespaceUUIDAnnotations();
		// http://imce.jpl.nasa.gov/oml/Scala
		createScalaAnnotations();
		// http://imce.jpl.nasa.gov/oml/OverrideVal
		createOverrideValAnnotations();
		// http://imce.jpl.nasa.gov/oml/Override
		createOverrideAnnotations();
		// http://imce.jpl.nasa.gov/oml/ExtentContainer
		createExtentContainerAnnotations();
		// http://imce.jpl.nasa.gov/oml/ResolverAPI
		createResolverAPIAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "Collection", "http://imce.jpl.nasa.gov/oml/Collection",
			 "ResolverAPI", "http://imce.jpl.nasa.gov/oml/ResolverAPI",
			 "Override", "http://imce.jpl.nasa.gov/oml/Override",
			 "OverrideVal", "http://imce.jpl.nasa.gov/oml/OverrideVal",
			 "NotFunctionalAPI", "http://imce.jpl.nasa.gov/oml/NotFunctionalAPI",
			 "FunctionalInterface", "http://imce.jpl.nasa.gov/oml/FunctionalInterface",
			 "NotSchema", "http://imce.jpl.nasa.gov/oml/NotSchema",
			 "ValueTable", "http://imce.jpl.nasa.gov/oml/ValueTable",
			 "Scala", "http://imce.jpl.nasa.gov/oml/Scala",
			 "IsOrderingKey", "http://imce.jpl.nasa.gov/oml/IsOrderingKey",
			 "CopyConstructor", "http://imce.jpl.nasa.gov/oml/CopyConstructor",
			 "Glossary", "http://imce.jpl.nasa.gov/oml/Glossary",
			 "ExtentContainer", "http://imce.jpl.nasa.gov/oml/ExtentContainer",
			 "ExtentManaged", "http://imce.jpl.nasa.gov/oml/ExtentManaged",
			 "Factory", "http://imce.jpl.nasa.gov/oml/Factory",
			 "ImplicitExtent", "http://imce.jpl.nasa.gov/oml/ImplicitExtent",
			 "NamespaceUUID", "http://imce.jpl.nasa.gov/oml/NamespaceUUID",
			 "DerivedUUID", "http://imce.jpl.nasa.gov/oml/DerivedUUID",
			 "IRIReference", "http://imce.jpl.nasa.gov/oml/IRIReference"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://imce.jpl.nasa.gov/oml/Glossary</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGlossaryAnnotations() {
		String source = "http://imce.jpl.nasa.gov/oml/Glossary";	
		addAnnotation
		  (crossReferencabilityKindEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (crossReferencableKindEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (nonCrossReferencableKindEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (identityKindEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (elementCrossReferenceTupleEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (valueCrossReferenceTupleEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (logicalElementEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (nonLogicalElementEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (resourceEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (moduleElementEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (moduleEdgeEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (annotationPropertyEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (annotationPropertyValueEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (extentEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (moduleEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://imce.jpl.nasa.gov/oml/NotFunctionalAPI</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNotFunctionalAPIAnnotations() {
		String source = "http://imce.jpl.nasa.gov/oml/NotFunctionalAPI";	
		addAnnotation
		  (getCrossReferencabilityKind__Uuid(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAnnotationProperty_Extent(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAnnotationPropertyValue__Uuid(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExtent_Modules(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExtent_AnnotationProperties(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModule__Uuid(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModule_Extent(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://imce.jpl.nasa.gov/oml/NotSchema</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNotSchemaAnnotations() {
		String source = "http://imce.jpl.nasa.gov/oml/NotSchema";	
		addAnnotation
		  (getCrossReferencabilityKind__Uuid(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getIntrinsicIdentityKind__Iri(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getLogicalElement__ModuleContext(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getLogicalElement_Annotations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getResource__Name(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getResource__AbbrevIRI(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModuleElement__AllNestedElements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModuleEdge__SourceModule(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModuleEdge__TargetModule(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModuleEdge__ModuleContext(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAnnotationProperty__Uuid(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAnnotationProperty__Iri(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAnnotationProperty_Extent(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAnnotationPropertyValue__Uuid(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExtent_Modules(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExtent_AnnotationProperties(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModule__ModuleEdges(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModule__Iri(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModule__NsPrefix(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModule__Name(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModule__AbbrevIRI(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModule__Uuid(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModule__ModuleContext(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModule__ModuleElements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModule_Extent(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://imce.jpl.nasa.gov/oml/ImplicitExtent</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImplicitExtentAnnotations() {
		String source = "http://imce.jpl.nasa.gov/oml/ImplicitExtent";	
		addAnnotation
		  (getCrossReferencabilityKind_Uuid(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getIntrinsicIdentityKind__Iri(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getLogicalElement__ModuleContext(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getLogicalElement_Annotations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getResource__AbbrevIRI(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModuleElement__AllNestedElements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModuleEdge__SourceModule(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModuleEdge__TargetModule(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModuleEdge__ModuleContext(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAnnotationProperty__Iri(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModule__ModuleEdges(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModule__Iri(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModule__AbbrevIRI(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModule__ModuleContext(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModule__ModuleElements(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://imce.jpl.nasa.gov/oml/IsOrderingKey</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createIsOrderingKeyAnnotations() {
		String source = "http://imce.jpl.nasa.gov/oml/IsOrderingKey";	
		addAnnotation
		  (getCrossReferencabilityKind_Uuid(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://imce.jpl.nasa.gov/oml/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://imce.jpl.nasa.gov/oml/Collection";	
		addAnnotation
		  (getLogicalElement_Annotations(), 
		   source, 
		   new String[] {
			 "kind", "Seq"
		   });	
		addAnnotation
		  (getModuleElement__AllNestedElements(), 
		   source, 
		   new String[] {
			 "kind", "Set"
		   });	
		addAnnotation
		  (getModule__ModuleEdges(), 
		   source, 
		   new String[] {
			 "kind", "Set"
		   });	
		addAnnotation
		  (getModule__ModuleElements(), 
		   source, 
		   new String[] {
			 "kind", "Set"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://imce.jpl.nasa.gov/oml/IRIReference</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createIRIReferenceAnnotations() {
		String source = "http://imce.jpl.nasa.gov/oml/IRIReference";	
		addAnnotation
		  (getModuleEdge__TargetModule(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://imce.jpl.nasa.gov/oml/ExtentManaged</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtentManagedAnnotations() {
		String source = "http://imce.jpl.nasa.gov/oml/ExtentManaged";	
		addAnnotation
		  (annotationPropertyEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (moduleEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://imce.jpl.nasa.gov/oml/NamespaceUUID</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNamespaceUUIDAnnotations() {
		String source = "http://imce.jpl.nasa.gov/oml/NamespaceUUID";	
		addAnnotation
		  (annotationPropertyEClass, 
		   source, 
		   new String[] {
			 "namespace", "iri",
			 "factors", ""
		   });	
		addAnnotation
		  (moduleEClass, 
		   source, 
		   new String[] {
			 "namespace", "iri",
			 "factors", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>http://imce.jpl.nasa.gov/oml/Scala</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createScalaAnnotations() {
		String source = "http://imce.jpl.nasa.gov/oml/Scala";	
		addAnnotation
		  (getAnnotationProperty__Uuid(), 
		   source, 
		   new String[] {
			 "code", "com.fasterxml.uuid.Generators.nameBasedGenerator(com.fasterxml.uuid.impl.NameBasedGenerator.NAMESPACE_URL).generate(iri)"
		   });	
		addAnnotation
		  (getAnnotationProperty__Iri(), 
		   source, 
		   new String[] {
			 "code", "scala.Some(iri)"
		   });	
		addAnnotation
		  (getModule__Iri(), 
		   source, 
		   new String[] {
			 "code", "scala.Some(iri)"
		   });	
		addAnnotation
		  (getModule__NsPrefix(), 
		   source, 
		   new String[] {
			 "code", "gov.nasa.jpl.imce.oml.tables.taggedTypes.namespacePrefix(iri.substring(1+iri.lastIndexOf(\'/\')))"
		   });	
		addAnnotation
		  (getModule__Name(), 
		   source, 
		   new String[] {
			 "code", "gov.nasa.jpl.imce.oml.tables.taggedTypes.localName(nsPrefix)"
		   });	
		addAnnotation
		  (getModule__AbbrevIRI(), 
		   source, 
		   new String[] {
			 "code", "scala.Some(nsPrefix)"
		   });	
		addAnnotation
		  (getModule__ModuleContext(), 
		   source, 
		   new String[] {
			 "code", "scala.Some(this)"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://imce.jpl.nasa.gov/oml/OverrideVal</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOverrideValAnnotations() {
		String source = "http://imce.jpl.nasa.gov/oml/OverrideVal";	
		addAnnotation
		  (getAnnotationProperty__Uuid(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://imce.jpl.nasa.gov/oml/Override</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOverrideAnnotations() {
		String source = "http://imce.jpl.nasa.gov/oml/Override";	
		addAnnotation
		  (getAnnotationProperty__Iri(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAnnotationProperty_Extent(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAnnotationPropertyValue__Uuid(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModule__Iri(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getModule__Uuid(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://imce.jpl.nasa.gov/oml/ExtentContainer</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtentContainerAnnotations() {
		String source = "http://imce.jpl.nasa.gov/oml/ExtentContainer";	
		addAnnotation
		  (extentEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://imce.jpl.nasa.gov/oml/ResolverAPI</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createResolverAPIAnnotations() {
		String source = "http://imce.jpl.nasa.gov/oml/ResolverAPI";	
		addAnnotation
		  (extentEClass, 
		   source, 
		   new String[] {
		   });
	}

} //CommonPackageImpl
