package com.org.ibm.model.investmentportfoliomanagement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T08:01:20.154Z[GMT]")

public class InitiateManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility   {
  @JsonProperty("InvestmentPortfolioTradingPolicies")
  private String investmentPortfolioTradingPolicies;

  @JsonProperty("InvestmentPortfolioPolicyLimitsandConstraints")
  private String investmentPortfolioPolicyLimitsandConstraints;

  @JsonProperty("InvestmentPortfolioHoldings")
  private String investmentPortfolioHoldings;

  @JsonProperty("InvestmentPortfolioSecurityType")
  private String investmentPortfolioSecurityType;

  @JsonProperty("InvestmentPortfolioSecurityHolding")
  private String investmentPortfolioSecurityHolding;

  public InitiateManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility investmentPortfolioTradingPolicies(String investmentPortfolioTradingPolicies) {
    this.investmentPortfolioTradingPolicies = investmentPortfolioTradingPolicies;
    return this;
  }

  /**
   * Get investmentPortfolioTradingPolicies
   * @return investmentPortfolioTradingPolicies
  */
  @ApiModelProperty(value = "")


  public String getInvestmentPortfolioTradingPolicies() {
    return investmentPortfolioTradingPolicies;
  }

  public void setInvestmentPortfolioTradingPolicies(String investmentPortfolioTradingPolicies) {
    this.investmentPortfolioTradingPolicies = investmentPortfolioTradingPolicies;
  }

  public InitiateManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility investmentPortfolioPolicyLimitsandConstraints(String investmentPortfolioPolicyLimitsandConstraints) {
    this.investmentPortfolioPolicyLimitsandConstraints = investmentPortfolioPolicyLimitsandConstraints;
    return this;
  }

  /**
   * Get investmentPortfolioPolicyLimitsandConstraints
   * @return investmentPortfolioPolicyLimitsandConstraints
  */
  @ApiModelProperty(value = "")


  public String getInvestmentPortfolioPolicyLimitsandConstraints() {
    return investmentPortfolioPolicyLimitsandConstraints;
  }

  public void setInvestmentPortfolioPolicyLimitsandConstraints(String investmentPortfolioPolicyLimitsandConstraints) {
    this.investmentPortfolioPolicyLimitsandConstraints = investmentPortfolioPolicyLimitsandConstraints;
  }

  public InitiateManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility investmentPortfolioHoldings(String investmentPortfolioHoldings) {
    this.investmentPortfolioHoldings = investmentPortfolioHoldings;
    return this;
  }

  /**
   * Get investmentPortfolioHoldings
   * @return investmentPortfolioHoldings
  */
  @ApiModelProperty(value = "")


  public String getInvestmentPortfolioHoldings() {
    return investmentPortfolioHoldings;
  }

  public void setInvestmentPortfolioHoldings(String investmentPortfolioHoldings) {
    this.investmentPortfolioHoldings = investmentPortfolioHoldings;
  }

  public InitiateManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility investmentPortfolioSecurityType(String investmentPortfolioSecurityType) {
    this.investmentPortfolioSecurityType = investmentPortfolioSecurityType;
    return this;
  }

  /**
   * Get investmentPortfolioSecurityType
   * @return investmentPortfolioSecurityType
  */
  @ApiModelProperty(value = "")


  public String getInvestmentPortfolioSecurityType() {
    return investmentPortfolioSecurityType;
  }

  public void setInvestmentPortfolioSecurityType(String investmentPortfolioSecurityType) {
    this.investmentPortfolioSecurityType = investmentPortfolioSecurityType;
  }

  public InitiateManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility investmentPortfolioSecurityHolding(String investmentPortfolioSecurityHolding) {
    this.investmentPortfolioSecurityHolding = investmentPortfolioSecurityHolding;
    return this;
  }

  /**
   * Get investmentPortfolioSecurityHolding
   * @return investmentPortfolioSecurityHolding
  */
  @ApiModelProperty(value = "")


  public String getInvestmentPortfolioSecurityHolding() {
    return investmentPortfolioSecurityHolding;
  }

  public void setInvestmentPortfolioSecurityHolding(String investmentPortfolioSecurityHolding) {
    this.investmentPortfolioSecurityHolding = investmentPortfolioSecurityHolding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility initiateManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility = (InitiateManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility) o;
    return Objects.equals(this.investmentPortfolioTradingPolicies, initiateManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility.investmentPortfolioTradingPolicies) &&
        Objects.equals(this.investmentPortfolioPolicyLimitsandConstraints, initiateManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility.investmentPortfolioPolicyLimitsandConstraints) &&
        Objects.equals(this.investmentPortfolioHoldings, initiateManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility.investmentPortfolioHoldings) &&
        Objects.equals(this.investmentPortfolioSecurityType, initiateManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility.investmentPortfolioSecurityType) &&
        Objects.equals(this.investmentPortfolioSecurityHolding, initiateManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility.investmentPortfolioSecurityHolding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investmentPortfolioTradingPolicies, investmentPortfolioPolicyLimitsandConstraints, investmentPortfolioHoldings, investmentPortfolioSecurityType, investmentPortfolioSecurityHolding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility {\n");
    
    sb.append("    investmentPortfolioTradingPolicies: ").append(toIndentedString(investmentPortfolioTradingPolicies)).append("\n");
    sb.append("    investmentPortfolioPolicyLimitsandConstraints: ").append(toIndentedString(investmentPortfolioPolicyLimitsandConstraints)).append("\n");
    sb.append("    investmentPortfolioHoldings: ").append(toIndentedString(investmentPortfolioHoldings)).append("\n");
    sb.append("    investmentPortfolioSecurityType: ").append(toIndentedString(investmentPortfolioSecurityType)).append("\n");
    sb.append("    investmentPortfolioSecurityHolding: ").append(toIndentedString(investmentPortfolioSecurityHolding)).append("\n");
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

