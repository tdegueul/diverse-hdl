/**
 */
package fr.inria.diverse.hdl.hipsterDomainLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Relation#getType <em>Type</em>}</li>
 *   <li>{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Relation#getFrom <em>From</em>}</li>
 *   <li>{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Relation#getFromRelation <em>From Relation</em>}</li>
 *   <li>{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Relation#getTo <em>To</em>}</li>
 *   <li>{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Relation#getToRelation <em>To Relation</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends DomainElement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link fr.inria.diverse.hdl.hipsterDomainLanguage.RelationType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.RelationType
   * @see #setType(RelationType)
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage#getRelation_Type()
   * @model
   * @generated
   */
  RelationType getType();

  /**
   * Sets the value of the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Relation#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.RelationType
   * @see #getType()
   * @generated
   */
  void setType(RelationType value);

  /**
   * Returns the value of the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' reference.
   * @see #setFrom(Entity)
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage#getRelation_From()
   * @model
   * @generated
   */
  Entity getFrom();

  /**
   * Sets the value of the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Relation#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(Entity value);

  /**
   * Returns the value of the '<em><b>From Relation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From Relation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Relation</em>' attribute.
   * @see #setFromRelation(String)
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage#getRelation_FromRelation()
   * @model
   * @generated
   */
  String getFromRelation();

  /**
   * Sets the value of the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Relation#getFromRelation <em>From Relation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From Relation</em>' attribute.
   * @see #getFromRelation()
   * @generated
   */
  void setFromRelation(String value);

  /**
   * Returns the value of the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' reference.
   * @see #setTo(Entity)
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage#getRelation_To()
   * @model
   * @generated
   */
  Entity getTo();

  /**
   * Sets the value of the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Relation#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
  void setTo(Entity value);

  /**
   * Returns the value of the '<em><b>To Relation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Relation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Relation</em>' attribute.
   * @see #setToRelation(String)
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage#getRelation_ToRelation()
   * @model
   * @generated
   */
  String getToRelation();

  /**
   * Sets the value of the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Relation#getToRelation <em>To Relation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Relation</em>' attribute.
   * @see #getToRelation()
   * @generated
   */
  void setToRelation(String value);

} // Relation
