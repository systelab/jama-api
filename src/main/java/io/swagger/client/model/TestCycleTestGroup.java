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
 * TestCycleTestGroup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-07T18:50:05.195+01:00")
public class TestCycleTestGroup {
  @SerializedName("testGroup")
  private Integer testGroup = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("assignedTo")
  private Integer assignedTo = null;

  @SerializedName("testCycle")
  private Integer testCycle = null;

  @SerializedName("type")
  private String type = null;

  public TestCycleTestGroup testGroup(Integer testGroup) {
    this.testGroup = testGroup;
    return this;
  }

   /**
   * Get testGroup
   * @return testGroup
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getTestGroup() {
    return testGroup;
  }

  public void setTestGroup(Integer testGroup) {
    this.testGroup = testGroup;
  }

  public TestCycleTestGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TestCycleTestGroup assignedTo(Integer assignedTo) {
    this.assignedTo = assignedTo;
    return this;
  }

   /**
   * ID of a user
   * @return assignedTo
  **/
  @ApiModelProperty(required = true, value = "ID of a user")
  public Integer getAssignedTo() {
    return assignedTo;
  }

  public void setAssignedTo(Integer assignedTo) {
    this.assignedTo = assignedTo;
  }

  public TestCycleTestGroup testCycle(Integer testCycle) {
    this.testCycle = testCycle;
    return this;
  }

   /**
   * Get testCycle
   * @return testCycle
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getTestCycle() {
    return testCycle;
  }

  public void setTestCycle(Integer testCycle) {
    this.testCycle = testCycle;
  }

  public TestCycleTestGroup type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestCycleTestGroup testCycleTestGroup = (TestCycleTestGroup) o;
    return Objects.equals(this.testGroup, testCycleTestGroup.testGroup) &&
        Objects.equals(this.name, testCycleTestGroup.name) &&
        Objects.equals(this.assignedTo, testCycleTestGroup.assignedTo) &&
        Objects.equals(this.testCycle, testCycleTestGroup.testCycle) &&
        Objects.equals(this.type, testCycleTestGroup.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testGroup, name, assignedTo, testCycle, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestCycleTestGroup {\n");
    
    sb.append("    testGroup: ").append(toIndentedString(testGroup)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    assignedTo: ").append(toIndentedString(assignedTo)).append("\n");
    sb.append("    testCycle: ").append(toIndentedString(testCycle)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

