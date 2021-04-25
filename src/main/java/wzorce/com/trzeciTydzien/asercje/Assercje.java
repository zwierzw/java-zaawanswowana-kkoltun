package wzorce.com.trzeciTydzien.asercje;

import java.util.Scanner;
//aby włączyć asercje należy dodać -ea w argumentach uruchomienia w vm options (po lewej od strzałki start)
//nie włączamy asercji na środowisku produkcyjnym
public class Assercje {
    public static void main(String[] args) {
        System.out.println("Podaj numer");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number);

        //wartość bezwzględna z liczby
        number = Math.abs(number);
        System.out.println(number);
        //czy tu mogę mieć pewność, że number nie jest ujemny
        number = -1; //psikus

//        assert number >0;
        assert number >0 : number;
        System.out.println("po asercji");



    }
}
