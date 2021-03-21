package com.sda.exceptions_home.books;

public class NoBookFoundException extends Exception{
    public NoBookFoundException (String text){
        super (text);
    }
}
