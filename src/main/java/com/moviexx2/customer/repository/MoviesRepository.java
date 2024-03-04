package com.moviexx2.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviexx2.customer.entity.Movies;

// @Repository
public interface MoviesRepository extends JpaRepository<Movies, Integer> {
}
