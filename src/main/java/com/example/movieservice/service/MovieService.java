package com.example.movieservice.service;

import com.example.movieservice.model.Movie;
import com.example.movieservice.model.MovieCategory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    List<Movie> movies = new ArrayList<>();

    public MovieService() {
        movies.add(new Movie(1, "Kapitan Bomba", MovieCategory.HORROR, "A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers."));
        movies.add(new Movie(2, "Blok ekipa", MovieCategory.ACTION, "Freedom fighters use extraordinary skills and weaponry to revolt against machines."));
        movies.add(new Movie(3, "Please send help", MovieCategory.COMEDY, "The human city of Zion defends itself against the massive invasion of the machines as Neo fights to end the war at another front while also opposing the rogue Agent Smith."));
        movies.add(new Movie(4, "GTA 6", MovieCategory.HORROR, "The human city of Zion defends itself against the massive invasion of the machines as Neo fights to end the war at another front while also opposing the rogue Agent Smith."));
    }

    public List<Movie> getAllMovies() {
        return movies;
    }

    public Movie getMovieById(int id) {
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }

    public Movie addMovie(Movie movie) {
        movies.add(movie);
        return movie;
    }

    public void updateMovie(int id, Movie movie) {
        for(Movie singleMovie : movies){
            if(singleMovie.getId() == id){
                singleMovie.setName(movie.getName());
                singleMovie.setMovieCategory(movie.getMovieCategory());
                singleMovie.setDescription(movie.getDescription());
            }
        }
    }

    public void deleteMovie(int id){
        for(Movie singleMovie : movies){
            if(singleMovie.getId() == id){
                movies.remove(singleMovie);
            }
        }
    }

}
