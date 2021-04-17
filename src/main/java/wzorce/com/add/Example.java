package wzorce.com.add;

import java.util.Locale;

public class Example {
    public static void main(String[] args) {

        //String jest obiektem niemutowalnym, tzn wywołanie na nim metod nie zmienia jego stanu, czyli go nie zmienia
        //ale zwraca zmieniony obiekt
        String abc = "abc";
        abc.toUpperCase();
        //abc = abc.toUpperCase(); -> tu zadziała
        System.out.println(abc);
    }
}
