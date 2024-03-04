package com.moviexx2.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviexx2.customer.entity.Customer;

// @Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
