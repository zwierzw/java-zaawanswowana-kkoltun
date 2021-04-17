package wzorce.com.add;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Napisz program, który najpier poprosi o 5 imion na standardowym wejściu.
// Wyświetli je i zapyta, które skasować, po czym wyświetli listę po skasowaniu,
// posortuje ją i wyświetli ponownie i po skasowaniu i zakończy działanie

public class Names {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String name3 = scanner.nextLine();
        String name4 = scanner.nextLine();
        String name5 = scanner.nextLine();

        List<String> names = new ArrayList<>();
        names.add(name1);
        names.add(name2);
        names.add(name3);
        names.add(name4);
        names.add(name5);

        System.out.println(names);
        System.out.println("Które z imion chcesz skasować");
        String nameRemove = scanner.nextLine();

        System.out.println("Lista po usunięciu wybranego imienia");
        System.out.println(names.stream()
                .filter(name -> !name.equalsIgnoreCase(nameRemove))
                .collect(Collectors.toList()));

        System.out.println("Lista posortowana");
        System.out.println(names.stream()
                .filter(name -> !name.equalsIgnoreCase(nameRemove))
                .sorted()
                .collect(Collectors.toList()));

    }
}
