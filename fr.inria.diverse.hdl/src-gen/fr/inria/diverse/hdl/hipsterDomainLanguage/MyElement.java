/**
 */
package fr.inria.diverse.hdl.hipsterDomainLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.hdl.hipsterDomainLanguage.MyElement#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.diverse.hdl.hipsterDomainLanguage.MyElement#getSomeFeatureOfMyElement <em>Some Feature Of My Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage#getMyElement()
 * @model
 * @generated
 */
public interface MyElement extends EObject
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
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage#getMyElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.MyElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Some Feature Of My Element</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.diverse.hdl.hipsterDomainLanguage.MyFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Some Feature Of My Element</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Some Feature Of My Element</em>' containment reference list.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage#getMyElement_SomeFeatureOfMyElement()
   * @model containment="true"
   * @generated
   */
  EList<MyFeature> getSomeFeatureOfMyElement();

} // MyElement
