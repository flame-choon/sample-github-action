package com.flamechoon.rest.customer.controller;

import com.flamechoon.rest.common.dto.ResponseDTO;
import com.flamechoon.rest.common.enums.ResponseCode;
import com.flamechoon.rest.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/customer")
public class CustomerController {

  @Autowired
  private CustomerService customerService;

  @GetMapping("/get")
  public ResponseDTO<List<String>> getCustomers(){
    return new ResponseDTO<>(ResponseCode.OK, customerService.getCustomers());
  }
}
