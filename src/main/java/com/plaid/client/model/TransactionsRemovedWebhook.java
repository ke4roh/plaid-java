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
import com.plaid.client.model.Error;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Fired when transaction(s) for an Item are deleted. The deleted transaction IDs are included in the webhook payload. Plaid will typically check for deleted transaction data several times a day.
 */
@ApiModel(description = "Fired when transaction(s) for an Item are deleted. The deleted transaction IDs are included in the webhook payload. Plaid will typically check for deleted transaction data several times a day.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-15T21:50:59.429Z[GMT]")
public class TransactionsRemovedWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Error error;

  public static final String SERIALIZED_NAME_REMOVED_TRANSACTIONS = "removed_transactions";
  @SerializedName(SERIALIZED_NAME_REMOVED_TRANSACTIONS)
  private List<String> removedTransactions = new ArrayList<>();

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;


  public TransactionsRemovedWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;TRANSACTIONS&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`TRANSACTIONS`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public TransactionsRemovedWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;TRANSACTIONS_REMOVED&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`TRANSACTIONS_REMOVED`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public TransactionsRemovedWebhook error(Error error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Error getError() {
    return error;
  }


  public void setError(Error error) {
    this.error = error;
  }


  public TransactionsRemovedWebhook removedTransactions(List<String> removedTransactions) {
    
    this.removedTransactions = removedTransactions;
    return this;
  }

  public TransactionsRemovedWebhook addRemovedTransactionsItem(String removedTransactionsItem) {
    this.removedTransactions.add(removedTransactionsItem);
    return this;
  }

   /**
   * An array of &#x60;transaction_ids&#x60; corresponding to the removed transactions
   * @return removedTransactions
  **/
  @ApiModelProperty(required = true, value = "An array of `transaction_ids` corresponding to the removed transactions")

  public List<String> getRemovedTransactions() {
    return removedTransactions;
  }


  public void setRemovedTransactions(List<String> removedTransactions) {
    this.removedTransactions = removedTransactions;
  }


  public TransactionsRemovedWebhook itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "The `item_id` of the Item associated with this webhook, warning, or error")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsRemovedWebhook transactionsRemovedWebhook = (TransactionsRemovedWebhook) o;
    return Objects.equals(this.webhookType, transactionsRemovedWebhook.webhookType) &&
        Objects.equals(this.webhookCode, transactionsRemovedWebhook.webhookCode) &&
        Objects.equals(this.error, transactionsRemovedWebhook.error) &&
        Objects.equals(this.removedTransactions, transactionsRemovedWebhook.removedTransactions) &&
        Objects.equals(this.itemId, transactionsRemovedWebhook.itemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, error, removedTransactions, itemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsRemovedWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    removedTransactions: ").append(toIndentedString(removedTransactions)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

