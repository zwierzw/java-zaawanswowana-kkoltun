package wzorce.com.add;

import java.util.Scanner;

public class NameRepoApp {
    public static void main(String[] args) {

        NamesRepo repo = new NameRepoImpl(5);

        Scanner scanner = new Scanner(System.in);
        while(!repo.isRepoFull()){
            System.out.println("Podaj imię");
            repo.add(scanner.nextLine());
        }

        System.out.println(repo);
        System.out.println("które imię usunąć");
        repo.remove(scanner.nextLine());

        System.out.println(repo);
        System.out.println("Sortuję repo");
        repo.sort();
        System.out.println(repo);

    }
}
