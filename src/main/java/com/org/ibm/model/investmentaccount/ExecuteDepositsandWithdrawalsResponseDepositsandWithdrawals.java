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
 * ExecuteDepositsandWithdrawalsResponseDepositsandWithdrawals
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T08:01:24.054Z[GMT]")

public class ExecuteDepositsandWithdrawalsResponseDepositsandWithdrawals   {
  @JsonProperty("SecuritiesDepositTransaction")
  private String securitiesDepositTransaction;

  @JsonProperty("SecuritiesDepositTransactionDepositType")
  private String securitiesDepositTransactionDepositType;

  @JsonProperty("SecuritiesDepositTransactionAmount")
  private BigDecimal securitiesDepositTransactionAmount;

  @JsonProperty("SecuritiesDepositTransactionDate")
  private String securitiesDepositTransactionDate;

  @JsonProperty("SecuritiesWithdrawalTransaction")
  private String securitiesWithdrawalTransaction;

  @JsonProperty("SecuritiesWithdrawalTransactionWithdrawalType")
  private String securitiesWithdrawalTransactionWithdrawalType;

  @JsonProperty("SecuritiesWithdrawalTransactionAmount")
  private BigDecimal securitiesWithdrawalTransactionAmount;

  @JsonProperty("SecuritiesWithdrawalTransactionDate")
  private String securitiesWithdrawalTransactionDate;

  public ExecuteDepositsandWithdrawalsResponseDepositsandWithdrawals securitiesDepositTransaction(String securitiesDepositTransaction) {
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

  public ExecuteDepositsandWithdrawalsResponseDepositsandWithdrawals securitiesDepositTransactionDepositType(String securitiesDepositTransactionDepositType) {
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

  public ExecuteDepositsandWithdrawalsResponseDepositsandWithdrawals securitiesDepositTransactionAmount(BigDecimal securitiesDepositTransactionAmount) {
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

  public ExecuteDepositsandWithdrawalsResponseDepositsandWithdrawals securitiesDepositTransactionDate(String securitiesDepositTransactionDate) {
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

  public ExecuteDepositsandWithdrawalsResponseDepositsandWithdrawals securitiesWithdrawalTransaction(String securitiesWithdrawalTransaction) {
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

  public ExecuteDepositsandWithdrawalsResponseDepositsandWithdrawals securitiesWithdrawalTransactionWithdrawalType(String securitiesWithdrawalTransactionWithdrawalType) {
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

  public ExecuteDepositsandWithdrawalsResponseDepositsandWithdrawals securitiesWithdrawalTransactionAmount(BigDecimal securitiesWithdrawalTransactionAmount) {
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

  public ExecuteDepositsandWithdrawalsResponseDepositsandWithdrawals securitiesWithdrawalTransactionDate(String securitiesWithdrawalTransactionDate) {
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
    ExecuteDepositsandWithdrawalsResponseDepositsandWithdrawals executeDepositsandWithdrawalsResponseDepositsandWithdrawals = (ExecuteDepositsandWithdrawalsResponseDepositsandWithdrawals) o;
    return Objects.equals(this.securitiesDepositTransaction, executeDepositsandWithdrawalsResponseDepositsandWithdrawals.securitiesDepositTransaction) &&
        Objects.equals(this.securitiesDepositTransactionDepositType, executeDepositsandWithdrawalsResponseDepositsandWithdrawals.securitiesDepositTransactionDepositType) &&
        Objects.equals(this.securitiesDepositTransactionAmount, executeDepositsandWithdrawalsResponseDepositsandWithdrawals.securitiesDepositTransactionAmount) &&
        Objects.equals(this.securitiesDepositTransactionDate, executeDepositsandWithdrawalsResponseDepositsandWithdrawals.securitiesDepositTransactionDate) &&
        Objects.equals(this.securitiesWithdrawalTransaction, executeDepositsandWithdrawalsResponseDepositsandWithdrawals.securitiesWithdrawalTransaction) &&
        Objects.equals(this.securitiesWithdrawalTransactionWithdrawalType, executeDepositsandWithdrawalsResponseDepositsandWithdrawals.securitiesWithdrawalTransactionWithdrawalType) &&
        Objects.equals(this.securitiesWithdrawalTransactionAmount, executeDepositsandWithdrawalsResponseDepositsandWithdrawals.securitiesWithdrawalTransactionAmount) &&
        Objects.equals(this.securitiesWithdrawalTransactionDate, executeDepositsandWithdrawalsResponseDepositsandWithdrawals.securitiesWithdrawalTransactionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securitiesDepositTransaction, securitiesDepositTransactionDepositType, securitiesDepositTransactionAmount, securitiesDepositTransactionDate, securitiesWithdrawalTransaction, securitiesWithdrawalTransactionWithdrawalType, securitiesWithdrawalTransactionAmount, securitiesWithdrawalTransactionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteDepositsandWithdrawalsResponseDepositsandWithdrawals {\n");
    
    sb.append("    securitiesDepositTransaction: ").append(toIndentedString(securitiesDepositTransaction)).append("\n");
    sb.append("    securitiesDepositTransactionDepositType: ").append(toIndentedString(securitiesDepositTransactionDepositType)).append("\n");
    sb.append("    securitiesDepositTransactionAmount: ").append(toIndentedString(securitiesDepositTransactionAmount)).append("\n");
    sb.append("    securitiesDepositTransactionDate: ").append(toIndentedString(securitiesDepositTransactionDate)).append("\n");
    sb.append("    securitiesWithdrawalTransaction: ").append(toIndentedString(securitiesWithdrawalTransaction)).append("\n");
    sb.append("    securitiesWithdrawalTransactionWithdrawalType: ").append(toIndentedString(securitiesWithdrawalTransactionWithdrawalType)).append("\n");
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

