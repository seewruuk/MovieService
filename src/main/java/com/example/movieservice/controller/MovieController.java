package com.example.movieservice.controller;


import com.example.movieservice.MovieServiceApplication;
import com.example.movieservice.model.Movie;
import com.example.movieservice.service.MovieService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }


    @GetMapping("/movies/{id}")
    public ResponseEntity<Movie> getMovieWithId(@PathVariable int id){
        Movie movie = movieService.findMovieById(id);
        return ResponseEntity.ok(movie);
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> getAllMovies(){
        List<Movie> movies = movieService.getAllMovies();
        return ResponseEntity.ok(movies);
    }

    @PostMapping("/movies")
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie){
        Movie savedMovie = movieService.saveMovie(movie);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedMovie);
    }

    @DeleteMapping("/movies/{id}")
    public ResponseEntity<Movie> deleteMovie(@PathVariable int id){
        Movie movie = movieService.deleteMovieById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/movies/{id}")
    public ResponseEntity<Movie> updateMovie(@PathVariable int id, @RequestBody Movie movie){
        Movie updatedMovie = movieService.updateMovie(id, movie);
        return ResponseEntity.ok(updatedMovie);
    }

    @PutMapping("/movies/{id}/available")
    public ResponseEntity<Movie> updateMovieAvailability(@PathVariable int id){
        Movie updatedMovie = movieService.updateMovieAvailability(id);
        return ResponseEntity.ok(updatedMovie);
    }







}
