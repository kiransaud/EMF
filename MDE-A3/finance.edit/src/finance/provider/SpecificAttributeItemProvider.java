/**
 */
package finance.provider;


import finance.FinancePackage;
import finance.SpecificAttribute;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link finance.SpecificAttribute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecificAttributeItemProvider extends AccountItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificAttributeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addFin_entityIDPropertyDescriptor(object);
			addFin_entity_namePropertyDescriptor(object);
			addFinancialentitytypePropertyDescriptor(object);
			addAddressPropertyDescriptor(object);
			addContactPropertyDescriptor(object);
			addEmailPropertyDescriptor(object);
			addRegulatoryentityPropertyDescriptor(object);
			addProduct_idPropertyDescriptor(object);
			addProduct_namePropertyDescriptor(object);
			addServicesofferedByPropertyDescriptor(object);
			addTransctionIDPropertyDescriptor(object);
			addAmountPropertyDescriptor(object);
			addDatePropertyDescriptor(object);
			addTransctiontypePropertyDescriptor(object);
			addTransctionmodePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Fin entity ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFin_entityIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FinancialEntity_fin_entityID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FinancialEntity_fin_entityID_feature", "_UI_FinancialEntity_type"),
				 FinancePackage.Literals.FINANCIAL_ENTITY__FIN_ENTITY_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fin entity name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFin_entity_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FinancialEntity_fin_entity_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FinancialEntity_fin_entity_name_feature", "_UI_FinancialEntity_type"),
				 FinancePackage.Literals.FINANCIAL_ENTITY__FIN_ENTITY_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Financialentitytype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinancialentitytypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FinancialEntity_financialentitytype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FinancialEntity_financialentitytype_feature", "_UI_FinancialEntity_type"),
				 FinancePackage.Literals.FINANCIAL_ENTITY__FINANCIALENTITYTYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FinancialEntity_address_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FinancialEntity_address_feature", "_UI_FinancialEntity_type"),
				 FinancePackage.Literals.FINANCIAL_ENTITY__ADDRESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contact feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContactPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FinancialEntity_contact_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FinancialEntity_contact_feature", "_UI_FinancialEntity_type"),
				 FinancePackage.Literals.FINANCIAL_ENTITY__CONTACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Email feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmailPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FinancialEntity_email_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FinancialEntity_email_feature", "_UI_FinancialEntity_type"),
				 FinancePackage.Literals.FINANCIAL_ENTITY__EMAIL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Regulatoryentity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegulatoryentityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FinancialEntity_regulatoryentity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FinancialEntity_regulatoryentity_feature", "_UI_FinancialEntity_type"),
				 FinancePackage.Literals.FINANCIAL_ENTITY__REGULATORYENTITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Product id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProduct_idPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FinancialProduct_product_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FinancialProduct_product_id_feature", "_UI_FinancialProduct_type"),
				 FinancePackage.Literals.FINANCIAL_PRODUCT__PRODUCT_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Product name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProduct_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FinancialProduct_product_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FinancialProduct_product_name_feature", "_UI_FinancialProduct_type"),
				 FinancePackage.Literals.FINANCIAL_PRODUCT__PRODUCT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Servicesoffered By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServicesofferedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FinancialProduct_servicesofferedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FinancialProduct_servicesofferedBy_feature", "_UI_FinancialProduct_type"),
				 FinancePackage.Literals.FINANCIAL_PRODUCT__SERVICESOFFERED_BY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transction ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransctionIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transction_transctionID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transction_transctionID_feature", "_UI_Transction_type"),
				 FinancePackage.Literals.TRANSCTION__TRANSCTION_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Amount feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAmountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transction_amount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transction_amount_feature", "_UI_Transction_type"),
				 FinancePackage.Literals.TRANSCTION__AMOUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transction_date_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transction_date_feature", "_UI_Transction_type"),
				 FinancePackage.Literals.TRANSCTION__DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transctiontype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransctiontypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transction_transctiontype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transction_transctiontype_feature", "_UI_Transction_type"),
				 FinancePackage.Literals.TRANSCTION__TRANSCTIONTYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transctionmode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransctionmodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transction_transctionmode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transction_transctionmode_feature", "_UI_Transction_type"),
				 FinancePackage.Literals.TRANSCTION__TRANSCTIONMODE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpecificAttribute_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpecificAttribute_name_feature", "_UI_SpecificAttribute_type"),
				 FinancePackage.Literals.SPECIFIC_ATTRIBUTE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpecificAttribute_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpecificAttribute_value_feature", "_UI_SpecificAttribute_type"),
				 FinancePackage.Literals.SPECIFIC_ATTRIBUTE__VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SpecificAttribute.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SpecificAttribute"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SpecificAttribute)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SpecificAttribute_type") :
			getString("_UI_SpecificAttribute_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SpecificAttribute.class)) {
			case FinancePackage.SPECIFIC_ATTRIBUTE__FIN_ENTITY_ID:
			case FinancePackage.SPECIFIC_ATTRIBUTE__FIN_ENTITY_NAME:
			case FinancePackage.SPECIFIC_ATTRIBUTE__FINANCIALENTITYTYPE:
			case FinancePackage.SPECIFIC_ATTRIBUTE__ADDRESS:
			case FinancePackage.SPECIFIC_ATTRIBUTE__CONTACT:
			case FinancePackage.SPECIFIC_ATTRIBUTE__EMAIL:
			case FinancePackage.SPECIFIC_ATTRIBUTE__PRODUCT_ID:
			case FinancePackage.SPECIFIC_ATTRIBUTE__PRODUCT_NAME:
			case FinancePackage.SPECIFIC_ATTRIBUTE__TRANSCTION_ID:
			case FinancePackage.SPECIFIC_ATTRIBUTE__AMOUNT:
			case FinancePackage.SPECIFIC_ATTRIBUTE__DATE:
			case FinancePackage.SPECIFIC_ATTRIBUTE__NAME:
			case FinancePackage.SPECIFIC_ATTRIBUTE__VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
