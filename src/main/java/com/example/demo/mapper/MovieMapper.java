package com.example.demo.mapper;

import java.util.List;

import com.example.demo.model.Movie;

public interface MovieMapper {
    
    List<Movie> getAll();

    List<Movie> getSearch(String name);

    List<Movie> getHot();
    
    Movie getMovie(int id);
    
    void insert(Movie movie);

    void update(String name,Movie movie);

    void delete(String name);
}
