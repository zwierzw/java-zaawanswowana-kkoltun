package wzorce.com.trzeciTydzien.positivNumber;

//Znajdz najmniesza pozytywna liczbe, ktora nie wystapila w tablicy.
//Metoda przyjmuje jako argument tablice a zwraca liczbe int.
//Przyklady
//[1, 2, 4] zwraca 3
//[-1, -3, 5] zwraca 1
//[-1, -3, 1] zwraca 2
//Zastanow sie nad sygnatura metody. Uzyj interfejsu.

public class Numbers implements findNUmber {
    private int number;

    private boolean isArrayCotainNumbers(int n, int[] numbers) {
//        boolean contains = false;
        for (int number : numbers) {
            if (number == n) {
                return true;
//                return contains = true;
//                break;
            }
        }
        return false;
//        return contains;
    }

    @Override
    public int findNumber(int[] numbers) {
        int min;
//        Arrays.sort(numbers);
//        for(int number: numbers){
//            if(min == number){
//                min++;
//            }
//        }

        for (min = 1; ; min++) {
            boolean result = isArrayCotainNumbers(min, numbers);
            if (result) {
                continue;
            } else {
                return min;
            }
        }
    }

    public Numbers() {
        this.number = 0;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "number=" + number +
                '}';
    }
}
