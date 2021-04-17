package wzorce.com.add;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamStringExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Rambo");
        names.add("Rocky");
        names.add("Terminator");

        System.out.println(names.contains("Rambo"));
        for (String name : names) {
            if (name.equalsIgnoreCase("Rambo")) {
                System.out.println("Rambo jest na liście");
                break;
            }
        }
        Predicate<String> predicate = name -> name.equalsIgnoreCase("Rambo");
        boolean result = names.stream().anyMatch(predicate);

        boolean result2 = names.stream()
                .anyMatch(name ->name.equalsIgnoreCase("rambo"));

        boolean result3 = names.stream()
                .allMatch(name -> name.isBlank());


        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);


    }
}
