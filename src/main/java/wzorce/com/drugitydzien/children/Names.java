package wzorce.com.drugitydzien.children;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Names implements ChildrenRepository  {
    List<String> names = new ArrayList<>();


    @Override
    public boolean addToList(String name) {
        return names.add(name);
    }

    @Override
    public List<String> getChildrenList() {
        return names;
    }

    @Override
    public void sortChildren() {
        names = names.stream()
                .sorted()   //.sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

//        Collections.sort(names);

//        Comparator<String> comparator = String::compareTo;
//        names.sort(comparator);

//        Comparator<String> comparator = (string1, string2) -> string2.compareTo(string1);
//        names.sort(comparator);

//        Integer.compareTo(string1.length().compareTo(string2.length))
    }

    @Override
    public void removeDuplicates() {
//        Rozwiązanie 4
//        Set<String> set = new HashSet<>(names);
//        List<String> tempList = new ArrayList<>(set);
//        names = tempList;

//        Rozwiązanie 3
//        names = new ArrayList(new HashSet((names)));

//        Rozwiązanie 1
        names = names.stream()
                .distinct()
                .collect(Collectors.toList());

//        Rozwiązanie 2
//        List<String> tempList = new ArrayList<>();
//        for (int i = 0 ; i <names.size(); i++){
//            String tempName = names.get(i);
//            if(!tempList.contains(tempName)){
//                tempList.add(tempName);
//            }
//        }
//        names = tempList;
    }


    @Override
    public void namesToUpperCase() {

//        for (int i = 0; i < names.size(); i++){
//            String tempName = names.get(i);
//            tempName = tempName.toUpperCase();
//            names.set(i, tempName);
//        }

//
//        Function<String, String> f = new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return null;
//            }
//        }

        Function<String, String> f = name -> name.toUpperCase();
        names = names.stream().map(f).collect(Collectors.toList());

    }

    @Override
    public void namesToLowerCase() {
        names = names.stream()
                .map(name -> name.toLowerCase())
                .collect(Collectors.toList());

    }


    @Override
    public String toString() {
        return "Names{" +
                "names=" + names +
                '}';
    }
}
