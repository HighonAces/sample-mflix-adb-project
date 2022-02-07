package com.srujanpakanati.samplemflixadbproject.repository;

import com.srujanpakanati.samplemflixadbproject.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, String> {
}
