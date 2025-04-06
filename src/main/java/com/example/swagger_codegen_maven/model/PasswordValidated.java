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
 * PasswordValidated
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PasswordValidated implements Serializable {

  private static final long serialVersionUID = 1L;

  private Boolean passwordValidated;

  public PasswordValidated passwordValidated(Boolean passwordValidated) {
    this.passwordValidated = passwordValidated;
    return this;
  }

  /**
   * Get passwordValidated
   * @return passwordValidated
  */
  
  @Schema(name = "passwordValidated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passwordValidated")
  public Boolean getPasswordValidated() {
    return passwordValidated;
  }

  public void setPasswordValidated(Boolean passwordValidated) {
    this.passwordValidated = passwordValidated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordValidated passwordValidated = (PasswordValidated) o;
    return Objects.equals(this.passwordValidated, passwordValidated.passwordValidated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passwordValidated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordValidated {\n");
    sb.append("    passwordValidated: ").append(toIndentedString(passwordValidated)).append("\n");
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

