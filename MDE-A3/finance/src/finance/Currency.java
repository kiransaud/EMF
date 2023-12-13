/**
 */
package finance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Currency</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see finance.FinancePackage#getCurrency()
 * @model
 * @generated
 */
public enum Currency implements Enumerator {
	/**
	 * The '<em><b>Euro</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EURO_VALUE
	 * @generated
	 * @ordered
	 */
	EURO(0, "Euro", "Euro"),

	/**
	 * The '<em><b>YEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEN_VALUE
	 * @generated
	 * @ordered
	 */
	YEN(1, "YEN", "YEN"),

	/**
	 * The '<em><b>GBP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GBP_VALUE
	 * @generated
	 * @ordered
	 */
	GBP(2, "GBP", "GBP"),

	/**
	 * The '<em><b>USD3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USD3_VALUE
	 * @generated
	 * @ordered
	 */
	USD3(3, "USD3", "USD3");

	/**
	 * The '<em><b>Euro</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EURO
	 * @model name="Euro"
	 * @generated
	 * @ordered
	 */
	public static final int EURO_VALUE = 0;

	/**
	 * The '<em><b>YEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YEN_VALUE = 1;

	/**
	 * The '<em><b>GBP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GBP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GBP_VALUE = 2;

	/**
	 * The '<em><b>USD3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USD3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USD3_VALUE = 3;

	/**
	 * An array of all the '<em><b>Currency</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Currency[] VALUES_ARRAY =
		new Currency[] {
			EURO,
			YEN,
			GBP,
			USD3,
		};

	/**
	 * A public read-only list of all the '<em><b>Currency</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Currency> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Currency</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Currency get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Currency result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Currency</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Currency getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Currency result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Currency</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Currency get(int value) {
		switch (value) {
			case EURO_VALUE: return EURO;
			case YEN_VALUE: return YEN;
			case GBP_VALUE: return GBP;
			case USD3_VALUE: return USD3;
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
	private Currency(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Currency
