package com.sda.enum_home.postOffice;

import java.util.Scanner;

public class PostOfficeApp {
    public static void main(String[] args) {
        Package box1 = new Package("Mis");
        System.out.println(box1);

        box1.changeStatus(PackageStatus.COURIER);
        System.out.println(box1);

        box1.changeStatus(PackageStatus.LOST);
        System.out.println(box1);

        box1.changeStatus(PackageStatus.valueOf("TRAVELLING"));
        System.out.println(box1);
        System.out.println();
        System.out.println();


        //Zadanie 9
        Package box2 = new Package("Rys");
        Package box3 = new Package("Rys");


        do {
            System.out.println(box2);
            PackageStatus[] ps = PackageStatus.values();
            System.out.println("Możliwe statusy paczek:");
            for (PackageStatus packageStatus : ps) {
                System.out.println(packageStatus);
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj status paczki: ");
            String text = scanner.nextLine();

            for (PackageStatus packageStatus2 : ps) {
                if (packageStatus2.name().equals(text)) {
                    box2.changeStatus(PackageStatus.valueOf(text));
                    System.out.println();
                    System.out.println(box2);
                    return;
                }
            }
            if (box2.getPs() == box3.getPs()) {
                System.out.println();
                System.out.println("Nieprawidłowa nazwa paczki!");
            }

        } while (box2 != box3);
    }
}
