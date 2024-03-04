package com.moviexx2.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.moviexx2.customer.dto.ResponseData;
import com.moviexx2.customer.entity.Movies;
import com.moviexx2.customer.repository.MoviesRepository;

@Service
public class MoviesServiceImpl implements MoviesService {

    @Autowired
    MoviesRepository repository;
    @Override
    public ResponseData addMovies(Movies request) {
        repository.save(request);
        return new ResponseData(HttpStatus.OK.value(),"Success", request);
    }

    @Override
    public ResponseData getMovies() {
        List<Movies> movies = repository.findAll();
        return new ResponseData(HttpStatus.OK.value(),"Success", movies);
    }
    
}
