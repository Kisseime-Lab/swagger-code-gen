package com.example.swagger_codegen_maven.model;

import java.net.URI;
import java.util.Objects;
import com.example.swagger_codegen_maven.model.Annonce;
import com.example.swagger_codegen_maven.model.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Offre
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Offre implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;

  private String createdAt = "";

  private BigDecimal prix;

  private User author;

  private Annonce annonce;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    REFUSED("REFUSED"),
    
    ACCEPTED("ACCEPTED"),
    
    PENDING("PENDING");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private String date;

  private Boolean deleted;

  private String deletedAt;

  public Offre id(String id) {
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

  public Offre createdAt(String createdAt) {
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

  public Offre prix(BigDecimal prix) {
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

  public Offre author(User author) {
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

  public Offre annonce(Annonce annonce) {
    this.annonce = annonce;
    return this;
  }

  /**
   * Get annonce
   * @return annonce
  */
  @Valid 
  @Schema(name = "annonce", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("annonce")
  public Annonce getAnnonce() {
    return annonce;
  }

  public void setAnnonce(Annonce annonce) {
    this.annonce = annonce;
  }

  public Offre status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Offre date(String date) {
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

  public Offre deleted(Boolean deleted) {
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

  public Offre deletedAt(String deletedAt) {
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
    Offre offre = (Offre) o;
    return Objects.equals(this.id, offre.id) &&
        Objects.equals(this.createdAt, offre.createdAt) &&
        Objects.equals(this.prix, offre.prix) &&
        Objects.equals(this.author, offre.author) &&
        Objects.equals(this.annonce, offre.annonce) &&
        Objects.equals(this.status, offre.status) &&
        Objects.equals(this.date, offre.date) &&
        Objects.equals(this.deleted, offre.deleted) &&
        Objects.equals(this.deletedAt, offre.deletedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, prix, author, annonce, status, date, deleted, deletedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Offre {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    prix: ").append(toIndentedString(prix)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    annonce: ").append(toIndentedString(annonce)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

