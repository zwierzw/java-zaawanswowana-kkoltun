package com.sda.exceptions_home.books;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) throws NoBookFoundException {
        for (Book b1 : books) {
            if (b1 == book) {
                books.remove(book);
                return;
            }
        }
        throw new NoBookFoundException("There is no such book: " + book);

    }

    public List searchBookByName(String name) throws NoBookFoundException {
        List<Book> searchedBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle() == name) {
                searchedBooks.add(book);
            }
        }
        if (searchedBooks.size() != 0) {
            System.out.println(searchedBooks.toString());
        } else {
            throw new NoBookFoundException("Not found books with that name!");
        }
        return searchedBooks;
    }

    public List searchBookByID(long id) throws NoBookFoundException {
        List<Book> searchedBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getIsbn() == id) {
                searchedBooks.add(book);
            }
        }

        if (searchedBooks.size() != 0) {
            System.out.println(searchedBooks.toString());
        } else {
            throw new NoBookFoundException("Not found books with that ID!");
        }
        return searchedBooks;
    }

    public void removeBookByID(long id) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getIsbn() == id) {
                books.remove(book);
                return;
            }
        }
        throw new NoBookFoundException("Can't remove book with ID: " + id);
    }


    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "BookRepository{" +
                "books=" + books +
                '}';
    }
}
