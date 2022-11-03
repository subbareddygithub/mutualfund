package com.org.ibm.model.investmentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T08:01:24.054Z[GMT]")

public class InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals   {
  @JsonProperty("SecuritiesDepositType")
  private String securitiesDepositType;

  @JsonProperty("SecuritiesWithdrawalType")
  private String securitiesWithdrawalType;

  public InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals securitiesDepositType(String securitiesDepositType) {
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

  public InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals securitiesWithdrawalType(String securitiesWithdrawalType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals initiateDepositsandWithdrawalsRequestDepositsandWithdrawals = (InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals) o;
    return Objects.equals(this.securitiesDepositType, initiateDepositsandWithdrawalsRequestDepositsandWithdrawals.securitiesDepositType) &&
        Objects.equals(this.securitiesWithdrawalType, initiateDepositsandWithdrawalsRequestDepositsandWithdrawals.securitiesWithdrawalType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securitiesDepositType, securitiesWithdrawalType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals {\n");
    
    sb.append("    securitiesDepositType: ").append(toIndentedString(securitiesDepositType)).append("\n");
    sb.append("    securitiesWithdrawalType: ").append(toIndentedString(securitiesWithdrawalType)).append("\n");
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

