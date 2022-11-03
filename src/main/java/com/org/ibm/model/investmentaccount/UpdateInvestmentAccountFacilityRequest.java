package com.org.ibm.model.investmentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.investmentaccount.UpdateInvestmentAccountFacilityRequestInvestmentAccountFacility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateInvestmentAccountFacilityRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T08:01:24.054Z[GMT]")

public class UpdateInvestmentAccountFacilityRequest   {
  @JsonProperty("InvestmentAccountFacility")
  private UpdateInvestmentAccountFacilityRequestInvestmentAccountFacility investmentAccountFacility;

  public UpdateInvestmentAccountFacilityRequest investmentAccountFacility(UpdateInvestmentAccountFacilityRequestInvestmentAccountFacility investmentAccountFacility) {
    this.investmentAccountFacility = investmentAccountFacility;
    return this;
  }

  /**
   * Get investmentAccountFacility
   * @return investmentAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public UpdateInvestmentAccountFacilityRequestInvestmentAccountFacility getInvestmentAccountFacility() {
    return investmentAccountFacility;
  }

  public void setInvestmentAccountFacility(UpdateInvestmentAccountFacilityRequestInvestmentAccountFacility investmentAccountFacility) {
    this.investmentAccountFacility = investmentAccountFacility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateInvestmentAccountFacilityRequest updateInvestmentAccountFacilityRequest = (UpdateInvestmentAccountFacilityRequest) o;
    return Objects.equals(this.investmentAccountFacility, updateInvestmentAccountFacilityRequest.investmentAccountFacility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investmentAccountFacility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInvestmentAccountFacilityRequest {\n");
    
    sb.append("    investmentAccountFacility: ").append(toIndentedString(investmentAccountFacility)).append("\n");
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

