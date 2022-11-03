package com.org.ibm.model.investmentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T08:01:24.054Z[GMT]")

public class InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility   {
  @JsonProperty("ProductInstanceReference")
  private Object productInstanceReference;

  @JsonProperty("CustomerReference")
  private Object customerReference;

  @JsonProperty("BankBranchOrLocationReference")
  private Object bankBranchOrLocationReference;

  @JsonProperty("LinkedCashAccount")
  private String linkedCashAccount;

  @JsonProperty("LinkType")
  private String linkType;

  @JsonProperty("AccountDetails")
  private String accountDetails;

  @JsonProperty("InvestmentAccountType")
  private String investmentAccountType;

  @JsonProperty("InvestmentAccountInstrumentProfile")
  private String investmentAccountInstrumentProfile;

  @JsonProperty("InvestmentAccountInstrumentRecord")
  private String investmentAccountInstrumentRecord;

  @JsonProperty("InstrumentType")
  private String instrumentType;

  @JsonProperty("InstrumentReference")
  private Object instrumentReference;

  @JsonProperty("TradingMarketplaceReference")
  private Object tradingMarketplaceReference;

  @JsonProperty("InstrumentPositionRecord")
  private String instrumentPositionRecord;

  @JsonProperty("InstrumentPositionLimitType")
  private String instrumentPositionLimitType;

  @JsonProperty("InstrumentPositionLimitSettings")
  private String instrumentPositionLimitSettings;

  @JsonProperty("InstrumentProcessingSchedule")
  private String instrumentProcessingSchedule;

  @JsonProperty("InstrumentEventType")
  private String instrumentEventType;

  @JsonProperty("InstrumentEventDescription")
  private String instrumentEventDescription;

  @JsonProperty("InstrumentEventDate")
  private String instrumentEventDate;

  @JsonProperty("TaxReference")
  private Object taxReference;

  @JsonProperty("EntitlementOptionDefinition")
  private String entitlementOptionDefinition;

  @JsonProperty("EntitlementOptionSetting")
  private String entitlementOptionSetting;

  @JsonProperty("RestrictionOptionSetting")
  private String restrictionOptionSetting;

  @JsonProperty("LinkedAccounts")
  private String linkedAccounts;

  @JsonProperty("DateType")
  private String dateType;

  public InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility productInstanceReference(Object productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
    return this;
  }

  /**
   * Get productInstanceReference
   * @return productInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(Object productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }

  public InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility customerReference(Object customerReference) {
    this.customerReference = customerReference;
    return this;
  }

  /**
   * Get customerReference
   * @return customerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(Object customerReference) {
    this.customerReference = customerReference;
  }

  public InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility bankBranchOrLocationReference(Object bankBranchOrLocationReference) {
    this.bankBranchOrLocationReference = bankBranchOrLocationReference;
    return this;
  }

  /**
   * Get bankBranchOrLocationReference
   * @return bankBranchOrLocationReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBankBranchOrLocationReference() {
    return bankBranchOrLocationReference;
  }

  public void setBankBranchOrLocationReference(Object bankBranchOrLocationReference) {
    this.bankBranchOrLocationReference = bankBranchOrLocationReference;
  }

  public InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility linkedCashAccount(String linkedCashAccount) {
    this.linkedCashAccount = linkedCashAccount;
    return this;
  }

  /**
   * Get linkedCashAccount
   * @return linkedCashAccount
  */
  @ApiModelProperty(value = "")


  public String getLinkedCashAccount() {
    return linkedCashAccount;
  }

  public void setLinkedCashAccount(String linkedCashAccount) {
    this.linkedCashAccount = linkedCashAccount;
  }

  public InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility linkType(String linkType) {
    this.linkType = linkType;
    return this;
  }

  /**
   * Get linkType
   * @return linkType
  */
  @ApiModelProperty(value = "")


  public String getLinkType() {
    return linkType;
  }

  public void setLinkType(String linkType) {
    this.linkType = linkType;
  }

  public InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility accountDetails(String accountDetails) {
    this.accountDetails = accountDetails;
    return this;
  }

  /**
   * Get accountDetails
   * @return accountDetails
  */
  @ApiModelProperty(value = "")


  public String getAccountDetails() {
    return accountDetails;
  }

  public void setAccountDetails(String accountDetails) {
    this.accountDetails = accountDetails;
  }

  public InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility investmentAccountType(String investmentAccountType) {
    this.investmentAccountType = investmentAccountType;
    return this;
  }

  /**
   * Get investmentAccountType
   * @return investmentAccountType
  */
  @ApiModelProperty(value = "")


  public String getInvestmentAccountType() {
    return investmentAccountType;
  }

  public void setInvestmentAccountType(String investmentAccountType) {
    this.investmentAccountType = investmentAccountType;
  }

  public InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility investmentAccountInstrumentProfile(String investmentAccountInstrumentProfile) {
    this.investmentAccountInstrumentProfile = investmentAccountInstrumentProfile;
    return this;
  }

  /**
   * Get investmentAccountInstrumentProfile
   * @return investmentAccountInstrumentProfile
  */
  @ApiModelProperty(value = "")


  public String getInvestmentAccountInstrumentProfile() {
    return investmentAccountInstrumentProfile;
  }

  public void setInvestmentAccountInstrumentProfile(String investmentAccountInstrumentProfile) {
    this.investmentAccountInstrumentProfile = investmentAccountInstrumentProfile;
  }

  public InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility investmentAccountInstrumentRecord(String investmentAccountInstrumentRecord) {
    this.investmentAccountInstrumentRecord = investmentAccountInstrumentRecord;
    return this;
  }

  /**
   * Get investmentAccountInstrumentRecord
   * @return investmentAccountInstrumentRecord
  */
  @ApiModelProperty(value = "")


  public String getInvestmentAccountInstrumentRecord() {
    return investmentAccountInstrumentRecord;
  }

  public void setInvestmentAccountInstrumentRecord(String investmentAccountInstrumentRecord) {
    this.investmentAccountInstrumentRecord = investmentAccountInstrumentRecord;
  }

  public InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility instrumentType(String instrumentType) {
    this.instrumentType = instrumentType;
    return this;
  }

  /**
   * Get instrumentType
   * @return instrumentType
  */
  @ApiModelProperty(value = "")


  public String getInstrumentType() {
    return instrumentType;
  }

  public void setInstrumentType(String instrumentType) {
    this.instrumentType = instrumentType;
  }

  public InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility instrumentReference(Object instrumentReference) {
    this.instrumentReference = instrumentReference;
    return this;
  }

  /**
   * Get instrumentReference
   * @return instrumentReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getInstrumentReference() {
    return instrumentReference;
  }

  public void setInstrumentReference(Object instrumentReference) {
    this.instrumentReference = instrumentReference;
  }

  public InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility tradingMarketplaceReference(Object tradingMarketplaceReference) {
    this.tradingMarketplaceReference = tradingMarketplaceReference;
    return this;
  }

  /**
   * Get tradingMarketplaceReference
   * @return tradingMarketplaceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getTradingMarketplaceReference() {
    return tradingMarketplaceReference;
  }

  public void setTradingMarketplaceReference(Object tradingMarketplaceReference) {
    this.tradingMarketplaceReference = tradingMarketplaceReference;
  }

  public InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility instrumentPositionRecord(String instrumentPositionRecord) {
    this.instrumentPositionRecord = instrumentPositionRecord;
    return this;
  }

  /**
   * Get instrumentPositionRecord
   * @return instrumentPositionRecord
  */
  @ApiModelProperty(value = "")


  public String getInstrumentPositionRecord() {
    return instrumentPositionRecord;
  }

  public void setInstrumentPositionRecord(String instrumentPositionRecord) {
    this.instrumentPositionRecord = instrumentPositionRecord;
  }

  public InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility instrumentPositionLimitType(String instrumentPositionLimitType) {
    this.instrumentPositionLimitType = instrumentPositionLimitType;
    return this;
  }

  /**
   * Get instrumentPositionLimitType
   * @return instrumentPositionLimitType
  */
  @ApiModelProperty(value = "")


  public String getInstrumentPositionLimitType() {
    return instrumentPositionLimitType;
  }

  public void setInstrumentPositionLimitType(String instrumentPositionLimitType) {
    this.instrumentPositionLimitType = instrumentPositionLimitType;
  }

  public InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility instrumentPositionLimitSettings(String instrumentPositionLimitSettings) {
    this.instrumentPositionLimitSettings = instrumentPositionLimitSettings;
    return this;
  }

  /**
   * Get instrumentPositionLimitSettings
   * @return instrumentPositionLimitSettings
  */
  @ApiModelProperty(value = "")


  public String getInstrumentPositionLimitSettings() {
    return instrumentPositionLimitSettings;
  }

  public void setInstrumentPositionLimitSettings(String instrumentPositionLimitSettings) {
    this.instrumentPositionLimitSettings = instrumentPositionLimitSettings;
  }

  public InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility instrumentProcessingSchedule(String instrumentProcessingSchedule) {
    this.instrumentProcessingSchedule = instrumentProcessingSchedule;
    return this;
  }

  /**
   * Get instrumentProcessingSchedule
   * @return instrumentProcessingSchedule
  */
  @ApiModelProperty(value = "")


  public String getInstrumentProcessingSchedule() {
    return instrumentProcessingSchedule;
  }

  public void setInstrumentProcessingSchedule(String instrumentProcessingSchedule) {
    this.instrumentProcessingSchedule = instrumentProcessingSchedule;
  }

  public InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility instrumentEventType(String instrumentEventType) {
    this.instrumentEventType = instrumentEventType;
    return this;
  }

  /**
   * Get instrumentEventType
   * @return instrumentEventType
  */
  @ApiModelProperty(value = "")


  public String getInstrumentEventType() {
    return instrumentEventType;
  }

  public void setInstrumentEventType(String instrumentEventType) {
    this.instrumentEventType = instrumentEventType;
  }

  public InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility instrumentEventDescription(String instrumentEventDescription) {
    this.instrumentEventDescription = instrumentEventDescription;
    return this;
  }

  /**
   * Get instrumentEventDescription
   * @return instrumentEventDescription
  */
  @ApiModelProperty(value = "")


  public String getInstrumentEventDescription() {
    return instrumentEventDescription;
  }

  public void setInstrumentEventDescription(String instrumentEventDescription) {
    this.instrumentEventDescription = instrumentEventDescription;
  }

  public InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility instrumentEventDate(String instrumentEventDate) {
    this.instrumentEventDate = instrumentEventDate;
    return this;
  }

  /**
   * Get instrumentEventDate
   * @return instrumentEventDate
  */
  @ApiModelProperty(value = "")


  public String getInstrumentEventDate() {
    return instrumentEventDate;
  }

  public void setInstrumentEventDate(String instrumentEventDate) {
    this.instrumentEventDate = instrumentEventDate;
  }

  public InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility taxReference(Object taxReference) {
    this.taxReference = taxReference;
    return this;
  }

  /**
   * Get taxReference
   * @return taxReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(Object taxReference) {
    this.taxReference = taxReference;
  }

  public InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility entitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
    return this;
  }

  /**
   * Get entitlementOptionDefinition
   * @return entitlementOptionDefinition
  */
  @ApiModelProperty(value = "")


  public String getEntitlementOptionDefinition() {
    return entitlementOptionDefinition;
  }

  public void setEntitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
  }

  public InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility entitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
    return this;
  }

  /**
   * Get entitlementOptionSetting
   * @return entitlementOptionSetting
  */
  @ApiModelProperty(value = "")


  public String getEntitlementOptionSetting() {
    return entitlementOptionSetting;
  }

  public void setEntitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
  }

  public InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility restrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
    return this;
  }

  /**
   * Get restrictionOptionSetting
   * @return restrictionOptionSetting
  */
  @ApiModelProperty(value = "")


  public String getRestrictionOptionSetting() {
    return restrictionOptionSetting;
  }

  public void setRestrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
  }

  public InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility linkedAccounts(String linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
    return this;
  }

  /**
   * Get linkedAccounts
   * @return linkedAccounts
  */
  @ApiModelProperty(value = "")


  public String getLinkedAccounts() {
    return linkedAccounts;
  }

  public void setLinkedAccounts(String linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
  }

  public InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility dateType(String dateType) {
    this.dateType = dateType;
    return this;
  }

  /**
   * Get dateType
   * @return dateType
  */
  @ApiModelProperty(value = "")


  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility initiateInvestmentAccountFacilityRequestInvestmentAccountFacility = (InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility) o;
    return Objects.equals(this.productInstanceReference, initiateInvestmentAccountFacilityRequestInvestmentAccountFacility.productInstanceReference) &&
        Objects.equals(this.customerReference, initiateInvestmentAccountFacilityRequestInvestmentAccountFacility.customerReference) &&
        Objects.equals(this.bankBranchOrLocationReference, initiateInvestmentAccountFacilityRequestInvestmentAccountFacility.bankBranchOrLocationReference) &&
        Objects.equals(this.linkedCashAccount, initiateInvestmentAccountFacilityRequestInvestmentAccountFacility.linkedCashAccount) &&
        Objects.equals(this.linkType, initiateInvestmentAccountFacilityRequestInvestmentAccountFacility.linkType) &&
        Objects.equals(this.accountDetails, initiateInvestmentAccountFacilityRequestInvestmentAccountFacility.accountDetails) &&
        Objects.equals(this.investmentAccountType, initiateInvestmentAccountFacilityRequestInvestmentAccountFacility.investmentAccountType) &&
        Objects.equals(this.investmentAccountInstrumentProfile, initiateInvestmentAccountFacilityRequestInvestmentAccountFacility.investmentAccountInstrumentProfile) &&
        Objects.equals(this.investmentAccountInstrumentRecord, initiateInvestmentAccountFacilityRequestInvestmentAccountFacility.investmentAccountInstrumentRecord) &&
        Objects.equals(this.instrumentType, initiateInvestmentAccountFacilityRequestInvestmentAccountFacility.instrumentType) &&
        Objects.equals(this.instrumentReference, initiateInvestmentAccountFacilityRequestInvestmentAccountFacility.instrumentReference) &&
        Objects.equals(this.tradingMarketplaceReference, initiateInvestmentAccountFacilityRequestInvestmentAccountFacility.tradingMarketplaceReference) &&
        Objects.equals(this.instrumentPositionRecord, initiateInvestmentAccountFacilityRequestInvestmentAccountFacility.instrumentPositionRecord) &&
        Objects.equals(this.instrumentPositionLimitType, initiateInvestmentAccountFacilityRequestInvestmentAccountFacility.instrumentPositionLimitType) &&
        Objects.equals(this.instrumentPositionLimitSettings, initiateInvestmentAccountFacilityRequestInvestmentAccountFacility.instrumentPositionLimitSettings) &&
        Objects.equals(this.instrumentProcessingSchedule, initiateInvestmentAccountFacilityRequestInvestmentAccountFacility.instrumentProcessingSchedule) &&
        Objects.equals(this.instrumentEventType, initiateInvestmentAccountFacilityRequestInvestmentAccountFacility.instrumentEventType) &&
        Objects.equals(this.instrumentEventDescription, initiateInvestmentAccountFacilityRequestInvestmentAccountFacility.instrumentEventDescription) &&
        Objects.equals(this.instrumentEventDate, initiateInvestmentAccountFacilityRequestInvestmentAccountFacility.instrumentEventDate) &&
        Objects.equals(this.taxReference, initiateInvestmentAccountFacilityRequestInvestmentAccountFacility.taxReference) &&
        Objects.equals(this.entitlementOptionDefinition, initiateInvestmentAccountFacilityRequestInvestmentAccountFacility.entitlementOptionDefinition) &&
        Objects.equals(this.entitlementOptionSetting, initiateInvestmentAccountFacilityRequestInvestmentAccountFacility.entitlementOptionSetting) &&
        Objects.equals(this.restrictionOptionSetting, initiateInvestmentAccountFacilityRequestInvestmentAccountFacility.restrictionOptionSetting) &&
        Objects.equals(this.linkedAccounts, initiateInvestmentAccountFacilityRequestInvestmentAccountFacility.linkedAccounts) &&
        Objects.equals(this.dateType, initiateInvestmentAccountFacilityRequestInvestmentAccountFacility.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productInstanceReference, customerReference, bankBranchOrLocationReference, linkedCashAccount, linkType, accountDetails, investmentAccountType, investmentAccountInstrumentProfile, investmentAccountInstrumentRecord, instrumentType, instrumentReference, tradingMarketplaceReference, instrumentPositionRecord, instrumentPositionLimitType, instrumentPositionLimitSettings, instrumentProcessingSchedule, instrumentEventType, instrumentEventDescription, instrumentEventDate, taxReference, entitlementOptionDefinition, entitlementOptionSetting, restrictionOptionSetting, linkedAccounts, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateInvestmentAccountFacilityRequestInvestmentAccountFacility {\n");
    
    sb.append("    productInstanceReference: ").append(toIndentedString(productInstanceReference)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    bankBranchOrLocationReference: ").append(toIndentedString(bankBranchOrLocationReference)).append("\n");
    sb.append("    linkedCashAccount: ").append(toIndentedString(linkedCashAccount)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    accountDetails: ").append(toIndentedString(accountDetails)).append("\n");
    sb.append("    investmentAccountType: ").append(toIndentedString(investmentAccountType)).append("\n");
    sb.append("    investmentAccountInstrumentProfile: ").append(toIndentedString(investmentAccountInstrumentProfile)).append("\n");
    sb.append("    investmentAccountInstrumentRecord: ").append(toIndentedString(investmentAccountInstrumentRecord)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    instrumentReference: ").append(toIndentedString(instrumentReference)).append("\n");
    sb.append("    tradingMarketplaceReference: ").append(toIndentedString(tradingMarketplaceReference)).append("\n");
    sb.append("    instrumentPositionRecord: ").append(toIndentedString(instrumentPositionRecord)).append("\n");
    sb.append("    instrumentPositionLimitType: ").append(toIndentedString(instrumentPositionLimitType)).append("\n");
    sb.append("    instrumentPositionLimitSettings: ").append(toIndentedString(instrumentPositionLimitSettings)).append("\n");
    sb.append("    instrumentProcessingSchedule: ").append(toIndentedString(instrumentProcessingSchedule)).append("\n");
    sb.append("    instrumentEventType: ").append(toIndentedString(instrumentEventType)).append("\n");
    sb.append("    instrumentEventDescription: ").append(toIndentedString(instrumentEventDescription)).append("\n");
    sb.append("    instrumentEventDate: ").append(toIndentedString(instrumentEventDate)).append("\n");
    sb.append("    taxReference: ").append(toIndentedString(taxReference)).append("\n");
    sb.append("    entitlementOptionDefinition: ").append(toIndentedString(entitlementOptionDefinition)).append("\n");
    sb.append("    entitlementOptionSetting: ").append(toIndentedString(entitlementOptionSetting)).append("\n");
    sb.append("    restrictionOptionSetting: ").append(toIndentedString(restrictionOptionSetting)).append("\n");
    sb.append("    linkedAccounts: ").append(toIndentedString(linkedAccounts)).append("\n");
    sb.append("    dateType: ").append(toIndentedString(dateType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

