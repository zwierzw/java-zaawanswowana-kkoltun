package wzorce.com.drugitydzien.blazejRozwiazanie;

import java.util.Scanner;

public class ChildrenTaskMain {

    public static void main(String[] args) {

        String menu = "Menu:\n" +
                "1.dodaj dziecko do listy\n" +
                "2.wyswielt liste dzieci\n" +
                "3.posortuj liste dzieci\n" +
                "4.wyczysc z duplikatów liste dzieci\n" +
                "5.zmien wszystkie litery imion dzieci na duze\n" +
                "6.zmien wszystkie litery imion dzieci na male\n" +
                "7.wyjdz z programu\n" +
                "8.wydrukuj listę zdarzen";

        final Scanner scanner = new Scanner(System.in);
//        final wzorce.com.drugitydzien.blazejRozwiazanie.IChildrenRepository children = new ChildrenRepository();
        final IChildrenRepository children = new ChildrenRepositoryBasic();
        System.out.println("Witaj w programie");

        while (true) {
            System.out.println();
            System.out.println(menu);
            int number;
            try {
                number = Integer.valueOf(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Dokonaj wyboru wprowadzajac cyfre");
                continue;
            }
            switch (number) {
                case 1:
                    System.out.println("Podaj dziecko");
                    String name = scanner.nextLine();

                    if (children.addChild(name)) {
                        System.out.println("Dodaje dziecko " + name);
                    } else {
                        System.out.println("Nie udalo sie dodac dziecka. Sprawdz poprawnosc argumentu:" + name);
                    }
                    break;
                case 2:
                    System.out.println(children.getChildren());
                    break;
                case 3:
                    System.out.println("Sortuje liste dzieci");
                    children.sortChildren();
                    break;
                case 4:
                    System.out.println("Usuwam duplikaty");
                    children.removeDuplicates();
                    break;
                case 5:
                    System.out.println("Imiona duza litera");
                    children.setNamesToUpperCase();
                    break;
                case 6:
                    System.out.println("Imiona mala litera");
                    children.setNamesToLowerCase();
                    break;
                case 7:
                    System.out.println("Exit");
                    System.exit(-1);
                case 8:
                    System.out.println(EventCounterSingleton.getInstance().getEventsList());
                    break;
                default:
                    System.out.println("Wprowadzono niepoprawna wartosc");
            }

        }

    }

}
