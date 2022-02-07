package com.srujanpakanati.samplemflixadbproject.controller;

import com.srujanpakanati.samplemflixadbproject.model.Movie;
import com.srujanpakanati.samplemflixadbproject.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("movie")
public class MovieController {

    @Autowired
    MovieRepository movieRepository;

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> getAllMovies() {
        try {
            List<Movie> movies = new ArrayList<>(movieRepository.findAll());
            return new ResponseEntity<>(movies, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}
