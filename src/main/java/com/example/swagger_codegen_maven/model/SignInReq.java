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
 * Request body for Sign-in
 */

@Schema(name = "SignInReq", description = "Request body for Sign-in")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class SignInReq implements Serializable {

  private static final long serialVersionUID = 1L;

  private String username;

  private String password;

  public SignInReq username(String username) {
    this.username = username;
    return this;
  }

  /**
   * username of the User
   * @return username
  */
  
  @Schema(name = "username", description = "username of the User", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public SignInReq password(String password) {
    this.password = password;
    return this;
  }

  /**
   * password of the User
   * @return password
  */
  
  @Schema(name = "password", description = "password of the User", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignInReq signInReq = (SignInReq) o;
    return Objects.equals(this.username, signInReq.username) &&
        Objects.equals(this.password, signInReq.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignInReq {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

