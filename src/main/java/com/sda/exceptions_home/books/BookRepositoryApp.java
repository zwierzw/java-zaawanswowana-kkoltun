package com.sda.exceptions_home.books;


public class BookRepositoryApp {
    public static void main(String[] args) throws NoBookFoundException {
        Book book1 = new Book();
        Book book2 = new Book(123, "Chylka", "Janusz Gajos", 1994);
        Book book3 = new Book(23, "Klamca", "Jakub Cwiek", 2012);

        BookRepository bookRepository = new BookRepository();
        bookRepository.addBook(book1);
        bookRepository.addBook(book2);
        bookRepository.addBook(book3);
        System.out.println(bookRepository.getBooks().size());

        bookRepository.removeBook(book1);
        System.out.println(bookRepository.getBooks().size());

        bookRepository.searchBookByName("Chylka");
        bookRepository.searchBookByID(23);
        bookRepository.removeBookByID(123);
        System.out.println(bookRepository.toString());

        Book book4 = new Book(1234, "James Bond", "Agatha Christie", 2000);
        Book book5 = new Book(12345, "Captain Hook", "Elizabeth", 2020);
        bookRepository.addBook(book4);
        bookRepository.addBook(book5);

        try {
            bookRepository.searchBookByName("Miś Kolargol");
        } catch (NoBookFoundException e) {
            System.out.println("Problem appeared: " + e.getMessage());
        } finally {
            System.out.println("Cleaning!");
        }

        try {
            bookRepository.searchBookByID(2);
        } catch (NoBookFoundException e) {
            System.out.println("Problem appeared: " + e.getMessage());
        } finally {
            System.out.println("Cleaning!");
        }

        try {
            bookRepository.removeBookByID(2);
        } catch (NoBookFoundException e) {
            System.out.println("Problem appeared: " + e.getMessage());
        } finally {
            System.out.println("Cleaning!");
        }

//        jak zapiszesz tylko w ten sposób poniżej, to wysypie ci się program
//        bookRepository.removeBook(book1);
//        Musisz złapać ten wyjątek, żeby program szedł dalej.

        try{
            bookRepository.removeBook(book1);
        } catch (NoBookFoundException e) {
            System.out.println("Problem appeared: " + e.getMessage());
        } finally {
            System.out.println("Cleaning!");
        }
    }
}
