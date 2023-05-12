package com.example.movieservice.model;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class Movie {

    private int id;
    private String name;
    private MovieCategory movieCategory;
    private String description;

    public Movie() {
    }

    public Movie(int id, String name, MovieCategory movieCategory, String description) {
        this.id = id;
        this.name = name;
        this.movieCategory = movieCategory;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public MovieCategory getMovieCategory() {
        return movieCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMovieCategory(MovieCategory movieCategory) {
        this.movieCategory = movieCategory;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
