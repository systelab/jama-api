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
 * RequestTransition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-07T18:50:05.195+01:00")
public class RequestTransition {
  @SerializedName("transitionId")
  private String transitionId = null;

  @SerializedName("comment")
  private String comment = null;

  public RequestTransition transitionId(String transitionId) {
    this.transitionId = transitionId;
    return this;
  }

   /**
   * Get transitionId
   * @return transitionId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTransitionId() {
    return transitionId;
  }

  public void setTransitionId(String transitionId) {
    this.transitionId = transitionId;
  }

  public RequestTransition comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(value = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestTransition requestTransition = (RequestTransition) o;
    return Objects.equals(this.transitionId, requestTransition.transitionId) &&
        Objects.equals(this.comment, requestTransition.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transitionId, comment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestTransition {\n");
    
    sb.append("    transitionId: ").append(toIndentedString(transitionId)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
