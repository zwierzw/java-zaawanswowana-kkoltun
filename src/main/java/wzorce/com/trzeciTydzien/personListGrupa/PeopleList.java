package wzorce.com.trzeciTydzien.personListGrupa;


import java.util.*;

public class PeopleList implements AddPeople {
    private Map<String, List<String>> peopleMap = new HashMap<>();

    public PeopleList() {
    }

    @Override
    public void addPeople(String name, String surname) {
        if (peopleMap.containsKey(name)) {
            List<String> value = peopleMap.get(name);
            value.add(surname);
        } else {
            List<String> surnames = new ArrayList<>();
            surnames.add(surname);
            peopleMap.put(name, surnames);
        }
    }

    @Override
    public String toString() {
        return peopleMap.toString();
    }
}

