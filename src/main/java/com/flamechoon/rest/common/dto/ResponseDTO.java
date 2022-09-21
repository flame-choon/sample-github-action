package com.flamechoon.rest.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.flamechoon.rest.common.enums.ResponseCode;
import lombok.*;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseDTO<T> implements Serializable {

  private static final long serialVersionUID = 1L;

//  private Date timestamp = new Date();

  private Integer code;

  private String message;

  private T result;

  public ResponseDTO(ResponseCode responseCode) {
    init(responseCode);
  }

  public ResponseDTO(ResponseCode responseCode, T data) {
    init(responseCode);
    if(data instanceof Boolean) {
      this.result = (T) data;
    } else {
      this.result = (T) ResultData.builder()
        .data(data instanceof List ? data : Arrays.asList(data))
        .build();
    }
  }

  public ResponseDTO(ResponseCode responseCode, T data, PageInfo pageInfo) {
    init(responseCode);
    if(data instanceof Boolean) {
      this.result = (T) data;
    } else {
      this.result = (T) ResultData.builder()
        .data(data instanceof List ? data : Arrays.asList(data))
        .pageInfo(pageInfo)
        .build();
    }
  }

  private void init(ResponseCode responseCode) {
    this.code = responseCode.getCode();
    this.message = responseCode.getMessages();
  }

}
