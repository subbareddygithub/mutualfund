package com.org.ibm.model.investmentportfoliomanagement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.investmentportfoliomanagement.ExecuteManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteManagedInvestmentPortfolioFacilityResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T08:01:20.154Z[GMT]")

public class ExecuteManagedInvestmentPortfolioFacilityResponse   {
  @JsonProperty("ManagedInvestmentPortfolioFacility")
  private ExecuteManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility managedInvestmentPortfolioFacility;

  public ExecuteManagedInvestmentPortfolioFacilityResponse managedInvestmentPortfolioFacility(ExecuteManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility managedInvestmentPortfolioFacility) {
    this.managedInvestmentPortfolioFacility = managedInvestmentPortfolioFacility;
    return this;
  }

  /**
   * Get managedInvestmentPortfolioFacility
   * @return managedInvestmentPortfolioFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecuteManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility getManagedInvestmentPortfolioFacility() {
    return managedInvestmentPortfolioFacility;
  }

  public void setManagedInvestmentPortfolioFacility(ExecuteManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility managedInvestmentPortfolioFacility) {
    this.managedInvestmentPortfolioFacility = managedInvestmentPortfolioFacility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteManagedInvestmentPortfolioFacilityResponse executeManagedInvestmentPortfolioFacilityResponse = (ExecuteManagedInvestmentPortfolioFacilityResponse) o;
    return Objects.equals(this.managedInvestmentPortfolioFacility, executeManagedInvestmentPortfolioFacilityResponse.managedInvestmentPortfolioFacility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedInvestmentPortfolioFacility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteManagedInvestmentPortfolioFacilityResponse {\n");
    
    sb.append("    managedInvestmentPortfolioFacility: ").append(toIndentedString(managedInvestmentPortfolioFacility)).append("\n");
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

