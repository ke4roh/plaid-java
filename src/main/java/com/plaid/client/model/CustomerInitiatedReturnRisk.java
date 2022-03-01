/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.79.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The object contains a risk score and a risk tier that evaluate the transaction return risk of an unauthorized debit. Common return codes in this category include: \&quot;R05\&quot;, \&quot;R07\&quot;, \&quot;R10\&quot;, \&quot;R11\&quot;, \&quot;R29\&quot;. These returns typically have a return time frame of up to 60 calendar days. During this period, the customer of financial institutions can dispute a transaction as unauthorized.
 */
@ApiModel(description = "The object contains a risk score and a risk tier that evaluate the transaction return risk of an unauthorized debit. Common return codes in this category include: \"R05\", \"R07\", \"R10\", \"R11\", \"R29\". These returns typically have a return time frame of up to 60 calendar days. During this period, the customer of financial institutions can dispute a transaction as unauthorized.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-01T23:05:06.764Z[GMT]")
public class CustomerInitiatedReturnRisk {
  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Integer score;

  public static final String SERIALIZED_NAME_RISK_TIER = "risk_tier";
  @SerializedName(SERIALIZED_NAME_RISK_TIER)
  private Integer riskTier;


  public CustomerInitiatedReturnRisk score(Integer score) {
    
    this.score = score;
    return this;
  }

   /**
   * A score from 0-99 that indicates the transaction return risk: a higher risk score suggests a higher return likelihood.
   * minimum: 0
   * maximum: 100
   * @return score
  **/
  @ApiModelProperty(required = true, value = "A score from 0-99 that indicates the transaction return risk: a higher risk score suggests a higher return likelihood.")

  public Integer getScore() {
    return score;
  }


  public void setScore(Integer score) {
    this.score = score;
  }


  public CustomerInitiatedReturnRisk riskTier(Integer riskTier) {
    
    this.riskTier = riskTier;
    return this;
  }

   /**
   * A tier corresponding to the projected likelihood that the transaction, if initiated, will be subject to a return.  In the &#x60;customer_initiated_return_risk&#x60; object, there are five risk tiers corresponding to the scores:   1: Predicted customer-initiated return incidence rate between 0.00% - 0.02%   2: Predicted customer-initiated return incidence rate between 0.02% - 0.05%   3: Predicted customer-initiated return incidence rate between 0.05% - 0.1%   4: Predicted customer-initiated return incidence rate between 0.1% - 0.5%   5: Predicted customer-initiated return incidence rate greater than 0.5% 
   * minimum: 1
   * maximum: 5
   * @return riskTier
  **/
  @ApiModelProperty(required = true, value = "A tier corresponding to the projected likelihood that the transaction, if initiated, will be subject to a return.  In the `customer_initiated_return_risk` object, there are five risk tiers corresponding to the scores:   1: Predicted customer-initiated return incidence rate between 0.00% - 0.02%   2: Predicted customer-initiated return incidence rate between 0.02% - 0.05%   3: Predicted customer-initiated return incidence rate between 0.05% - 0.1%   4: Predicted customer-initiated return incidence rate between 0.1% - 0.5%   5: Predicted customer-initiated return incidence rate greater than 0.5% ")

  public Integer getRiskTier() {
    return riskTier;
  }


  public void setRiskTier(Integer riskTier) {
    this.riskTier = riskTier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerInitiatedReturnRisk customerInitiatedReturnRisk = (CustomerInitiatedReturnRisk) o;
    return Objects.equals(this.score, customerInitiatedReturnRisk.score) &&
        Objects.equals(this.riskTier, customerInitiatedReturnRisk.riskTier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, riskTier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerInitiatedReturnRisk {\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    riskTier: ").append(toIndentedString(riskTier)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

