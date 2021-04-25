package wzorce.com.trzeciTydzien.liczbaZnakow;

public class charCounterHelper {

    public static int countOccurrencesLettersInWord(String word, char[] letters) {
        int counter = 0;
        char[] wordToChar = word.toCharArray();

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
