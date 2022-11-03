package com.org.ibm.model.investmentaccount;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.ibm.model.investmentaccount.ExecuteCorporateActionRequestCorporateAction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteCorporateActionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-03T08:01:24.054Z[GMT]")

public class ExecuteCorporateActionRequest   {
  @JsonProperty("CorporateAction")
  private ExecuteCorporateActionRequestCorporateAction corporateAction;

  public ExecuteCorporateActionRequest corporateAction(ExecuteCorporateActionRequestCorporateAction corporateAction) {
    this.corporateAction = corporateAction;
    return this;
  }

  /**
   * Get corporateAction
   * @return corporateAction
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecuteCorporateActionRequestCorporateAction getCorporateAction() {
    return corporateAction;
  }

  public void setCorporateAction(ExecuteCorporateActionRequestCorporateAction corporateAction) {
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
    ExecuteCorporateActionRequest executeCorporateActionRequest = (ExecuteCorporateActionRequest) o;
    return Objects.equals(this.corporateAction, executeCorporateActionRequest.corporateAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporateAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteCorporateActionRequest {\n");
    
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

