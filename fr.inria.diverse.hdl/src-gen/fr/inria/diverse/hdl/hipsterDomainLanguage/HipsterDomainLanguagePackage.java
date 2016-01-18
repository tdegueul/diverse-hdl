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
   * The meta object id for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.FieldImpl
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getField()
   * @generated
   */
  int FIELD = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
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
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.RelationType <em>Relation Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.RelationType
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getRelationType()
   * @generated
   */
  int RELATION_TYPE = 5;

  /**
   * The meta object id for the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.JHipsterType <em>JHipster Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.JHipsterType
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguagePackageImpl#getJHipsterType()
   * @generated
   */
  int JHIPSTER_TYPE = 6;


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
   * Returns the meta object for the attribute '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Field#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Field#getType()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Type();

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
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__TYPE = eINSTANCE.getField_Type();

    /**
     * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__REQUIRED = eINSTANCE.getField_Required();

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
