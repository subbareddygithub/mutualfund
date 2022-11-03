package com.org.ibm.model.investmentportfoliomanagement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TradeInitiation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T08:01:20.154Z[GMT]")

public class TradeInitiation   {
  @JsonProperty("InvestmentPortfolioTradeRequest")
  private String investmentPortfolioTradeRequest;

  @JsonProperty("InvestmentPortfolioTradeSecurityType")
  private String investmentPortfolioTradeSecurityType;

  @JsonProperty("InvestmentPortfolioTradeSecurityTradeDescription")
  private String investmentPortfolioTradeSecurityTradeDescription;

  public TradeInitiation investmentPortfolioTradeRequest(String investmentPortfolioTradeRequest) {
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

  public TradeInitiation investmentPortfolioTradeSecurityType(String investmentPortfolioTradeSecurityType) {
    this.investmentPortfolioTradeSecurityType = investmentPortfolioTradeSecurityType;
    return this;
  }

  /**
   * Get investmentPortfolioTradeSecurityType
   * @return investmentPortfolioTradeSecurityType
  */
  @ApiModelProperty(value = "")


  public String getInvestmentPortfolioTradeSecurityType() {
    return investmentPortfolioTradeSecurityType;
  }

  public void setInvestmentPortfolioTradeSecurityType(String investmentPortfolioTradeSecurityType) {
    this.investmentPortfolioTradeSecurityType = investmentPortfolioTradeSecurityType;
  }

  public TradeInitiation investmentPortfolioTradeSecurityTradeDescription(String investmentPortfolioTradeSecurityTradeDescription) {
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
    TradeInitiation tradeInitiation = (TradeInitiation) o;
    return Objects.equals(this.investmentPortfolioTradeRequest, tradeInitiation.investmentPortfolioTradeRequest) &&
        Objects.equals(this.investmentPortfolioTradeSecurityType, tradeInitiation.investmentPortfolioTradeSecurityType) &&
        Objects.equals(this.investmentPortfolioTradeSecurityTradeDescription, tradeInitiation.investmentPortfolioTradeSecurityTradeDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investmentPortfolioTradeRequest, investmentPortfolioTradeSecurityType, investmentPortfolioTradeSecurityTradeDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeInitiation {\n");
    
    sb.append("    investmentPortfolioTradeRequest: ").append(toIndentedString(investmentPortfolioTradeRequest)).append("\n");
    sb.append("    investmentPortfolioTradeSecurityType: ").append(toIndentedString(investmentPortfolioTradeSecurityType)).append("\n");
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

