package wzorce.com.add;

public class PrinterService {
    //metoda przyjmuje jako pierwszy argument obiekt typu interfejs
    public void printContent(IPrinter IPrinter, String text) {
        IPrinter.print(text);
    }
}
