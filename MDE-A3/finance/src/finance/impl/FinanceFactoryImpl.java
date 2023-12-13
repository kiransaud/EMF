/**
 */
package finance.impl;

import finance.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FinanceFactoryImpl extends EFactoryImpl implements FinanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FinanceFactory init() {
		try {
			FinanceFactory theFinanceFactory = (FinanceFactory)EPackage.Registry.INSTANCE.getEFactory(FinancePackage.eNS_URI);
			if (theFinanceFactory != null) {
				return theFinanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FinanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinanceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FinancePackage.ACCOUNT: return createAccount();
			case FinancePackage.ACCOUNT_TYPE: return createAccountType();
			case FinancePackage.ACCOUNT_LIST: return createAccountList();
			case FinancePackage.FINANCIAL_ENTITY: return createFinancialEntity();
			case FinancePackage.FINANCIAL_ENTITY_LIST: return createFinancialEntityList();
			case FinancePackage.FINANCIAL_PRODUCT: return createFinancialProduct();
			case FinancePackage.FINANCIAL_PRODUCT_TYPE: return createFinancialProductType();
			case FinancePackage.FINANCIAL_PRODUCT_TYPE_LIST: return createFinancialProductTypeList();
			case FinancePackage.PARTY: return createParty();
			case FinancePackage.PARTY_LIST: return createPartyList();
			case FinancePackage.REGULATORY_ENTITY: return createRegulatoryEntity();
			case FinancePackage.REGULATORY_ENTITYTYPE: return createRegulatoryEntitytype();
			case FinancePackage.REGULATORY_ENTITY_LIST: return createRegulatoryEntityList();
			case FinancePackage.REGULATION: return createRegulation();
			case FinancePackage.SPECIFIC_ATTRIBUTE: return createSpecificAttribute();
			case FinancePackage.TRANSCTION: return createTransction();
			case FinancePackage.TRANSCTION_TYPE: return createTransctionType();
			case FinancePackage.TRANSCTION_MODE: return createTransctionMode();
			case FinancePackage.TRANSCTION_LIST: return createTransctionList();
			case FinancePackage.TRANSCTION_TYPE_LIST: return createTransctionTypeList();
			case FinancePackage.TRANSCTION_MODE_LIST: return createTransctionModeList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FinancePackage.CURRENCY:
				return createCurrencyFromString(eDataType, initialValue);
			case FinancePackage.FINANCIAL_ENTITY_TYPE:
				return createFinancialEntityTypeFromString(eDataType, initialValue);
			case FinancePackage.PARTY_TYPE:
				return createPartyTypeFromString(eDataType, initialValue);
			case FinancePackage.EEMAIL:
				return createEEmailFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FinancePackage.CURRENCY:
				return convertCurrencyToString(eDataType, instanceValue);
			case FinancePackage.FINANCIAL_ENTITY_TYPE:
				return convertFinancialEntityTypeToString(eDataType, instanceValue);
			case FinancePackage.PARTY_TYPE:
				return convertPartyTypeToString(eDataType, instanceValue);
			case FinancePackage.EEMAIL:
				return convertEEmailToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Account createAccount() {
		AccountImpl account = new AccountImpl();
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccountType createAccountType() {
		AccountTypeImpl accountType = new AccountTypeImpl();
		return accountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccountList createAccountList() {
		AccountListImpl accountList = new AccountListImpl();
		return accountList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinancialEntity createFinancialEntity() {
		FinancialEntityImpl financialEntity = new FinancialEntityImpl();
		return financialEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinancialEntityList createFinancialEntityList() {
		FinancialEntityListImpl financialEntityList = new FinancialEntityListImpl();
		return financialEntityList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinancialProduct createFinancialProduct() {
		FinancialProductImpl financialProduct = new FinancialProductImpl();
		return financialProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinancialProductType createFinancialProductType() {
		FinancialProductTypeImpl financialProductType = new FinancialProductTypeImpl();
		return financialProductType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinancialProductTypeList createFinancialProductTypeList() {
		FinancialProductTypeListImpl financialProductTypeList = new FinancialProductTypeListImpl();
		return financialProductTypeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party createParty() {
		PartyImpl party = new PartyImpl();
		return party;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyList createPartyList() {
		PartyListImpl partyList = new PartyListImpl();
		return partyList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegulatoryEntity createRegulatoryEntity() {
		RegulatoryEntityImpl regulatoryEntity = new RegulatoryEntityImpl();
		return regulatoryEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegulatoryEntitytype createRegulatoryEntitytype() {
		RegulatoryEntitytypeImpl regulatoryEntitytype = new RegulatoryEntitytypeImpl();
		return regulatoryEntitytype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegulatoryEntityList createRegulatoryEntityList() {
		RegulatoryEntityListImpl regulatoryEntityList = new RegulatoryEntityListImpl();
		return regulatoryEntityList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Regulation createRegulation() {
		RegulationImpl regulation = new RegulationImpl();
		return regulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecificAttribute createSpecificAttribute() {
		SpecificAttributeImpl specificAttribute = new SpecificAttributeImpl();
		return specificAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transction createTransction() {
		TransctionImpl transction = new TransctionImpl();
		return transction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransctionType createTransctionType() {
		TransctionTypeImpl transctionType = new TransctionTypeImpl();
		return transctionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransctionMode createTransctionMode() {
		TransctionModeImpl transctionMode = new TransctionModeImpl();
		return transctionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransctionList createTransctionList() {
		TransctionListImpl transctionList = new TransctionListImpl();
		return transctionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransctionTypeList createTransctionTypeList() {
		TransctionTypeListImpl transctionTypeList = new TransctionTypeListImpl();
		return transctionTypeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransctionModeList createTransctionModeList() {
		TransctionModeListImpl transctionModeList = new TransctionModeListImpl();
		return transctionModeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Currency createCurrencyFromString(EDataType eDataType, String initialValue) {
		Currency result = Currency.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCurrencyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinancialEntityType createFinancialEntityTypeFromString(EDataType eDataType, String initialValue) {
		FinancialEntityType result = FinancialEntityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFinancialEntityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyType createPartyTypeFromString(EDataType eDataType, String initialValue) {
		PartyType result = PartyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEEmailFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEEmailToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinancePackage getFinancePackage() {
		return (FinancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FinancePackage getPackage() {
		return FinancePackage.eINSTANCE;
	}

} //FinanceFactoryImpl
