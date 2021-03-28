package com.sda.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

//Napisz klasę MapToCsv która zapisze mapę zawierającą stringi
//do pliku csv (linia po linii wartości przedzielane przecinkami)

public class MapToCsv {
    public static void main(String[] args) {
        Map<String, String> values = new HashMap<>();
        values.put("Karol", "Koltun");
        values.put("Alicja", "Sokołowksa");
        values.put("Maria", "Kowalska");

        Path path = Paths.get("mapa.csv");

        writeToFile(path, values);

    }

    private static void writeToFile(Path path, Map<String, String> values) {
        String dane = "";
        for (String name : values.keySet()) {
            String lastName = values.get(name);

            dane = dane + name + "," + lastName + "\n";
        }
        try {
            Files.writeString(path, dane);
        } catch (IOException ioe){
            System.out.println("Wystąpił błąd " + ioe.getMessage());
        }

//        try {
//            BufferedWriter writer = Files.newBufferedWriter(path);
//            for (String name : values.keySet()) {
//                String lastName = values.get(name);
//                writer.write(name + ", " + lastName);
//                writer.newLine();
//            }
//            writer.close();
//        } catch (IOException ioe){
//            System.out.println("Wystąpił błąd: " + ioe.toString());
//        } finally {
//            System.out.println("Sprzątam");
//        }

    }
}
