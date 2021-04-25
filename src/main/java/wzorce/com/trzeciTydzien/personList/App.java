package wzorce.com.trzeciTydzien.personList;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       Person person1 = new Person("Jan", "Kowalski");
       Person person2 = new Person("Jan", "Tomaszewski");
       Person person3 = new Person("Konrad", "Borecki");

        PersonList personList = new PersonList();
        personList.addPerson(person1);
        personList.addPerson(person2);
        personList.addPerson(person3);

        System.out.println(personList.sameNamePersonList("Jan"));

    }
}
