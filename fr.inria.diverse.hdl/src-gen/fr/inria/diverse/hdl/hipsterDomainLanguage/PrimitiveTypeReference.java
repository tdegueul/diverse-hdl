/**
 */
package fr.inria.diverse.hdl.hipsterDomainLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.hdl.hipsterDomainLanguage.PrimitiveTypeReference#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage#getPrimitiveTypeReference()
 * @model
 * @generated
 */
public interface PrimitiveTypeReference extends HdlTypeReference
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link fr.inria.diverse.hdl.hipsterDomainLanguage.JHipsterType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.JHipsterType
   * @see #setType(JHipsterType)
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage#getPrimitiveTypeReference_Type()
   * @model
   * @generated
   */
  JHipsterType getType();

  /**
   * Sets the value of the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.PrimitiveTypeReference#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.JHipsterType
   * @see #getType()
   * @generated
   */
  void setType(JHipsterType value);

} // PrimitiveTypeReference
