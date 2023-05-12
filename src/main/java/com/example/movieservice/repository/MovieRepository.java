//package com.example.movieservice.repository;
//
//
//import com.example.movieservice.model.Movie;
//import com.example.movieservice.model.MovieCategory;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class MovieRepository {
//
//    List<Movie> movies = new ArrayList<>();
//
//    public MovieRepository() {
//        movies.add(new Movie(1, "Kapitan Bomba", MovieCategory.HORROR, "A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers."));
//        movies.add(new Movie(2, "Blok ekipa", MovieCategory.ACTION, "Freedom fighters use extraordinary skills and weaponry to revolt against machines."));
//        movies.add(new Movie(3, "Please send help", MovieCategory.COMEDY, "The human city of Zion defends itself against the massive invasion of the machines as Neo fights to end the war at another front while also opposing the rogue Agent Smith."));
//        movies.add(new Movie(4, "GTA 6", MovieCategory.HORROR, "The human city of Zion defends itself against the massive invasion of the machines as Neo fights to end the war at another front while also opposing the rogue Agent Smith."));
//    }
//
//    public List<Movie> getAllMovies() {
//        return movies;
//    }
//
//    public Movie getMovieById(int id) {
//        for (Movie movie : movies) {
//            if (movie.getId() == id) {
//                return movie;
//            }
//        }
//        return null;
//    }
//
//    public Movie addMovie(Movie movie) {
//        movies.add(movie);
//        return movie;
//    }
//
////    public Movie updateMovie(Movie movie) {
////        for (Movie m : movies) {
////            if (m.getId() == movie.getId()) {
////                m.setName(movie.getName());
////                m.setMovieCategory(movie.getMovieCategory());
////                m.setDescription(movie.getDescription());
////                return m;
////            }
////        }
////        return null;
////    }
//
////    public Movie deleteMovie(int id) {
////        for (Movie movie : movies) {
////            if (movie.getId() == id) {
////                movies.remove(movie);
////                return movie;
////            }
////        }
////        return null;
////    }
//
//}
