package com.org.ibm.model.investmentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteCorporateActionResponseCorporateAction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T08:01:24.054Z[GMT]")

public class ExecuteCorporateActionResponseCorporateAction   {
  @JsonProperty("CorporateActionTransaction")
  private String corporateActionTransaction;

  @JsonProperty("CorporateActionTransactionDescription")
  private String corporateActionTransactionDescription;

  @JsonProperty("CorporateActionWorkProducts")
  private String corporateActionWorkProducts;

  @JsonProperty("DocumentDirectoryEntryInstanceReference")
  private Object documentDirectoryEntryInstanceReference;

  @JsonProperty("CorporateActionTransactionResult")
  private String corporateActionTransactionResult;

  @JsonProperty("CorporateActionTransactionDate")
  private String corporateActionTransactionDate;

  public ExecuteCorporateActionResponseCorporateAction corporateActionTransaction(String corporateActionTransaction) {
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

  public ExecuteCorporateActionResponseCorporateAction corporateActionTransactionDescription(String corporateActionTransactionDescription) {
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

  public ExecuteCorporateActionResponseCorporateAction corporateActionWorkProducts(String corporateActionWorkProducts) {
    this.corporateActionWorkProducts = corporateActionWorkProducts;
    return this;
  }

  /**
   * Get corporateActionWorkProducts
   * @return corporateActionWorkProducts
  */
  @ApiModelProperty(value = "")


  public String getCorporateActionWorkProducts() {
    return corporateActionWorkProducts;
  }

  public void setCorporateActionWorkProducts(String corporateActionWorkProducts) {
    this.corporateActionWorkProducts = corporateActionWorkProducts;
  }

  public ExecuteCorporateActionResponseCorporateAction documentDirectoryEntryInstanceReference(Object documentDirectoryEntryInstanceReference) {
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

  public ExecuteCorporateActionResponseCorporateAction corporateActionTransactionResult(String corporateActionTransactionResult) {
    this.corporateActionTransactionResult = corporateActionTransactionResult;
    return this;
  }

  /**
   * Get corporateActionTransactionResult
   * @return corporateActionTransactionResult
  */
  @ApiModelProperty(value = "")


  public String getCorporateActionTransactionResult() {
    return corporateActionTransactionResult;
  }

  public void setCorporateActionTransactionResult(String corporateActionTransactionResult) {
    this.corporateActionTransactionResult = corporateActionTransactionResult;
  }

  public ExecuteCorporateActionResponseCorporateAction corporateActionTransactionDate(String corporateActionTransactionDate) {
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
    ExecuteCorporateActionResponseCorporateAction executeCorporateActionResponseCorporateAction = (ExecuteCorporateActionResponseCorporateAction) o;
    return Objects.equals(this.corporateActionTransaction, executeCorporateActionResponseCorporateAction.corporateActionTransaction) &&
        Objects.equals(this.corporateActionTransactionDescription, executeCorporateActionResponseCorporateAction.corporateActionTransactionDescription) &&
        Objects.equals(this.corporateActionWorkProducts, executeCorporateActionResponseCorporateAction.corporateActionWorkProducts) &&
        Objects.equals(this.documentDirectoryEntryInstanceReference, executeCorporateActionResponseCorporateAction.documentDirectoryEntryInstanceReference) &&
        Objects.equals(this.corporateActionTransactionResult, executeCorporateActionResponseCorporateAction.corporateActionTransactionResult) &&
        Objects.equals(this.corporateActionTransactionDate, executeCorporateActionResponseCorporateAction.corporateActionTransactionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporateActionTransaction, corporateActionTransactionDescription, corporateActionWorkProducts, documentDirectoryEntryInstanceReference, corporateActionTransactionResult, corporateActionTransactionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteCorporateActionResponseCorporateAction {\n");
    
    sb.append("    corporateActionTransaction: ").append(toIndentedString(corporateActionTransaction)).append("\n");
    sb.append("    corporateActionTransactionDescription: ").append(toIndentedString(corporateActionTransactionDescription)).append("\n");
    sb.append("    corporateActionWorkProducts: ").append(toIndentedString(corporateActionWorkProducts)).append("\n");
    sb.append("    documentDirectoryEntryInstanceReference: ").append(toIndentedString(documentDirectoryEntryInstanceReference)).append("\n");
    sb.append("    corporateActionTransactionResult: ").append(toIndentedString(corporateActionTransactionResult)).append("\n");
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

