/**
 */
package fr.inria.diverse.hdl.hipsterDomainLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface HipsterDomainLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "hipsterDomainLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.inria.fr/diverse/hdl/HipsterDomainLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "hipsterDomainLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HipsterDomainLanguagePackage eINSTANCE = fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.DomainImpl <em>Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.DomainImpl
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getDomain()
   * @generated
   */
  int DOMAIN = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.DomainElementImpl <em>Domain Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.DomainElementImpl
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getDomainElement()
   * @generated
   */
  int DOMAIN_ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Domain Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.EntityImpl
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = DOMAIN_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__FIELDS = DOMAIN_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = DOMAIN_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.RelationImpl <em>Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.RelationImpl
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getRelation()
   * @generated
   */
  int RELATION = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__TYPE = DOMAIN_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__FROM = DOMAIN_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>From Relation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__FROM_RELATION = DOMAIN_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__TO = DOMAIN_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>To Relation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__TO_RELATION = DOMAIN_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FEATURE_COUNT = DOMAIN_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.EnumImpl <em>Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.EnumImpl
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getEnum()
   * @generated
   */
  int ENUM = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__NAME = DOMAIN_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Literals</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__LITERALS = DOMAIN_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FEATURE_COUNT = DOMAIN_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.FieldImpl
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getField()
   * @generated
   */
  int FIELD = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE = 1;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__REQUIRED = 2;

  /**
   * The feature id for the '<em><b>Validation Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__VALIDATION_RULES = 3;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.ValidationRuleImpl <em>Validation Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.ValidationRuleImpl
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getValidationRule()
   * @generated
   */
  int VALIDATION_RULE = 6;

  /**
   * The number of structural features of the '<em>Validation Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALIDATION_RULE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.ValueRangeImpl <em>Value Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.ValueRangeImpl
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getValueRange()
   * @generated
   */
  int VALUE_RANGE = 7;

  /**
   * The number of structural features of the '<em>Value Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_RANGE_FEATURE_COUNT = VALIDATION_RULE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.MinSpecificationImpl <em>Min Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.MinSpecificationImpl
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getMinSpecification()
   * @generated
   */
  int MIN_SPECIFICATION = 8;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_SPECIFICATION__MIN = VALUE_RANGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Min Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_SPECIFICATION_FEATURE_COUNT = VALUE_RANGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.MaxSpecificationImpl <em>Max Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.MaxSpecificationImpl
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getMaxSpecification()
   * @generated
   */
  int MAX_SPECIFICATION = 9;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_SPECIFICATION__MAX = VALUE_RANGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Max Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_SPECIFICATION_FEATURE_COUNT = VALUE_RANGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.PatternImpl <em>Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.PatternImpl
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getPattern()
   * @generated
   */
  int PATTERN = 10;

  /**
   * The feature id for the '<em><b>Regex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__REGEX = VALIDATION_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_FEATURE_COUNT = VALIDATION_RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HdlTypeReferenceImpl <em>Hdl Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HdlTypeReferenceImpl
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getHdlTypeReference()
   * @generated
   */
  int HDL_TYPE_REFERENCE = 11;

  /**
   * The number of structural features of the '<em>Hdl Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HDL_TYPE_REFERENCE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.EnumTypeReferenceImpl <em>Enum Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.EnumTypeReferenceImpl
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getEnumTypeReference()
   * @generated
   */
  int ENUM_TYPE_REFERENCE = 12;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_REFERENCE__TYPE = HDL_TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_REFERENCE_FEATURE_COUNT = HDL_TYPE_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.PrimitiveTypeReferenceImpl <em>Primitive Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.PrimitiveTypeReferenceImpl
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getPrimitiveTypeReference()
   * @generated
   */
  int PRIMITIVE_TYPE_REFERENCE = 13;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_REFERENCE__TYPE = HDL_TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Primitive Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_REFERENCE_FEATURE_COUNT = HDL_TYPE_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.RelationType <em>Relation Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.RelationType
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getRelationType()
   * @generated
   */
  int RELATION_TYPE = 14;

  /**
   * The meta object id for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.JHipsterType <em>JHipster Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.JHipsterType
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getJHipsterType()
   * @generated
   */
  int JHIPSTER_TYPE = 15;


  /**
   * Returns the meta object for class '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Domain
   * @generated
   */
  EClass getDomain();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Domain#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Domain#getElements()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_Elements();

  /**
   * Returns the meta object for class '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.DomainElement <em>Domain Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Element</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.DomainElement
   * @generated
   */
  EClass getDomainElement();

  /**
   * Returns the meta object for class '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Entity#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Entity#getFields()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Fields();

  /**
   * Returns the meta object for class '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Relation
   * @generated
   */
  EClass getRelation();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Relation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Relation#getType()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_Type();

  /**
   * Returns the meta object for the reference '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Relation#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Relation#getFrom()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_From();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Relation#getFromRelation <em>From Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From Relation</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Relation#getFromRelation()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_FromRelation();

  /**
   * Returns the meta object for the reference '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Relation#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Relation#getTo()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_To();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Relation#getToRelation <em>To Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>To Relation</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Relation#getToRelation()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_ToRelation();

  /**
   * Returns the meta object for class '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Enum
   * @generated
   */
  EClass getEnum();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Enum#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Enum#getName()
   * @see #getEnum()
   * @generated
   */
  EAttribute getEnum_Name();

  /**
   * Returns the meta object for the attribute list '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Enum#getLiterals <em>Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Literals</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Enum#getLiterals()
   * @see #getEnum()
   * @generated
   */
  EAttribute getEnum_Literals();

  /**
   * Returns the meta object for class '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Field#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Field#getType()
   * @see #getField()
   * @generated
   */
  EReference getField_Type();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Field#isRequired <em>Required</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Required</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Field#isRequired()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Required();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Field#getValidationRules <em>Validation Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Validation Rules</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Field#getValidationRules()
   * @see #getField()
   * @generated
   */
  EReference getField_ValidationRules();

  /**
   * Returns the meta object for class '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.ValidationRule <em>Validation Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Validation Rule</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.ValidationRule
   * @generated
   */
  EClass getValidationRule();

  /**
   * Returns the meta object for class '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.ValueRange <em>Value Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Range</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.ValueRange
   * @generated
   */
  EClass getValueRange();

  /**
   * Returns the meta object for class '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.MinSpecification <em>Min Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Min Specification</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.MinSpecification
   * @generated
   */
  EClass getMinSpecification();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.MinSpecification#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.MinSpecification#getMin()
   * @see #getMinSpecification()
   * @generated
   */
  EAttribute getMinSpecification_Min();

  /**
   * Returns the meta object for class '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.MaxSpecification <em>Max Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Max Specification</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.MaxSpecification
   * @generated
   */
  EClass getMaxSpecification();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.MaxSpecification#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.MaxSpecification#getMax()
   * @see #getMaxSpecification()
   * @generated
   */
  EAttribute getMaxSpecification_Max();

  /**
   * Returns the meta object for class '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pattern</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Pattern
   * @generated
   */
  EClass getPattern();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Pattern#getRegex <em>Regex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Regex</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Pattern#getRegex()
   * @see #getPattern()
   * @generated
   */
  EAttribute getPattern_Regex();

  /**
   * Returns the meta object for class '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.HdlTypeReference <em>Hdl Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hdl Type Reference</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HdlTypeReference
   * @generated
   */
  EClass getHdlTypeReference();

  /**
   * Returns the meta object for class '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.EnumTypeReference <em>Enum Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Type Reference</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.EnumTypeReference
   * @generated
   */
  EClass getEnumTypeReference();

  /**
   * Returns the meta object for the reference '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.EnumTypeReference#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.EnumTypeReference#getType()
   * @see #getEnumTypeReference()
   * @generated
   */
  EReference getEnumTypeReference_Type();

  /**
   * Returns the meta object for class '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.PrimitiveTypeReference <em>Primitive Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Type Reference</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.PrimitiveTypeReference
   * @generated
   */
  EClass getPrimitiveTypeReference();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.PrimitiveTypeReference#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.PrimitiveTypeReference#getType()
   * @see #getPrimitiveTypeReference()
   * @generated
   */
  EAttribute getPrimitiveTypeReference_Type();

  /**
   * Returns the meta object for enum '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.RelationType <em>Relation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Relation Type</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.RelationType
   * @generated
   */
  EEnum getRelationType();

  /**
   * Returns the meta object for enum '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.JHipsterType <em>JHipster Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>JHipster Type</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.JHipsterType
   * @generated
   */
  EEnum getJHipsterType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  HipsterDomainLanguageFactory getHipsterDomainLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.DomainImpl <em>Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.DomainImpl
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getDomain()
     * @generated
     */
    EClass DOMAIN = eINSTANCE.getDomain();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__ELEMENTS = eINSTANCE.getDomain_Elements();

    /**
     * The meta object literal for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.DomainElementImpl <em>Domain Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.DomainElementImpl
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getDomainElement()
     * @generated
     */
    EClass DOMAIN_ELEMENT = eINSTANCE.getDomainElement();

    /**
     * The meta object literal for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.EntityImpl
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__FIELDS = eINSTANCE.getEntity_Fields();

    /**
     * The meta object literal for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.RelationImpl <em>Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.RelationImpl
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getRelation()
     * @generated
     */
    EClass RELATION = eINSTANCE.getRelation();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION__TYPE = eINSTANCE.getRelation_Type();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__FROM = eINSTANCE.getRelation_From();

    /**
     * The meta object literal for the '<em><b>From Relation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION__FROM_RELATION = eINSTANCE.getRelation_FromRelation();

    /**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__TO = eINSTANCE.getRelation_To();

    /**
     * The meta object literal for the '<em><b>To Relation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION__TO_RELATION = eINSTANCE.getRelation_ToRelation();

    /**
     * The meta object literal for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.EnumImpl <em>Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.EnumImpl
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getEnum()
     * @generated
     */
    EClass ENUM = eINSTANCE.getEnum();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM__NAME = eINSTANCE.getEnum_Name();

    /**
     * The meta object literal for the '<em><b>Literals</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM__LITERALS = eINSTANCE.getEnum_Literals();

    /**
     * The meta object literal for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.FieldImpl
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NAME = eINSTANCE.getField_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__TYPE = eINSTANCE.getField_Type();

    /**
     * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__REQUIRED = eINSTANCE.getField_Required();

    /**
     * The meta object literal for the '<em><b>Validation Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__VALIDATION_RULES = eINSTANCE.getField_ValidationRules();

    /**
     * The meta object literal for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.ValidationRuleImpl <em>Validation Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.ValidationRuleImpl
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getValidationRule()
     * @generated
     */
    EClass VALIDATION_RULE = eINSTANCE.getValidationRule();

    /**
     * The meta object literal for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.ValueRangeImpl <em>Value Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.ValueRangeImpl
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getValueRange()
     * @generated
     */
    EClass VALUE_RANGE = eINSTANCE.getValueRange();

    /**
     * The meta object literal for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.MinSpecificationImpl <em>Min Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.MinSpecificationImpl
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getMinSpecification()
     * @generated
     */
    EClass MIN_SPECIFICATION = eINSTANCE.getMinSpecification();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MIN_SPECIFICATION__MIN = eINSTANCE.getMinSpecification_Min();

    /**
     * The meta object literal for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.MaxSpecificationImpl <em>Max Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.MaxSpecificationImpl
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getMaxSpecification()
     * @generated
     */
    EClass MAX_SPECIFICATION = eINSTANCE.getMaxSpecification();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAX_SPECIFICATION__MAX = eINSTANCE.getMaxSpecification_Max();

    /**
     * The meta object literal for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.PatternImpl <em>Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.PatternImpl
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getPattern()
     * @generated
     */
    EClass PATTERN = eINSTANCE.getPattern();

    /**
     * The meta object literal for the '<em><b>Regex</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATTERN__REGEX = eINSTANCE.getPattern_Regex();

    /**
     * The meta object literal for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HdlTypeReferenceImpl <em>Hdl Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HdlTypeReferenceImpl
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getHdlTypeReference()
     * @generated
     */
    EClass HDL_TYPE_REFERENCE = eINSTANCE.getHdlTypeReference();

    /**
     * The meta object literal for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.EnumTypeReferenceImpl <em>Enum Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.EnumTypeReferenceImpl
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getEnumTypeReference()
     * @generated
     */
    EClass ENUM_TYPE_REFERENCE = eINSTANCE.getEnumTypeReference();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_TYPE_REFERENCE__TYPE = eINSTANCE.getEnumTypeReference_Type();

    /**
     * The meta object literal for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.PrimitiveTypeReferenceImpl <em>Primitive Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.PrimitiveTypeReferenceImpl
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getPrimitiveTypeReference()
     * @generated
     */
    EClass PRIMITIVE_TYPE_REFERENCE = eINSTANCE.getPrimitiveTypeReference();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_TYPE_REFERENCE__TYPE = eINSTANCE.getPrimitiveTypeReference_Type();

    /**
     * The meta object literal for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.RelationType <em>Relation Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.RelationType
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getRelationType()
     * @generated
     */
    EEnum RELATION_TYPE = eINSTANCE.getRelationType();

    /**
     * The meta object literal for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.JHipsterType <em>JHipster Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.JHipsterType
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getJHipsterType()
     * @generated
     */
    EEnum JHIPSTER_TYPE = eINSTANCE.getJHipsterType();

  }

} //HipsterDomainLanguagePackage
