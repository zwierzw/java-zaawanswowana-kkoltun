package com.sda.collections_home.author;

import java.util.ArrayList;
import java.util.List;

public class BookServiceApp {
    public static void main(String[] args) {
        Author grochola = new Author("Katarzyna", "Grochola", "F");
        Author cwiek = new Author("Jakub", "Cwiek", "M");
        Author rowling = new Author("J.K.", "Rowling", "F");

        List<Author> authorList1 = new ArrayList<>();
        authorList1.add(grochola);
        List<Author> authorList2 = new ArrayList<>();
        authorList2.add(cwiek);
        List<Author> authorList3 = new ArrayList<>();
        authorList3.add(rowling);
//        authorList3.add(grochola); // --> linijka ta i poniżej są do zadania .get3AuthorBook()
//        authorList3.add(cwiek);


        Book deszczBook = new Book("Deszcz", 33.22d, 1989, authorList1, Genre.DOCUMENT);
        Book klamcaBook = new Book("Klamca", 28.99d, 2014, authorList2, Genre.FANTASY);
        Book harryPotterBook = new Book("Harry Potter", 59.99d, 2005, authorList3, Genre.DOCUMENT);

        List myBooks = new ArrayList();
        myBooks.add(deszczBook);
        myBooks.add(klamcaBook);
        myBooks.add(harryPotterBook);
        BookService bookService = new BookService(myBooks);
        System.out.println(bookService.getBookList());
        System.out.println(bookService.getBooksBefore1999());
        System.out.println(bookService.getFantasyBookList());
        System.out.println(bookService.getMostExpensiveBook());
        System.out.println(bookService.getLeastExpensiveBook());
        System.out.println(bookService.get3AuthorBook());
        System.out.println(bookService.getSortedByPriceAsc()); //jak sortować po Stringach w streamach
        System.out.println(bookService.getSortedByPriceDsc());

        Author pratchett = new Author("Terry", "Pratchett", "M");
        List<Author> authorList4 = new ArrayList<>();
        authorList4.add(pratchett);
        List<Author> authorList5 = new ArrayList<>();
        authorList5.add(pratchett);

        Book kolorMagiiBook = new Book("Kolor magii", 27.99d, 2000, authorList4, Genre.FANTASY);
        System.out.println(bookService.getSpecificBook(klamcaBook));
        System.out.println(bookService.getSpecificBook(kolorMagiiBook));

        Book mortBook = new Book("Mort", 27.99d, 2002, authorList5, Genre.FANTASY);
        myBooks.add(kolorMagiiBook);
        myBooks.add(mortBook);
        System.out.println(bookService.getAllBooksOfOneAuthor(pratchett));


        //dodatkowa metoda z zadania 4
        System.out.println(bookService.getSpecialMap()); //metoda dodaje tylko 2 tytuły, bo w mapie 1 klucz ma 1 wartość!!

    }
}
