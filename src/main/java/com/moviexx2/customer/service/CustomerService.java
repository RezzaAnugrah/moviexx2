package com.moviexx2.customer.service;

import com.moviexx2.customer.dto.ResponseData;
import com.moviexx2.customer.entity.Customer;

public interface CustomerService {
    ResponseData addCustomer(Customer request);
    ResponseData getCustomer();
    
}