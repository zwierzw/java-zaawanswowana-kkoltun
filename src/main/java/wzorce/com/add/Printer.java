package wzorce.com.add;
//poniżej adnotacja sprawdzająca, czy interfejs jest funkcyjny

@FunctionalInterface
public interface Printer {

    //interfejs funkcyjny ma jedną metodę abstrakcyjną
    //poniżej jest metoda abstrakcyjna
    void print (String text);

    //nie mogę dodać drugiej metody abstrakcyjnej, bo jest adnotacja która pilnuje czy interfejs jest funkcyjny
   // void printCapitalLetter();
}
