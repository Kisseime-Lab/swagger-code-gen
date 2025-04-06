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
 * Signed-in user information
 */

@Schema(name = "SignedInUser", description = "Signed-in user information")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class SignedInUser implements Serializable {

  private static final long serialVersionUID = 1L;

  private String refreshToken;

  private String accessToken;

  private String username;

  private String userId;

  private String role;

  public SignedInUser refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * Refresh Token
   * @return refreshToken
  */
  
  @Schema(name = "refreshToken", description = "Refresh Token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refreshToken")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public SignedInUser accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * JWT Token aka access token
   * @return accessToken
  */
  
  @Schema(name = "accessToken", description = "JWT Token aka access token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accessToken")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public SignedInUser username(String username) {
    this.username = username;
    return this;
  }

  /**
   * User Name
   * @return username
  */
  
  @Schema(name = "username", description = "User Name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public SignedInUser userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * User Identifier
   * @return userId
  */
  
  @Schema(name = "userId", description = "User Identifier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public SignedInUser role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  */
  
  @Schema(name = "role", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignedInUser signedInUser = (SignedInUser) o;
    return Objects.equals(this.refreshToken, signedInUser.refreshToken) &&
        Objects.equals(this.accessToken, signedInUser.accessToken) &&
        Objects.equals(this.username, signedInUser.username) &&
        Objects.equals(this.userId, signedInUser.userId) &&
        Objects.equals(this.role, signedInUser.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refreshToken, accessToken, username, userId, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignedInUser {\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

