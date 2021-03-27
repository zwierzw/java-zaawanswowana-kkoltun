package com.sda.generic.tools;

import com.sda.vehicles.Car;
import java.lang.reflect.Array;

public class ToolsApp {

//    public static void main(String[] args) {
//        print("String");
//        print(123);
//        print(new Car);
//    }
//
//    //publ. stat. gen. zwr. void metoda o nazwie print przyjmująca argument
//    public static <T> void print(T item){
//        System.out.println(item.toString());
//        System.out.println(item.getClass());
//    }

    public static <T> void hasDuplicate(T[] arrayT) {
        for (int i = 0; i < arrayT.length; i++) {
            for (int j = i + 1; j < arrayT.length; j++) {
                if (arrayT[i].equals(arrayT[j])) {
                    System.out.println("This method has Duplicate of " + arrayT[i] + " :c");
                    return;
                }
            }
        }
        System.out.println("Nie znalazłem duplikatów");
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 2};
        String[] strings = new String[]{"Jacek", "Ola", "Piotrek", "Jacek"};
        hasDuplicate(integers);
        hasDuplicate(strings);
    }

}
