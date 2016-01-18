/**
 */
package fr.inria.diverse.hdl.hipsterDomainLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Entity#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Entity#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends DomainElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage#getEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Entity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.diverse.hdl.hipsterDomainLanguage.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage#getEntity_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

} // Entity
