package com.org.ibm.model.investmentportfoliomanagement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MarketOpportunities
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T08:01:20.154Z[GMT]")

public class MarketOpportunities   {
  @JsonProperty("MarketOpportunityDescription")
  private String marketOpportunityDescription;

  @JsonProperty("SecuritiesComparison")
  private String securitiesComparison;

  public MarketOpportunities marketOpportunityDescription(String marketOpportunityDescription) {
    this.marketOpportunityDescription = marketOpportunityDescription;
    return this;
  }

  /**
   * Get marketOpportunityDescription
   * @return marketOpportunityDescription
  */
  @ApiModelProperty(value = "")


  public String getMarketOpportunityDescription() {
    return marketOpportunityDescription;
  }

  public void setMarketOpportunityDescription(String marketOpportunityDescription) {
    this.marketOpportunityDescription = marketOpportunityDescription;
  }

  public MarketOpportunities securitiesComparison(String securitiesComparison) {
    this.securitiesComparison = securitiesComparison;
    return this;
  }

  /**
   * Get securitiesComparison
   * @return securitiesComparison
  */
  @ApiModelProperty(value = "")


  public String getSecuritiesComparison() {
    return securitiesComparison;
  }

  public void setSecuritiesComparison(String securitiesComparison) {
    this.securitiesComparison = securitiesComparison;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketOpportunities marketOpportunities = (MarketOpportunities) o;
    return Objects.equals(this.marketOpportunityDescription, marketOpportunities.marketOpportunityDescription) &&
        Objects.equals(this.securitiesComparison, marketOpportunities.securitiesComparison);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketOpportunityDescription, securitiesComparison);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketOpportunities {\n");
    
    sb.append("    marketOpportunityDescription: ").append(toIndentedString(marketOpportunityDescription)).append("\n");
    sb.append("    securitiesComparison: ").append(toIndentedString(securitiesComparison)).append("\n");
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

