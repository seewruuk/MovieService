package com.example.movieservice.model;


import jakarta.persistence.*;
import jdk.jfr.Name;

@Entity
@Table(name = "movie")
//@NamedQueries({
//        @NamedQuery(name = "Movie.findMovieWithId", query = "SELECT m FROM Movie m WHERE m.id = :id"),
//        @NamedQuery(name = "Movie.showAllMovies", query = "SELECT m FROM Movie m")
////        @NamedQuery(name = "Movie.addMovie", query = "INSERT INTO Movie(m.name, m.category, m.description) VALUES (:name, :category, :description)"),
////        @NamedQuery(name = "Movie.deleteMovieById", query = "DELETE FROM Movie m WHERE m.id = :id")
//})
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "category")
    @Enumerated(EnumType.STRING)
    private MovieCategory movieCategory;
    @Column(name = "isavailable", columnDefinition = "BIT")
    private int isAvailable;



    public Movie() {
    }

    public Movie(String name, String description, MovieCategory movieCategory, int isAvailable) {
        this.name = name;
        this.description = description;
        this.movieCategory = movieCategory;
        this.isAvailable = isAvailable;
    }

    public int getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(int isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MovieCategory getMovieCategory() {
        return movieCategory;
    }

    public void setMovieCategory(MovieCategory movieCategory) {
        this.movieCategory = movieCategory;
    }
}
