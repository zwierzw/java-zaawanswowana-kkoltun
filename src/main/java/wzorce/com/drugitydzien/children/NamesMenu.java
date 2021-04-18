package wzorce.com.drugitydzien.children;

import java.util.Scanner;

public class NamesMenu extends WrongFormatException {
    public static void main(String[] args) {

        ChildrenRepository childrenRepository = new Names();

        while (true) {
            System.out.println("1.dodaj dziecko do listy\n" +
                    "2.wyswielt liste dzieci\n" +
                    "3.posortuj liste dzieci\n" +
                    "4.wyczysc z duplikatow liste dzieci\n" +
                    "5.zmien wszystkie litery imion dzieci na duze\n" +
                    "6.zmien wszystkie litery imion dzieci na male\n" +
                    "7. EXIT");
            System.out.println("Napisz wybraną cyfrę");

            Scanner scanner = new Scanner(System.in);
            int integer;
            try {
                 integer = Integer.valueOf(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Wprowadź cyfrę!");
                integer = 0;
            }

            switch (integer) {
                case 1:
                    System.out.println("Podaj imię dziecka:");
                    String name = scanner.nextLine();
                    childrenRepository.addToList(name);
                    break;
                case 2:
                    childrenRepository.getChildrenList();
                    break;
                case 3:
                    childrenRepository.sortChildren();
                    break;
                case 4:
                    childrenRepository.removeDuplicates();
                    break;
                case 5:
                    childrenRepository.namesToUpperCase();
                    break;
                case 6:
                    childrenRepository.namesToLowerCase();
                    break;
                case 7:
                    System.out.println("EXIT");
                    System.exit(-1);
                    break;
                default:
                    System.out.println("Wrong number, try again!");
                    break;
            }
            System.out.println(childrenRepository.getChildrenList());
            System.out.println();
        }

    }

}
