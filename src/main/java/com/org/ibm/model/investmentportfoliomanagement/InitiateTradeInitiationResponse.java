package com.org.ibm.model.investmentportfoliomanagement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.investmentportfoliomanagement.InitiateManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility;
import com.org.ibm.model.investmentportfoliomanagement.InitiateTradeInitiationResponseTradeInitiation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateTradeInitiationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T08:01:20.154Z[GMT]")

public class InitiateTradeInitiationResponse   {
  @JsonProperty("ManagedInvestmentPortfolioFacility")
  private InitiateManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility managedInvestmentPortfolioFacility;

  @JsonProperty("TradeInitiation")
  private InitiateTradeInitiationResponseTradeInitiation tradeInitiation;

  public InitiateTradeInitiationResponse managedInvestmentPortfolioFacility(InitiateManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility managedInvestmentPortfolioFacility) {
    this.managedInvestmentPortfolioFacility = managedInvestmentPortfolioFacility;
    return this;
  }

  /**
   * Get managedInvestmentPortfolioFacility
   * @return managedInvestmentPortfolioFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility getManagedInvestmentPortfolioFacility() {
    return managedInvestmentPortfolioFacility;
  }

  public void setManagedInvestmentPortfolioFacility(InitiateManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility managedInvestmentPortfolioFacility) {
    this.managedInvestmentPortfolioFacility = managedInvestmentPortfolioFacility;
  }

  public InitiateTradeInitiationResponse tradeInitiation(InitiateTradeInitiationResponseTradeInitiation tradeInitiation) {
    this.tradeInitiation = tradeInitiation;
    return this;
  }

  /**
   * Get tradeInitiation
   * @return tradeInitiation
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateTradeInitiationResponseTradeInitiation getTradeInitiation() {
    return tradeInitiation;
  }

  public void setTradeInitiation(InitiateTradeInitiationResponseTradeInitiation tradeInitiation) {
    this.tradeInitiation = tradeInitiation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateTradeInitiationResponse initiateTradeInitiationResponse = (InitiateTradeInitiationResponse) o;
    return Objects.equals(this.managedInvestmentPortfolioFacility, initiateTradeInitiationResponse.managedInvestmentPortfolioFacility) &&
        Objects.equals(this.tradeInitiation, initiateTradeInitiationResponse.tradeInitiation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedInvestmentPortfolioFacility, tradeInitiation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateTradeInitiationResponse {\n");
    
    sb.append("    managedInvestmentPortfolioFacility: ").append(toIndentedString(managedInvestmentPortfolioFacility)).append("\n");
    sb.append("    tradeInitiation: ").append(toIndentedString(tradeInitiation)).append("\n");
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

