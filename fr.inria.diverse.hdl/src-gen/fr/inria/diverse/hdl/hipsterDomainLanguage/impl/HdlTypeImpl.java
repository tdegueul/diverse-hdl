/**
 */
package fr.inria.diverse.hdl.hipsterDomainLanguage.impl;

import fr.inria.diverse.hdl.hipsterDomainLanguage.HdlType;
import fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage;
import fr.inria.diverse.hdl.hipsterDomainLanguage.JHipsterType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hdl Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HdlTypeImpl#getEnumType <em>Enum Type</em>}</li>
 *   <li>{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HdlTypeImpl#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HdlTypeImpl extends MinimalEObjectImpl.Container implements HdlType
{
  /**
   * The cached value of the '{@link #getEnumType() <em>Enum Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumType()
   * @generated
   * @ordered
   */
  protected fr.inria.diverse.hdl.hipsterDomainLanguage.Enum enumType;

  /**
   * The default value of the '{@link #getPrimitiveType() <em>Primitive Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimitiveType()
   * @generated
   * @ordered
   */
  protected static final JHipsterType PRIMITIVE_TYPE_EDEFAULT = JHipsterType.STRING;

  /**
   * The cached value of the '{@link #getPrimitiveType() <em>Primitive Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimitiveType()
   * @generated
   * @ordered
   */
  protected JHipsterType primitiveType = PRIMITIVE_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HdlTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return HipsterDomainLanguagePackage.Literals.HDL_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fr.inria.diverse.hdl.hipsterDomainLanguage.Enum getEnumType()
  {
    if (enumType != null && enumType.eIsProxy())
    {
      InternalEObject oldEnumType = (InternalEObject)enumType;
      enumType = (fr.inria.diverse.hdl.hipsterDomainLanguage.Enum)eResolveProxy(oldEnumType);
      if (enumType != oldEnumType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HipsterDomainLanguagePackage.HDL_TYPE__ENUM_TYPE, oldEnumType, enumType));
      }
    }
    return enumType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fr.inria.diverse.hdl.hipsterDomainLanguage.Enum basicGetEnumType()
  {
    return enumType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumType(fr.inria.diverse.hdl.hipsterDomainLanguage.Enum newEnumType)
  {
    fr.inria.diverse.hdl.hipsterDomainLanguage.Enum oldEnumType = enumType;
    enumType = newEnumType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HipsterDomainLanguagePackage.HDL_TYPE__ENUM_TYPE, oldEnumType, enumType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JHipsterType getPrimitiveType()
  {
    return primitiveType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimitiveType(JHipsterType newPrimitiveType)
  {
    JHipsterType oldPrimitiveType = primitiveType;
    primitiveType = newPrimitiveType == null ? PRIMITIVE_TYPE_EDEFAULT : newPrimitiveType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HipsterDomainLanguagePackage.HDL_TYPE__PRIMITIVE_TYPE, oldPrimitiveType, primitiveType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case HipsterDomainLanguagePackage.HDL_TYPE__ENUM_TYPE:
        if (resolve) return getEnumType();
        return basicGetEnumType();
      case HipsterDomainLanguagePackage.HDL_TYPE__PRIMITIVE_TYPE:
        return getPrimitiveType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HipsterDomainLanguagePackage.HDL_TYPE__ENUM_TYPE:
        setEnumType((fr.inria.diverse.hdl.hipsterDomainLanguage.Enum)newValue);
        return;
      case HipsterDomainLanguagePackage.HDL_TYPE__PRIMITIVE_TYPE:
        setPrimitiveType((JHipsterType)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case HipsterDomainLanguagePackage.HDL_TYPE__ENUM_TYPE:
        setEnumType((fr.inria.diverse.hdl.hipsterDomainLanguage.Enum)null);
        return;
      case HipsterDomainLanguagePackage.HDL_TYPE__PRIMITIVE_TYPE:
        setPrimitiveType(PRIMITIVE_TYPE_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case HipsterDomainLanguagePackage.HDL_TYPE__ENUM_TYPE:
        return enumType != null;
      case HipsterDomainLanguagePackage.HDL_TYPE__PRIMITIVE_TYPE:
        return primitiveType != PRIMITIVE_TYPE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (primitiveType: ");
    result.append(primitiveType);
    result.append(')');
    return result.toString();
  }

} //HdlTypeImpl
