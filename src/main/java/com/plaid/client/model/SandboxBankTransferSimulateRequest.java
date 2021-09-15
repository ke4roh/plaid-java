/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.33.0
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
import com.plaid.client.model.BankTransferFailure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Defines the request schema for &#x60;/sandbox/bank_transfer/simulate&#x60;
 */
@ApiModel(description = "Defines the request schema for `/sandbox/bank_transfer/simulate`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-15T21:50:59.429Z[GMT]")
public class SandboxBankTransferSimulateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_BANK_TRANSFER_ID = "bank_transfer_id";
  @SerializedName(SERIALIZED_NAME_BANK_TRANSFER_ID)
  private String bankTransferId;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failure_reason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private BankTransferFailure failureReason;


  public SandboxBankTransferSimulateRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public SandboxBankTransferSimulateRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public SandboxBankTransferSimulateRequest bankTransferId(String bankTransferId) {
    
    this.bankTransferId = bankTransferId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a bank transfer.
   * @return bankTransferId
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for a bank transfer.")

  public String getBankTransferId() {
    return bankTransferId;
  }


  public void setBankTransferId(String bankTransferId) {
    this.bankTransferId = bankTransferId;
  }


  public SandboxBankTransferSimulateRequest eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * The asynchronous event to be simulated. May be: &#x60;posted&#x60;, &#x60;failed&#x60;, or &#x60;reversed&#x60;.  An error will be returned if the event type is incompatible with the current transfer status. Compatible status --&gt; event type transitions include:  &#x60;pending&#x60; --&gt; &#x60;failed&#x60;  &#x60;pending&#x60; --&gt; &#x60;posted&#x60;  &#x60;posted&#x60; --&gt; &#x60;reversed&#x60; 
   * @return eventType
  **/
  @ApiModelProperty(required = true, value = "The asynchronous event to be simulated. May be: `posted`, `failed`, or `reversed`.  An error will be returned if the event type is incompatible with the current transfer status. Compatible status --> event type transitions include:  `pending` --> `failed`  `pending` --> `posted`  `posted` --> `reversed` ")

  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public SandboxBankTransferSimulateRequest failureReason(BankTransferFailure failureReason) {
    
    this.failureReason = failureReason;
    return this;
  }

   /**
   * Get failureReason
   * @return failureReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BankTransferFailure getFailureReason() {
    return failureReason;
  }


  public void setFailureReason(BankTransferFailure failureReason) {
    this.failureReason = failureReason;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxBankTransferSimulateRequest sandboxBankTransferSimulateRequest = (SandboxBankTransferSimulateRequest) o;
    return Objects.equals(this.clientId, sandboxBankTransferSimulateRequest.clientId) &&
        Objects.equals(this.secret, sandboxBankTransferSimulateRequest.secret) &&
        Objects.equals(this.bankTransferId, sandboxBankTransferSimulateRequest.bankTransferId) &&
        Objects.equals(this.eventType, sandboxBankTransferSimulateRequest.eventType) &&
        Objects.equals(this.failureReason, sandboxBankTransferSimulateRequest.failureReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, bankTransferId, eventType, failureReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxBankTransferSimulateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    bankTransferId: ").append(toIndentedString(bankTransferId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
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

