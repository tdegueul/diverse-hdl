/**
 */
package fr.inria.diverse.hdl.hipsterDomainLanguage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Relation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage#getRelationType()
 * @model
 * @generated
 */
public enum RelationType implements Enumerator
{
  /**
   * The '<em><b>ONE TO MANY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONE_TO_MANY_VALUE
   * @generated
   * @ordered
   */
  ONE_TO_MANY(0, "ONE_TO_MANY", "OneToMany"),

  /**
   * The '<em><b>MANY TO ONE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MANY_TO_ONE_VALUE
   * @generated
   * @ordered
   */
  MANY_TO_ONE(1, "MANY_TO_ONE", "ManyToOne"),

  /**
   * The '<em><b>ONE TO ONE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONE_TO_ONE_VALUE
   * @generated
   * @ordered
   */
  ONE_TO_ONE(2, "ONE_TO_ONE", "OneToOne"),

  /**
   * The '<em><b>MANY TO MANY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MANY_TO_MANY_VALUE
   * @generated
   * @ordered
   */
  MANY_TO_MANY(3, "MANY_TO_MANY", "ManyToMany");

  /**
   * The '<em><b>ONE TO MANY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ONE TO MANY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ONE_TO_MANY
   * @model literal="OneToMany"
   * @generated
   * @ordered
   */
  public static final int ONE_TO_MANY_VALUE = 0;

  /**
   * The '<em><b>MANY TO ONE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MANY TO ONE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MANY_TO_ONE
   * @model literal="ManyToOne"
   * @generated
   * @ordered
   */
  public static final int MANY_TO_ONE_VALUE = 1;

  /**
   * The '<em><b>ONE TO ONE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ONE TO ONE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ONE_TO_ONE
   * @model literal="OneToOne"
   * @generated
   * @ordered
   */
  public static final int ONE_TO_ONE_VALUE = 2;

  /**
   * The '<em><b>MANY TO MANY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MANY TO MANY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MANY_TO_MANY
   * @model literal="ManyToMany"
   * @generated
   * @ordered
   */
  public static final int MANY_TO_MANY_VALUE = 3;

  /**
   * An array of all the '<em><b>Relation Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final RelationType[] VALUES_ARRAY =
    new RelationType[]
    {
      ONE_TO_MANY,
      MANY_TO_ONE,
      ONE_TO_ONE,
      MANY_TO_MANY,
    };

  /**
   * A public read-only list of all the '<em><b>Relation Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<RelationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Relation Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RelationType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RelationType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Relation Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RelationType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RelationType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Relation Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RelationType get(int value)
  {
    switch (value)
    {
      case ONE_TO_MANY_VALUE: return ONE_TO_MANY;
      case MANY_TO_ONE_VALUE: return MANY_TO_ONE;
      case ONE_TO_ONE_VALUE: return ONE_TO_ONE;
      case MANY_TO_MANY_VALUE: return MANY_TO_MANY;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private RelationType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //RelationType
