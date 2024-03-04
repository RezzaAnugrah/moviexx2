package com.moviexx2.customer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.moviexx2.customer.dto.OrderTransactionDTO;
import com.moviexx2.customer.entity.OrderTransaction;

// @Repository
public interface OrderTransactionRepository extends JpaRepository<OrderTransaction, Integer> {

    @Query(
        value = "SELECT new com.moviexx2.customer.dto.OrderTransactionDTO("+
        " ot.id, "+
        " cs.customerID, "+
        " cs.name as customerName, "+
        " cs.email, "+
        " ot.movieID, "+
        " mv.name as movieName, "+
        " mv.type, "+
        " ot.roomID, "+
        " rm.name as roomName, "+
        " ot.transactionDate, "+
        " ot.seatNo "+
        ")"+
        " FROM OrderTransaction ot "+
        " LEFT JOIN Customer cs on cs.customerID = ot.customerID " + 
        " LEFT JOIN Movies mv on mv.movieID = ot.movieID " + 
        " LEFT JOIN Room rm on rm.roomID = ot.roomID " + 
        " WHERE 1=1 " + 
        " ORDER BY ot.transactionDate DESC " 
    
    )
    List<OrderTransactionDTO> getOrderDetails();
}
