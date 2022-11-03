package com.org.ibm.model.investmentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T08:01:24.054Z[GMT]")

public class InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility   {
  @JsonProperty("InvestmentAccountNumber")
  private String investmentAccountNumber;

  @JsonProperty("LinkedCashAccount")
  private String linkedCashAccount;

  @JsonProperty("LinkType")
  private String linkType;

  @JsonProperty("AccountDetails")
  private String accountDetails;

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

  @JsonProperty("InstrumentPositionHolding")
  private String instrumentPositionHolding;

  @JsonProperty("InstrumentProcessingSchedule")
  private String instrumentProcessingSchedule;

  @JsonProperty("InstrumentEventType")
  private String instrumentEventType;

  @JsonProperty("InstrumentEventDescription")
  private String instrumentEventDescription;

  @JsonProperty("InstrumentEventDate")
  private String instrumentEventDate;

  @JsonProperty("EntitlementOptionDefinition")
  private String entitlementOptionDefinition;

  @JsonProperty("EntitlementOptionSetting")
  private String entitlementOptionSetting;

  @JsonProperty("RestrictionOptionDefinition")
  private String restrictionOptionDefinition;

  @JsonProperty("RestrictionOptionSetting")
  private String restrictionOptionSetting;

  @JsonProperty("DateType")
  private String dateType;

  public InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility investmentAccountNumber(String investmentAccountNumber) {
    this.investmentAccountNumber = investmentAccountNumber;
    return this;
  }

  /**
   * Get investmentAccountNumber
   * @return investmentAccountNumber
  */
  @ApiModelProperty(value = "")


  public String getInvestmentAccountNumber() {
    return investmentAccountNumber;
  }

  public void setInvestmentAccountNumber(String investmentAccountNumber) {
    this.investmentAccountNumber = investmentAccountNumber;
  }

  public InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility linkedCashAccount(String linkedCashAccount) {
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

  public InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility linkType(String linkType) {
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

  public InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility accountDetails(String accountDetails) {
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

  public InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility investmentAccountInstrumentProfile(String investmentAccountInstrumentProfile) {
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

  public InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility investmentAccountInstrumentRecord(String investmentAccountInstrumentRecord) {
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

  public InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility instrumentType(String instrumentType) {
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

  public InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility instrumentReference(Object instrumentReference) {
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

  public InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility tradingMarketplaceReference(Object tradingMarketplaceReference) {
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

  public InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility instrumentPositionRecord(String instrumentPositionRecord) {
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

  public InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility instrumentPositionLimitType(String instrumentPositionLimitType) {
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

  public InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility instrumentPositionLimitSettings(String instrumentPositionLimitSettings) {
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

  public InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility instrumentPositionHolding(String instrumentPositionHolding) {
    this.instrumentPositionHolding = instrumentPositionHolding;
    return this;
  }

  /**
   * Get instrumentPositionHolding
   * @return instrumentPositionHolding
  */
  @ApiModelProperty(value = "")


  public String getInstrumentPositionHolding() {
    return instrumentPositionHolding;
  }

  public void setInstrumentPositionHolding(String instrumentPositionHolding) {
    this.instrumentPositionHolding = instrumentPositionHolding;
  }

  public InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility instrumentProcessingSchedule(String instrumentProcessingSchedule) {
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

  public InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility instrumentEventType(String instrumentEventType) {
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

  public InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility instrumentEventDescription(String instrumentEventDescription) {
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

  public InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility instrumentEventDate(String instrumentEventDate) {
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

  public InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility entitlementOptionDefinition(String entitlementOptionDefinition) {
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

  public InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility entitlementOptionSetting(String entitlementOptionSetting) {
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

  public InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility restrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
    return this;
  }

  /**
   * Get restrictionOptionDefinition
   * @return restrictionOptionDefinition
  */
  @ApiModelProperty(value = "")


  public String getRestrictionOptionDefinition() {
    return restrictionOptionDefinition;
  }

  public void setRestrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
  }

  public InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility restrictionOptionSetting(String restrictionOptionSetting) {
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

  public InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility dateType(String dateType) {
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
    InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility initiateInvestmentAccountFacilityResponseInvestmentAccountFacility = (InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility) o;
    return Objects.equals(this.investmentAccountNumber, initiateInvestmentAccountFacilityResponseInvestmentAccountFacility.investmentAccountNumber) &&
        Objects.equals(this.linkedCashAccount, initiateInvestmentAccountFacilityResponseInvestmentAccountFacility.linkedCashAccount) &&
        Objects.equals(this.linkType, initiateInvestmentAccountFacilityResponseInvestmentAccountFacility.linkType) &&
        Objects.equals(this.accountDetails, initiateInvestmentAccountFacilityResponseInvestmentAccountFacility.accountDetails) &&
        Objects.equals(this.investmentAccountInstrumentProfile, initiateInvestmentAccountFacilityResponseInvestmentAccountFacility.investmentAccountInstrumentProfile) &&
        Objects.equals(this.investmentAccountInstrumentRecord, initiateInvestmentAccountFacilityResponseInvestmentAccountFacility.investmentAccountInstrumentRecord) &&
        Objects.equals(this.instrumentType, initiateInvestmentAccountFacilityResponseInvestmentAccountFacility.instrumentType) &&
        Objects.equals(this.instrumentReference, initiateInvestmentAccountFacilityResponseInvestmentAccountFacility.instrumentReference) &&
        Objects.equals(this.tradingMarketplaceReference, initiateInvestmentAccountFacilityResponseInvestmentAccountFacility.tradingMarketplaceReference) &&
        Objects.equals(this.instrumentPositionRecord, initiateInvestmentAccountFacilityResponseInvestmentAccountFacility.instrumentPositionRecord) &&
        Objects.equals(this.instrumentPositionLimitType, initiateInvestmentAccountFacilityResponseInvestmentAccountFacility.instrumentPositionLimitType) &&
        Objects.equals(this.instrumentPositionLimitSettings, initiateInvestmentAccountFacilityResponseInvestmentAccountFacility.instrumentPositionLimitSettings) &&
        Objects.equals(this.instrumentPositionHolding, initiateInvestmentAccountFacilityResponseInvestmentAccountFacility.instrumentPositionHolding) &&
        Objects.equals(this.instrumentProcessingSchedule, initiateInvestmentAccountFacilityResponseInvestmentAccountFacility.instrumentProcessingSchedule) &&
        Objects.equals(this.instrumentEventType, initiateInvestmentAccountFacilityResponseInvestmentAccountFacility.instrumentEventType) &&
        Objects.equals(this.instrumentEventDescription, initiateInvestmentAccountFacilityResponseInvestmentAccountFacility.instrumentEventDescription) &&
        Objects.equals(this.instrumentEventDate, initiateInvestmentAccountFacilityResponseInvestmentAccountFacility.instrumentEventDate) &&
        Objects.equals(this.entitlementOptionDefinition, initiateInvestmentAccountFacilityResponseInvestmentAccountFacility.entitlementOptionDefinition) &&
        Objects.equals(this.entitlementOptionSetting, initiateInvestmentAccountFacilityResponseInvestmentAccountFacility.entitlementOptionSetting) &&
        Objects.equals(this.restrictionOptionDefinition, initiateInvestmentAccountFacilityResponseInvestmentAccountFacility.restrictionOptionDefinition) &&
        Objects.equals(this.restrictionOptionSetting, initiateInvestmentAccountFacilityResponseInvestmentAccountFacility.restrictionOptionSetting) &&
        Objects.equals(this.dateType, initiateInvestmentAccountFacilityResponseInvestmentAccountFacility.dateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investmentAccountNumber, linkedCashAccount, linkType, accountDetails, investmentAccountInstrumentProfile, investmentAccountInstrumentRecord, instrumentType, instrumentReference, tradingMarketplaceReference, instrumentPositionRecord, instrumentPositionLimitType, instrumentPositionLimitSettings, instrumentPositionHolding, instrumentProcessingSchedule, instrumentEventType, instrumentEventDescription, instrumentEventDate, entitlementOptionDefinition, entitlementOptionSetting, restrictionOptionDefinition, restrictionOptionSetting, dateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateInvestmentAccountFacilityResponseInvestmentAccountFacility {\n");
    
    sb.append("    investmentAccountNumber: ").append(toIndentedString(investmentAccountNumber)).append("\n");
    sb.append("    linkedCashAccount: ").append(toIndentedString(linkedCashAccount)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    accountDetails: ").append(toIndentedString(accountDetails)).append("\n");
    sb.append("    investmentAccountInstrumentProfile: ").append(toIndentedString(investmentAccountInstrumentProfile)).append("\n");
    sb.append("    investmentAccountInstrumentRecord: ").append(toIndentedString(investmentAccountInstrumentRecord)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    instrumentReference: ").append(toIndentedString(instrumentReference)).append("\n");
    sb.append("    tradingMarketplaceReference: ").append(toIndentedString(tradingMarketplaceReference)).append("\n");
    sb.append("    instrumentPositionRecord: ").append(toIndentedString(instrumentPositionRecord)).append("\n");
    sb.append("    instrumentPositionLimitType: ").append(toIndentedString(instrumentPositionLimitType)).append("\n");
    sb.append("    instrumentPositionLimitSettings: ").append(toIndentedString(instrumentPositionLimitSettings)).append("\n");
    sb.append("    instrumentPositionHolding: ").append(toIndentedString(instrumentPositionHolding)).append("\n");
    sb.append("    instrumentProcessingSchedule: ").append(toIndentedString(instrumentProcessingSchedule)).append("\n");
    sb.append("    instrumentEventType: ").append(toIndentedString(instrumentEventType)).append("\n");
    sb.append("    instrumentEventDescription: ").append(toIndentedString(instrumentEventDescription)).append("\n");
    sb.append("    instrumentEventDate: ").append(toIndentedString(instrumentEventDate)).append("\n");
    sb.append("    entitlementOptionDefinition: ").append(toIndentedString(entitlementOptionDefinition)).append("\n");
    sb.append("    entitlementOptionSetting: ").append(toIndentedString(entitlementOptionSetting)).append("\n");
    sb.append("    restrictionOptionDefinition: ").append(toIndentedString(restrictionOptionDefinition)).append("\n");
    sb.append("    restrictionOptionSetting: ").append(toIndentedString(restrictionOptionSetting)).append("\n");
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

