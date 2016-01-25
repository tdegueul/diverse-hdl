/**
 */
package fr.inria.diverse.hdl.hipsterDomainLanguage.impl;

import fr.inria.diverse.hdl.hipsterDomainLanguage.*;

import org.eclipse.emf.ecore.EClass;
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
      case HipsterDomainLanguagePackage.MY_ELEMENT: return createMyElement();
      case HipsterDomainLanguagePackage.MY_FEATURE: return createMyFeature();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
  public MyElement createMyElement()
  {
    MyElementImpl myElement = new MyElementImpl();
    return myElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyFeature createMyFeature()
  {
    MyFeatureImpl myFeature = new MyFeatureImpl();
    return myFeature;
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
