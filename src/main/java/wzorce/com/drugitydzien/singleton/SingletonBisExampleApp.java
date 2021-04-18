package wzorce.com.drugitydzien.singleton;

public class SingletonBisExampleApp {
    public static void main(String[] args) {
        SingletonBisExample singleton = SingletonBisExample.getInstance();
//        int sequence = singleton.getSequence();
//        System.out.println(sequence);
//        System.out.println(singleton.getSequence());
//        System.out.println(singleton.getSequence());
//        System.out.println(singleton.getSequence());

        singleton.addName("Tomek");
        singleton.addName("John");

        System.out.println(singleton.getNames());
    }
}
