package com.flamechoon.rest.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
public class ResultData<T> {
  private PageInfo pageInfo;
  private T data;
}

