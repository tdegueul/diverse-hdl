/**
 */
package fr.inria.diverse.hdl.hipsterDomainLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hdl Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.hdl.hipsterDomainLanguage.HdlType#getEnumType <em>Enum Type</em>}</li>
 *   <li>{@link fr.inria.diverse.hdl.hipsterDomainLanguage.HdlType#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage#getHdlType()
 * @model
 * @generated
 */
public interface HdlType extends EObject
{
  /**
   * Returns the value of the '<em><b>Enum Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum Type</em>' reference.
   * @see #setEnumType(fr.inria.diverse.hdl.hipsterDomainLanguage.Enum)
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage#getHdlType_EnumType()
   * @model
   * @generated
   */
  fr.inria.diverse.hdl.hipsterDomainLanguage.Enum getEnumType();

  /**
   * Sets the value of the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.HdlType#getEnumType <em>Enum Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum Type</em>' reference.
   * @see #getEnumType()
   * @generated
   */
  void setEnumType(fr.inria.diverse.hdl.hipsterDomainLanguage.Enum value);

  /**
   * Returns the value of the '<em><b>Primitive Type</b></em>' attribute.
   * The literals are from the enumeration {@link fr.inria.diverse.hdl.hipsterDomainLanguage.JHipsterType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primitive Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primitive Type</em>' attribute.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.JHipsterType
   * @see #setPrimitiveType(JHipsterType)
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage#getHdlType_PrimitiveType()
   * @model
   * @generated
   */
  JHipsterType getPrimitiveType();

  /**
   * Sets the value of the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.HdlType#getPrimitiveType <em>Primitive Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primitive Type</em>' attribute.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.JHipsterType
   * @see #getPrimitiveType()
   * @generated
   */
  void setPrimitiveType(JHipsterType value);

} // HdlType
