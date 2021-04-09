package com.sda.collections_home.author;

import java.util.*;
import java.util.stream.Collectors;

public class BookService {
    private List<Book> bookList;


    public void add(Book book) {
        bookList.add(book);
    }

    public void remove(Book book) {
        bookList.remove(book);
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public List<Book> getFantasyBookList() {
        return bookList.stream()
                .filter(book -> book.getGenre() == Genre.FANTASY)
                .collect(Collectors.toList());
    }

    public List<Book> getBooksBefore1999() {
        return bookList.stream()
                .filter(book -> book.getYear() < 1999)
                .collect(Collectors.toList());
    }

    public Optional<Book> getMostExpensiveBook() {
        return bookList.stream()
                .max(Comparator.comparing(Book::getPrice));
    }

    public Optional<Book> getLeastExpensiveBook() {
        return bookList.stream()
                .min(Comparator.comparing(Book::getPrice));
    }

    public List<Book> get3AuthorBook() {
        return bookList.stream()
                .filter(book -> book.getAuthorList().size() >= 3)
                .collect(Collectors.toList());
    }

    public List<Book> getSortedByPriceAsc() {
        return bookList.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Book> getSortedByPriceDsc() {
        return bookList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public boolean getSpecificBook(Book searchedBook) {
        return bookList.contains(searchedBook);
    }


    public BookService(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getAllBooksOfOneAuthor(Author author) {
        return bookList.stream()
                .filter(book -> book.getAuthorList().contains(author))
                .collect(Collectors.toList());
    }

    //dodatkowa metoda z zadania 4
    public Map<Genre, String> getSpecialMap (){
        Map<Genre, String> bookMap = new HashMap<>();
        for (Book book : bookList){
            bookMap.put(book.getGenre(),book.getTitle());
        }
        return bookMap;
    }


    @Override
    public String toString() {
        return "BookService{" +
                "bookList=" + bookList +
                '}';
    }
}
