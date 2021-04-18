package wzorce.com.add.SumOfDigitsHelper;

//Zadanie
//Uzywajac klas biblioteki standardowej javy napisz program, który sumuje
//cyfry w tekscie podanym przez uzytkownika i wyswietla wynik w konsoli.
//Utworz klase SumOfDigitsHelper, ktora bedzie zawierala metode, ktora
//bedzie przyjmowala jako argument String oraz zwracała wynik, czyli sume
//cyfr w postaci typu prostego int.
//Niech program działa w petli. Prosi o podanie wyrazu i wyswietla rezultat na
//konsoli.
//Kiedy użytkownik wpisze w konsoli exit, to program zakonczy działanie.
//Spróbuj rozwiazac zadanie obiektowo, z uzyciem interfejsu.
//Z gwiazdka sprobuj dodatkowo napisac metode, ktora przyjmuje jako argument int


public class SumOfDigitsHelper {
    public static int getSumOfDigitHelper(String text) {
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char znak = text.charAt(i);
            if(Character.isDigit(znak)) {
                sum = sum + Character.getNumericValue(znak);
            }
        }
        return sum;
    }
}
