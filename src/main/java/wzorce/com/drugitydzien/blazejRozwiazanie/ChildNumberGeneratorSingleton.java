package wzorce.com.drugitydzien.blazejRozwiazanie;

public class ChildNumberGeneratorSingleton {

    private int number = 1;

    //zmienna statyczna przechowująca instancję
//    private static ChildNumberGeneratorSingleton instance = new ChildNumberGeneratorSingleton();
    private static ChildNumberGeneratorSingleton instance;

    //prywatny konstruktor
    private ChildNumberGeneratorSingleton() {
    }

    //metoda zwracająca singleton
    public synchronized static ChildNumberGeneratorSingleton getInstance() {
        if(instance == null){ //tworzony przy pierwszym włączeniu, tzw lazy
            instance = new ChildNumberGeneratorSingleton();
        }

        return instance;
    }

    public int getNumber(){
        return number++;
    }

}
