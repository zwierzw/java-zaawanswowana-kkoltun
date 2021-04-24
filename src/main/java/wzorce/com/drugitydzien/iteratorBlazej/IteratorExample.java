package wzorce.com.drugitydzien.iteratorBlazej;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Adam");
        names.add("Terminator");

        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
