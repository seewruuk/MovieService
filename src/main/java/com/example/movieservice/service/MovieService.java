package com.example.movieservice.service;

import com.example.movieservice.model.Movie;
import com.example.movieservice.model.MovieCategory;
import com.example.movieservice.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Movie saveMovie(Movie movie){
        return movieRepository.save(movie);
    }
    public Movie deleteMovieById(int id){
        return movieRepository.deleteById(id);
    }
    public Movie findMovieById(int id){
        return movieRepository.findMovieById(id);
    }
    public Movie updateMovie(int id, Movie movie){
        Movie movieToUpdate = movieRepository.findMovieById(id);
        movieToUpdate.setName(movie.getName());
        movieToUpdate.setMovieCategory(movie.getMovieCategory());
        movieToUpdate.setDescription(movie.getDescription());
        movieToUpdate.setIsAvailable(movie.getIsAvailable());
        return movieRepository.save(movieToUpdate);
    }
    public Movie updateMovieAvailability(int id){
        Movie movieToUpdate = movieRepository.findMovieById(id);
        movieToUpdate.setIsAvailable(1);
        return movieRepository.save(movieToUpdate);
    }
}
