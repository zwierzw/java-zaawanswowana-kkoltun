package wzorce.com.trzeciTydzien.personListGrupa;


import java.util.*;
import java.util.stream.Collectors;

public class PeopleList implements AddPeople {
    private Map<String, List<String>> peopleMap = new HashMap<>();

    public PeopleList() {
    }

    @Override
    public void addPeople(String name, String surname) {
        if (peopleMap.containsKey(name)) {
            List<String> value = peopleMap.get(name);

            if (!value.contains(surname)) {
                value.add(surname);
            }
        } else {
            List<String> surnames = new ArrayList<>();
            surnames.add(surname);
            peopleMap.put(name, surnames);
        }
    }

    //metoda zwracająca listę imion
    public List<String> listOfNames(String surname) {
        Set<Map.Entry<String, List<String>>> klucze = peopleMap.entrySet();
        List<String> listOfNamesofSurnam = new ArrayList<>();

        for (Map.Entry<String, List<String>> entry :
                klucze) {
            if (entry.getValue().contains(surname)) {
                listOfNamesofSurnam.add(entry.getKey());
            }
//
////            System.out.println(entry);
//            System.out.println("key " + entry.getKey());
//            System.out.println("value " + entry.getValue());
//            System.out.println();
        }
        return listOfNamesofSurnam;
    }

    //metoda zwracająca listę imion, rozwiązanie przez streamy
    public List<String> listOfNamesStream(String surname) {
        return peopleMap.entrySet().stream()
                .filter(entry -> entry.getValue().contains(surname))
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return peopleMap.toString();
    }
}

