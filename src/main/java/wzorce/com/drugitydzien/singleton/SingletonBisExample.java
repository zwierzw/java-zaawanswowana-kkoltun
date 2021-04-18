package wzorce.com.drugitydzien.singleton;

import java.util.ArrayList;
import java.util.List;

public class SingletonBisExample {

    //zmienna statyczna przechowująca Sinlgeton
    private static SingletonBisExample instance = new SingletonBisExample();
    private int sequence = 1;

    private List<String> names = new ArrayList<>();

    //metoda zwracająca singleton
    public static SingletonBisExample getInstance(){
        return instance;
    }

    public int getSequence(){
        return sequence++;
    }

    public void addName(String name){
        names.add(name);
    }

    public String getNames(){
        return names.toString();
    }

    //prywatny konstruktor
    private SingletonBisExample() {
    }
}
