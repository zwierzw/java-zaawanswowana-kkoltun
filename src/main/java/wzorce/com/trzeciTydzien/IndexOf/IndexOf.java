package wzorce.com.trzeciTydzien.IndexOf;

public class IndexOf {
    public static void main(String[] args) {
        String kot = "kottttt.";
        char c = 'a';
        char c2 = 'x';
        char c3 = 't';
        System.out.println(kot.indexOf(c));
        System.out.println(kot.indexOf(c2));
        System.out.println(kot.indexOf(c3));
        System.out.println(kot.indexOf(c3, 4));
        System.out.println(kot.indexOf("tt."));

        String zdanie = "Jest ładna pogoda";
        System.out.println("index słowa ładna pogoda to " + zdanie.indexOf("pogoda"));
        String noweZdanie = zdanie.substring(zdanie.indexOf("adna"));

        char[] letters = {'k', 'o', 't'};
        String wordFromArray = String.valueOf(letters);
        System.out.println(wordFromArray);
        //w jaki sposób zrobić predykta, czy w słowie znajduje się wyraz
        //albo jak stworzyć boolean
        if(wordFromArray.indexOf('k') != -1){
            System.out.println("litera znajduje się w wyrazie");
        }
        String słowoDoAnalizy = "Pomidorr";
        char[] litery = {'o', 'r'};
        String wyrazZliter = String.valueOf(litery);
//        Jeśli chcemy używać zmiennej w lambdzie, musi ona być efektywnie finalna,
//        tzn. że możemy przed nią napisać słowo kluczowe final
//        wyrazZliter = "ksert";
        int wynik = (int) słowoDoAnalizy.chars().filter(znak -> wyrazZliter.charAt(znak) != -1).count();



    }
}
