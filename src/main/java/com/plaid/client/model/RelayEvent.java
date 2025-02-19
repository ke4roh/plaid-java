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
 * The webhook code indicating which endpoint was called. It can be one of &#x60;GET_CALLED&#x60;, &#x60;REFRESH_CALLED&#x60; or &#x60;AUDIT_COPY_CREATE_CALLED&#x60;.
 */
@JsonAdapter(RelayEvent.Adapter.class)
public enum RelayEvent {
  
  GET_CALLED("GET_CALLED"),
  
  REFRESH_CALLED("REFRESH_CALLED"),
  
  AUDIT_COPY_CREATE_CALLED("AUDIT_COPY_CREATE_CALLED"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  RelayEvent(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RelayEvent fromValue(String value) {
    for (RelayEvent b : RelayEvent.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return RelayEvent.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<RelayEvent> {
    @Override
    public void write(final JsonWriter jsonWriter, final RelayEvent enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RelayEvent read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RelayEvent.fromValue(value);
    }
  }
}

