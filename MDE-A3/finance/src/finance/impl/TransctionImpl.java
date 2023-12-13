/**
 */
package finance.impl;

import finance.FinancePackage;
import finance.Transction;
import finance.TransctionMode;
import finance.TransctionType;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link finance.impl.TransctionImpl#getTransctionID <em>Transction ID</em>}</li>
 *   <li>{@link finance.impl.TransctionImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link finance.impl.TransctionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link finance.impl.TransctionImpl#getTransctiontype <em>Transctiontype</em>}</li>
 *   <li>{@link finance.impl.TransctionImpl#getTransctionmode <em>Transctionmode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransctionImpl extends MinimalEObjectImpl.Container implements Transction {
	/**
	 * The default value of the '{@link #getTransctionID() <em>Transction ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransctionID()
	 * @generated
	 * @ordered
	 */
	protected static final int TRANSCTION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTransctionID() <em>Transction ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransctionID()
	 * @generated
	 * @ordered
	 */
	protected int transctionID = TRANSCTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected float amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransctiontype() <em>Transctiontype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransctiontype()
	 * @generated
	 * @ordered
	 */
	protected TransctionType transctiontype;

	/**
	 * The cached value of the '{@link #getTransctionmode() <em>Transctionmode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransctionmode()
	 * @generated
	 * @ordered
	 */
	protected TransctionMode transctionmode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinancePackage.Literals.TRANSCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTransctionID() {
		return transctionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransctionID(int newTransctionID) {
		int oldTransctionID = transctionID;
		transctionID = newTransctionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.TRANSCTION__TRANSCTION_ID, oldTransctionID, transctionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(float newAmount) {
		float oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.TRANSCTION__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.TRANSCTION__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransctionType getTransctiontype() {
		if (transctiontype != null && transctiontype.eIsProxy()) {
			InternalEObject oldTransctiontype = (InternalEObject)transctiontype;
			transctiontype = (TransctionType)eResolveProxy(oldTransctiontype);
			if (transctiontype != oldTransctiontype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinancePackage.TRANSCTION__TRANSCTIONTYPE, oldTransctiontype, transctiontype));
			}
		}
		return transctiontype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransctionType basicGetTransctiontype() {
		return transctiontype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransctiontype(TransctionType newTransctiontype) {
		TransctionType oldTransctiontype = transctiontype;
		transctiontype = newTransctiontype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.TRANSCTION__TRANSCTIONTYPE, oldTransctiontype, transctiontype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransctionMode getTransctionmode() {
		if (transctionmode != null && transctionmode.eIsProxy()) {
			InternalEObject oldTransctionmode = (InternalEObject)transctionmode;
			transctionmode = (TransctionMode)eResolveProxy(oldTransctionmode);
			if (transctionmode != oldTransctionmode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinancePackage.TRANSCTION__TRANSCTIONMODE, oldTransctionmode, transctionmode));
			}
		}
		return transctionmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransctionMode basicGetTransctionmode() {
		return transctionmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransctionmode(TransctionMode newTransctionmode) {
		TransctionMode oldTransctionmode = transctionmode;
		transctionmode = newTransctionmode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinancePackage.TRANSCTION__TRANSCTIONMODE, oldTransctionmode, transctionmode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinancePackage.TRANSCTION__TRANSCTION_ID:
				return getTransctionID();
			case FinancePackage.TRANSCTION__AMOUNT:
				return getAmount();
			case FinancePackage.TRANSCTION__DATE:
				return getDate();
			case FinancePackage.TRANSCTION__TRANSCTIONTYPE:
				if (resolve) return getTransctiontype();
				return basicGetTransctiontype();
			case FinancePackage.TRANSCTION__TRANSCTIONMODE:
				if (resolve) return getTransctionmode();
				return basicGetTransctionmode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FinancePackage.TRANSCTION__TRANSCTION_ID:
				setTransctionID((Integer)newValue);
				return;
			case FinancePackage.TRANSCTION__AMOUNT:
				setAmount((Float)newValue);
				return;
			case FinancePackage.TRANSCTION__DATE:
				setDate((Date)newValue);
				return;
			case FinancePackage.TRANSCTION__TRANSCTIONTYPE:
				setTransctiontype((TransctionType)newValue);
				return;
			case FinancePackage.TRANSCTION__TRANSCTIONMODE:
				setTransctionmode((TransctionMode)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case FinancePackage.TRANSCTION__TRANSCTION_ID:
				setTransctionID(TRANSCTION_ID_EDEFAULT);
				return;
			case FinancePackage.TRANSCTION__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case FinancePackage.TRANSCTION__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case FinancePackage.TRANSCTION__TRANSCTIONTYPE:
				setTransctiontype((TransctionType)null);
				return;
			case FinancePackage.TRANSCTION__TRANSCTIONMODE:
				setTransctionmode((TransctionMode)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FinancePackage.TRANSCTION__TRANSCTION_ID:
				return transctionID != TRANSCTION_ID_EDEFAULT;
			case FinancePackage.TRANSCTION__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case FinancePackage.TRANSCTION__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case FinancePackage.TRANSCTION__TRANSCTIONTYPE:
				return transctiontype != null;
			case FinancePackage.TRANSCTION__TRANSCTIONMODE:
				return transctionmode != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (transctionID: ");
		result.append(transctionID);
		result.append(", amount: ");
		result.append(amount);
		result.append(", date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //TransctionImpl
