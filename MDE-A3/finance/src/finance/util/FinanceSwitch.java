/**
 */
package finance.util;

import finance.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see finance.FinancePackage
 * @generated
 */
public class FinanceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FinancePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinanceSwitch() {
		if (modelPackage == null) {
			modelPackage = FinancePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FinancePackage.ACCOUNT: {
				Account account = (Account)theEObject;
				T result = caseAccount(account);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancePackage.ACCOUNT_TYPE: {
				AccountType accountType = (AccountType)theEObject;
				T result = caseAccountType(accountType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancePackage.ACCOUNT_LIST: {
				AccountList accountList = (AccountList)theEObject;
				T result = caseAccountList(accountList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancePackage.FINANCIAL_ENTITY: {
				FinancialEntity financialEntity = (FinancialEntity)theEObject;
				T result = caseFinancialEntity(financialEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancePackage.FINANCIAL_ENTITY_LIST: {
				FinancialEntityList financialEntityList = (FinancialEntityList)theEObject;
				T result = caseFinancialEntityList(financialEntityList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancePackage.FINANCIAL_PRODUCT: {
				FinancialProduct financialProduct = (FinancialProduct)theEObject;
				T result = caseFinancialProduct(financialProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancePackage.FINANCIAL_PRODUCT_TYPE: {
				FinancialProductType financialProductType = (FinancialProductType)theEObject;
				T result = caseFinancialProductType(financialProductType);
				if (result == null) result = caseFinancialProduct(financialProductType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancePackage.FINANCIAL_PRODUCT_TYPE_LIST: {
				FinancialProductTypeList financialProductTypeList = (FinancialProductTypeList)theEObject;
				T result = caseFinancialProductTypeList(financialProductTypeList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancePackage.PARTY: {
				Party party = (Party)theEObject;
				T result = caseParty(party);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancePackage.PARTY_LIST: {
				PartyList partyList = (PartyList)theEObject;
				T result = casePartyList(partyList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancePackage.REGULATORY_ENTITY: {
				RegulatoryEntity regulatoryEntity = (RegulatoryEntity)theEObject;
				T result = caseRegulatoryEntity(regulatoryEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancePackage.REGULATORY_ENTITYTYPE: {
				RegulatoryEntitytype regulatoryEntitytype = (RegulatoryEntitytype)theEObject;
				T result = caseRegulatoryEntitytype(regulatoryEntitytype);
				if (result == null) result = caseRegulatoryEntity(regulatoryEntitytype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancePackage.REGULATORY_ENTITY_LIST: {
				RegulatoryEntityList regulatoryEntityList = (RegulatoryEntityList)theEObject;
				T result = caseRegulatoryEntityList(regulatoryEntityList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancePackage.REGULATION: {
				Regulation regulation = (Regulation)theEObject;
				T result = caseRegulation(regulation);
				if (result == null) result = caseRegulatoryEntity(regulation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancePackage.SPECIFIC_ATTRIBUTE: {
				SpecificAttribute specificAttribute = (SpecificAttribute)theEObject;
				T result = caseSpecificAttribute(specificAttribute);
				if (result == null) result = caseAccount(specificAttribute);
				if (result == null) result = caseFinancialEntity(specificAttribute);
				if (result == null) result = caseFinancialProduct(specificAttribute);
				if (result == null) result = caseTransction(specificAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancePackage.TRANSCTION: {
				Transction transction = (Transction)theEObject;
				T result = caseTransction(transction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancePackage.TRANSCTION_TYPE: {
				TransctionType transctionType = (TransctionType)theEObject;
				T result = caseTransctionType(transctionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancePackage.TRANSCTION_MODE: {
				TransctionMode transctionMode = (TransctionMode)theEObject;
				T result = caseTransctionMode(transctionMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancePackage.TRANSCTION_LIST: {
				TransctionList transctionList = (TransctionList)theEObject;
				T result = caseTransctionList(transctionList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancePackage.TRANSCTION_TYPE_LIST: {
				TransctionTypeList transctionTypeList = (TransctionTypeList)theEObject;
				T result = caseTransctionTypeList(transctionTypeList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FinancePackage.TRANSCTION_MODE_LIST: {
				TransctionModeList transctionModeList = (TransctionModeList)theEObject;
				T result = caseTransctionModeList(transctionModeList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccount(Account object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountType(AccountType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountList(AccountList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Financial Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Financial Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinancialEntity(FinancialEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Financial Entity List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Financial Entity List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinancialEntityList(FinancialEntityList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Financial Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Financial Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinancialProduct(FinancialProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Financial Product Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Financial Product Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinancialProductType(FinancialProductType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Financial Product Type List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Financial Product Type List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinancialProductTypeList(FinancialProductTypeList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParty(Party object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Party List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Party List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartyList(PartyList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regulatory Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regulatory Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegulatoryEntity(RegulatoryEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regulatory Entitytype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regulatory Entitytype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegulatoryEntitytype(RegulatoryEntitytype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regulatory Entity List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regulatory Entity List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegulatoryEntityList(RegulatoryEntityList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regulation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regulation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegulation(Regulation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificAttribute(SpecificAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransction(Transction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransctionType(TransctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transction Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transction Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransctionMode(TransctionMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transction List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transction List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransctionList(TransctionList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transction Type List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transction Type List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransctionTypeList(TransctionTypeList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transction Mode List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transction Mode List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransctionModeList(TransctionModeList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FinanceSwitch
