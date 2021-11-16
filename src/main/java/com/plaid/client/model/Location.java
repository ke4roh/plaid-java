/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.46.1
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
import java.math.BigDecimal;

/**
 * A representation of where a transaction took place
 */
@ApiModel(description = "A representation of where a transaction took place")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-10T01:11:28.812Z[GMT]")
public class Location {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_LAT = "lat";
  @SerializedName(SERIALIZED_NAME_LAT)
  private Double lat;

  public static final String SERIALIZED_NAME_LON = "lon";
  @SerializedName(SERIALIZED_NAME_LON)
  private Double lon;

  public static final String SERIALIZED_NAME_STORE_NUMBER = "store_number";
  @SerializedName(SERIALIZED_NAME_STORE_NUMBER)
  private String storeNumber;


  public Location address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * The street address where the transaction occurred.
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The street address where the transaction occurred.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public Location city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The city where the transaction occurred.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The city where the transaction occurred.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public Location region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * The region or state where the transaction occurred.
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The region or state where the transaction occurred.")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public Location postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code where the transaction occurred.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The postal code where the transaction occurred.")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public Location country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The ISO 3166-1 alpha-2 country code where the transaction occurred.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ISO 3166-1 alpha-2 country code where the transaction occurred.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public Location lat(Double lat) {
    
    this.lat = lat;
    return this;
  }

   /**
   * The latitude where the transaction occurred.
   * @return lat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The latitude where the transaction occurred.")

  public Double getLat() {
    return lat;
  }


  public void setLat(Double lat) {
    this.lat = lat;
  }


  public Location lon(Double lon) {
    
    this.lon = lon;
    return this;
  }

   /**
   * The longitude where the transaction occurred.
   * @return lon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The longitude where the transaction occurred.")

  public Double getLon() {
    return lon;
  }


  public void setLon(Double lon) {
    this.lon = lon;
  }


  public Location storeNumber(String storeNumber) {
    
    this.storeNumber = storeNumber;
    return this;
  }

   /**
   * The merchant defined store number where the transaction occurred.
   * @return storeNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The merchant defined store number where the transaction occurred.")

  public String getStoreNumber() {
    return storeNumber;
  }


  public void setStoreNumber(String storeNumber) {
    this.storeNumber = storeNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.address, location.address) &&
        Objects.equals(this.city, location.city) &&
        Objects.equals(this.region, location.region) &&
        Objects.equals(this.postalCode, location.postalCode) &&
        Objects.equals(this.country, location.country) &&
        Objects.equals(this.lat, location.lat) &&
        Objects.equals(this.lon, location.lon) &&
        Objects.equals(this.storeNumber, location.storeNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, city, region, postalCode, country, lat, lon, storeNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
    sb.append("    storeNumber: ").append(toIndentedString(storeNumber)).append("\n");
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

