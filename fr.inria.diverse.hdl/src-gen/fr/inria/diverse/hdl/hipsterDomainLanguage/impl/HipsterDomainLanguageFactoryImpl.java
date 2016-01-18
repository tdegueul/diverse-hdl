/**
 */
package fr.inria.diverse.hdl.hipsterDomainLanguage.impl;

import fr.inria.diverse.hdl.hipsterDomainLanguage.Domain;
import fr.inria.diverse.hdl.hipsterDomainLanguage.DomainElement;
import fr.inria.diverse.hdl.hipsterDomainLanguage.Entity;
import fr.inria.diverse.hdl.hipsterDomainLanguage.EnumTypeReference;
import fr.inria.diverse.hdl.hipsterDomainLanguage.Field;
import fr.inria.diverse.hdl.hipsterDomainLanguage.HdlTypeReference;
import fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguageFactory;
import fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage;
import fr.inria.diverse.hdl.hipsterDomainLanguage.JHipsterType;
import fr.inria.diverse.hdl.hipsterDomainLanguage.MaxSpecification;
import fr.inria.diverse.hdl.hipsterDomainLanguage.MinSpecification;
import fr.inria.diverse.hdl.hipsterDomainLanguage.Pattern;
import fr.inria.diverse.hdl.hipsterDomainLanguage.PrimitiveTypeReference;
import fr.inria.diverse.hdl.hipsterDomainLanguage.Relation;
import fr.inria.diverse.hdl.hipsterDomainLanguage.RelationType;
import fr.inria.diverse.hdl.hipsterDomainLanguage.ValidationRule;
import fr.inria.diverse.hdl.hipsterDomainLanguage.ValueRange;

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
public class HipsterDomainLanguageFactoryImpl extends EFactoryImpl implements HipsterDomainLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HipsterDomainLanguageFactory init()
  {
    try
    {
      HipsterDomainLanguageFactory theHipsterDomainLanguageFactory = (HipsterDomainLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(HipsterDomainLanguagePackage.eNS_URI);
      if (theHipsterDomainLanguageFactory != null)
      {
        return theHipsterDomainLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new HipsterDomainLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HipsterDomainLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case HipsterDomainLanguagePackage.DOMAIN: return createDomain();
      case HipsterDomainLanguagePackage.DOMAIN_ELEMENT: return createDomainElement();
      case HipsterDomainLanguagePackage.ENTITY: return createEntity();
      case HipsterDomainLanguagePackage.RELATION: return createRelation();
      case HipsterDomainLanguagePackage.ENUM: return createEnum();
      case HipsterDomainLanguagePackage.FIELD: return createField();
      case HipsterDomainLanguagePackage.VALIDATION_RULE: return createValidationRule();
      case HipsterDomainLanguagePackage.VALUE_RANGE: return createValueRange();
      case HipsterDomainLanguagePackage.MIN_SPECIFICATION: return createMinSpecification();
      case HipsterDomainLanguagePackage.MAX_SPECIFICATION: return createMaxSpecification();
      case HipsterDomainLanguagePackage.PATTERN: return createPattern();
      case HipsterDomainLanguagePackage.HDL_TYPE_REFERENCE: return createHdlTypeReference();
      case HipsterDomainLanguagePackage.ENUM_TYPE_REFERENCE: return createEnumTypeReference();
      case HipsterDomainLanguagePackage.PRIMITIVE_TYPE_REFERENCE: return createPrimitiveTypeReference();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case HipsterDomainLanguagePackage.RELATION_TYPE:
        return createRelationTypeFromString(eDataType, initialValue);
      case HipsterDomainLanguagePackage.JHIPSTER_TYPE:
        return createJHipsterTypeFromString(eDataType, initialValue);
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
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case HipsterDomainLanguagePackage.RELATION_TYPE:
        return convertRelationTypeToString(eDataType, instanceValue);
      case HipsterDomainLanguagePackage.JHIPSTER_TYPE:
        return convertJHipsterTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domain createDomain()
  {
    DomainImpl domain = new DomainImpl();
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainElement createDomainElement()
  {
    DomainElementImpl domainElement = new DomainElementImpl();
    return domainElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relation createRelation()
  {
    RelationImpl relation = new RelationImpl();
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fr.inria.diverse.hdl.hipsterDomainLanguage.Enum createEnum()
  {
    EnumImpl enum_ = new EnumImpl();
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValidationRule createValidationRule()
  {
    ValidationRuleImpl validationRule = new ValidationRuleImpl();
    return validationRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueRange createValueRange()
  {
    ValueRangeImpl valueRange = new ValueRangeImpl();
    return valueRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinSpecification createMinSpecification()
  {
    MinSpecificationImpl minSpecification = new MinSpecificationImpl();
    return minSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaxSpecification createMaxSpecification()
  {
    MaxSpecificationImpl maxSpecification = new MaxSpecificationImpl();
    return maxSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern createPattern()
  {
    PatternImpl pattern = new PatternImpl();
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HdlTypeReference createHdlTypeReference()
  {
    HdlTypeReferenceImpl hdlTypeReference = new HdlTypeReferenceImpl();
    return hdlTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumTypeReference createEnumTypeReference()
  {
    EnumTypeReferenceImpl enumTypeReference = new EnumTypeReferenceImpl();
    return enumTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveTypeReference createPrimitiveTypeReference()
  {
    PrimitiveTypeReferenceImpl primitiveTypeReference = new PrimitiveTypeReferenceImpl();
    return primitiveTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationType createRelationTypeFromString(EDataType eDataType, String initialValue)
  {
    RelationType result = RelationType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRelationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JHipsterType createJHipsterTypeFromString(EDataType eDataType, String initialValue)
  {
    JHipsterType result = JHipsterType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertJHipsterTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HipsterDomainLanguagePackage getHipsterDomainLanguagePackage()
  {
    return (HipsterDomainLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static HipsterDomainLanguagePackage getPackage()
  {
    return HipsterDomainLanguagePackage.eINSTANCE;
  }

} //HipsterDomainLanguageFactoryImpl
