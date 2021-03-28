package com.sda.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OperationsApp {
    public static void main(String[] args) {
        //relatywna ścieżka - od folderu głównego
        Path relativePath = Paths.get("input.txt");
        System.out.println(relativePath + " istnieje: " + Files.exists(relativePath));


        //absolutna ścieżke = od samego początku lokacji folderu głównego
        //musisz prawy przycisk myszy na folder główny java_zaaw....-> copy -> absolutePath || copyPath -> absolutePath
        Path absolutePath = Paths.get ("C:\\Users\\Wojtek\\IdeaProjects\\java_zaaw_zdjavapo77\\input.txt");

        System.out.println(absolutePath + " istnieje: " + Files.exists(absolutePath));
        System.out.println(absolutePath + " jest plikiem: " + Files.isRegularFile(absolutePath));

        //To poniżej to ścieżka do foleru
        Path projectRootDirectory = Paths.get("C:\\Users\\Wojtek\\IdeaProjects\\java_zaaw_zdjavapo77");
        //To poniżej to wejście do pliku
        Path inputPath = projectRootDirectory.resolve ("input.txt");

        System.out.println(inputPath + " jest plikiem: " + Files.isRegularFile(inputPath));

        //MOżna wchodzić do folderu podając kolejne foldery od dysku
        Path path = Paths.get("C", "Windows", "system.ini");
        //Poniżej sprawdzamy czy możemy w ogóle zapisywać w danym folderze, czy java nie ma dostępu do niego, bo np. plik systemowy
        System.out.println("Zapis do pliku: " + Files.isWritable(path));


        //Poniżej
        Path dyskC = Paths.get("C:\\Users\\Wojtek\\IdeaProjects\\java_zaaw_zdjavapo77");
        try {
            Set<Path> pathSet = Files.list(dyskC).collect(Collectors.toSet());
            System.out.println(pathSet.toString());
        } catch (IOException ioe){
            System.out.println("Był błąd IOException: " + ioe.toString());
        } finally {
            System.out.println("sprzątam");
        }


        //Demo
        try{
            Predicate<Path> isFile = anyPath -> Files.isRegularFile(anyPath);
            Consumer<Path> printPath = anyPath -> System.out.println("Plik" + anyPath);
            Files.list(projectRootDirectory)
                    .filter(isFile)
                    .forEach(printPath);

        } catch (IOException exception){
            System.out.println("Wystąpił błąd: " + exception);
        }

    }
}
