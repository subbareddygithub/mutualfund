package com.org.ibm.model.investmentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteCorporateActionRequestCorporateAction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T08:01:24.054Z[GMT]")

public class ExecuteCorporateActionRequestCorporateAction   {
  @JsonProperty("CorporateActionType")
  private String corporateActionType;

  @JsonProperty("CorporateActionApplicationSchedule")
  private String corporateActionApplicationSchedule;

  @JsonProperty("CorporateActionInstrumentType")
  private String corporateActionInstrumentType;

  @JsonProperty("CorporateActionTransaction")
  private String corporateActionTransaction;

  @JsonProperty("CorporateActionTransactionType")
  private String corporateActionTransactionType;

  @JsonProperty("CorporateActionTransactionDescription")
  private String corporateActionTransactionDescription;

  @JsonProperty("DocumentDirectoryEntryInstanceReference")
  private Object documentDirectoryEntryInstanceReference;

  @JsonProperty("CorporateActionTransactionDate")
  private String corporateActionTransactionDate;

  public ExecuteCorporateActionRequestCorporateAction corporateActionType(String corporateActionType) {
    this.corporateActionType = corporateActionType;
    return this;
  }

  /**
   * Get corporateActionType
   * @return corporateActionType
  */
  @ApiModelProperty(value = "")


  public String getCorporateActionType() {
    return corporateActionType;
  }

  public void setCorporateActionType(String corporateActionType) {
    this.corporateActionType = corporateActionType;
  }

  public ExecuteCorporateActionRequestCorporateAction corporateActionApplicationSchedule(String corporateActionApplicationSchedule) {
    this.corporateActionApplicationSchedule = corporateActionApplicationSchedule;
    return this;
  }

  /**
   * Get corporateActionApplicationSchedule
   * @return corporateActionApplicationSchedule
  */
  @ApiModelProperty(value = "")


  public String getCorporateActionApplicationSchedule() {
    return corporateActionApplicationSchedule;
  }

  public void setCorporateActionApplicationSchedule(String corporateActionApplicationSchedule) {
    this.corporateActionApplicationSchedule = corporateActionApplicationSchedule;
  }

  public ExecuteCorporateActionRequestCorporateAction corporateActionInstrumentType(String corporateActionInstrumentType) {
    this.corporateActionInstrumentType = corporateActionInstrumentType;
    return this;
  }

  /**
   * Get corporateActionInstrumentType
   * @return corporateActionInstrumentType
  */
  @ApiModelProperty(value = "")


  public String getCorporateActionInstrumentType() {
    return corporateActionInstrumentType;
  }

  public void setCorporateActionInstrumentType(String corporateActionInstrumentType) {
    this.corporateActionInstrumentType = corporateActionInstrumentType;
  }

  public ExecuteCorporateActionRequestCorporateAction corporateActionTransaction(String corporateActionTransaction) {
    this.corporateActionTransaction = corporateActionTransaction;
    return this;
  }

  /**
   * Get corporateActionTransaction
   * @return corporateActionTransaction
  */
  @ApiModelProperty(value = "")


  public String getCorporateActionTransaction() {
    return corporateActionTransaction;
  }

  public void setCorporateActionTransaction(String corporateActionTransaction) {
    this.corporateActionTransaction = corporateActionTransaction;
  }

  public ExecuteCorporateActionRequestCorporateAction corporateActionTransactionType(String corporateActionTransactionType) {
    this.corporateActionTransactionType = corporateActionTransactionType;
    return this;
  }

  /**
   * Get corporateActionTransactionType
   * @return corporateActionTransactionType
  */
  @ApiModelProperty(value = "")


  public String getCorporateActionTransactionType() {
    return corporateActionTransactionType;
  }

  public void setCorporateActionTransactionType(String corporateActionTransactionType) {
    this.corporateActionTransactionType = corporateActionTransactionType;
  }

  public ExecuteCorporateActionRequestCorporateAction corporateActionTransactionDescription(String corporateActionTransactionDescription) {
    this.corporateActionTransactionDescription = corporateActionTransactionDescription;
    return this;
  }

  /**
   * Get corporateActionTransactionDescription
   * @return corporateActionTransactionDescription
  */
  @ApiModelProperty(value = "")


  public String getCorporateActionTransactionDescription() {
    return corporateActionTransactionDescription;
  }

  public void setCorporateActionTransactionDescription(String corporateActionTransactionDescription) {
    this.corporateActionTransactionDescription = corporateActionTransactionDescription;
  }

  public ExecuteCorporateActionRequestCorporateAction documentDirectoryEntryInstanceReference(Object documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    return this;
  }

  /**
   * Get documentDirectoryEntryInstanceReference
   * @return documentDirectoryEntryInstanceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(Object documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }

  public ExecuteCorporateActionRequestCorporateAction corporateActionTransactionDate(String corporateActionTransactionDate) {
    this.corporateActionTransactionDate = corporateActionTransactionDate;
    return this;
  }

  /**
   * Get corporateActionTransactionDate
   * @return corporateActionTransactionDate
  */
  @ApiModelProperty(value = "")


  public String getCorporateActionTransactionDate() {
    return corporateActionTransactionDate;
  }

  public void setCorporateActionTransactionDate(String corporateActionTransactionDate) {
    this.corporateActionTransactionDate = corporateActionTransactionDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteCorporateActionRequestCorporateAction executeCorporateActionRequestCorporateAction = (ExecuteCorporateActionRequestCorporateAction) o;
    return Objects.equals(this.corporateActionType, executeCorporateActionRequestCorporateAction.corporateActionType) &&
        Objects.equals(this.corporateActionApplicationSchedule, executeCorporateActionRequestCorporateAction.corporateActionApplicationSchedule) &&
        Objects.equals(this.corporateActionInstrumentType, executeCorporateActionRequestCorporateAction.corporateActionInstrumentType) &&
        Objects.equals(this.corporateActionTransaction, executeCorporateActionRequestCorporateAction.corporateActionTransaction) &&
        Objects.equals(this.corporateActionTransactionType, executeCorporateActionRequestCorporateAction.corporateActionTransactionType) &&
        Objects.equals(this.corporateActionTransactionDescription, executeCorporateActionRequestCorporateAction.corporateActionTransactionDescription) &&
        Objects.equals(this.documentDirectoryEntryInstanceReference, executeCorporateActionRequestCorporateAction.documentDirectoryEntryInstanceReference) &&
        Objects.equals(this.corporateActionTransactionDate, executeCorporateActionRequestCorporateAction.corporateActionTransactionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporateActionType, corporateActionApplicationSchedule, corporateActionInstrumentType, corporateActionTransaction, corporateActionTransactionType, corporateActionTransactionDescription, documentDirectoryEntryInstanceReference, corporateActionTransactionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteCorporateActionRequestCorporateAction {\n");
    
    sb.append("    corporateActionType: ").append(toIndentedString(corporateActionType)).append("\n");
    sb.append("    corporateActionApplicationSchedule: ").append(toIndentedString(corporateActionApplicationSchedule)).append("\n");
    sb.append("    corporateActionInstrumentType: ").append(toIndentedString(corporateActionInstrumentType)).append("\n");
    sb.append("    corporateActionTransaction: ").append(toIndentedString(corporateActionTransaction)).append("\n");
    sb.append("    corporateActionTransactionType: ").append(toIndentedString(corporateActionTransactionType)).append("\n");
    sb.append("    corporateActionTransactionDescription: ").append(toIndentedString(corporateActionTransactionDescription)).append("\n");
    sb.append("    documentDirectoryEntryInstanceReference: ").append(toIndentedString(documentDirectoryEntryInstanceReference)).append("\n");
    sb.append("    corporateActionTransactionDate: ").append(toIndentedString(corporateActionTransactionDate)).append("\n");
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

