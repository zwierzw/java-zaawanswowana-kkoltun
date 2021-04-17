package wzorce.com.add;

public class SingletonSequenceGenerator {

    private static SingletonSequenceGenerator instance = new SingletonSequenceGenerator();

    private int sequence = 1;

    //prywatny konstruktor, zatem nie można utworzyć obiektu poza klasą
    private SingletonSequenceGenerator() {
    }

    //metoda statyczna, można wywoływać bez instancji, może odwoływać się tylko do pól statycznych
    public static SingletonSequenceGenerator getInstance(){
        return instance;
    }


    public int getSequence(){
        return sequence ++;
    }

}
