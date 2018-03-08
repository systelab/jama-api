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
 * RequestPickListOption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-07T18:50:05.195+01:00")
public class RequestPickListOption {
  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private String value = null;

  /**
   * Gets or Sets color
   */
  @JsonAdapter(ColorEnum.Adapter.class)
  public enum ColorEnum {
    _3C3C3C("3C3C3C"),
    
    AAAAAA("AAAAAA"),
    
    BBBBBB("BBBBBB"),
    
    CCCCCC("CCCCCC"),
    
    DDDDDD("DDDDDD"),
    
    EEEEEE("EEEEEE"),
    
    FFFFFF("FFFFFF"),
    
    E39191("E39191"),
    
    FFCC66("FFCC66"),
    
    FFFF66("FFFF66"),
    
    _9CE78C("9CE78C"),
    
    _9BDFFF("9BDFFF"),
    
    _9966FF("9966FF"),
    
    FF66FF("FF66FF"),
    
    FFCCCC("FFCCCC"),
    
    FFE9BC("FFE9BC"),
    
    FFFFCC("FFFFCC"),
    
    CCFFCC("CCFFCC"),
    
    CCFFFF("CCFFFF"),
    
    CAB4FF("CAB4FF"),
    
    F7C0FF("F7C0FF"),
    
    FBE4E3("FBE4E3"),
    
    FFF4DB("FFF4DB"),
    
    FFFFE1("FFFFE1"),
    
    E6FFE1("E6FFE1"),
    
    E9FFFF("E9FFFF"),
    
    EAEAFF("EAEAFF"),
    
    FDE3FF("FDE3FF");

    private String value;

    ColorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ColorEnum fromValue(String text) {
      for (ColorEnum b : ColorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ColorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ColorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ColorEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ColorEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("color")
  private ColorEnum color = null;

  @SerializedName("sortOrder")
  private Integer sortOrder = null;

  @SerializedName("default")
  private Boolean _default = null;

  public RequestPickListOption description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RequestPickListOption name(String name) {
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

  public RequestPickListOption value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public RequestPickListOption color(ColorEnum color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(value = "")
  public ColorEnum getColor() {
    return color;
  }

  public void setColor(ColorEnum color) {
    this.color = color;
  }

  public RequestPickListOption sortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @ApiModelProperty(value = "")
  public Integer getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  public RequestPickListOption _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @ApiModelProperty(value = "")
  public Boolean isDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestPickListOption requestPickListOption = (RequestPickListOption) o;
    return Objects.equals(this.description, requestPickListOption.description) &&
        Objects.equals(this.name, requestPickListOption.name) &&
        Objects.equals(this.value, requestPickListOption.value) &&
        Objects.equals(this.color, requestPickListOption.color) &&
        Objects.equals(this.sortOrder, requestPickListOption.sortOrder) &&
        Objects.equals(this._default, requestPickListOption._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, value, color, sortOrder, _default);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestPickListOption {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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

