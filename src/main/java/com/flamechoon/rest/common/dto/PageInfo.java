package com.flamechoon.rest.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.math.BigInteger;


@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageInfo {
  private BigInteger pageNo;
  private BigInteger pageSize;
  private BigInteger totalCount;

  public PageInfo(BigInteger pageNo, BigInteger pageSize, BigInteger totalCount) {
    this.pageNo = pageNo;
    this.pageSize = pageSize;
    this.totalCount = totalCount;
  }
}