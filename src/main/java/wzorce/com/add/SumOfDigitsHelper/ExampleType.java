package wzorce.com.add.SumOfDigitsHelper;

public class ExampleType {
    public static void main(String[] args) {
        String liczba = "4";
//        System.out.println(liczba);
//        System.out.println(liczba.charAt(0));

        int liczbaZliczby = Integer.valueOf(liczba);
        System.out.println(liczbaZliczby);

        int liczbaZChara = Integer.valueOf(liczba.charAt(0));
        System.out.println(liczbaZChara);

        char znak = liczba.charAt(0);
        int liczbaZeZnaku = Character.getNumericValue(znak);
        System.out.println(liczbaZeZnaku);

    }

}
