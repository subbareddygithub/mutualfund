package com.org.ibm.model.investmentportfoliomanagement;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Track
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T08:01:20.154Z[GMT]")

public class Track   {
  @JsonProperty("InvestmentPortfolioSecuritySensitivity")
  private String investmentPortfolioSecuritySensitivity;

  @JsonProperty("ProjectedValuation")
  private String projectedValuation;

  @JsonProperty("ProjectedPortfolioImpact")
  private String projectedPortfolioImpact;

  public Track investmentPortfolioSecuritySensitivity(String investmentPortfolioSecuritySensitivity) {
    this.investmentPortfolioSecuritySensitivity = investmentPortfolioSecuritySensitivity;
    return this;
  }

  /**
   * Get investmentPortfolioSecuritySensitivity
   * @return investmentPortfolioSecuritySensitivity
  */
  @ApiModelProperty(value = "")


  public String getInvestmentPortfolioSecuritySensitivity() {
    return investmentPortfolioSecuritySensitivity;
  }

  public void setInvestmentPortfolioSecuritySensitivity(String investmentPortfolioSecuritySensitivity) {
    this.investmentPortfolioSecuritySensitivity = investmentPortfolioSecuritySensitivity;
  }

  public Track projectedValuation(String projectedValuation) {
    this.projectedValuation = projectedValuation;
    return this;
  }

  /**
   * Get projectedValuation
   * @return projectedValuation
  */
  @ApiModelProperty(value = "")


  public String getProjectedValuation() {
    return projectedValuation;
  }

  public void setProjectedValuation(String projectedValuation) {
    this.projectedValuation = projectedValuation;
  }

  public Track projectedPortfolioImpact(String projectedPortfolioImpact) {
    this.projectedPortfolioImpact = projectedPortfolioImpact;
    return this;
  }

  /**
   * Get projectedPortfolioImpact
   * @return projectedPortfolioImpact
  */
  @ApiModelProperty(value = "")


  public String getProjectedPortfolioImpact() {
    return projectedPortfolioImpact;
  }

  public void setProjectedPortfolioImpact(String projectedPortfolioImpact) {
    this.projectedPortfolioImpact = projectedPortfolioImpact;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Track track = (Track) o;
    return Objects.equals(this.investmentPortfolioSecuritySensitivity, track.investmentPortfolioSecuritySensitivity) &&
        Objects.equals(this.projectedValuation, track.projectedValuation) &&
        Objects.equals(this.projectedPortfolioImpact, track.projectedPortfolioImpact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investmentPortfolioSecuritySensitivity, projectedValuation, projectedPortfolioImpact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Track {\n");
    
    sb.append("    investmentPortfolioSecuritySensitivity: ").append(toIndentedString(investmentPortfolioSecuritySensitivity)).append("\n");
    sb.append("    projectedValuation: ").append(toIndentedString(projectedValuation)).append("\n");
    sb.append("    projectedPortfolioImpact: ").append(toIndentedString(projectedPortfolioImpact)).append("\n");
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

