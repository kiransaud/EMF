/**
 */
package finance.util;

import finance.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see finance.FinancePackage
 * @generated
 */
public class FinanceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FinancePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinanceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FinancePackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
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
	protected FinanceSwitch<Adapter> modelSwitch =
		new FinanceSwitch<Adapter>() {
			@Override
			public Adapter caseAccount(Account object) {
				return createAccountAdapter();
			}
			@Override
			public Adapter caseAccountType(AccountType object) {
				return createAccountTypeAdapter();
			}
			@Override
			public Adapter caseAccountList(AccountList object) {
				return createAccountListAdapter();
			}
			@Override
			public Adapter caseFinancialEntity(FinancialEntity object) {
				return createFinancialEntityAdapter();
			}
			@Override
			public Adapter caseFinancialEntityList(FinancialEntityList object) {
				return createFinancialEntityListAdapter();
			}
			@Override
			public Adapter caseFinancialProduct(FinancialProduct object) {
				return createFinancialProductAdapter();
			}
			@Override
			public Adapter caseFinancialProductType(FinancialProductType object) {
				return createFinancialProductTypeAdapter();
			}
			@Override
			public Adapter caseFinancialProductTypeList(FinancialProductTypeList object) {
				return createFinancialProductTypeListAdapter();
			}
			@Override
			public Adapter caseParty(Party object) {
				return createPartyAdapter();
			}
			@Override
			public Adapter casePartyList(PartyList object) {
				return createPartyListAdapter();
			}
			@Override
			public Adapter caseRegulatoryEntity(RegulatoryEntity object) {
				return createRegulatoryEntityAdapter();
			}
			@Override
			public Adapter caseRegulatoryEntitytype(RegulatoryEntitytype object) {
				return createRegulatoryEntitytypeAdapter();
			}
			@Override
			public Adapter caseRegulatoryEntityList(RegulatoryEntityList object) {
				return createRegulatoryEntityListAdapter();
			}
			@Override
			public Adapter caseRegulation(Regulation object) {
				return createRegulationAdapter();
			}
			@Override
			public Adapter caseSpecificAttribute(SpecificAttribute object) {
				return createSpecificAttributeAdapter();
			}
			@Override
			public Adapter caseTransction(Transction object) {
				return createTransctionAdapter();
			}
			@Override
			public Adapter caseTransctionType(TransctionType object) {
				return createTransctionTypeAdapter();
			}
			@Override
			public Adapter caseTransctionMode(TransctionMode object) {
				return createTransctionModeAdapter();
			}
			@Override
			public Adapter caseTransctionList(TransctionList object) {
				return createTransctionListAdapter();
			}
			@Override
			public Adapter caseTransctionTypeList(TransctionTypeList object) {
				return createTransctionTypeListAdapter();
			}
			@Override
			public Adapter caseTransctionModeList(TransctionModeList object) {
				return createTransctionModeListAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link finance.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see finance.Account
	 * @generated
	 */
	public Adapter createAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link finance.AccountType <em>Account Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see finance.AccountType
	 * @generated
	 */
	public Adapter createAccountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link finance.AccountList <em>Account List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see finance.AccountList
	 * @generated
	 */
	public Adapter createAccountListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link finance.FinancialEntity <em>Financial Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see finance.FinancialEntity
	 * @generated
	 */
	public Adapter createFinancialEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link finance.FinancialEntityList <em>Financial Entity List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see finance.FinancialEntityList
	 * @generated
	 */
	public Adapter createFinancialEntityListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link finance.FinancialProduct <em>Financial Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see finance.FinancialProduct
	 * @generated
	 */
	public Adapter createFinancialProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link finance.FinancialProductType <em>Financial Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see finance.FinancialProductType
	 * @generated
	 */
	public Adapter createFinancialProductTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link finance.FinancialProductTypeList <em>Financial Product Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see finance.FinancialProductTypeList
	 * @generated
	 */
	public Adapter createFinancialProductTypeListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link finance.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see finance.Party
	 * @generated
	 */
	public Adapter createPartyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link finance.PartyList <em>Party List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see finance.PartyList
	 * @generated
	 */
	public Adapter createPartyListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link finance.RegulatoryEntity <em>Regulatory Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see finance.RegulatoryEntity
	 * @generated
	 */
	public Adapter createRegulatoryEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link finance.RegulatoryEntitytype <em>Regulatory Entitytype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see finance.RegulatoryEntitytype
	 * @generated
	 */
	public Adapter createRegulatoryEntitytypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link finance.RegulatoryEntityList <em>Regulatory Entity List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see finance.RegulatoryEntityList
	 * @generated
	 */
	public Adapter createRegulatoryEntityListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link finance.Regulation <em>Regulation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see finance.Regulation
	 * @generated
	 */
	public Adapter createRegulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link finance.SpecificAttribute <em>Specific Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see finance.SpecificAttribute
	 * @generated
	 */
	public Adapter createSpecificAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link finance.Transction <em>Transction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see finance.Transction
	 * @generated
	 */
	public Adapter createTransctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link finance.TransctionType <em>Transction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see finance.TransctionType
	 * @generated
	 */
	public Adapter createTransctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link finance.TransctionMode <em>Transction Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see finance.TransctionMode
	 * @generated
	 */
	public Adapter createTransctionModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link finance.TransctionList <em>Transction List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see finance.TransctionList
	 * @generated
	 */
	public Adapter createTransctionListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link finance.TransctionTypeList <em>Transction Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see finance.TransctionTypeList
	 * @generated
	 */
	public Adapter createTransctionTypeListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link finance.TransctionModeList <em>Transction Mode List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see finance.TransctionModeList
	 * @generated
	 */
	public Adapter createTransctionModeListAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FinanceAdapterFactory
