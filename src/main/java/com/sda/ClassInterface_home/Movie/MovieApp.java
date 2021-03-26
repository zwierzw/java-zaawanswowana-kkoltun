package com.sda.ClassInterface_home.Movie;

public class MovieApp {
    public static void main(String[] args) {
        System.out.println(Movie.MovieCreator.createMovie());
        Movie movie = new Movie.MovieCreator()
                .setTitle("Nietykalni")
                .setRegiseur("Polanski")
                .setYear(1996)
                .setGenre("drama")
                .setPublisher("21century")
                .createMovie()                ;
        System.out.println(movie);
    }
}
