package com.moviexx2.customer.service;

import com.moviexx2.customer.dto.ResponseData;
import com.moviexx2.customer.entity.OrderTransaction;

public interface OrderTransactionService {
    ResponseData addOrderTransaction(OrderTransaction request);
    ResponseData getOrderTransaction();
    ResponseData getOrderDetailsTransaction();
}