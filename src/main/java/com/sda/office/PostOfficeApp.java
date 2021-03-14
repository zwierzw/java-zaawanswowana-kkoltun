package com.sda.office;

public class PostOfficeApp {
    public static void main(String[] args) {
        PackageStatus sent = PackageStatus.SENT;
        System.out.println(sent);

        Package paczka = new Package(PackageStatus.COURIER, "zabytki");
        System.out.println(paczka);

        paczka.setStatus(PackageStatus.LOST);
        System.out.println(paczka);
    }
}
