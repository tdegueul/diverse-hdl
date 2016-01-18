/**
 */
package fr.inria.diverse.hdl.hipsterDomainLanguage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>JHipster Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage#getJHipsterType()
 * @model
 * @generated
 */
public enum JHipsterType implements Enumerator
{
  /**
   * The '<em><b>STRING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_VALUE
   * @generated
   * @ordered
   */
  STRING(0, "STRING", "String"),

  /**
   * The '<em><b>INTEGER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTEGER_VALUE
   * @generated
   * @ordered
   */
  INTEGER(1, "INTEGER", "Integer"),

  /**
   * The '<em><b>LONG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LONG_VALUE
   * @generated
   * @ordered
   */
  LONG(2, "LONG", "Long"),

  /**
   * The '<em><b>BIG DECIMAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BIG_DECIMAL_VALUE
   * @generated
   * @ordered
   */
  BIG_DECIMAL(3, "BIG_DECIMAL", "BigDecimal"),

  /**
   * The '<em><b>FLOAT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FLOAT_VALUE
   * @generated
   * @ordered
   */
  FLOAT(4, "FLOAT", "Float"),

  /**
   * The '<em><b>DOUBLE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOUBLE_VALUE
   * @generated
   * @ordered
   */
  DOUBLE(5, "DOUBLE", "Double"),

  /**
   * The '<em><b>ENUM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENUM_VALUE
   * @generated
   * @ordered
   */
  ENUM(6, "ENUM", "Enum"),

  /**
   * The '<em><b>BOOLEAN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOOLEAN_VALUE
   * @generated
   * @ordered
   */
  BOOLEAN(7, "BOOLEAN", "Boolean"),

  /**
   * The '<em><b>LOCAL DATE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LOCAL_DATE_VALUE
   * @generated
   * @ordered
   */
  LOCAL_DATE(8, "LOCAL_DATE", "LocalDate"),

  /**
   * The '<em><b>ZONE DATE TIME</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ZONE_DATE_TIME_VALUE
   * @generated
   * @ordered
   */
  ZONE_DATE_TIME(9, "ZONE_DATE_TIME", "ZoneDateTime");

  /**
   * The '<em><b>STRING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STRING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRING
   * @model literal="String"
   * @generated
   * @ordered
   */
  public static final int STRING_VALUE = 0;

  /**
   * The '<em><b>INTEGER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INTEGER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTEGER
   * @model literal="Integer"
   * @generated
   * @ordered
   */
  public static final int INTEGER_VALUE = 1;

  /**
   * The '<em><b>LONG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LONG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LONG
   * @model literal="Long"
   * @generated
   * @ordered
   */
  public static final int LONG_VALUE = 2;

  /**
   * The '<em><b>BIG DECIMAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BIG DECIMAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BIG_DECIMAL
   * @model literal="BigDecimal"
   * @generated
   * @ordered
   */
  public static final int BIG_DECIMAL_VALUE = 3;

  /**
   * The '<em><b>FLOAT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FLOAT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FLOAT
   * @model literal="Float"
   * @generated
   * @ordered
   */
  public static final int FLOAT_VALUE = 4;

  /**
   * The '<em><b>DOUBLE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DOUBLE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DOUBLE
   * @model literal="Double"
   * @generated
   * @ordered
   */
  public static final int DOUBLE_VALUE = 5;

  /**
   * The '<em><b>ENUM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ENUM</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENUM
   * @model literal="Enum"
   * @generated
   * @ordered
   */
  public static final int ENUM_VALUE = 6;

  /**
   * The '<em><b>BOOLEAN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BOOLEAN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BOOLEAN
   * @model literal="Boolean"
   * @generated
   * @ordered
   */
  public static final int BOOLEAN_VALUE = 7;

  /**
   * The '<em><b>LOCAL DATE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LOCAL DATE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LOCAL_DATE
   * @model literal="LocalDate"
   * @generated
   * @ordered
   */
  public static final int LOCAL_DATE_VALUE = 8;

  /**
   * The '<em><b>ZONE DATE TIME</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ZONE DATE TIME</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ZONE_DATE_TIME
   * @model literal="ZoneDateTime"
   * @generated
   * @ordered
   */
  public static final int ZONE_DATE_TIME_VALUE = 9;

  /**
   * An array of all the '<em><b>JHipster Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final JHipsterType[] VALUES_ARRAY =
    new JHipsterType[]
    {
      STRING,
      INTEGER,
      LONG,
      BIG_DECIMAL,
      FLOAT,
      DOUBLE,
      ENUM,
      BOOLEAN,
      LOCAL_DATE,
      ZONE_DATE_TIME,
    };

  /**
   * A public read-only list of all the '<em><b>JHipster Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<JHipsterType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>JHipster Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static JHipsterType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      JHipsterType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>JHipster Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static JHipsterType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      JHipsterType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>JHipster Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static JHipsterType get(int value)
  {
    switch (value)
    {
      case STRING_VALUE: return STRING;
      case INTEGER_VALUE: return INTEGER;
      case LONG_VALUE: return LONG;
      case BIG_DECIMAL_VALUE: return BIG_DECIMAL;
      case FLOAT_VALUE: return FLOAT;
      case DOUBLE_VALUE: return DOUBLE;
      case ENUM_VALUE: return ENUM;
      case BOOLEAN_VALUE: return BOOLEAN;
      case LOCAL_DATE_VALUE: return LOCAL_DATE;
      case ZONE_DATE_TIME_VALUE: return ZONE_DATE_TIME;
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
  private JHipsterType(int value, String name, String literal)
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
  
} //JHipsterType
