package wzorce.com.trzeciTydzien.liczbaZnakow;

//Praca domowa - zastanowcie sie jak zrobic ponizsze zadanie z uzyciem streama:
//Napisz program, ktory bedzie liczyl liczbe wystapien okreslonych znakow w slowie.
//Przykladowa sygnatura public int countOccurrencesLettersInWord(String word, char[] letters){...}gdzie
// word jest przekazanym slowem, a letters to znaki, ktorych wystapienia zliczamy
//Przyklad
//public int countOccurrencesLettersInWord("Dom to nie auto", new char[] {'a','m'})
//Wynik 2

public class charCounterHelper {

    public static int countOccurrencesLettersInWord(String word, char[] letters) {
        int counter = 0;
        char[] wordToChar = word.toCharArray();




        word.chars().filter(k -> k == 'k').count();

        for (int i = 0; i < wordToChar.length; i++) {
            char charToCheck = wordToChar[i];
            for (int j = 0; j < letters.length; j++) {
                char charWeCheck = letters[j];
                if (charToCheck == charWeCheck) {
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }

}
