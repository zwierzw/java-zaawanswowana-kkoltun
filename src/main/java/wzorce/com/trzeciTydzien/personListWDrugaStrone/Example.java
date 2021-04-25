package wzorce.com.trzeciTydzien.personListWDrugaStrone;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        Map<String, List<String>> m = new HashMap<>();
        List<String> names = new ArrayList<>();
        names.add("Kowalski");
        m.put("Jan", names);

        List<String> names2 = new ArrayList<>();
        names2.add("Kowalski");
        names2.add("Frankowski");

        m.put("Tomasz", names2);

        System.out.println(m);

       Set<Map.Entry<String, List<String>>> klucze = m.entrySet();
       for (Map.Entry<String, List<String>> entry : klucze){
//           System.out.println(entry);
           System.out.println("klucz" + entry.getKey());
           System.out.println("wartosc" + entry.getValue());
           System.out.println();
       }
    }
}
