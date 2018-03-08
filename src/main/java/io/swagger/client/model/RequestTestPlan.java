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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * RequestTestPlan
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-07T18:50:05.195+01:00")
public class RequestTestPlan {
  @SerializedName("project")
  private Integer project = null;

  @SerializedName("fields")
  private Map<String, Object> fields = new HashMap<String, Object>();

  public RequestTestPlan project(Integer project) {
    this.project = project;
    return this;
  }

   /**
   * Only required when creating a new test plan (POST).
   * @return project
  **/
  @ApiModelProperty(required = true, value = "Only required when creating a new test plan (POST).")
  public Integer getProject() {
    return project;
  }

  public void setProject(Integer project) {
    this.project = project;
  }

  public RequestTestPlan fields(Map<String, Object> fields) {
    this.fields = fields;
    return this;
  }

  public RequestTestPlan putFieldsItem(String key, Object fieldsItem) {
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
    RequestTestPlan requestTestPlan = (RequestTestPlan) o;
    return Objects.equals(this.project, requestTestPlan.project) &&
        Objects.equals(this.fields, requestTestPlan.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, fields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestTestPlan {\n");
    
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
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

