package com.moviexx2.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.moviexx2.customer.dto.OrderTransactionDTO;
import com.moviexx2.customer.dto.ResponseData;
import com.moviexx2.customer.entity.OrderTransaction;
import com.moviexx2.customer.repository.OrderTransactionRepository;

@Service
public class OrderTransactionServiceImpl implements OrderTransactionService {

    @Autowired
    OrderTransactionRepository repository;

    @Override
    public ResponseData addOrderTransaction(OrderTransaction request) {
        repository.save(request);
        return new ResponseData(HttpStatus.OK.value(),"Success", request);
    }

    @Override
    public ResponseData getOrderTransaction() {
        List<OrderTransaction> orderTransactions = repository.findAll();
        return new ResponseData(HttpStatus.OK.value(),"Success", orderTransactions);
    }

    @Override
    public ResponseData getOrderDetailsTransaction() {
        List<OrderTransactionDTO> orderTransactions = repository.getOrderDetails();
        return new ResponseData(HttpStatus.OK.value(),"Success", orderTransactions);
    }
}