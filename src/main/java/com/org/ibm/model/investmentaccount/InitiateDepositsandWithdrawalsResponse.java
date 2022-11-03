package com.org.ibm.model.investmentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.investmentaccount.InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateDepositsandWithdrawalsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T08:01:24.054Z[GMT]")

public class InitiateDepositsandWithdrawalsResponse   {
  @JsonProperty("DepositsandWithdrawals")
  private InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals depositsandWithdrawals;

  public InitiateDepositsandWithdrawalsResponse depositsandWithdrawals(InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals depositsandWithdrawals) {
    this.depositsandWithdrawals = depositsandWithdrawals;
    return this;
  }

  /**
   * Get depositsandWithdrawals
   * @return depositsandWithdrawals
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals getDepositsandWithdrawals() {
    return depositsandWithdrawals;
  }

  public void setDepositsandWithdrawals(InitiateDepositsandWithdrawalsRequestDepositsandWithdrawals depositsandWithdrawals) {
    this.depositsandWithdrawals = depositsandWithdrawals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateDepositsandWithdrawalsResponse initiateDepositsandWithdrawalsResponse = (InitiateDepositsandWithdrawalsResponse) o;
    return Objects.equals(this.depositsandWithdrawals, initiateDepositsandWithdrawalsResponse.depositsandWithdrawals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositsandWithdrawals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateDepositsandWithdrawalsResponse {\n");
    
    sb.append("    depositsandWithdrawals: ").append(toIndentedString(depositsandWithdrawals)).append("\n");
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

