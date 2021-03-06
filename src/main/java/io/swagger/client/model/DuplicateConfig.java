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
 * DuplicateConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-07T18:50:05.195+01:00")
public class DuplicateConfig {
  @SerializedName("includeTags")
  private Boolean includeTags = null;

  @SerializedName("includeAttachments")
  private Boolean includeAttachments = null;

  @SerializedName("includeLinks")
  private Boolean includeLinks = null;

  public DuplicateConfig includeTags(Boolean includeTags) {
    this.includeTags = includeTags;
    return this;
  }

   /**
   * Get includeTags
   * @return includeTags
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludeTags() {
    return includeTags;
  }

  public void setIncludeTags(Boolean includeTags) {
    this.includeTags = includeTags;
  }

  public DuplicateConfig includeAttachments(Boolean includeAttachments) {
    this.includeAttachments = includeAttachments;
    return this;
  }

   /**
   * Get includeAttachments
   * @return includeAttachments
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludeAttachments() {
    return includeAttachments;
  }

  public void setIncludeAttachments(Boolean includeAttachments) {
    this.includeAttachments = includeAttachments;
  }

  public DuplicateConfig includeLinks(Boolean includeLinks) {
    this.includeLinks = includeLinks;
    return this;
  }

   /**
   * Get includeLinks
   * @return includeLinks
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludeLinks() {
    return includeLinks;
  }

  public void setIncludeLinks(Boolean includeLinks) {
    this.includeLinks = includeLinks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DuplicateConfig duplicateConfig = (DuplicateConfig) o;
    return Objects.equals(this.includeTags, duplicateConfig.includeTags) &&
        Objects.equals(this.includeAttachments, duplicateConfig.includeAttachments) &&
        Objects.equals(this.includeLinks, duplicateConfig.includeLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeTags, includeAttachments, includeLinks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DuplicateConfig {\n");
    
    sb.append("    includeTags: ").append(toIndentedString(includeTags)).append("\n");
    sb.append("    includeAttachments: ").append(toIndentedString(includeAttachments)).append("\n");
    sb.append("    includeLinks: ").append(toIndentedString(includeLinks)).append("\n");
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

