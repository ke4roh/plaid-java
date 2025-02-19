/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.121.0
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
 * Fired when the status of an identity verification has been updated, which can be triggered via the dashboard or the API.
 */
@ApiModel(description = "Fired when the status of an identity verification has been updated, which can be triggered via the dashboard or the API.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-31T23:42:52.209921Z[Etc/UTC]")
public class IdentityVerificationStatusUpdatedWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_IDENTITY_VERIFICATION_ID = "identity_verification_id";
  @SerializedName(SERIALIZED_NAME_IDENTITY_VERIFICATION_ID)
  private Object identityVerificationId = null;


  public IdentityVerificationStatusUpdatedWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;IDENTITY_VERIFICATION&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`IDENTITY_VERIFICATION`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public IdentityVerificationStatusUpdatedWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;STATUS_UPDATED&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`STATUS_UPDATED`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public IdentityVerificationStatusUpdatedWebhook identityVerificationId(Object identityVerificationId) {
    
    this.identityVerificationId = identityVerificationId;
    return this;
  }

   /**
   * The ID of the associated Identity Verification attempt.
   * @return identityVerificationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ID of the associated Identity Verification attempt.")

  public Object getIdentityVerificationId() {
    return identityVerificationId;
  }


  public void setIdentityVerificationId(Object identityVerificationId) {
    this.identityVerificationId = identityVerificationId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityVerificationStatusUpdatedWebhook identityVerificationStatusUpdatedWebhook = (IdentityVerificationStatusUpdatedWebhook) o;
    return Objects.equals(this.webhookType, identityVerificationStatusUpdatedWebhook.webhookType) &&
        Objects.equals(this.webhookCode, identityVerificationStatusUpdatedWebhook.webhookCode) &&
        Objects.equals(this.identityVerificationId, identityVerificationStatusUpdatedWebhook.identityVerificationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, identityVerificationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityVerificationStatusUpdatedWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    identityVerificationId: ").append(toIndentedString(identityVerificationId)).append("\n");
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

