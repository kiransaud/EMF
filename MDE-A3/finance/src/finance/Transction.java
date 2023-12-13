/**
 */
package finance;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link finance.Transction#getTransctionID <em>Transction ID</em>}</li>
 *   <li>{@link finance.Transction#getAmount <em>Amount</em>}</li>
 *   <li>{@link finance.Transction#getDate <em>Date</em>}</li>
 *   <li>{@link finance.Transction#getTransctiontype <em>Transctiontype</em>}</li>
 *   <li>{@link finance.Transction#getTransctionmode <em>Transctionmode</em>}</li>
 * </ul>
 *
 * @see finance.FinancePackage#getTransction()
 * @model
 * @generated
 */
public interface Transction extends EObject {
	/**
	 * Returns the value of the '<em><b>Transction ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transction ID</em>' attribute.
	 * @see #setTransctionID(int)
	 * @see finance.FinancePackage#getTransction_TransctionID()
	 * @model
	 * @generated
	 */
	int getTransctionID();

	/**
	 * Sets the value of the '{@link finance.Transction#getTransctionID <em>Transction ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transction ID</em>' attribute.
	 * @see #getTransctionID()
	 * @generated
	 */
	void setTransctionID(int value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(float)
	 * @see finance.FinancePackage#getTransction_Amount()
	 * @model
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link finance.Transction#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see finance.FinancePackage#getTransction_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link finance.Transction#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Transctiontype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transctiontype</em>' reference.
	 * @see #setTransctiontype(TransctionType)
	 * @see finance.FinancePackage#getTransction_Transctiontype()
	 * @model required="true"
	 * @generated
	 */
	TransctionType getTransctiontype();

	/**
	 * Sets the value of the '{@link finance.Transction#getTransctiontype <em>Transctiontype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transctiontype</em>' reference.
	 * @see #getTransctiontype()
	 * @generated
	 */
	void setTransctiontype(TransctionType value);

	/**
	 * Returns the value of the '<em><b>Transctionmode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transctionmode</em>' reference.
	 * @see #setTransctionmode(TransctionMode)
	 * @see finance.FinancePackage#getTransction_Transctionmode()
	 * @model required="true"
	 * @generated
	 */
	TransctionMode getTransctionmode();

	/**
	 * Sets the value of the '{@link finance.Transction#getTransctionmode <em>Transctionmode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transctionmode</em>' reference.
	 * @see #getTransctionmode()
	 * @generated
	 */
	void setTransctionmode(TransctionMode value);

} // Transction
