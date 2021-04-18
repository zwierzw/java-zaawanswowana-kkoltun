package wzorce.com.add.randomNumArray;

import java.util.Arrays;
import java.util.Random;

public class SumOfNumbersImpl implements SumOfNumbers{

    int[] myArray;

    public SumOfNumbersImpl(int size) {
        this.myArray = new int[size];
        fillArrayRandomValues();
        System.out.println(myArray.length);
        System.out.println(Arrays.toString(myArray));
    }

    @Override
    public int getSumOfNumbers() {
        int sum = 0;
        for (int element : myArray){
            sum += element;
        }
        return sum;
    }

    private void fillArrayRandomValues(){
        Random r = new Random();
        for (int i =0; i<myArray.length; i++){
            myArray[i] = r.nextInt(100);

        }
    }


}
