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
import java.util.ArrayList;
import java.util.List;

/**
 * BaselineParent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-07T18:50:05.195+01:00")
public class BaselineParent {
  @SerializedName("item")
  private List<Integer> item = null;

  @SerializedName("project")
  private Integer project = null;

  public BaselineParent item(List<Integer> item) {
    this.item = item;
    return this;
  }

  public BaselineParent addItemItem(Integer itemItem) {
    if (this.item == null) {
      this.item = new ArrayList<Integer>();
    }
    this.item.add(itemItem);
    return this;
  }

   /**
   * Item ID and version number for an item
   * @return item
  **/
  @ApiModelProperty(value = "Item ID and version number for an item")
  public List<Integer> getItem() {
    return item;
  }

  public void setItem(List<Integer> item) {
    this.item = item;
  }

  public BaselineParent project(Integer project) {
    this.project = project;
    return this;
  }

   /**
   * ID of a project
   * @return project
  **/
  @ApiModelProperty(value = "ID of a project")
  public Integer getProject() {
    return project;
  }

  public void setProject(Integer project) {
    this.project = project;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaselineParent baselineParent = (BaselineParent) o;
    return Objects.equals(this.item, baselineParent.item) &&
        Objects.equals(this.project, baselineParent.project);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, project);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaselineParent {\n");
    
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
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

