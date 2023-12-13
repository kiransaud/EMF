/**
 */
package finance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Financial Entity Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see finance.FinancePackage#getFinancialEntityType()
 * @model
 * @generated
 */
public enum FinancialEntityType implements Enumerator {
	/**
	 * The '<em><b>BANK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BANK_VALUE
	 * @generated
	 * @ordered
	 */
	BANK(0, "BANK", "BANK"),

	/**
	 * The '<em><b>INVESTFIRM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVESTFIRM_VALUE
	 * @generated
	 * @ordered
	 */
	INVESTFIRM(1, "INVESTFIRM", "INVESTFIRM"),

	/**
	 * The '<em><b>CREDITUNION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREDITUNION_VALUE
	 * @generated
	 * @ordered
	 */
	CREDITUNION(2, "CREDITUNION", "CREDITUNION"),

	/**
	 * The '<em><b>INSURANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSURANCE_VALUE
	 * @generated
	 * @ordered
	 */
	INSURANCE(3, "INSURANCE", "INSURANCE"),

	/**
	 * The '<em><b>COOPERATIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COOPERATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	COOPERATIVE(4, "COOPERATIVE", "COOPERATIVE"),

	/**
	 * The '<em><b>OTHERS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHERS_VALUE
	 * @generated
	 * @ordered
	 */
	OTHERS(5, "OTHERS", "OTHERS");

	/**
	 * The '<em><b>BANK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BANK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BANK_VALUE = 0;

	/**
	 * The '<em><b>INVESTFIRM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVESTFIRM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INVESTFIRM_VALUE = 1;

	/**
	 * The '<em><b>CREDITUNION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREDITUNION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CREDITUNION_VALUE = 2;

	/**
	 * The '<em><b>INSURANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSURANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSURANCE_VALUE = 3;

	/**
	 * The '<em><b>COOPERATIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COOPERATIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COOPERATIVE_VALUE = 4;

	/**
	 * The '<em><b>OTHERS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHERS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHERS_VALUE = 5;

	/**
	 * An array of all the '<em><b>Financial Entity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FinancialEntityType[] VALUES_ARRAY =
		new FinancialEntityType[] {
			BANK,
			INVESTFIRM,
			CREDITUNION,
			INSURANCE,
			COOPERATIVE,
			OTHERS,
		};

	/**
	 * A public read-only list of all the '<em><b>Financial Entity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FinancialEntityType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Financial Entity Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FinancialEntityType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FinancialEntityType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Financial Entity Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FinancialEntityType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FinancialEntityType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Financial Entity Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FinancialEntityType get(int value) {
		switch (value) {
			case BANK_VALUE: return BANK;
			case INVESTFIRM_VALUE: return INVESTFIRM;
			case CREDITUNION_VALUE: return CREDITUNION;
			case INSURANCE_VALUE: return INSURANCE;
			case COOPERATIVE_VALUE: return COOPERATIVE;
			case OTHERS_VALUE: return OTHERS;
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
	private FinancialEntityType(int value, String name, String literal) {
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
	
} //FinancialEntityType
