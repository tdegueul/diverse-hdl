/**
 */
package fr.inria.diverse.hdl.hipsterDomainLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Min Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.hdl.hipsterDomainLanguage.MinSpecification#getMin <em>Min</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage#getMinSpecification()
 * @model
 * @generated
 */
public interface MinSpecification extends ValueRange
{
  /**
   * Returns the value of the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' attribute.
   * @see #setMin(int)
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage#getMinSpecification_Min()
   * @model
   * @generated
   */
  int getMin();

  /**
   * Sets the value of the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.MinSpecification#getMin <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' attribute.
   * @see #getMin()
   * @generated
   */
  void setMin(int value);

} // MinSpecification
