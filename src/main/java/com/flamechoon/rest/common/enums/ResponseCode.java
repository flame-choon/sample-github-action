package com.flamechoon.rest.common.enums;

import lombok.Getter;

@Getter
public enum ResponseCode {
  OK(200, "OK"),
  BAD_REQUEST(400, "badRequest"),
  NOT_AUTHORIZATION(401, "noAuthorization"),
  ACCESS_DENY(403, "accessDeny"),
  NOT_FOUND(404, "notFound"),
  SERVER_ERROR(500, "internalServerError");

  private final int code;
  private final String messages;

  ResponseCode(int code, String messages) {
    this.code = code;
    this.messages = messages;
  }
}
