package wzorce.com.trzeciTydzien.peselValidator;

public class PeselValidatorHelper {

    public static int[] multipliers = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};

    public static boolean isPeselValid(String pesel) {

        //możemy usunąć whitespace na początku i końcu metodą trim
        pesel = pesel.trim();

        char[] peselDigits = pesel.toCharArray();

        if (pesel.length() != 11) {
            return false;
        }

        int sumOfDigits = 0;
        for (int i = 0; i < 11; i++) {
            if (Character.isDigit(peselDigits[i])) {
                sumOfDigits = sumOfDigits + (Character.getNumericValue(peselDigits[i]) * multipliers[i]);
            } else {
                return false;
            }
        }

        if(sumOfDigits %10 ==0){
            return true;
        }


//        final String sum = String.valueOf(sumOfDigits);
//        if (sum.charAt((sum.length() - 1)) == '0') {
//            return true;
//        }
//
        return false;

    }
}
