package wzorce.com.add;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class NamesApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("John");
        names.add("Adam");
        names.add("John");
        names.add("Adam");
        names.add("Tadek");

        System.out.println(names);
//        //usuwa tylko pierwsze wystąpienie obiektu i zmienia indeks w tablicy, więc reszta nie zostanie usunięta
//        names.remove("John");
//        System.out.println(names);
//
//
//        //iterator to obiekt, który pozwala przeglądać zawartość obiektu bez względu na sposób przechowywania danych.
//        Iterator<String> iterator = names.iterator();
//        while(iterator.hasNext()){
//            String name = iterator.next();
//            if(name.equals("John")){
//                iterator.remove();
//            }
//        }
////        //rzuci wyjątkiem jeśli na ma kolejneggo elementu
////        iterator.next();


        names.removeIf(name -> name.equals("John"));
        Collections.sort(names);


        System.out.println(names);

    }
}
