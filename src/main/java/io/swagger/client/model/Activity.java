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
import org.threeten.bp.OffsetDateTime;

/**
 * Activity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-07T18:50:05.195+01:00")
public class Activity {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("details")
  private String details = null;

  @SerializedName("action")
  private String action = null;

  @SerializedName("user")
  private Integer user = null;

  @SerializedName("userComment")
  private String userComment = null;

  @SerializedName("item")
  private Integer item = null;

  /**
   * Gets or Sets eventType
   */
  @JsonAdapter(EventTypeEnum.Adapter.class)
  public enum EventTypeEnum {
    CREATE("CREATE"),
    
    UPDATE("UPDATE"),
    
    DELETE("DELETE"),
    
    PUBLIC("PUBLIC"),
    
    BATCH_SUMMARY("BATCH_SUMMARY");

    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventTypeEnum fromValue(String text) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EventTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EventTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("eventType")
  private EventTypeEnum eventType = null;

  /**
   * Gets or Sets objectType
   */
  @JsonAdapter(ObjectTypeEnum.Adapter.class)
  public enum ObjectTypeEnum {
    PROJECT("PROJECT"),
    
    ITEM("ITEM"),
    
    USER("USER"),
    
    RELATIONSHIP("RELATIONSHIP"),
    
    COMMENT("COMMENT"),
    
    ITEM_TAG("ITEM_TAG"),
    
    TAG("TAG"),
    
    ITEM_ATTACHMENT("ITEM_ATTACHMENT"),
    
    URL("URL"),
    
    TEST_RESULT("TEST_RESULT"),
    
    BASELINE("BASELINE"),
    
    CHANGE_REQUEST("CHANGE_REQUEST"),
    
    REVIEW("REVIEW"),
    
    REVISION("REVISION"),
    
    REVISION_ITEM("REVISION_ITEM"),
    
    TEST_PLAN("TEST_PLAN"),
    
    TEST_CYCLE("TEST_CYCLE"),
    
    TEST_RUN("TEST_RUN"),
    
    INTEGRATION("INTEGRATION"),
    
    MISCELLANEOUS("MISCELLANEOUS");

    private String value;

    ObjectTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectTypeEnum fromValue(String text) {
      for (ObjectTypeEnum b : ObjectTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ObjectTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ObjectTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("objectType")
  private ObjectTypeEnum objectType = null;

  public Activity id(Integer id) {
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

  public Activity date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public Activity details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public Activity action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public Activity user(Integer user) {
    this.user = user;
    return this;
  }

   /**
   * ID of a user
   * @return user
  **/
  @ApiModelProperty(required = true, value = "ID of a user")
  public Integer getUser() {
    return user;
  }

  public void setUser(Integer user) {
    this.user = user;
  }

  public Activity userComment(String userComment) {
    this.userComment = userComment;
    return this;
  }

   /**
   * Get userComment
   * @return userComment
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUserComment() {
    return userComment;
  }

  public void setUserComment(String userComment) {
    this.userComment = userComment;
  }

  public Activity item(Integer item) {
    this.item = item;
    return this;
  }

   /**
   * ID of an item
   * @return item
  **/
  @ApiModelProperty(required = true, value = "ID of an item")
  public Integer getItem() {
    return item;
  }

  public void setItem(Integer item) {
    this.item = item;
  }

  public Activity eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @ApiModelProperty(required = true, value = "")
  public EventTypeEnum getEventType() {
    return eventType;
  }

  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }

  public Activity objectType(ObjectTypeEnum objectType) {
    this.objectType = objectType;
    return this;
  }

   /**
   * Get objectType
   * @return objectType
  **/
  @ApiModelProperty(required = true, value = "")
  public ObjectTypeEnum getObjectType() {
    return objectType;
  }

  public void setObjectType(ObjectTypeEnum objectType) {
    this.objectType = objectType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Activity activity = (Activity) o;
    return Objects.equals(this.id, activity.id) &&
        Objects.equals(this.date, activity.date) &&
        Objects.equals(this.details, activity.details) &&
        Objects.equals(this.action, activity.action) &&
        Objects.equals(this.user, activity.user) &&
        Objects.equals(this.userComment, activity.userComment) &&
        Objects.equals(this.item, activity.item) &&
        Objects.equals(this.eventType, activity.eventType) &&
        Objects.equals(this.objectType, activity.objectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, details, action, user, userComment, item, eventType, objectType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    userComment: ").append(toIndentedString(userComment)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
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
