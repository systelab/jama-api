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
import io.swagger.client.model.ContentDisposition;
import io.swagger.client.model.MediaType;
import io.swagger.client.model.MessageBodyWorkers;
import io.swagger.client.model.MultiPart;
import io.swagger.client.model.ParameterizedHeader;
import io.swagger.client.model.Providers;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * BodyPart
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-07T18:50:05.195+01:00")
public class BodyPart {
  @SerializedName("contentDisposition")
  private ContentDisposition contentDisposition = null;

  @SerializedName("entity")
  private Object entity = null;

  @SerializedName("headers")
  private Map<String, List<String>> headers = null;

  @SerializedName("mediaType")
  private MediaType mediaType = null;

  @SerializedName("messageBodyWorkers")
  private MessageBodyWorkers messageBodyWorkers = null;

  @SerializedName("parent")
  private MultiPart parent = null;

  @SerializedName("providers")
  private Providers providers = null;

  @SerializedName("parameterizedHeaders")
  private Map<String, List<ParameterizedHeader>> parameterizedHeaders = null;

  public BodyPart contentDisposition(ContentDisposition contentDisposition) {
    this.contentDisposition = contentDisposition;
    return this;
  }

   /**
   * Get contentDisposition
   * @return contentDisposition
  **/
  @ApiModelProperty(value = "")
  public ContentDisposition getContentDisposition() {
    return contentDisposition;
  }

  public void setContentDisposition(ContentDisposition contentDisposition) {
    this.contentDisposition = contentDisposition;
  }

  public BodyPart entity(Object entity) {
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @ApiModelProperty(value = "")
  public Object getEntity() {
    return entity;
  }

  public void setEntity(Object entity) {
    this.entity = entity;
  }

  public BodyPart headers(Map<String, List<String>> headers) {
    this.headers = headers;
    return this;
  }

  public BodyPart putHeadersItem(String key, List<String> headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<String, List<String>>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @ApiModelProperty(value = "")
  public Map<String, List<String>> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, List<String>> headers) {
    this.headers = headers;
  }

  public BodyPart mediaType(MediaType mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  @ApiModelProperty(value = "")
  public MediaType getMediaType() {
    return mediaType;
  }

  public void setMediaType(MediaType mediaType) {
    this.mediaType = mediaType;
  }

  public BodyPart messageBodyWorkers(MessageBodyWorkers messageBodyWorkers) {
    this.messageBodyWorkers = messageBodyWorkers;
    return this;
  }

   /**
   * Get messageBodyWorkers
   * @return messageBodyWorkers
  **/
  @ApiModelProperty(value = "")
  public MessageBodyWorkers getMessageBodyWorkers() {
    return messageBodyWorkers;
  }

  public void setMessageBodyWorkers(MessageBodyWorkers messageBodyWorkers) {
    this.messageBodyWorkers = messageBodyWorkers;
  }

  public BodyPart parent(MultiPart parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @ApiModelProperty(value = "")
  public MultiPart getParent() {
    return parent;
  }

  public void setParent(MultiPart parent) {
    this.parent = parent;
  }

  public BodyPart providers(Providers providers) {
    this.providers = providers;
    return this;
  }

   /**
   * Get providers
   * @return providers
  **/
  @ApiModelProperty(value = "")
  public Providers getProviders() {
    return providers;
  }

  public void setProviders(Providers providers) {
    this.providers = providers;
  }

  public BodyPart parameterizedHeaders(Map<String, List<ParameterizedHeader>> parameterizedHeaders) {
    this.parameterizedHeaders = parameterizedHeaders;
    return this;
  }

  public BodyPart putParameterizedHeadersItem(String key, List<ParameterizedHeader> parameterizedHeadersItem) {
    if (this.parameterizedHeaders == null) {
      this.parameterizedHeaders = new HashMap<String, List<ParameterizedHeader>>();
    }
    this.parameterizedHeaders.put(key, parameterizedHeadersItem);
    return this;
  }

   /**
   * Get parameterizedHeaders
   * @return parameterizedHeaders
  **/
  @ApiModelProperty(value = "")
  public Map<String, List<ParameterizedHeader>> getParameterizedHeaders() {
    return parameterizedHeaders;
  }

  public void setParameterizedHeaders(Map<String, List<ParameterizedHeader>> parameterizedHeaders) {
    this.parameterizedHeaders = parameterizedHeaders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BodyPart bodyPart = (BodyPart) o;
    return Objects.equals(this.contentDisposition, bodyPart.contentDisposition) &&
        Objects.equals(this.entity, bodyPart.entity) &&
        Objects.equals(this.headers, bodyPart.headers) &&
        Objects.equals(this.mediaType, bodyPart.mediaType) &&
        Objects.equals(this.messageBodyWorkers, bodyPart.messageBodyWorkers) &&
        Objects.equals(this.parent, bodyPart.parent) &&
        Objects.equals(this.providers, bodyPart.providers) &&
        Objects.equals(this.parameterizedHeaders, bodyPart.parameterizedHeaders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentDisposition, entity, headers, mediaType, messageBodyWorkers, parent, providers, parameterizedHeaders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BodyPart {\n");
    
    sb.append("    contentDisposition: ").append(toIndentedString(contentDisposition)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    messageBodyWorkers: ").append(toIndentedString(messageBodyWorkers)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    parameterizedHeaders: ").append(toIndentedString(parameterizedHeaders)).append("\n");
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

