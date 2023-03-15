package org.example;

import java.util.Arrays;

public class MovieManager {
    private String[] movies;
    private int limit;

    public MovieManager() {
        this.movies = new String[0];
        this.limit = 10;
    }

    public MovieManager(int limit) {
        this.movies = new String[0];
        this.limit = limit;
    }

    public void addMovie(String movie) {
        String[] newMovies = new String[movies.length + 1];
        System.arraycopy(movies, 0, newMovies, 0, movies.length);
        newMovies[newMovies.length - 1] = movie;
        movies = newMovies;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}

