/**
 */
package fr.inria.diverse.hdl.hipsterDomainLanguage.impl;

import fr.inria.diverse.hdl.hipsterDomainLanguage.Domain;
import fr.inria.diverse.hdl.hipsterDomainLanguage.DomainElement;
import fr.inria.diverse.hdl.hipsterDomainLanguage.Entity;
import fr.inria.diverse.hdl.hipsterDomainLanguage.Field;
import fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguageFactory;
import fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage;
import fr.inria.diverse.hdl.hipsterDomainLanguage.JHipsterType;
import fr.inria.diverse.hdl.hipsterDomainLanguage.Relation;
import fr.inria.diverse.hdl.hipsterDomainLanguage.RelationType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
  private EClass domainElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum relationTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum jHipsterTypeEEnum = null;

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
  public EClass getDomainElement()
  {
    return domainElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntity_Name()
  {
    return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_Fields()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelation()
  {
    return relationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelation_Type()
  {
    return (EAttribute)relationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_From()
  {
    return (EReference)relationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelation_FromRelation()
  {
    return (EAttribute)relationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_To()
  {
    return (EReference)relationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelation_ToRelation()
  {
    return (EAttribute)relationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getField()
  {
    return fieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_Name()
  {
    return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_Type()
  {
    return (EAttribute)fieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_Required()
  {
    return (EAttribute)fieldEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getRelationType()
  {
    return relationTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getJHipsterType()
  {
    return jHipsterTypeEEnum;
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

    domainElementEClass = createEClass(DOMAIN_ELEMENT);

    entityEClass = createEClass(ENTITY);
    createEAttribute(entityEClass, ENTITY__NAME);
    createEReference(entityEClass, ENTITY__FIELDS);

    relationEClass = createEClass(RELATION);
    createEAttribute(relationEClass, RELATION__TYPE);
    createEReference(relationEClass, RELATION__FROM);
    createEAttribute(relationEClass, RELATION__FROM_RELATION);
    createEReference(relationEClass, RELATION__TO);
    createEAttribute(relationEClass, RELATION__TO_RELATION);

    fieldEClass = createEClass(FIELD);
    createEAttribute(fieldEClass, FIELD__NAME);
    createEAttribute(fieldEClass, FIELD__TYPE);
    createEAttribute(fieldEClass, FIELD__REQUIRED);

    // Create enums
    relationTypeEEnum = createEEnum(RELATION_TYPE);
    jHipsterTypeEEnum = createEEnum(JHIPSTER_TYPE);
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
    entityEClass.getESuperTypes().add(this.getDomainElement());
    relationEClass.getESuperTypes().add(this.getDomainElement());

    // Initialize classes and features; add operations and parameters
    initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDomain_Elements(), this.getDomainElement(), null, "elements", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domainElementEClass, DomainElement.class, "DomainElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_Fields(), this.getField(), null, "fields", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRelation_Type(), this.getRelationType(), "type", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelation_From(), this.getEntity(), null, "from", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelation_FromRelation(), ecorePackage.getEString(), "fromRelation", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelation_To(), this.getEntity(), null, "to", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelation_ToRelation(), ecorePackage.getEString(), "toRelation", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getField_Name(), ecorePackage.getEString(), "name", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getField_Type(), this.getJHipsterType(), "type", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getField_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(relationTypeEEnum, RelationType.class, "RelationType");
    addEEnumLiteral(relationTypeEEnum, RelationType.ONE_TO_MANY);
    addEEnumLiteral(relationTypeEEnum, RelationType.MANY_TO_ONE);
    addEEnumLiteral(relationTypeEEnum, RelationType.ONE_TO_ONE);
    addEEnumLiteral(relationTypeEEnum, RelationType.MANY_TO_MANY);

    initEEnum(jHipsterTypeEEnum, JHipsterType.class, "JHipsterType");
    addEEnumLiteral(jHipsterTypeEEnum, JHipsterType.STRING);
    addEEnumLiteral(jHipsterTypeEEnum, JHipsterType.INTEGER);
    addEEnumLiteral(jHipsterTypeEEnum, JHipsterType.LONG);
    addEEnumLiteral(jHipsterTypeEEnum, JHipsterType.BIG_DECIMAL);
    addEEnumLiteral(jHipsterTypeEEnum, JHipsterType.FLOAT);
    addEEnumLiteral(jHipsterTypeEEnum, JHipsterType.DOUBLE);
    addEEnumLiteral(jHipsterTypeEEnum, JHipsterType.ENUM);
    addEEnumLiteral(jHipsterTypeEEnum, JHipsterType.BOOLEAN);
    addEEnumLiteral(jHipsterTypeEEnum, JHipsterType.LOCAL_DATE);
    addEEnumLiteral(jHipsterTypeEEnum, JHipsterType.ZONE_DATE_TIME);

    // Create resource
    createResource(eNS_URI);
  }

} //HipsterDomainLanguagePackageImpl
