package wzorce.com.trzeciTydzien.peselValidator;

public class PeselApp {
    public static void main(String[] args) {
        String pesel0 = "76052739495";
        String pesel1 = "76052739494999";
        String pesel2 = "7605273949z";
        String pesel3 = "a76052739494";

        System.out.println(PeselValidatorHelper.isPeselValid(pesel0));
    }
}
