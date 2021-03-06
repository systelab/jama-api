/*
 * Jama REST API
 * This is the documentation for the Jama REST API.
 *
 * OpenAPI spec version: latest
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DerivedDataFailure
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-07T18:50:05.195+01:00")
public class DerivedDataFailure {
  @SerializedName("itemId")
  private Integer itemId = null;

  @SerializedName("databaseValue")
  private Object databaseValue = null;

  @SerializedName("calculatedValue")
  private Object calculatedValue = null;

  public DerivedDataFailure itemId(Integer itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  @ApiModelProperty(value = "")
  public Integer getItemId() {
    return itemId;
  }

  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }

  public DerivedDataFailure databaseValue(Object databaseValue) {
    this.databaseValue = databaseValue;
    return this;
  }

   /**
   * Get databaseValue
   * @return databaseValue
  **/
  @ApiModelProperty(value = "")
  public Object getDatabaseValue() {
    return databaseValue;
  }

  public void setDatabaseValue(Object databaseValue) {
    this.databaseValue = databaseValue;
  }

  public DerivedDataFailure calculatedValue(Object calculatedValue) {
    this.calculatedValue = calculatedValue;
    return this;
  }

   /**
   * Get calculatedValue
   * @return calculatedValue
  **/
  @ApiModelProperty(value = "")
  public Object getCalculatedValue() {
    return calculatedValue;
  }

  public void setCalculatedValue(Object calculatedValue) {
    this.calculatedValue = calculatedValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DerivedDataFailure derivedDataFailure = (DerivedDataFailure) o;
    return Objects.equals(this.itemId, derivedDataFailure.itemId) &&
        Objects.equals(this.databaseValue, derivedDataFailure.databaseValue) &&
        Objects.equals(this.calculatedValue, derivedDataFailure.calculatedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, databaseValue, calculatedValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DerivedDataFailure {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    databaseValue: ").append(toIndentedString(databaseValue)).append("\n");
    sb.append("    calculatedValue: ").append(toIndentedString(calculatedValue)).append("\n");
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

