package com.sda.generic;

public class BoxApp {
    public static void main(String[] args) {
        Box<Integer> boxLiczba = new Box<Integer>();
        boxLiczba.set(1234);
        System.out.println(boxLiczba.get());

        Box<String> boxTekst = new Box<String>();
        boxTekst.set("tekst");
        System.out.println(boxTekst.get());
    }
}
