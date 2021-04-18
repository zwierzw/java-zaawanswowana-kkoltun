package wzorce.com.drugitydzien.children;

public class NamesApp {
    public static void main(String[] args) {
        Names namesList = new Names();
        namesList.addToList("Jan");
        namesList.addToList("Adam");
        namesList.addToList("Kasia");
        namesList.addToList("Jan");
        System.out.println(namesList);

        namesList.sortChildren();

        System.out.println(namesList);

        namesList.removeDuplicates();
        System.out.println(namesList);

        namesList.namesToUpperCase();
        System.out.println(namesList);

        namesList.namesToLowerCase();
        System.out.println(namesList);

    }
}
