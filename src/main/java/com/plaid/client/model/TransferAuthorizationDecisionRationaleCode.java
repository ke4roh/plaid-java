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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * A code representing the rationale for approving or declining the proposed transfer. Possible values are:  &#x60;MANUALLY_VERIFIED_ITEM&#x60; – Item created via same-day micro deposits, limited information available. Plaid will offer &#x60;approved&#x60; as a transaction decision.  &#x60;LOGIN_REQUIRED&#x60; – Unable to collect the account information due to Item staleness. Can be rectified using Link in update mode. Plaid will offer &#x60;approved&#x60; as a transaction decision.  &#x60;ERROR&#x60; – Unable to collect the account information due to an error. Plaid will offer &#x60;approved&#x60; as a transaction decision.  &#x60;NSF&#x60; – Transaction likely to result in a return due to insufficient funds. Plaid will offer &#x60;declined&#x60; as a transaction decision.  &#x60;RISK&#x60; - Transaction is high-risk. Plaid will offer &#x60;declined&#x60; as a transaction decision.
 */
@JsonAdapter(TransferAuthorizationDecisionRationaleCode.Adapter.class)
public enum TransferAuthorizationDecisionRationaleCode {
  
  NSF("NSF"),
  
  RISK("RISK"),
  
  MANUALLY_VERIFIED_ITEM("MANUALLY_VERIFIED_ITEM"),
  
  LOGIN_REQUIRED("LOGIN_REQUIRED"),
  
  ERROR("ERROR"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TransferAuthorizationDecisionRationaleCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransferAuthorizationDecisionRationaleCode fromValue(String value) {
    for (TransferAuthorizationDecisionRationaleCode b : TransferAuthorizationDecisionRationaleCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return TransferAuthorizationDecisionRationaleCode.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<TransferAuthorizationDecisionRationaleCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransferAuthorizationDecisionRationaleCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransferAuthorizationDecisionRationaleCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransferAuthorizationDecisionRationaleCode.fromValue(value);
    }
  }
}

