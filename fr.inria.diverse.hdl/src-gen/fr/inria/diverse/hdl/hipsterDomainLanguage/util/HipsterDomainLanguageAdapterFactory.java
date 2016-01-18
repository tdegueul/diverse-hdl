/**
 */
package fr.inria.diverse.hdl.hipsterDomainLanguage.util;

import fr.inria.diverse.hdl.hipsterDomainLanguage.Domain;
import fr.inria.diverse.hdl.hipsterDomainLanguage.DomainElement;
import fr.inria.diverse.hdl.hipsterDomainLanguage.Entity;
import fr.inria.diverse.hdl.hipsterDomainLanguage.Field;
import fr.inria.diverse.hdl.hipsterDomainLanguage.HdlType;
import fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage;
import fr.inria.diverse.hdl.hipsterDomainLanguage.Relation;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage
 * @generated
 */
public class HipsterDomainLanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static HipsterDomainLanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HipsterDomainLanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = HipsterDomainLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HipsterDomainLanguageSwitch<Adapter> modelSwitch =
    new HipsterDomainLanguageSwitch<Adapter>()
    {
      @Override
      public Adapter caseDomain(Domain object)
      {
        return createDomainAdapter();
      }
      @Override
      public Adapter caseDomainElement(DomainElement object)
      {
        return createDomainElementAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseRelation(Relation object)
      {
        return createRelationAdapter();
      }
      @Override
      public Adapter caseEnum(fr.inria.diverse.hdl.hipsterDomainLanguage.Enum object)
      {
        return createEnumAdapter();
      }
      @Override
      public Adapter caseField(Field object)
      {
        return createFieldAdapter();
      }
      @Override
      public Adapter caseHdlType(HdlType object)
      {
        return createHdlTypeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Domain
   * @generated
   */
  public Adapter createDomainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.DomainElement <em>Domain Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.DomainElement
   * @generated
   */
  public Adapter createDomainElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Relation
   * @generated
   */
  public Adapter createRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Enum
   * @generated
   */
  public Adapter createEnumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.Field
   * @generated
   */
  public Adapter createFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.diverse.hdl.hipsterDomainLanguage.HdlType <em>Hdl Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HdlType
   * @generated
   */
  public Adapter createHdlTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //HipsterDomainLanguageAdapterFactory
