package com.sda.collections_home.arrayList;

public class SDAArrayListApp {
    public static void main(String[] args) {
        SDAArrayList<String> stringSDAArrayList = new SDAArrayList<>();
        stringSDAArrayList.add("Jacek");
        stringSDAArrayList.add("Wojtek");
        stringSDAArrayList.add("Błażej");
        stringSDAArrayList.display();
        stringSDAArrayList.add("Tomek");
        stringSDAArrayList.add("Krzysiek");
        stringSDAArrayList.add("Romek");
        stringSDAArrayList.display();
        stringSDAArrayList.remove(1);
        stringSDAArrayList.display();
        System.out.println(stringSDAArrayList.get(3));
    }
}
