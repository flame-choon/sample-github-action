package com.flamechoon.rest.customer.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {


  public List<String> getCustomers(){

    List<String> customerList = new ArrayList<>();

    customerList.add("HWANG");
    customerList.add("JIN");

    return customerList;
  }
}
