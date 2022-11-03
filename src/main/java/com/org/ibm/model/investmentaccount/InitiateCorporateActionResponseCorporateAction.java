package com.org.ibm.model.investmentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCorporateActionResponseCorporateAction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T08:01:24.054Z[GMT]")

public class InitiateCorporateActionResponseCorporateAction   {
  @JsonProperty("CorporateActionApplicationSchedule")
  private String corporateActionApplicationSchedule;

  @JsonProperty("CorporateActionInstrumentType")
  private String corporateActionInstrumentType;

  public InitiateCorporateActionResponseCorporateAction corporateActionApplicationSchedule(String corporateActionApplicationSchedule) {
    this.corporateActionApplicationSchedule = corporateActionApplicationSchedule;
    return this;
  }

  /**
   * Get corporateActionApplicationSchedule
   * @return corporateActionApplicationSchedule
  */
  @ApiModelProperty(value = "")


  public String getCorporateActionApplicationSchedule() {
    return corporateActionApplicationSchedule;
  }

  public void setCorporateActionApplicationSchedule(String corporateActionApplicationSchedule) {
    this.corporateActionApplicationSchedule = corporateActionApplicationSchedule;
  }

  public InitiateCorporateActionResponseCorporateAction corporateActionInstrumentType(String corporateActionInstrumentType) {
    this.corporateActionInstrumentType = corporateActionInstrumentType;
    return this;
  }

  /**
   * Get corporateActionInstrumentType
   * @return corporateActionInstrumentType
  */
  @ApiModelProperty(value = "")


  public String getCorporateActionInstrumentType() {
    return corporateActionInstrumentType;
  }

  public void setCorporateActionInstrumentType(String corporateActionInstrumentType) {
    this.corporateActionInstrumentType = corporateActionInstrumentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCorporateActionResponseCorporateAction initiateCorporateActionResponseCorporateAction = (InitiateCorporateActionResponseCorporateAction) o;
    return Objects.equals(this.corporateActionApplicationSchedule, initiateCorporateActionResponseCorporateAction.corporateActionApplicationSchedule) &&
        Objects.equals(this.corporateActionInstrumentType, initiateCorporateActionResponseCorporateAction.corporateActionInstrumentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporateActionApplicationSchedule, corporateActionInstrumentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCorporateActionResponseCorporateAction {\n");
    
    sb.append("    corporateActionApplicationSchedule: ").append(toIndentedString(corporateActionApplicationSchedule)).append("\n");
    sb.append("    corporateActionInstrumentType: ").append(toIndentedString(corporateActionInstrumentType)).append("\n");
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

