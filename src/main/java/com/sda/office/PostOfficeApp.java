package com.sda.office;

import java.time.LocalDate;
import java.time.Month;

public class PostOfficeApp {
    public static void main(String[] args) {
        PackageStatus sent = PackageStatus.SENT;
        System.out.println(sent);

        Package paczka = new Package(PackageStatus.COURIER, "zabytki");
        System.out.println(paczka);

        paczka.setStatus(PackageStatus.LOST);
        System.out.println(paczka);

        PackageStatus[] packageStatuses = PackageStatus.values();
        for(PackageStatus packageStatus : packageStatuses){
            System.out.println(packageStatus);
        }

        PackageStatus packageStatus = PackageStatus.valueOf("SENT");
        System.out.println(packageStatus);

        //przykłady użycia enuma
        LocalDate data = LocalDate.of(1992, Month.DECEMBER,12);
        Month september = Month.of(9);
        System.out.println(data);
        System.out.println(september);

        //Użycie statycznej metody enum
        PackageStatus[] errorStatuses = PackageStatus.getErrorStatuses();
        for (PackageStatus packages: errorStatuses){
            System.out.println(packages);
        }

        //Uzycie niestatycznej metody enum
        System.out.println(PackageStatus.LOST.isError());
        System.out.println(PackageStatus.DELIVERED.isError());
        System.out.println(PackageStatus.RETURNED.isError());



    }
}
