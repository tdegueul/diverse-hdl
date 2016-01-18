/**
 */
package fr.inria.diverse.hdl.hipsterDomainLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage
 * @generated
 */
public interface HipsterDomainLanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HipsterDomainLanguageFactory eINSTANCE = fr.inria.diverse.hdl.hipsterDomainLanguage.impl.HipsterDomainLanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Domain</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domain</em>'.
   * @generated
   */
  Domain createDomain();

  /**
   * Returns a new object of class '<em>Domain Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domain Element</em>'.
   * @generated
   */
  DomainElement createDomainElement();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relation</em>'.
   * @generated
   */
  Relation createRelation();

  /**
   * Returns a new object of class '<em>Enum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum</em>'.
   * @generated
   */
  Enum createEnum();

  /**
   * Returns a new object of class '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field</em>'.
   * @generated
   */
  Field createField();

  /**
   * Returns a new object of class '<em>Hdl Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hdl Type</em>'.
   * @generated
   */
  HdlType createHdlType();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  HipsterDomainLanguagePackage getHipsterDomainLanguagePackage();

} //HipsterDomainLanguageFactory
