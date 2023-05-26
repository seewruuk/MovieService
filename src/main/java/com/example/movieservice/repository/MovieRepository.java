package com.example.movieservice.repository;


import com.example.movieservice.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;


public interface MovieRepository extends JpaRepository<Movie, Integer> {

    List<Movie> findAll();

    Movie save(Movie movie);

    Movie deleteById(int id);

    Movie findMovieById(int id);

}
