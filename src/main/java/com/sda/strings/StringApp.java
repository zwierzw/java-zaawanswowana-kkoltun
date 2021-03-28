package com.sda.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class StringApp {
    public static void main(String[] args) {
        List<String> texts = new ArrayList<>();
        texts.add("first");
        texts.add("second");
        texts.add("third");

        //implementacja przez klasę
        TextUpperCase upperCase = new TextUpperCase();

        //implementacja anonimowa klasa
        StringOperation textDuplicate = new StringOperation() {
            @Override
            public String modify(String text) {
                return text.concat(text);
            }
        };

        //implementacja lambda Karola
        StringOperation removeLetterI = (String text) -> {
            return text.replace("i", "");
        };

        //implementacja anonimowa klasa ja
        StringOperation shortenString = new StringOperation() {
            @Override
            public String modify(String text) {
                return text.substring(0, 3);
            }
        };

        //pełna implementacja przy lambdzie ja
        StringOperation shortenStringTo3Letters = (String text) -> {
            return text.substring(0, 3);
        };

        //implementacja skrócona lambda Karol (charakterystyczne ->)
        StringOperation shorten = text -> text.substring(0, 3);

        //tutaj interfejs jest zaimplementowany za pomocą referencji do metody (charakterystyczne ::"
        StringOperation textToUpperCaseMethodReference = String::toUpperCase;
        StringOperation doklejHello = StringApp::doklejHello;


        for (String text : texts) {
            String modified = upperCase.modify(text);
            System.out.println(modified);

            String duplicate = textDuplicate.modify(text);
            System.out.println(duplicate);

            String substring = shortenStringTo3Letters.modify(text);
            System.out.println(substring);

            String shortLambda = shorten.modify(text);
            System.out.println(shortLambda);

            String doklejanieHello = doklejHello(text);
            System.out.println(doklejanieHello);
        }
    }

    private static String doklejHello(String text) {
        return "HELLO " + text;
    }
}
