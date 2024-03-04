package com.moviexx2.customer.service;

import com.moviexx2.customer.dto.ResponseData;
import com.moviexx2.customer.entity.Movies;

public interface MoviesService {
    ResponseData addMovies(Movies request);
    ResponseData getMovies();
}