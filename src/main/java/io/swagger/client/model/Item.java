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
import io.swagger.client.model.AllowedResource;
import io.swagger.client.model.Location;
import io.swagger.client.model.Lock;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * Item
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-07T18:50:05.195+01:00")
public class Item {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("documentKey")
  private String documentKey = null;

  @SerializedName("globalId")
  private String globalId = null;

  @SerializedName("project")
  private Integer project = null;

  @SerializedName("itemType")
  private Integer itemType = null;

  @SerializedName("childItemType")
  private Integer childItemType = null;

  @SerializedName("createdDate")
  private OffsetDateTime createdDate = null;

  @SerializedName("modifiedDate")
  private OffsetDateTime modifiedDate = null;

  @SerializedName("lastActivityDate")
  private OffsetDateTime lastActivityDate = null;

  @SerializedName("createdBy")
  private Integer createdBy = null;

  @SerializedName("modifiedBy")
  private Integer modifiedBy = null;

  @SerializedName("lock")
  private Lock lock = null;

  @SerializedName("location")
  private Location location = null;

  @SerializedName("resources")
  private Map<String, AllowedResource> resources = new HashMap<String, AllowedResource>();

  @SerializedName("fields")
  private Map<String, Object> fields = new HashMap<String, Object>();

  public Item id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Item documentKey(String documentKey) {
    this.documentKey = documentKey;
    return this;
  }

   /**
   * Get documentKey
   * @return documentKey
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDocumentKey() {
    return documentKey;
  }

  public void setDocumentKey(String documentKey) {
    this.documentKey = documentKey;
  }

  public Item globalId(String globalId) {
    this.globalId = globalId;
    return this;
  }

   /**
   * Get globalId
   * @return globalId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getGlobalId() {
    return globalId;
  }

  public void setGlobalId(String globalId) {
    this.globalId = globalId;
  }

  public Item project(Integer project) {
    this.project = project;
    return this;
  }

   /**
   * ID of a project
   * @return project
  **/
  @ApiModelProperty(required = true, value = "ID of a project")
  public Integer getProject() {
    return project;
  }

  public void setProject(Integer project) {
    this.project = project;
  }

  public Item itemType(Integer itemType) {
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

  public Item childItemType(Integer childItemType) {
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

  public Item createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public Item modifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public Item lastActivityDate(OffsetDateTime lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
    return this;
  }

   /**
   * Get lastActivityDate
   * @return lastActivityDate
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getLastActivityDate() {
    return lastActivityDate;
  }

  public void setLastActivityDate(OffsetDateTime lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
  }

  public Item createdBy(Integer createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * ID of a user
   * @return createdBy
  **/
  @ApiModelProperty(required = true, value = "ID of a user")
  public Integer getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }

  public Item modifiedBy(Integer modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * ID of a user
   * @return modifiedBy
  **/
  @ApiModelProperty(required = true, value = "ID of a user")
  public Integer getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(Integer modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public Item lock(Lock lock) {
    this.lock = lock;
    return this;
  }

   /**
   * Get lock
   * @return lock
  **/
  @ApiModelProperty(required = true, value = "")
  public Lock getLock() {
    return lock;
  }

  public void setLock(Lock lock) {
    this.lock = lock;
  }

  public Item location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(required = true, value = "")
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public Item resources(Map<String, AllowedResource> resources) {
    this.resources = resources;
    return this;
  }

  public Item putResourcesItem(String key, AllowedResource resourcesItem) {
    this.resources.put(key, resourcesItem);
    return this;
  }

   /**
   * A set of resources and allowed permissions
   * @return resources
  **/
  @ApiModelProperty(required = true, value = "A set of resources and allowed permissions")
  public Map<String, AllowedResource> getResources() {
    return resources;
  }

  public void setResources(Map<String, AllowedResource> resources) {
    this.resources = resources;
  }

  public Item fields(Map<String, Object> fields) {
    this.fields = fields;
    return this;
  }

  public Item putFieldsItem(String key, Object fieldsItem) {
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
    Item item = (Item) o;
    return Objects.equals(this.id, item.id) &&
        Objects.equals(this.documentKey, item.documentKey) &&
        Objects.equals(this.globalId, item.globalId) &&
        Objects.equals(this.project, item.project) &&
        Objects.equals(this.itemType, item.itemType) &&
        Objects.equals(this.childItemType, item.childItemType) &&
        Objects.equals(this.createdDate, item.createdDate) &&
        Objects.equals(this.modifiedDate, item.modifiedDate) &&
        Objects.equals(this.lastActivityDate, item.lastActivityDate) &&
        Objects.equals(this.createdBy, item.createdBy) &&
        Objects.equals(this.modifiedBy, item.modifiedBy) &&
        Objects.equals(this.lock, item.lock) &&
        Objects.equals(this.location, item.location) &&
        Objects.equals(this.resources, item.resources) &&
        Objects.equals(this.fields, item.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, documentKey, globalId, project, itemType, childItemType, createdDate, modifiedDate, lastActivityDate, createdBy, modifiedBy, lock, location, resources, fields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    documentKey: ").append(toIndentedString(documentKey)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    childItemType: ").append(toIndentedString(childItemType)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    lastActivityDate: ").append(toIndentedString(lastActivityDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    lock: ").append(toIndentedString(lock)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

