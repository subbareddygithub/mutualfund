package com.org.ibm.model.investmentportfoliomanagement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateTradeInitiationResponseTradeInitiation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T08:01:20.154Z[GMT]")

public class InitiateTradeInitiationResponseTradeInitiation   {
  @JsonProperty("InvestmentPortfolioTradeRequest")
  private String investmentPortfolioTradeRequest;

  @JsonProperty("InvestmentPortfolioTradeSecurityTradeDescription")
  private String investmentPortfolioTradeSecurityTradeDescription;

  public InitiateTradeInitiationResponseTradeInitiation investmentPortfolioTradeRequest(String investmentPortfolioTradeRequest) {
    this.investmentPortfolioTradeRequest = investmentPortfolioTradeRequest;
    return this;
  }

  /**
   * Get investmentPortfolioTradeRequest
   * @return investmentPortfolioTradeRequest
  */
  @ApiModelProperty(value = "")


  public String getInvestmentPortfolioTradeRequest() {
    return investmentPortfolioTradeRequest;
  }

  public void setInvestmentPortfolioTradeRequest(String investmentPortfolioTradeRequest) {
    this.investmentPortfolioTradeRequest = investmentPortfolioTradeRequest;
  }

  public InitiateTradeInitiationResponseTradeInitiation investmentPortfolioTradeSecurityTradeDescription(String investmentPortfolioTradeSecurityTradeDescription) {
    this.investmentPortfolioTradeSecurityTradeDescription = investmentPortfolioTradeSecurityTradeDescription;
    return this;
  }

  /**
   * Get investmentPortfolioTradeSecurityTradeDescription
   * @return investmentPortfolioTradeSecurityTradeDescription
  */
  @ApiModelProperty(value = "")


  public String getInvestmentPortfolioTradeSecurityTradeDescription() {
    return investmentPortfolioTradeSecurityTradeDescription;
  }

  public void setInvestmentPortfolioTradeSecurityTradeDescription(String investmentPortfolioTradeSecurityTradeDescription) {
    this.investmentPortfolioTradeSecurityTradeDescription = investmentPortfolioTradeSecurityTradeDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateTradeInitiationResponseTradeInitiation initiateTradeInitiationResponseTradeInitiation = (InitiateTradeInitiationResponseTradeInitiation) o;
    return Objects.equals(this.investmentPortfolioTradeRequest, initiateTradeInitiationResponseTradeInitiation.investmentPortfolioTradeRequest) &&
        Objects.equals(this.investmentPortfolioTradeSecurityTradeDescription, initiateTradeInitiationResponseTradeInitiation.investmentPortfolioTradeSecurityTradeDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investmentPortfolioTradeRequest, investmentPortfolioTradeSecurityTradeDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateTradeInitiationResponseTradeInitiation {\n");
    
    sb.append("    investmentPortfolioTradeRequest: ").append(toIndentedString(investmentPortfolioTradeRequest)).append("\n");
    sb.append("    investmentPortfolioTradeSecurityTradeDescription: ").append(toIndentedString(investmentPortfolioTradeSecurityTradeDescription)).append("\n");
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

