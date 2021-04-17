package wzorce.com.add;

import java.util.Locale;

public class PrinterCapitalLetter implements IPrinter{
    @Override
    public void print(String text) {
        System.out.println(text.toUpperCase(Locale.ROOT));
    }
}
