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
import io.swagger.client.model.Link;
import io.swagger.client.model.MetaListWrapper;
import io.swagger.client.model.TestRun;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TestRunDataListWrapper
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-07T18:50:05.195+01:00")
public class TestRunDataListWrapper {
  @SerializedName("data")
  private List<TestRun> data = null;

  @SerializedName("links")
  private Map<String, Link> links = null;

  @SerializedName("linked")
  private Map<String, Map<String, Object>> linked = null;

  @SerializedName("meta")
  private MetaListWrapper meta = null;

  public TestRunDataListWrapper data(List<TestRun> data) {
    this.data = data;
    return this;
  }

  public TestRunDataListWrapper addDataItem(TestRun dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<TestRun>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<TestRun> getData() {
    return data;
  }

  public void setData(List<TestRun> data) {
    this.data = data;
  }

  public TestRunDataListWrapper links(Map<String, Link> links) {
    this.links = links;
    return this;
  }

  public TestRunDataListWrapper putLinksItem(String key, Link linksItem) {
    if (this.links == null) {
      this.links = new HashMap<String, Link>();
    }
    this.links.put(key, linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public Map<String, Link> getLinks() {
    return links;
  }

  public void setLinks(Map<String, Link> links) {
    this.links = links;
  }

  public TestRunDataListWrapper linked(Map<String, Map<String, Object>> linked) {
    this.linked = linked;
    return this;
  }

  public TestRunDataListWrapper putLinkedItem(String key, Map<String, Object> linkedItem) {
    if (this.linked == null) {
      this.linked = new HashMap<String, Map<String, Object>>();
    }
    this.linked.put(key, linkedItem);
    return this;
  }

   /**
   * Get linked
   * @return linked
  **/
  @ApiModelProperty(value = "")
  public Map<String, Map<String, Object>> getLinked() {
    return linked;
  }

  public void setLinked(Map<String, Map<String, Object>> linked) {
    this.linked = linked;
  }

  public TestRunDataListWrapper meta(MetaListWrapper meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(value = "")
  public MetaListWrapper getMeta() {
    return meta;
  }

  public void setMeta(MetaListWrapper meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestRunDataListWrapper testRunDataListWrapper = (TestRunDataListWrapper) o;
    return Objects.equals(this.data, testRunDataListWrapper.data) &&
        Objects.equals(this.links, testRunDataListWrapper.links) &&
        Objects.equals(this.linked, testRunDataListWrapper.linked) &&
        Objects.equals(this.meta, testRunDataListWrapper.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, linked, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestRunDataListWrapper {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    linked: ").append(toIndentedString(linked)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

