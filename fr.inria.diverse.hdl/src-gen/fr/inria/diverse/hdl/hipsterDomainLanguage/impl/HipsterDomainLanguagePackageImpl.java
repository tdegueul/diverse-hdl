/**
 */
package fr.inria.diverse.hdl.hipsterDomainLanguage.impl;

import fr.inria.diverse.hdl.hipsterDomainLanguage.Domain;
import fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguageFactory;
import fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage;
import fr.inria.diverse.hdl.hipsterDomainLanguage.MyElement;
import fr.inria.diverse.hdl.hipsterDomainLanguage.MyFeature;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HipsterDomainLanguagePackageImpl extends EPackageImpl implements HipsterDomainLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass myElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass myFeatureEClass = null;

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
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private HipsterDomainLanguagePackageImpl()
  {
    super(eNS_URI, HipsterDomainLanguageFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link HipsterDomainLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static HipsterDomainLanguagePackage init()
  {
    if (isInited) return (HipsterDomainLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(HipsterDomainLanguagePackage.eNS_URI);

    // Obtain or create and register package
    HipsterDomainLanguagePackageImpl theHipsterDomainLanguagePackage = (HipsterDomainLanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HipsterDomainLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HipsterDomainLanguagePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theHipsterDomainLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theHipsterDomainLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theHipsterDomainLanguagePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(HipsterDomainLanguagePackage.eNS_URI, theHipsterDomainLanguagePackage);
    return theHipsterDomainLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomain()
  {
    return domainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomain_Elements()
  {
    return (EReference)domainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMyElement()
  {
    return myElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMyElement_Name()
  {
    return (EAttribute)myElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMyElement_SomeFeatureOfMyElement()
  {
    return (EReference)myElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMyFeature()
  {
    return myFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMyFeature_Name()
  {
    return (EAttribute)myFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HipsterDomainLanguageFactory getHipsterDomainLanguageFactory()
  {
    return (HipsterDomainLanguageFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    domainEClass = createEClass(DOMAIN);
    createEReference(domainEClass, DOMAIN__ELEMENTS);

    myElementEClass = createEClass(MY_ELEMENT);
    createEAttribute(myElementEClass, MY_ELEMENT__NAME);
    createEReference(myElementEClass, MY_ELEMENT__SOME_FEATURE_OF_MY_ELEMENT);

    myFeatureEClass = createEClass(MY_FEATURE);
    createEAttribute(myFeatureEClass, MY_FEATURE__NAME);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDomain_Elements(), this.getMyElement(), null, "elements", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(myElementEClass, MyElement.class, "MyElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMyElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, MyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMyElement_SomeFeatureOfMyElement(), this.getMyFeature(), null, "someFeatureOfMyElement", null, 0, -1, MyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(myFeatureEClass, MyFeature.class, "MyFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMyFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, MyFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //HipsterDomainLanguagePackageImpl
