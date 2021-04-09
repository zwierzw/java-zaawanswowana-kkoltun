package com.sda.collections_home.randomNumberArray;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integerList.add(random.nextInt(50));
        }
        System.out.println(integerList.toString());


        Set<Integer> uniqueValues = new HashSet<>();
        Set<Integer> duplicatedValues = new HashSet<>();

        for (int i = 0; i <integerList.size() - 1; i++){
            for(int j = i + 1; j<integerList.size(); j++){
                if (integerList.get(i) ==integerList.get(j)){
                    duplicatedValues.add(integerList.get(i));
                }
            }
        }

        for(Integer value : integerList){
            if (!duplicatedValues.contains(value)){
                uniqueValues.add(value);
            }
        }

        System.out.println("Unique values: " + uniqueValues);
        System.out.println("Duplicated values: " + duplicatedValues);






    }
}
