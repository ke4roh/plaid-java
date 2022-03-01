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
 * An object containing a set of ids related to an employee
 */
@ApiModel(description = "An object containing a set of ids related to an employee")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-01T23:05:06.764Z[GMT]")
public class PlatformIds {
  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employee_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_PAYROLL_ID = "payroll_id";
  @SerializedName(SERIALIZED_NAME_PAYROLL_ID)
  private String payrollId;

  public static final String SERIALIZED_NAME_POSITION_ID = "position_id";
  @SerializedName(SERIALIZED_NAME_POSITION_ID)
  private String positionId;


  public PlatformIds employeeId(String employeeId) {
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * The ID of an employee as given by their employer
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of an employee as given by their employer")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }


  public PlatformIds payrollId(String payrollId) {
    
    this.payrollId = payrollId;
    return this;
  }

   /**
   * The ID of an employee as given by their payroll
   * @return payrollId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of an employee as given by their payroll")

  public String getPayrollId() {
    return payrollId;
  }


  public void setPayrollId(String payrollId) {
    this.payrollId = payrollId;
  }


  public PlatformIds positionId(String positionId) {
    
    this.positionId = positionId;
    return this;
  }

   /**
   * The ID of the position of the employee
   * @return positionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the position of the employee")

  public String getPositionId() {
    return positionId;
  }


  public void setPositionId(String positionId) {
    this.positionId = positionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatformIds platformIds = (PlatformIds) o;
    return Objects.equals(this.employeeId, platformIds.employeeId) &&
        Objects.equals(this.payrollId, platformIds.payrollId) &&
        Objects.equals(this.positionId, platformIds.positionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, payrollId, positionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatformIds {\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    payrollId: ").append(toIndentedString(payrollId)).append("\n");
    sb.append("    positionId: ").append(toIndentedString(positionId)).append("\n");
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

