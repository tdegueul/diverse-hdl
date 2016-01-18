/**
 */
package fr.inria.diverse.hdl.hipsterDomainLanguage.impl;

import fr.inria.diverse.hdl.hipsterDomainLanguage.Entity;
import fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage;
import fr.inria.diverse.hdl.hipsterDomainLanguage.Relation;
import fr.inria.diverse.hdl.hipsterDomainLanguage.RelationType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.RelationImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.RelationImpl#getFrom <em>From</em>}</li>
 *   <li>{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.RelationImpl#getFromRelationName <em>From Relation Name</em>}</li>
 *   <li>{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.RelationImpl#getTo <em>To</em>}</li>
 *   <li>{@link fr.inria.diverse.hdl.hipsterDomainLanguage.impl.RelationImpl#getToRelationName <em>To Relation Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationImpl extends DomainElementImpl implements Relation
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final RelationType TYPE_EDEFAULT = RelationType.ONE_TO_MANY;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected RelationType type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected Entity from;

  /**
   * The default value of the '{@link #getFromRelationName() <em>From Relation Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromRelationName()
   * @generated
   * @ordered
   */
  protected static final String FROM_RELATION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFromRelationName() <em>From Relation Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromRelationName()
   * @generated
   * @ordered
   */
  protected String fromRelationName = FROM_RELATION_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected Entity to;

  /**
   * The default value of the '{@link #getToRelationName() <em>To Relation Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToRelationName()
   * @generated
   * @ordered
   */
  protected static final String TO_RELATION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getToRelationName() <em>To Relation Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToRelationName()
   * @generated
   * @ordered
   */
  protected String toRelationName = TO_RELATION_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return HipsterDomainLanguagePackage.Literals.RELATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(RelationType newType)
  {
    RelationType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HipsterDomainLanguagePackage.RELATION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getFrom()
  {
    if (from != null && from.eIsProxy())
    {
      InternalEObject oldFrom = (InternalEObject)from;
      from = (Entity)eResolveProxy(oldFrom);
      if (from != oldFrom)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HipsterDomainLanguagePackage.RELATION__FROM, oldFrom, from));
      }
    }
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(Entity newFrom)
  {
    Entity oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HipsterDomainLanguagePackage.RELATION__FROM, oldFrom, from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFromRelationName()
  {
    return fromRelationName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFromRelationName(String newFromRelationName)
  {
    String oldFromRelationName = fromRelationName;
    fromRelationName = newFromRelationName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HipsterDomainLanguagePackage.RELATION__FROM_RELATION_NAME, oldFromRelationName, fromRelationName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getTo()
  {
    if (to != null && to.eIsProxy())
    {
      InternalEObject oldTo = (InternalEObject)to;
      to = (Entity)eResolveProxy(oldTo);
      if (to != oldTo)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HipsterDomainLanguagePackage.RELATION__TO, oldTo, to));
      }
    }
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTo(Entity newTo)
  {
    Entity oldTo = to;
    to = newTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HipsterDomainLanguagePackage.RELATION__TO, oldTo, to));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getToRelationName()
  {
    return toRelationName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToRelationName(String newToRelationName)
  {
    String oldToRelationName = toRelationName;
    toRelationName = newToRelationName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HipsterDomainLanguagePackage.RELATION__TO_RELATION_NAME, oldToRelationName, toRelationName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case HipsterDomainLanguagePackage.RELATION__TYPE:
        return getType();
      case HipsterDomainLanguagePackage.RELATION__FROM:
        if (resolve) return getFrom();
        return basicGetFrom();
      case HipsterDomainLanguagePackage.RELATION__FROM_RELATION_NAME:
        return getFromRelationName();
      case HipsterDomainLanguagePackage.RELATION__TO:
        if (resolve) return getTo();
        return basicGetTo();
      case HipsterDomainLanguagePackage.RELATION__TO_RELATION_NAME:
        return getToRelationName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HipsterDomainLanguagePackage.RELATION__TYPE:
        setType((RelationType)newValue);
        return;
      case HipsterDomainLanguagePackage.RELATION__FROM:
        setFrom((Entity)newValue);
        return;
      case HipsterDomainLanguagePackage.RELATION__FROM_RELATION_NAME:
        setFromRelationName((String)newValue);
        return;
      case HipsterDomainLanguagePackage.RELATION__TO:
        setTo((Entity)newValue);
        return;
      case HipsterDomainLanguagePackage.RELATION__TO_RELATION_NAME:
        setToRelationName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case HipsterDomainLanguagePackage.RELATION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case HipsterDomainLanguagePackage.RELATION__FROM:
        setFrom((Entity)null);
        return;
      case HipsterDomainLanguagePackage.RELATION__FROM_RELATION_NAME:
        setFromRelationName(FROM_RELATION_NAME_EDEFAULT);
        return;
      case HipsterDomainLanguagePackage.RELATION__TO:
        setTo((Entity)null);
        return;
      case HipsterDomainLanguagePackage.RELATION__TO_RELATION_NAME:
        setToRelationName(TO_RELATION_NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case HipsterDomainLanguagePackage.RELATION__TYPE:
        return type != TYPE_EDEFAULT;
      case HipsterDomainLanguagePackage.RELATION__FROM:
        return from != null;
      case HipsterDomainLanguagePackage.RELATION__FROM_RELATION_NAME:
        return FROM_RELATION_NAME_EDEFAULT == null ? fromRelationName != null : !FROM_RELATION_NAME_EDEFAULT.equals(fromRelationName);
      case HipsterDomainLanguagePackage.RELATION__TO:
        return to != null;
      case HipsterDomainLanguagePackage.RELATION__TO_RELATION_NAME:
        return TO_RELATION_NAME_EDEFAULT == null ? toRelationName != null : !TO_RELATION_NAME_EDEFAULT.equals(toRelationName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (type: ");
    result.append(type);
    result.append(", fromRelationName: ");
    result.append(fromRelationName);
    result.append(", toRelationName: ");
    result.append(toRelationName);
    result.append(')');
    return result.toString();
  }

} //RelationImpl
