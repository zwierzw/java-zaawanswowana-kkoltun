package com.sda.collections_home.author;

import java.util.List;
import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;
    private double price;
    private int year;
    private List<Author> authorList;
    private Genre genre;

    public Book(String title, double price, int year, List<Author> authorList, Genre genre) {
        this.title = title;
        this.price = price;
        this.year = year;
        this.authorList = authorList;
        this.genre = genre;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", authorList=" + authorList +
                ", genre=" + genre +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && year == book.year && Objects.equals(title, book.title) && Objects.equals(authorList, book.authorList) && genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, year, authorList, genre);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }


    @Override
    public int compareTo(Book otherBook) {
        if (this.getPrice() < otherBook.getPrice()) {
            return -1;
        } else if (this.getPrice() == otherBook.getPrice()) {
            return 0;
        } else {
            return 1;
        }
    }
}
