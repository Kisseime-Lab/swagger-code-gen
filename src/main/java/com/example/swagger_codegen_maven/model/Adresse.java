package com.example.swagger_codegen_maven.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Adresse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Adresse implements Serializable {

  private static final long serialVersionUID = 1L;

  private String city;

  private String libelle;

  private String zipCode;

  private Boolean deleted;

  private String deletedAt;

  public Adresse city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  
  @Schema(name = "city", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Adresse libelle(String libelle) {
    this.libelle = libelle;
    return this;
  }

  /**
   * Get libelle
   * @return libelle
  */
  
  @Schema(name = "libelle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("libelle")
  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  public Adresse zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * Get zipCode
   * @return zipCode
  */
  
  @Schema(name = "zipCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("zipCode")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public Adresse deleted(Boolean deleted) {
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

  public Adresse deletedAt(String deletedAt) {
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
    Adresse adresse = (Adresse) o;
    return Objects.equals(this.city, adresse.city) &&
        Objects.equals(this.libelle, adresse.libelle) &&
        Objects.equals(this.zipCode, adresse.zipCode) &&
        Objects.equals(this.deleted, adresse.deleted) &&
        Objects.equals(this.deletedAt, adresse.deletedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, libelle, zipCode, deleted, deletedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Adresse {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    libelle: ").append(toIndentedString(libelle)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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

