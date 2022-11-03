package com.org.ibm.model.investmentportfoliomanagement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T08:01:20.154Z[GMT]")

public class ExecuteManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility   {
  @JsonProperty("InvestmentPortfolioTradingPolicies")
  private String investmentPortfolioTradingPolicies;

  @JsonProperty("InvestmentPortfolioPolicyType")
  private String investmentPortfolioPolicyType;

  @JsonProperty("InvestmentPortfolioPolicyDescription")
  private String investmentPortfolioPolicyDescription;

  @JsonProperty("InvestmentPortfolioPolicyLimitsandConstraints")
  private String investmentPortfolioPolicyLimitsandConstraints;

  @JsonProperty("InvestmentPortfolioHoldings")
  private String investmentPortfolioHoldings;

  @JsonProperty("InvestmentPortfolioSecurityType")
  private String investmentPortfolioSecurityType;

  @JsonProperty("InvestmentPortfolioSecurityHolding")
  private String investmentPortfolioSecurityHolding;

  public ExecuteManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility investmentPortfolioTradingPolicies(String investmentPortfolioTradingPolicies) {
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

  public ExecuteManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility investmentPortfolioPolicyType(String investmentPortfolioPolicyType) {
    this.investmentPortfolioPolicyType = investmentPortfolioPolicyType;
    return this;
  }

  /**
   * Get investmentPortfolioPolicyType
   * @return investmentPortfolioPolicyType
  */
  @ApiModelProperty(value = "")


  public String getInvestmentPortfolioPolicyType() {
    return investmentPortfolioPolicyType;
  }

  public void setInvestmentPortfolioPolicyType(String investmentPortfolioPolicyType) {
    this.investmentPortfolioPolicyType = investmentPortfolioPolicyType;
  }

  public ExecuteManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility investmentPortfolioPolicyDescription(String investmentPortfolioPolicyDescription) {
    this.investmentPortfolioPolicyDescription = investmentPortfolioPolicyDescription;
    return this;
  }

  /**
   * Get investmentPortfolioPolicyDescription
   * @return investmentPortfolioPolicyDescription
  */
  @ApiModelProperty(value = "")


  public String getInvestmentPortfolioPolicyDescription() {
    return investmentPortfolioPolicyDescription;
  }

  public void setInvestmentPortfolioPolicyDescription(String investmentPortfolioPolicyDescription) {
    this.investmentPortfolioPolicyDescription = investmentPortfolioPolicyDescription;
  }

  public ExecuteManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility investmentPortfolioPolicyLimitsandConstraints(String investmentPortfolioPolicyLimitsandConstraints) {
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

  public ExecuteManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility investmentPortfolioHoldings(String investmentPortfolioHoldings) {
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

  public ExecuteManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility investmentPortfolioSecurityType(String investmentPortfolioSecurityType) {
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

  public ExecuteManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility investmentPortfolioSecurityHolding(String investmentPortfolioSecurityHolding) {
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
    ExecuteManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility executeManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility = (ExecuteManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility) o;
    return Objects.equals(this.investmentPortfolioTradingPolicies, executeManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility.investmentPortfolioTradingPolicies) &&
        Objects.equals(this.investmentPortfolioPolicyType, executeManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility.investmentPortfolioPolicyType) &&
        Objects.equals(this.investmentPortfolioPolicyDescription, executeManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility.investmentPortfolioPolicyDescription) &&
        Objects.equals(this.investmentPortfolioPolicyLimitsandConstraints, executeManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility.investmentPortfolioPolicyLimitsandConstraints) &&
        Objects.equals(this.investmentPortfolioHoldings, executeManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility.investmentPortfolioHoldings) &&
        Objects.equals(this.investmentPortfolioSecurityType, executeManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility.investmentPortfolioSecurityType) &&
        Objects.equals(this.investmentPortfolioSecurityHolding, executeManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility.investmentPortfolioSecurityHolding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investmentPortfolioTradingPolicies, investmentPortfolioPolicyType, investmentPortfolioPolicyDescription, investmentPortfolioPolicyLimitsandConstraints, investmentPortfolioHoldings, investmentPortfolioSecurityType, investmentPortfolioSecurityHolding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteManagedInvestmentPortfolioFacilityResponseManagedInvestmentPortfolioFacility {\n");
    
    sb.append("    investmentPortfolioTradingPolicies: ").append(toIndentedString(investmentPortfolioTradingPolicies)).append("\n");
    sb.append("    investmentPortfolioPolicyType: ").append(toIndentedString(investmentPortfolioPolicyType)).append("\n");
    sb.append("    investmentPortfolioPolicyDescription: ").append(toIndentedString(investmentPortfolioPolicyDescription)).append("\n");
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

