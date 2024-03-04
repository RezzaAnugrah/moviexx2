package com.moviexx2.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviexx2.customer.dto.ResponseData;
import com.moviexx2.customer.entity.Customer;
import com.moviexx2.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService service;
 
    @GetMapping (value = {"", "/"})
    public ResponseEntity<?> getList(){
        try {
            ResponseData responseData = service.getCustomer();
            return ResponseEntity.status(responseData.getStatus()).body(responseData);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @PostMapping (value = {"", "/"})
    public ResponseEntity<?> save(@RequestBody Customer request){
        try {
            ResponseData responseData = service.addCustomer(request);
            return ResponseEntity.status(responseData.getStatus()).body(responseData);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
