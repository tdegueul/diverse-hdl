/**
 */
package fr.inria.diverse.hdl.hipsterDomainLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
   * The meta object id for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.MyElementImpl <em>My Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.MyElementImpl
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getMyElement()
   * @generated
   */
  int MY_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Some Feature Of My Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_ELEMENT__SOME_FEATURE_OF_MY_ELEMENT = 1;

  /**
   * The number of structural features of the '<em>My Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.MyFeatureImpl <em>My Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.MyFeatureImpl
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getMyFeature()
   * @generated
   */
  int MY_FEATURE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_FEATURE__NAME = 0;

  /**
   * The number of structural features of the '<em>My Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_FEATURE_FEATURE_COUNT = 1;


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
   * Returns the meta object for class '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.MyElement <em>My Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>My Element</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.MyElement
   * @generated
   */
  EClass getMyElement();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.MyElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.MyElement#getName()
   * @see #getMyElement()
   * @generated
   */
  EAttribute getMyElement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.MyElement#getSomeFeatureOfMyElement <em>Some Feature Of My Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Some Feature Of My Element</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.MyElement#getSomeFeatureOfMyElement()
   * @see #getMyElement()
   * @generated
   */
  EReference getMyElement_SomeFeatureOfMyElement();

  /**
   * Returns the meta object for class '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.MyFeature <em>My Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>My Feature</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.MyFeature
   * @generated
   */
  EClass getMyFeature();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.MyFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.MyFeature#getName()
   * @see #getMyFeature()
   * @generated
   */
  EAttribute getMyFeature_Name();

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
     * The meta object literal for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.MyElementImpl <em>My Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.MyElementImpl
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getMyElement()
     * @generated
     */
    EClass MY_ELEMENT = eINSTANCE.getMyElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MY_ELEMENT__NAME = eINSTANCE.getMyElement_Name();

    /**
     * The meta object literal for the '<em><b>Some Feature Of My Element</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MY_ELEMENT__SOME_FEATURE_OF_MY_ELEMENT = eINSTANCE.getMyElement_SomeFeatureOfMyElement();

    /**
     * The meta object literal for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.MyFeatureImpl <em>My Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.MyFeatureImpl
     * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getMyFeature()
     * @generated
     */
    EClass MY_FEATURE = eINSTANCE.getMyFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MY_FEATURE__NAME = eINSTANCE.getMyFeature_Name();

  }

} //HipsterDomainLanguagePackage
