package com.org.ibm.model.investmentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.investmentaccount.InitiateCorporateActionResponseCorporateAction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCorporateActionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T08:01:24.054Z[GMT]")

public class InitiateCorporateActionResponse   {
  @JsonProperty("CorporateAction")
  private InitiateCorporateActionResponseCorporateAction corporateAction;

  public InitiateCorporateActionResponse corporateAction(InitiateCorporateActionResponseCorporateAction corporateAction) {
    this.corporateAction = corporateAction;
    return this;
  }

  /**
   * Get corporateAction
   * @return corporateAction
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateCorporateActionResponseCorporateAction getCorporateAction() {
    return corporateAction;
  }

  public void setCorporateAction(InitiateCorporateActionResponseCorporateAction corporateAction) {
    this.corporateAction = corporateAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCorporateActionResponse initiateCorporateActionResponse = (InitiateCorporateActionResponse) o;
    return Objects.equals(this.corporateAction, initiateCorporateActionResponse.corporateAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporateAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCorporateActionResponse {\n");
    
    sb.append("    corporateAction: ").append(toIndentedString(corporateAction)).append("\n");
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

