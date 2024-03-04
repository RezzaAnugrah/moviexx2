package com.moviexx2.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderTransactionDTO {
    private Integer id;
    private Integer customerID;
    private String customerName;
    private String email;
    private Integer movieID;
    private String movieName;
    private String type;
    private Integer roomID;
    private String roomName;
    private String transactionDate;
    private String seatNo;
}
