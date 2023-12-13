/**
 */
package finance.impl;

import finance.FinancePackage;
import finance.RegulatoryEntity;
import finance.RegulatoryEntityList;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regulatory Entity List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link finance.impl.RegulatoryEntityListImpl#getRegulatoryentities <em>Regulatoryentities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegulatoryEntityListImpl extends MinimalEObjectImpl.Container implements RegulatoryEntityList {
	/**
	 * The cached value of the '{@link #getRegulatoryentities() <em>Regulatoryentities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatoryentities()
	 * @generated
	 * @ordered
	 */
	protected EList<RegulatoryEntity> regulatoryentities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegulatoryEntityListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinancePackage.Literals.REGULATORY_ENTITY_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RegulatoryEntity> getRegulatoryentities() {
		if (regulatoryentities == null) {
			regulatoryentities = new EObjectContainmentEList<RegulatoryEntity>(RegulatoryEntity.class, this, FinancePackage.REGULATORY_ENTITY_LIST__REGULATORYENTITIES);
		}
		return regulatoryentities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinancePackage.REGULATORY_ENTITY_LIST__REGULATORYENTITIES:
				return ((InternalEList<?>)getRegulatoryentities()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinancePackage.REGULATORY_ENTITY_LIST__REGULATORYENTITIES:
				return getRegulatoryentities();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FinancePackage.REGULATORY_ENTITY_LIST__REGULATORYENTITIES:
				getRegulatoryentities().clear();
				getRegulatoryentities().addAll((Collection<? extends RegulatoryEntity>)newValue);
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
			case FinancePackage.REGULATORY_ENTITY_LIST__REGULATORYENTITIES:
				getRegulatoryentities().clear();
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
			case FinancePackage.REGULATORY_ENTITY_LIST__REGULATORYENTITIES:
				return regulatoryentities != null && !regulatoryentities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RegulatoryEntityListImpl
