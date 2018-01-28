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
import java.io.IOException;

/**
 * EarnResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-01-28T15:32:32.821+02:00")
public class EarnResult {

    /**
   * Gets or Sets offerType
   */
  @JsonAdapter(OfferTypeEnum.Adapter.class)
  public enum OfferTypeEnum {
    
    EARNRESULT("EarnResult");

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
  @SerializedName("transaction_id")
  private String transactionId = null;
  @SerializedName("sender_address")
  private String senderAddress = null;
  
  public EarnResult offerType(OfferTypeEnum offerType) {
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
  
  public EarnResult transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  
  /**
  * Get transactionId
  * @return transactionId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }
  
  public EarnResult senderAddress(String senderAddress) {
    this.senderAddress = senderAddress;
    return this;
  }

  
  /**
  * Get senderAddress
  * @return senderAddress
  **/
  @ApiModelProperty(value = "")
  public String getSenderAddress() {
    return senderAddress;
  }
  public void setSenderAddress(String senderAddress) {
    this.senderAddress = senderAddress;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarnResult earnResult = (EarnResult) o;
    return Objects.equals(this.offerType, earnResult.offerType) &&
        Objects.equals(this.transactionId, earnResult.transactionId) &&
        Objects.equals(this.senderAddress, earnResult.senderAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerType, transactionId, senderAddress);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarnResult {\n");
    
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    senderAddress: ").append(toIndentedString(senderAddress)).append("\n");
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



