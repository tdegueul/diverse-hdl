/**
 */
package fr.inria.diverse.hdl.hipsterDomainLanguage.util;

import fr.inria.diverse.hdl.hipsterDomainLanguage.Domain;
import fr.inria.diverse.hdl.hipsterDomainLanguage.DomainElement;
import fr.inria.diverse.hdl.hipsterDomainLanguage.Entity;
import fr.inria.diverse.hdl.hipsterDomainLanguage.Field;
import fr.inria.diverse.hdl.hipsterDomainLanguage.HdlType;
import fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage;
import fr.inria.diverse.hdl.hipsterDomainLanguage.IntegerMaxSpecification;
import fr.inria.diverse.hdl.hipsterDomainLanguage.IntegerMinSpecification;
import fr.inria.diverse.hdl.hipsterDomainLanguage.MaxSpecification;
import fr.inria.diverse.hdl.hipsterDomainLanguage.MinSpecification;
import fr.inria.diverse.hdl.hipsterDomainLanguage.Pattern;
import fr.inria.diverse.hdl.hipsterDomainLanguage.Relation;
import fr.inria.diverse.hdl.hipsterDomainLanguage.Required;
import fr.inria.diverse.hdl.hipsterDomainLanguage.StringMaxSpecification;
import fr.inria.diverse.hdl.hipsterDomainLanguage.StringMinSpecification;
import fr.inria.diverse.hdl.hipsterDomainLanguage.ValidationRule;
import fr.inria.diverse.hdl.hipsterDomainLanguage.ValueRange;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage
 * @generated
 */
public class HipsterDomainLanguageSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static HipsterDomainLanguagePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HipsterDomainLanguageSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = HipsterDomainLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case HipsterDomainLanguagePackage.DOMAIN:
      {
        Domain domain = (Domain)theEObject;
        T result = caseDomain(domain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HipsterDomainLanguagePackage.DOMAIN_ELEMENT:
      {
        DomainElement domainElement = (DomainElement)theEObject;
        T result = caseDomainElement(domainElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HipsterDomainLanguagePackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = caseDomainElement(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HipsterDomainLanguagePackage.RELATION:
      {
        Relation relation = (Relation)theEObject;
        T result = caseRelation(relation);
        if (result == null) result = caseDomainElement(relation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HipsterDomainLanguagePackage.ENUM:
      {
        fr.inria.diverse.hdl.hipsterDomainLanguage.Enum enum_ = (fr.inria.diverse.hdl.hipsterDomainLanguage.Enum)theEObject;
        T result = caseEnum(enum_);
        if (result == null) result = caseDomainElement(enum_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HipsterDomainLanguagePackage.FIELD:
      {
        Field field = (Field)theEObject;
        T result = caseField(field);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HipsterDomainLanguagePackage.VALIDATION_RULE:
      {
        ValidationRule validationRule = (ValidationRule)theEObject;
        T result = caseValidationRule(validationRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HipsterDomainLanguagePackage.REQUIRED:
      {
        Required required = (Required)theEObject;
        T result = caseRequired(required);
        if (result == null) result = caseValidationRule(required);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HipsterDomainLanguagePackage.VALUE_RANGE:
      {
        ValueRange valueRange = (ValueRange)theEObject;
        T result = caseValueRange(valueRange);
        if (result == null) result = caseValidationRule(valueRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HipsterDomainLanguagePackage.MIN_SPECIFICATION:
      {
        MinSpecification minSpecification = (MinSpecification)theEObject;
        T result = caseMinSpecification(minSpecification);
        if (result == null) result = caseValueRange(minSpecification);
        if (result == null) result = caseValidationRule(minSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HipsterDomainLanguagePackage.MAX_SPECIFICATION:
      {
        MaxSpecification maxSpecification = (MaxSpecification)theEObject;
        T result = caseMaxSpecification(maxSpecification);
        if (result == null) result = caseValueRange(maxSpecification);
        if (result == null) result = caseValidationRule(maxSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HipsterDomainLanguagePackage.STRING_MIN_SPECIFICATION:
      {
        StringMinSpecification stringMinSpecification = (StringMinSpecification)theEObject;
        T result = caseStringMinSpecification(stringMinSpecification);
        if (result == null) result = caseMinSpecification(stringMinSpecification);
        if (result == null) result = caseValueRange(stringMinSpecification);
        if (result == null) result = caseValidationRule(stringMinSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HipsterDomainLanguagePackage.STRING_MAX_SPECIFICATION:
      {
        StringMaxSpecification stringMaxSpecification = (StringMaxSpecification)theEObject;
        T result = caseStringMaxSpecification(stringMaxSpecification);
        if (result == null) result = caseMaxSpecification(stringMaxSpecification);
        if (result == null) result = caseValueRange(stringMaxSpecification);
        if (result == null) result = caseValidationRule(stringMaxSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HipsterDomainLanguagePackage.INTEGER_MIN_SPECIFICATION:
      {
        IntegerMinSpecification integerMinSpecification = (IntegerMinSpecification)theEObject;
        T result = caseIntegerMinSpecification(integerMinSpecification);
        if (result == null) result = caseMinSpecification(integerMinSpecification);
        if (result == null) result = caseValueRange(integerMinSpecification);
        if (result == null) result = caseValidationRule(integerMinSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HipsterDomainLanguagePackage.INTEGER_MAX_SPECIFICATION:
      {
        IntegerMaxSpecification integerMaxSpecification = (IntegerMaxSpecification)theEObject;
        T result = caseIntegerMaxSpecification(integerMaxSpecification);
        if (result == null) result = caseMaxSpecification(integerMaxSpecification);
        if (result == null) result = caseValueRange(integerMaxSpecification);
        if (result == null) result = caseValidationRule(integerMaxSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HipsterDomainLanguagePackage.PATTERN:
      {
        Pattern pattern = (Pattern)theEObject;
        T result = casePattern(pattern);
        if (result == null) result = caseValidationRule(pattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HipsterDomainLanguagePackage.HDL_TYPE:
      {
        HdlType hdlType = (HdlType)theEObject;
        T result = caseHdlType(hdlType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomain(Domain object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainElement(DomainElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelation(Relation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnum(fr.inria.diverse.hdl.hipsterDomainLanguage.Enum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseField(Field object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Validation Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Validation Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValidationRule(ValidationRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Required</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Required</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequired(Required object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueRange(ValueRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Min Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Min Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinSpecification(MinSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Max Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Max Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMaxSpecification(MaxSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Min Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Min Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringMinSpecification(StringMinSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Max Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Max Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringMaxSpecification(StringMaxSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Min Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Min Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerMinSpecification(IntegerMinSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Max Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Max Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerMaxSpecification(IntegerMaxSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePattern(Pattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hdl Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hdl Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHdlType(HdlType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //HipsterDomainLanguageSwitch
