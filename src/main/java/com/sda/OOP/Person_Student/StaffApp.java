package com.sda.OOP.Person_Student;

public class StaffApp {
    public static void main(String[] args) {
        Person student = new Student("Jacek", "Wrocław", "budownictwo", 2,123.18f);
        Person lecturer = new Lecturer("Tomek", "Kraków", "chemia", 456.23f);
        System.out.println(student);
        System.out.println(lecturer);
        // Czemu ten String nie działa?????????

    }
}
