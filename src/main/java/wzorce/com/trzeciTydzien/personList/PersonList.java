package wzorce.com.trzeciTydzien.personList;

//Utworz program do przechowywania listy osob o okreslonym imieniu
//Program ma funkcje dodaj osobe
//Wyswietl osoby o okreslonym imieniu
//Uwaga program ma przechowywac liste osob o okreslonym imieniu, nie jedna osobe
//Pod kluczem imie przechowujemy liste osob o tym imieniu

import java.util.*;
import java.util.stream.Collectors;

public class PersonList {
    private List<Person> personList = new ArrayList<>();
    private Map<String, Person> personMap = new HashMap<>();


    public Map<String, Person> addPerson (Person person){
        personMap.put(person.getName(), person);
        return personMap;
    }

    public List<Person> sameNamePersonList(String nameGiven){
        for (Person person: personMap.values()) {
            personList.add(personMap.get(nameGiven));
        }
        return personList;
    }
}
