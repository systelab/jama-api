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
import io.swagger.client.model.RequestLocation;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * RequestItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-07T18:50:05.195+01:00")
public class RequestItem {
  @SerializedName("globalId")
  private String globalId = null;

  @SerializedName("project")
  private Integer project = null;

  @SerializedName("itemType")
  private Integer itemType = null;

  @SerializedName("childItemType")
  private Integer childItemType = null;

  @SerializedName("location")
  private RequestLocation location = null;

  @SerializedName("fields")
  private Map<String, Object> fields = new HashMap<String, Object>();

  public RequestItem globalId(String globalId) {
    this.globalId = globalId;
    return this;
  }

   /**
   * Must use override if you want to set this value on POST.
   * @return globalId
  **/
  @ApiModelProperty(value = "Must use override if you want to set this value on POST.")
  public String getGlobalId() {
    return globalId;
  }

  public void setGlobalId(String globalId) {
    this.globalId = globalId;
  }

  public RequestItem project(Integer project) {
    this.project = project;
    return this;
  }

   /**
   * Only required when creating a new item (POST).
   * @return project
  **/
  @ApiModelProperty(required = true, value = "Only required when creating a new item (POST).")
  public Integer getProject() {
    return project;
  }

  public void setProject(Integer project) {
    this.project = project;
  }

  public RequestItem itemType(Integer itemType) {
    this.itemType = itemType;
    return this;
  }

   /**
   * ID of an item type
   * @return itemType
  **/
  @ApiModelProperty(required = true, value = "ID of an item type")
  public Integer getItemType() {
    return itemType;
  }

  public void setItemType(Integer itemType) {
    this.itemType = itemType;
  }

  public RequestItem childItemType(Integer childItemType) {
    this.childItemType = childItemType;
    return this;
  }

   /**
   * ID of an item type
   * @return childItemType
  **/
  @ApiModelProperty(required = true, value = "ID of an item type")
  public Integer getChildItemType() {
    return childItemType;
  }

  public void setChildItemType(Integer childItemType) {
    this.childItemType = childItemType;
  }

  public RequestItem location(RequestLocation location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(required = true, value = "")
  public RequestLocation getLocation() {
    return location;
  }

  public void setLocation(RequestLocation location) {
    this.location = location;
  }

  public RequestItem fields(Map<String, Object> fields) {
    this.fields = fields;
    return this;
  }

  public RequestItem putFieldsItem(String key, Object fieldsItem) {
    this.fields.put(key, fieldsItem);
    return this;
  }

   /**
   * A map of field names to field values e.g. {\&quot;name\&quot;:\&quot;Sample Item\&quot;, \&quot;status\&quot;: 292, \&quot;release\&quot;: 2, \&quot;assigned\&quot;: 23}
   * @return fields
  **/
  @ApiModelProperty(required = true, value = "A map of field names to field values e.g. {\"name\":\"Sample Item\", \"status\": 292, \"release\": 2, \"assigned\": 23}")
  public Map<String, Object> getFields() {
    return fields;
  }

  public void setFields(Map<String, Object> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestItem requestItem = (RequestItem) o;
    return Objects.equals(this.globalId, requestItem.globalId) &&
        Objects.equals(this.project, requestItem.project) &&
        Objects.equals(this.itemType, requestItem.itemType) &&
        Objects.equals(this.childItemType, requestItem.childItemType) &&
        Objects.equals(this.location, requestItem.location) &&
        Objects.equals(this.fields, requestItem.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(globalId, project, itemType, childItemType, location, fields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestItem {\n");
    
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    childItemType: ").append(toIndentedString(childItemType)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

