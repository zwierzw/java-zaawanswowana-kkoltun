package wzorce.com.add;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NameRepoImpl implements NamesRepo {

    int maxSize;
    private List<String> names;

    public NameRepoImpl(int maxSize) {
        this.maxSize = maxSize;
        //w nawiasie podano początkowy rozmiar listy, jeśli go przekroczymy lista powiększy swój rozmiar
        this.names = new ArrayList<>(maxSize);
    }

    @Override
    public void sort() {
        //  Collections.sort(names);
        names = names.stream().sorted().collect(Collectors.toList());
//        names.sort();
    }

    @Override
    public void add(String name) {
        if (!name.isBlank() && !isRepoFull()) {
            names.add(name);
        }
    }

    @Override
    public void remove(String nameToRemove) {
        names.removeIf(name -> name.equalsIgnoreCase(nameToRemove));

    }

    @Override
    public boolean isRepoFull() {
        boolean isFull = names.size() >= maxSize;
        return isFull;
    }

    @Override
    public String toString() {
        return names.toString();
    }
}
