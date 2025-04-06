package com.example.swagger_codegen_maven.model;

import java.net.URI;
import java.util.Objects;
import com.example.swagger_codegen_maven.model.Adresse;
import com.example.swagger_codegen_maven.model.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Annonce
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Annonce implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;

  private String createdAt = "";

  private String titre = "";

  private Adresse departure;

  private Adresse destination;

  @Valid
  private List<String> photos;

  private BigDecimal distance;

  private BigDecimal prix;

  private User author;

  private Boolean open;

  private BigDecimal offres;

  private String date;

  private Boolean deleted;

  private String deletedAt;

  public Annonce id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Annonce createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  
  @Schema(name = "createdAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdAt")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Annonce titre(String titre) {
    this.titre = titre;
    return this;
  }

  /**
   * Get titre
   * @return titre
  */
  
  @Schema(name = "titre", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("titre")
  public String getTitre() {
    return titre;
  }

  public void setTitre(String titre) {
    this.titre = titre;
  }

  public Annonce departure(Adresse departure) {
    this.departure = departure;
    return this;
  }

  /**
   * Get departure
   * @return departure
  */
  @Valid 
  @Schema(name = "departure", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("departure")
  public Adresse getDeparture() {
    return departure;
  }

  public void setDeparture(Adresse departure) {
    this.departure = departure;
  }

  public Annonce destination(Adresse destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Get destination
   * @return destination
  */
  @Valid 
  @Schema(name = "destination", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("destination")
  public Adresse getDestination() {
    return destination;
  }

  public void setDestination(Adresse destination) {
    this.destination = destination;
  }

  public Annonce photos(List<String> photos) {
    this.photos = photos;
    return this;
  }

  public Annonce addPhotosItem(String photosItem) {
    if (this.photos == null) {
      this.photos = new ArrayList<>();
    }
    this.photos.add(photosItem);
    return this;
  }

  /**
   * Get photos
   * @return photos
  */
  
  @Schema(name = "photos", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("photos")
  public List<String> getPhotos() {
    return photos;
  }

  public void setPhotos(List<String> photos) {
    this.photos = photos;
  }

  public Annonce distance(BigDecimal distance) {
    this.distance = distance;
    return this;
  }

  /**
   * Get distance
   * @return distance
  */
  @Valid 
  @Schema(name = "distance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("distance")
  public BigDecimal getDistance() {
    return distance;
  }

  public void setDistance(BigDecimal distance) {
    this.distance = distance;
  }

  public Annonce prix(BigDecimal prix) {
    this.prix = prix;
    return this;
  }

  /**
   * Get prix
   * @return prix
  */
  @Valid 
  @Schema(name = "prix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prix")
  public BigDecimal getPrix() {
    return prix;
  }

  public void setPrix(BigDecimal prix) {
    this.prix = prix;
  }

  public Annonce author(User author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
  */
  @Valid 
  @Schema(name = "author", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("author")
  public User getAuthor() {
    return author;
  }

  public void setAuthor(User author) {
    this.author = author;
  }

  public Annonce open(Boolean open) {
    this.open = open;
    return this;
  }

  /**
   * Get open
   * @return open
  */
  
  @Schema(name = "open", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("open")
  public Boolean getOpen() {
    return open;
  }

  public void setOpen(Boolean open) {
    this.open = open;
  }

  public Annonce offres(BigDecimal offres) {
    this.offres = offres;
    return this;
  }

  /**
   * Get offres
   * @return offres
  */
  @Valid 
  @Schema(name = "offres", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offres")
  public BigDecimal getOffres() {
    return offres;
  }

  public void setOffres(BigDecimal offres) {
    this.offres = offres;
  }

  public Annonce date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  
  @Schema(name = "date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Annonce deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Get deleted
   * @return deleted
  */
  
  @Schema(name = "deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public Annonce deletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

  /**
   * Get deletedAt
   * @return deletedAt
  */
  
  @Schema(name = "deletedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deletedAt")
  public String getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Annonce annonce = (Annonce) o;
    return Objects.equals(this.id, annonce.id) &&
        Objects.equals(this.createdAt, annonce.createdAt) &&
        Objects.equals(this.titre, annonce.titre) &&
        Objects.equals(this.departure, annonce.departure) &&
        Objects.equals(this.destination, annonce.destination) &&
        Objects.equals(this.photos, annonce.photos) &&
        Objects.equals(this.distance, annonce.distance) &&
        Objects.equals(this.prix, annonce.prix) &&
        Objects.equals(this.author, annonce.author) &&
        Objects.equals(this.open, annonce.open) &&
        Objects.equals(this.offres, annonce.offres) &&
        Objects.equals(this.date, annonce.date) &&
        Objects.equals(this.deleted, annonce.deleted) &&
        Objects.equals(this.deletedAt, annonce.deletedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, titre, departure, destination, photos, distance, prix, author, open, offres, date, deleted, deletedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Annonce {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    titre: ").append(toIndentedString(titre)).append("\n");
    sb.append("    departure: ").append(toIndentedString(departure)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    photos: ").append(toIndentedString(photos)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    prix: ").append(toIndentedString(prix)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    offres: ").append(toIndentedString(offres)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

