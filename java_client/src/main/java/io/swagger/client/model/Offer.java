/*
 * Kin Ecosystem
 * Apis for client to server interaction
 *
 * OpenAPI spec version: 1.0.0
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
import io.swagger.client.model.BlockchainData;
import java.io.IOException;

/**
 * offer details for the offer list
 */@ApiModel(description = "offer details for the offer list")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-03-19T10:42:22.929+02:00")
public class Offer {
@SerializedName("id")
  private String id = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("image")
  private String image = null;
  @SerializedName("amount")
  private Integer amount = null;
  
    /**
   * Gets or Sets offerType
   */
  @JsonAdapter(OfferTypeEnum.Adapter.class)
  public enum OfferTypeEnum {
    
    EARN("earn"),
    SPEND("spend");

    private String value;

    OfferTypeEnum(String value) {
      this.value = value;
    }
    
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public static OfferTypeEnum fromValue(String text) {
      for (OfferTypeEnum b : OfferTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    
    public static class Adapter extends TypeAdapter<OfferTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OfferTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OfferTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OfferTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @SerializedName("offer_type")
  private OfferTypeEnum offerType = null;
  
    /**
   * determines the type of data that appears in the content
   */
  @JsonAdapter(ContentTypeEnum.Adapter.class)
  public enum ContentTypeEnum {
    
    POLL("poll"),
    COUPON("coupon");

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }
    
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public static ContentTypeEnum fromValue(String text) {
      for (ContentTypeEnum b : ContentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    
    public static class Adapter extends TypeAdapter<ContentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ContentTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @SerializedName("content_type")
  private ContentTypeEnum contentType = null;
  @SerializedName("content")
  private String content = null;
  @SerializedName("blockchain_data")
  private BlockchainData blockchainData = null;
  
  public Offer id(String id) {
    this.id = id;
    return this;
  }

  
  /**
  * Get id
  * @return id
  **/
  @ApiModelProperty(example = "1231321", required = true, value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  
  public Offer title(String title) {
    this.title = title;
    return this;
  }

  
  /**
  * Get title
  * @return title
  **/
  @ApiModelProperty(example = "Spotify Subscription", required = true, value = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  
  public Offer description(String description) {
    this.description = description;
    return this;
  }

  
  /**
  * Get description
  * @return description
  **/
  @ApiModelProperty(example = "Get 30 days", required = true, value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  
  public Offer image(String image) {
    this.image = image;
    return this;
  }

  
  /**
  * Get image
  * @return image
  **/
  @ApiModelProperty(example = "http://xxx.www.zzz/image.jpg", required = true, value = "")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }
  
  public Offer amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  
  /**
  * Get amount
  * @return amount
  **/
  @ApiModelProperty(example = "300", required = true, value = "")
  public Integer getAmount() {
    return amount;
  }
  public void setAmount(Integer amount) {
    this.amount = amount;
  }
  
  public Offer offerType(OfferTypeEnum offerType) {
    this.offerType = offerType;
    return this;
  }

  
  /**
  * Get offerType
  * @return offerType
  **/
  @ApiModelProperty(required = true, value = "")
  public OfferTypeEnum getOfferType() {
    return offerType;
  }
  public void setOfferType(OfferTypeEnum offerType) {
    this.offerType = offerType;
  }
  
  public Offer contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

  
  /**
  * determines the type of data that appears in the content
  * @return contentType
  **/
  @ApiModelProperty(value = "determines the type of data that appears in the content")
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }
  
  public Offer content(String content) {
    this.content = content;
    return this;
  }

  
  /**
  * The coupon description or the poll payload - as serialized json
  * @return content
  **/
  @ApiModelProperty(required = true, value = "The coupon description or the poll payload - as serialized json")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  
  public Offer blockchainData(BlockchainData blockchainData) {
    this.blockchainData = blockchainData;
    return this;
  }

  
  /**
  * Get blockchainData
  * @return blockchainData
  **/
  @ApiModelProperty(value = "")
  public BlockchainData getBlockchainData() {
    return blockchainData;
  }
  public void setBlockchainData(BlockchainData blockchainData) {
    this.blockchainData = blockchainData;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Offer offer = (Offer) o;
    return Objects.equals(this.id, offer.id) &&
        Objects.equals(this.title, offer.title) &&
        Objects.equals(this.description, offer.description) &&
        Objects.equals(this.image, offer.image) &&
        Objects.equals(this.amount, offer.amount) &&
        Objects.equals(this.offerType, offer.offerType) &&
        Objects.equals(this.contentType, offer.contentType) &&
        Objects.equals(this.content, offer.content) &&
        Objects.equals(this.blockchainData, offer.blockchainData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, image, amount, offerType, contentType, content, blockchainData);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Offer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    blockchainData: ").append(toIndentedString(blockchainData)).append("\n");
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



