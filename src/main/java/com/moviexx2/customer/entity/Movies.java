package com.moviexx2.customer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer movieID;
    private String name;
    private String type;
    private String duration;
    private String startDate;
    private String endDate;
}
