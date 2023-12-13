/**
 */
package finance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Party Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see finance.FinancePackage#getPartyType()
 * @model
 * @generated
 */
public enum PartyType implements Enumerator {
	/**
	 * The '<em><b>INDIVIDUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDIVIDUAL_VALUE
	 * @generated
	 * @ordered
	 */
	INDIVIDUAL(0, "INDIVIDUAL", "INDIVIDUAL"),

	/**
	 * The '<em><b>ORGANIZATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORGANIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	ORGANIZATION(1, "ORGANIZATION", "ORGANIZATION");

	/**
	 * The '<em><b>INDIVIDUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDIVIDUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INDIVIDUAL_VALUE = 0;

	/**
	 * The '<em><b>ORGANIZATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORGANIZATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORGANIZATION_VALUE = 1;

	/**
	 * An array of all the '<em><b>Party Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PartyType[] VALUES_ARRAY =
		new PartyType[] {
			INDIVIDUAL,
			ORGANIZATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Party Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PartyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Party Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PartyType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PartyType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Party Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PartyType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PartyType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Party Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PartyType get(int value) {
		switch (value) {
			case INDIVIDUAL_VALUE: return INDIVIDUAL;
			case ORGANIZATION_VALUE: return ORGANIZATION;
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
	private PartyType(int value, String name, String literal) {
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
	
} //PartyType
