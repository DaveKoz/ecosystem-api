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
import io.swagger.client.model.Offer;
import io.swagger.client.model.Paging;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * a list of offers
 */@ApiModel(description = "a list of offers")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-03-19T10:42:22.929+02:00")
public class OfferList {
@SerializedName("offers")
  private List<Offer> offers = new ArrayList<Offer>();
  @SerializedName("paging")
  private Paging paging = null;
  
  public OfferList offers(List<Offer> offers) {
    this.offers = offers;
    return this;
  }

  public OfferList addOffersItem(Offer offersItem) {
    
    this.offers.add(offersItem);
    return this;
  }
  
  /**
  * Get offers
  * @return offers
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Offer> getOffers() {
    return offers;
  }
  public void setOffers(List<Offer> offers) {
    this.offers = offers;
  }
  
  public OfferList paging(Paging paging) {
    this.paging = paging;
    return this;
  }

  
  /**
  * Get paging
  * @return paging
  **/
  @ApiModelProperty(value = "")
  public Paging getPaging() {
    return paging;
  }
  public void setPaging(Paging paging) {
    this.paging = paging;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferList offerList = (OfferList) o;
    return Objects.equals(this.offers, offerList.offers) &&
        Objects.equals(this.paging, offerList.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers, paging);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferList {\n");
    
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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



