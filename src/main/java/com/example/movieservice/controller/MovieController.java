package com.example.movieservice.controller;


import com.example.movieservice.MovieServiceApplication;
import com.example.movieservice.model.Movie;
import com.example.movieservice.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRunTimeException(RuntimeException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body("error: " + e.getLocalizedMessage());
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> getAllMovies(){
        return ResponseEntity.ok(movieService.getAllMovies());
    }

    @GetMapping("/exception")
    public ResponseEntity<String> throwException(){
        throw new RuntimeException("test exception");
    }

    @GetMapping("/movies/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable int id){
            if(movieService.getMovieById(id) == null){
              throw new RuntimeException("Movie with id: " + id + " not found " + ResponseEntity.notFound().build());
            }else{
                return ResponseEntity.ok(movieService.getMovieById(id));
            }
    }

    @PostMapping("/movies")
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
        if(movieService.getMovieById(movie.getId()) != null) {
            throw new RuntimeException("Movie with id (" + movie.getId() + ") already exists " + ResponseEntity.badRequest().build());
        }else{
            return ResponseEntity.ok(movieService.addMovie(movie));
        }
    }
    @PutMapping("/movies/{id}")
    public ResponseEntity<Movie> updateMovie(@PathVariable int id, @RequestBody Movie movie){
        if(movieService.getMovieById(id) == null) {
            throw new RuntimeException("Movie with id (" + id + ") not found, " + ResponseEntity.badRequest().build());
    }else{
            movieService.updateMovie(id, movie);
            return ResponseEntity.ok(movieService.getMovieById(id));
        }
    }

    @DeleteMapping("/movies/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable int id) {
        if(movieService.getMovieById(id) == null){
            throw new RuntimeException("Movie with id: " + id + " not found " + ResponseEntity.badRequest().build());
        }else{
            movieService.deleteMovie(id);
            return ResponseEntity.noContent().build();
        }
    }



}
