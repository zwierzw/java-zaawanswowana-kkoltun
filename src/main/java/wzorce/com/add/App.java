package wzorce.com.add;

import java.util.Locale;

public class App {
    public static void main(String[] args) {
        PrinterService printerService = new PrinterService();
        String textToPrint = "psikus do wydruku";
       // IPrinter printer = new PrinterCapitalLetter();

//        //Klasa anonimowa
//        //MOżemy spotkać w starszym kodzie, dzisiaj się raczej nie stosuje
//        IPrinter printer = new IPrinter() {
//            @Override
//            public void print(String text) {
//                System.out.println(text.toUpperCase(Locale.ROOT));
//            }
//        };

//        // void print(String text)
//        IPrinter printer = text -> System.out.println(text + "lambda");
//
//
//        printerService.printContent(printer, textToPrint);
        printerService.printContent(text -> System.out.println(text + "lambda"), textToPrint);


    }

}
