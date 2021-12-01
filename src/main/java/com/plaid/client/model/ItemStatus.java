/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.54.2
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
import com.plaid.client.model.ItemStatusInvestments;
import com.plaid.client.model.ItemStatusLastWebhook;
import com.plaid.client.model.ItemStatusTransactions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An object with information about the status of the Item.
 */
@ApiModel(description = "An object with information about the status of the Item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-01T18:55:04.982Z[GMT]")
public class ItemStatus {
  public static final String SERIALIZED_NAME_INVESTMENTS = "investments";
  @SerializedName(SERIALIZED_NAME_INVESTMENTS)
  private ItemStatusInvestments investments;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private ItemStatusTransactions transactions;

  public static final String SERIALIZED_NAME_LAST_WEBHOOK = "last_webhook";
  @SerializedName(SERIALIZED_NAME_LAST_WEBHOOK)
  private ItemStatusLastWebhook lastWebhook;


  public ItemStatus investments(ItemStatusInvestments investments) {
    
    this.investments = investments;
    return this;
  }

   /**
   * Get investments
   * @return investments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ItemStatusInvestments getInvestments() {
    return investments;
  }


  public void setInvestments(ItemStatusInvestments investments) {
    this.investments = investments;
  }


  public ItemStatus transactions(ItemStatusTransactions transactions) {
    
    this.transactions = transactions;
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ItemStatusTransactions getTransactions() {
    return transactions;
  }


  public void setTransactions(ItemStatusTransactions transactions) {
    this.transactions = transactions;
  }


  public ItemStatus lastWebhook(ItemStatusLastWebhook lastWebhook) {
    
    this.lastWebhook = lastWebhook;
    return this;
  }

   /**
   * Get lastWebhook
   * @return lastWebhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ItemStatusLastWebhook getLastWebhook() {
    return lastWebhook;
  }


  public void setLastWebhook(ItemStatusLastWebhook lastWebhook) {
    this.lastWebhook = lastWebhook;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemStatus itemStatus = (ItemStatus) o;
    return Objects.equals(this.investments, itemStatus.investments) &&
        Objects.equals(this.transactions, itemStatus.transactions) &&
        Objects.equals(this.lastWebhook, itemStatus.lastWebhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investments, transactions, lastWebhook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemStatus {\n");
    sb.append("    investments: ").append(toIndentedString(investments)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    lastWebhook: ").append(toIndentedString(lastWebhook)).append("\n");
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

