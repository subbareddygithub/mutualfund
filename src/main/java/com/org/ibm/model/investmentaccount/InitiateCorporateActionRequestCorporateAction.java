package com.org.ibm.model.investmentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCorporateActionRequestCorporateAction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T08:01:24.054Z[GMT]")

public class InitiateCorporateActionRequestCorporateAction   {
  @JsonProperty("CorporateActionType")
  private String corporateActionType;

  @JsonProperty("CorporateActionApplicationSchedule")
  private String corporateActionApplicationSchedule;

  @JsonProperty("CorporateActionInstrumentType")
  private String corporateActionInstrumentType;

  public InitiateCorporateActionRequestCorporateAction corporateActionType(String corporateActionType) {
    this.corporateActionType = corporateActionType;
    return this;
  }

  /**
   * Get corporateActionType
   * @return corporateActionType
  */
  @ApiModelProperty(value = "")


  public String getCorporateActionType() {
    return corporateActionType;
  }

  public void setCorporateActionType(String corporateActionType) {
    this.corporateActionType = corporateActionType;
  }

  public InitiateCorporateActionRequestCorporateAction corporateActionApplicationSchedule(String corporateActionApplicationSchedule) {
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

  public InitiateCorporateActionRequestCorporateAction corporateActionInstrumentType(String corporateActionInstrumentType) {
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
    InitiateCorporateActionRequestCorporateAction initiateCorporateActionRequestCorporateAction = (InitiateCorporateActionRequestCorporateAction) o;
    return Objects.equals(this.corporateActionType, initiateCorporateActionRequestCorporateAction.corporateActionType) &&
        Objects.equals(this.corporateActionApplicationSchedule, initiateCorporateActionRequestCorporateAction.corporateActionApplicationSchedule) &&
        Objects.equals(this.corporateActionInstrumentType, initiateCorporateActionRequestCorporateAction.corporateActionInstrumentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporateActionType, corporateActionApplicationSchedule, corporateActionInstrumentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCorporateActionRequestCorporateAction {\n");
    
    sb.append("    corporateActionType: ").append(toIndentedString(corporateActionType)).append("\n");
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

