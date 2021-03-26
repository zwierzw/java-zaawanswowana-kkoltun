package com.sda.ClassInterface_home.Movie;

public class Movie {
    private String title;
    private String regiseur;
    private long year;
    private String genre;
    private String publisher;


    public static class MovieCreator {
        private static String title;
        private static String regiseur;
        private static long year;
        private static String genre;
        private static String publisher;

        public static Movie createMovie(){
            Movie movie = new Movie(title, regiseur, year, genre, publisher);
            return movie;
        }

        public MovieCreator setTitle(String title) {
            this.title = title;
            return this;
        }

        public MovieCreator setRegiseur(String regiseur) {
            this.regiseur = regiseur;
            return this;
        }

        public MovieCreator setYear(long year) {
            this.year = year;
            return this;
        }

        public MovieCreator setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public MovieCreator setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        @Override
        public String toString() {
            return "MovieCreator{" +
                    "Movie{" +
                    "title='" + title + '\'' +
                    ", regiseur='" + regiseur + '\'' +
                    ", year=" + year +
                    ", genre='" + genre + '\'' +
                    ", publisher='" + publisher + '\'' +
                    '}'
                    + "}";
        }
    }



    public Movie() {
    }

    public Movie(String title, String regiseur, long year, String genre, String publisher) {
        this.title = title;
        this.regiseur = regiseur;
        this.year = year;
        this.genre = genre;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRegiseur() {
        return regiseur;
    }

    public void setRegiseur(String regiseur) {
        this.regiseur = regiseur;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", regiseur='" + regiseur + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
