package com.org.ibm.model.investmentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DepositsandWithdrawals
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T08:01:24.054Z[GMT]")

public class DepositsandWithdrawals   {
  @JsonProperty("SecuritiesDepositType")
  private String securitiesDepositType;

  @JsonProperty("SecuritiesWithdrawalType")
  private String securitiesWithdrawalType;

  @JsonProperty("SecuritiesDepositTransaction")
  private String securitiesDepositTransaction;

  @JsonProperty("SecuritiesDepositTransactionSourceReference")
  private Object securitiesDepositTransactionSourceReference;

  @JsonProperty("SecuritiesDepositTransactionDepositType")
  private String securitiesDepositTransactionDepositType;

  @JsonProperty("SecuritiesDepositTransactionDescription")
  private String securitiesDepositTransactionDescription;

  @JsonProperty("SecuritiesDepositTransactionAmount")
  private BigDecimal securitiesDepositTransactionAmount;

  @JsonProperty("SecuritiesDepositTransactionDate")
  private String securitiesDepositTransactionDate;

  @JsonProperty("SecuritiesWithdrawalTransaction")
  private String securitiesWithdrawalTransaction;

  @JsonProperty("SecuritiesWithdrawalTransactionSourceReference")
  private Object securitiesWithdrawalTransactionSourceReference;

  @JsonProperty("SecuritiesWithdrawalTransactionWithdrawalType")
  private String securitiesWithdrawalTransactionWithdrawalType;

  @JsonProperty("SecuritiesWithdrawalTransactionDescription")
  private String securitiesWithdrawalTransactionDescription;

  @JsonProperty("SecuritiesWithdrawalTransactionAmount")
  private BigDecimal securitiesWithdrawalTransactionAmount;

  @JsonProperty("SecuritiesWithdrawalTransactionDate")
  private String securitiesWithdrawalTransactionDate;

  public DepositsandWithdrawals securitiesDepositType(String securitiesDepositType) {
    this.securitiesDepositType = securitiesDepositType;
    return this;
  }

  /**
   * Get securitiesDepositType
   * @return securitiesDepositType
  */
  @ApiModelProperty(value = "")


  public String getSecuritiesDepositType() {
    return securitiesDepositType;
  }

  public void setSecuritiesDepositType(String securitiesDepositType) {
    this.securitiesDepositType = securitiesDepositType;
  }

  public DepositsandWithdrawals securitiesWithdrawalType(String securitiesWithdrawalType) {
    this.securitiesWithdrawalType = securitiesWithdrawalType;
    return this;
  }

  /**
   * Get securitiesWithdrawalType
   * @return securitiesWithdrawalType
  */
  @ApiModelProperty(value = "")


  public String getSecuritiesWithdrawalType() {
    return securitiesWithdrawalType;
  }

  public void setSecuritiesWithdrawalType(String securitiesWithdrawalType) {
    this.securitiesWithdrawalType = securitiesWithdrawalType;
  }

  public DepositsandWithdrawals securitiesDepositTransaction(String securitiesDepositTransaction) {
    this.securitiesDepositTransaction = securitiesDepositTransaction;
    return this;
  }

  /**
   * Get securitiesDepositTransaction
   * @return securitiesDepositTransaction
  */
  @ApiModelProperty(value = "")


  public String getSecuritiesDepositTransaction() {
    return securitiesDepositTransaction;
  }

  public void setSecuritiesDepositTransaction(String securitiesDepositTransaction) {
    this.securitiesDepositTransaction = securitiesDepositTransaction;
  }

  public DepositsandWithdrawals securitiesDepositTransactionSourceReference(Object securitiesDepositTransactionSourceReference) {
    this.securitiesDepositTransactionSourceReference = securitiesDepositTransactionSourceReference;
    return this;
  }

  /**
   * Get securitiesDepositTransactionSourceReference
   * @return securitiesDepositTransactionSourceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getSecuritiesDepositTransactionSourceReference() {
    return securitiesDepositTransactionSourceReference;
  }

  public void setSecuritiesDepositTransactionSourceReference(Object securitiesDepositTransactionSourceReference) {
    this.securitiesDepositTransactionSourceReference = securitiesDepositTransactionSourceReference;
  }

  public DepositsandWithdrawals securitiesDepositTransactionDepositType(String securitiesDepositTransactionDepositType) {
    this.securitiesDepositTransactionDepositType = securitiesDepositTransactionDepositType;
    return this;
  }

  /**
   * Get securitiesDepositTransactionDepositType
   * @return securitiesDepositTransactionDepositType
  */
  @ApiModelProperty(value = "")


  public String getSecuritiesDepositTransactionDepositType() {
    return securitiesDepositTransactionDepositType;
  }

  public void setSecuritiesDepositTransactionDepositType(String securitiesDepositTransactionDepositType) {
    this.securitiesDepositTransactionDepositType = securitiesDepositTransactionDepositType;
  }

  public DepositsandWithdrawals securitiesDepositTransactionDescription(String securitiesDepositTransactionDescription) {
    this.securitiesDepositTransactionDescription = securitiesDepositTransactionDescription;
    return this;
  }

  /**
   * Get securitiesDepositTransactionDescription
   * @return securitiesDepositTransactionDescription
  */
  @ApiModelProperty(value = "")


  public String getSecuritiesDepositTransactionDescription() {
    return securitiesDepositTransactionDescription;
  }

  public void setSecuritiesDepositTransactionDescription(String securitiesDepositTransactionDescription) {
    this.securitiesDepositTransactionDescription = securitiesDepositTransactionDescription;
  }

  public DepositsandWithdrawals securitiesDepositTransactionAmount(BigDecimal securitiesDepositTransactionAmount) {
    this.securitiesDepositTransactionAmount = securitiesDepositTransactionAmount;
    return this;
  }

  /**
   * Get securitiesDepositTransactionAmount
   * @return securitiesDepositTransactionAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getSecuritiesDepositTransactionAmount() {
    return securitiesDepositTransactionAmount;
  }

  public void setSecuritiesDepositTransactionAmount(BigDecimal securitiesDepositTransactionAmount) {
    this.securitiesDepositTransactionAmount = securitiesDepositTransactionAmount;
  }

  public DepositsandWithdrawals securitiesDepositTransactionDate(String securitiesDepositTransactionDate) {
    this.securitiesDepositTransactionDate = securitiesDepositTransactionDate;
    return this;
  }

  /**
   * Get securitiesDepositTransactionDate
   * @return securitiesDepositTransactionDate
  */
  @ApiModelProperty(value = "")


  public String getSecuritiesDepositTransactionDate() {
    return securitiesDepositTransactionDate;
  }

  public void setSecuritiesDepositTransactionDate(String securitiesDepositTransactionDate) {
    this.securitiesDepositTransactionDate = securitiesDepositTransactionDate;
  }

  public DepositsandWithdrawals securitiesWithdrawalTransaction(String securitiesWithdrawalTransaction) {
    this.securitiesWithdrawalTransaction = securitiesWithdrawalTransaction;
    return this;
  }

  /**
   * Get securitiesWithdrawalTransaction
   * @return securitiesWithdrawalTransaction
  */
  @ApiModelProperty(value = "")


  public String getSecuritiesWithdrawalTransaction() {
    return securitiesWithdrawalTransaction;
  }

  public void setSecuritiesWithdrawalTransaction(String securitiesWithdrawalTransaction) {
    this.securitiesWithdrawalTransaction = securitiesWithdrawalTransaction;
  }

  public DepositsandWithdrawals securitiesWithdrawalTransactionSourceReference(Object securitiesWithdrawalTransactionSourceReference) {
    this.securitiesWithdrawalTransactionSourceReference = securitiesWithdrawalTransactionSourceReference;
    return this;
  }

  /**
   * Get securitiesWithdrawalTransactionSourceReference
   * @return securitiesWithdrawalTransactionSourceReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getSecuritiesWithdrawalTransactionSourceReference() {
    return securitiesWithdrawalTransactionSourceReference;
  }

  public void setSecuritiesWithdrawalTransactionSourceReference(Object securitiesWithdrawalTransactionSourceReference) {
    this.securitiesWithdrawalTransactionSourceReference = securitiesWithdrawalTransactionSourceReference;
  }

  public DepositsandWithdrawals securitiesWithdrawalTransactionWithdrawalType(String securitiesWithdrawalTransactionWithdrawalType) {
    this.securitiesWithdrawalTransactionWithdrawalType = securitiesWithdrawalTransactionWithdrawalType;
    return this;
  }

  /**
   * Get securitiesWithdrawalTransactionWithdrawalType
   * @return securitiesWithdrawalTransactionWithdrawalType
  */
  @ApiModelProperty(value = "")


  public String getSecuritiesWithdrawalTransactionWithdrawalType() {
    return securitiesWithdrawalTransactionWithdrawalType;
  }

  public void setSecuritiesWithdrawalTransactionWithdrawalType(String securitiesWithdrawalTransactionWithdrawalType) {
    this.securitiesWithdrawalTransactionWithdrawalType = securitiesWithdrawalTransactionWithdrawalType;
  }

  public DepositsandWithdrawals securitiesWithdrawalTransactionDescription(String securitiesWithdrawalTransactionDescription) {
    this.securitiesWithdrawalTransactionDescription = securitiesWithdrawalTransactionDescription;
    return this;
  }

  /**
   * Get securitiesWithdrawalTransactionDescription
   * @return securitiesWithdrawalTransactionDescription
  */
  @ApiModelProperty(value = "")


  public String getSecuritiesWithdrawalTransactionDescription() {
    return securitiesWithdrawalTransactionDescription;
  }

  public void setSecuritiesWithdrawalTransactionDescription(String securitiesWithdrawalTransactionDescription) {
    this.securitiesWithdrawalTransactionDescription = securitiesWithdrawalTransactionDescription;
  }

  public DepositsandWithdrawals securitiesWithdrawalTransactionAmount(BigDecimal securitiesWithdrawalTransactionAmount) {
    this.securitiesWithdrawalTransactionAmount = securitiesWithdrawalTransactionAmount;
    return this;
  }

  /**
   * Get securitiesWithdrawalTransactionAmount
   * @return securitiesWithdrawalTransactionAmount
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getSecuritiesWithdrawalTransactionAmount() {
    return securitiesWithdrawalTransactionAmount;
  }

  public void setSecuritiesWithdrawalTransactionAmount(BigDecimal securitiesWithdrawalTransactionAmount) {
    this.securitiesWithdrawalTransactionAmount = securitiesWithdrawalTransactionAmount;
  }

  public DepositsandWithdrawals securitiesWithdrawalTransactionDate(String securitiesWithdrawalTransactionDate) {
    this.securitiesWithdrawalTransactionDate = securitiesWithdrawalTransactionDate;
    return this;
  }

  /**
   * Get securitiesWithdrawalTransactionDate
   * @return securitiesWithdrawalTransactionDate
  */
  @ApiModelProperty(value = "")


  public String getSecuritiesWithdrawalTransactionDate() {
    return securitiesWithdrawalTransactionDate;
  }

  public void setSecuritiesWithdrawalTransactionDate(String securitiesWithdrawalTransactionDate) {
    this.securitiesWithdrawalTransactionDate = securitiesWithdrawalTransactionDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositsandWithdrawals depositsandWithdrawals = (DepositsandWithdrawals) o;
    return Objects.equals(this.securitiesDepositType, depositsandWithdrawals.securitiesDepositType) &&
        Objects.equals(this.securitiesWithdrawalType, depositsandWithdrawals.securitiesWithdrawalType) &&
        Objects.equals(this.securitiesDepositTransaction, depositsandWithdrawals.securitiesDepositTransaction) &&
        Objects.equals(this.securitiesDepositTransactionSourceReference, depositsandWithdrawals.securitiesDepositTransactionSourceReference) &&
        Objects.equals(this.securitiesDepositTransactionDepositType, depositsandWithdrawals.securitiesDepositTransactionDepositType) &&
        Objects.equals(this.securitiesDepositTransactionDescription, depositsandWithdrawals.securitiesDepositTransactionDescription) &&
        Objects.equals(this.securitiesDepositTransactionAmount, depositsandWithdrawals.securitiesDepositTransactionAmount) &&
        Objects.equals(this.securitiesDepositTransactionDate, depositsandWithdrawals.securitiesDepositTransactionDate) &&
        Objects.equals(this.securitiesWithdrawalTransaction, depositsandWithdrawals.securitiesWithdrawalTransaction) &&
        Objects.equals(this.securitiesWithdrawalTransactionSourceReference, depositsandWithdrawals.securitiesWithdrawalTransactionSourceReference) &&
        Objects.equals(this.securitiesWithdrawalTransactionWithdrawalType, depositsandWithdrawals.securitiesWithdrawalTransactionWithdrawalType) &&
        Objects.equals(this.securitiesWithdrawalTransactionDescription, depositsandWithdrawals.securitiesWithdrawalTransactionDescription) &&
        Objects.equals(this.securitiesWithdrawalTransactionAmount, depositsandWithdrawals.securitiesWithdrawalTransactionAmount) &&
        Objects.equals(this.securitiesWithdrawalTransactionDate, depositsandWithdrawals.securitiesWithdrawalTransactionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securitiesDepositType, securitiesWithdrawalType, securitiesDepositTransaction, securitiesDepositTransactionSourceReference, securitiesDepositTransactionDepositType, securitiesDepositTransactionDescription, securitiesDepositTransactionAmount, securitiesDepositTransactionDate, securitiesWithdrawalTransaction, securitiesWithdrawalTransactionSourceReference, securitiesWithdrawalTransactionWithdrawalType, securitiesWithdrawalTransactionDescription, securitiesWithdrawalTransactionAmount, securitiesWithdrawalTransactionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositsandWithdrawals {\n");
    
    sb.append("    securitiesDepositType: ").append(toIndentedString(securitiesDepositType)).append("\n");
    sb.append("    securitiesWithdrawalType: ").append(toIndentedString(securitiesWithdrawalType)).append("\n");
    sb.append("    securitiesDepositTransaction: ").append(toIndentedString(securitiesDepositTransaction)).append("\n");
    sb.append("    securitiesDepositTransactionSourceReference: ").append(toIndentedString(securitiesDepositTransactionSourceReference)).append("\n");
    sb.append("    securitiesDepositTransactionDepositType: ").append(toIndentedString(securitiesDepositTransactionDepositType)).append("\n");
    sb.append("    securitiesDepositTransactionDescription: ").append(toIndentedString(securitiesDepositTransactionDescription)).append("\n");
    sb.append("    securitiesDepositTransactionAmount: ").append(toIndentedString(securitiesDepositTransactionAmount)).append("\n");
    sb.append("    securitiesDepositTransactionDate: ").append(toIndentedString(securitiesDepositTransactionDate)).append("\n");
    sb.append("    securitiesWithdrawalTransaction: ").append(toIndentedString(securitiesWithdrawalTransaction)).append("\n");
    sb.append("    securitiesWithdrawalTransactionSourceReference: ").append(toIndentedString(securitiesWithdrawalTransactionSourceReference)).append("\n");
    sb.append("    securitiesWithdrawalTransactionWithdrawalType: ").append(toIndentedString(securitiesWithdrawalTransactionWithdrawalType)).append("\n");
    sb.append("    securitiesWithdrawalTransactionDescription: ").append(toIndentedString(securitiesWithdrawalTransactionDescription)).append("\n");
    sb.append("    securitiesWithdrawalTransactionAmount: ").append(toIndentedString(securitiesWithdrawalTransactionAmount)).append("\n");
    sb.append("    securitiesWithdrawalTransactionDate: ").append(toIndentedString(securitiesWithdrawalTransactionDate)).append("\n");
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

