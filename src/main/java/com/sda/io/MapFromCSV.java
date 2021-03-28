package com.sda.io;

//Napisz klasę MapFromCsv która wczyta mapę zawierającą stringi z pliku csv (linia
// po linii wartości przedzielane przecinkami)

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class MapFromCSV {
    public static void main(String[] args) {
        Path path = Paths.get("mapa.csv");

        Map<String,String> loaded = readFromFile(path);

        System.out.println(loaded);
    }

    private static Map<String, String> readFromFile(Path path){
        Map<String,String> loadedData = new HashMap<>();

       // BufferedReader reader = null;
        //to poniżej to się nazywa try with resources, jeśli coś się wydarzy, to wytwórz powiązanie z plikiem.
        try (BufferedReader reader = Files.newBufferedReader(path)){
          //  reader = Files.newBufferedReader(path);
            String line = reader.readLine();
            while (line != null){
                String[] values = line.split(",");

                if(values.length != 2){
                    throw  new RuntimeException("Nieprawidłowa linia: " + line);
                }
                String name = values[0];
                String lastname = values[1];
                loadedData.put(name, lastname);

                line = reader.readLine();
            }
        } catch (IOException exception){
            System.out.println("Wystąpił błąd: " + exception.getMessage());
        }
//        finally {
//            if(reader != null){
//                reader.close();
//            }
//        }
//
//       pracując na plikach trzeba zawsze czyścić!

        return loadedData;
    }

}
