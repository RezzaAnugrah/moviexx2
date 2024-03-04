package com.moviexx2.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.moviexx2.customer.dto.ResponseData;
import com.moviexx2.customer.entity.Customer;
import com.moviexx2.customer.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository repository;

    @Override
    public ResponseData addCustomer(Customer request) {
        repository.save(request);
        return new ResponseData(HttpStatus.OK.value(),"Success", request);
    }

    @Override
    public ResponseData getCustomer() {
        List<Customer> customers = repository.findAll();
        return new ResponseData(HttpStatus.OK.value(),"Success", customers);
    }   
}