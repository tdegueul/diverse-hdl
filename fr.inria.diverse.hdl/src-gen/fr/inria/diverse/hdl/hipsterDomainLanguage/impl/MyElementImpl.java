/**
 */
package fr.inria.diverse.hdl.hipsterDomainLanguage.impl;

import fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage;
import fr.inria.diverse.hdl.hipsterDomainLanguage.MyElement;
import fr.inria.diverse.hdl.hipsterDomainLanguage.MyFeature;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>My Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.MyElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.MyElementImpl#getSomeFeatureOfMyElement <em>Some Feature Of My Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MyElementImpl extends MinimalEObjectImpl.Container implements MyElement
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSomeFeatureOfMyElement() <em>Some Feature Of My Element</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSomeFeatureOfMyElement()
   * @generated
   * @ordered
   */
  protected EList<MyFeature> someFeatureOfMyElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MyElementImpl()
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
    return HipsterDomainLanguagePackage.Literals.MY_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HipsterDomainLanguagePackage.MY_ELEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MyFeature> getSomeFeatureOfMyElement()
  {
    if (someFeatureOfMyElement == null)
    {
      someFeatureOfMyElement = new EObjectContainmentEList<MyFeature>(MyFeature.class, this, HipsterDomainLanguagePackage.MY_ELEMENT__SOME_FEATURE_OF_MY_ELEMENT);
    }
    return someFeatureOfMyElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case HipsterDomainLanguagePackage.MY_ELEMENT__SOME_FEATURE_OF_MY_ELEMENT:
        return ((InternalEList<?>)getSomeFeatureOfMyElement()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case HipsterDomainLanguagePackage.MY_ELEMENT__NAME:
        return getName();
      case HipsterDomainLanguagePackage.MY_ELEMENT__SOME_FEATURE_OF_MY_ELEMENT:
        return getSomeFeatureOfMyElement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HipsterDomainLanguagePackage.MY_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case HipsterDomainLanguagePackage.MY_ELEMENT__SOME_FEATURE_OF_MY_ELEMENT:
        getSomeFeatureOfMyElement().clear();
        getSomeFeatureOfMyElement().addAll((Collection<? extends MyFeature>)newValue);
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
      case HipsterDomainLanguagePackage.MY_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case HipsterDomainLanguagePackage.MY_ELEMENT__SOME_FEATURE_OF_MY_ELEMENT:
        getSomeFeatureOfMyElement().clear();
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
      case HipsterDomainLanguagePackage.MY_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case HipsterDomainLanguagePackage.MY_ELEMENT__SOME_FEATURE_OF_MY_ELEMENT:
        return someFeatureOfMyElement != null && !someFeatureOfMyElement.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //MyElementImpl
