package wzorce.com.drugitydzien.blazejRozwiazanie;

import jdk.jfr.Event;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ChildrenRepositoryBasic implements IChildrenRepository {

    private List<String> children = new ArrayList<>();

    @Override
    public boolean addChild(String child) {
        if (isValid(child)) {
            EventCounterSingleton.getInstance().addEvent("1.dodano dziecko do listy\n");
            return children.add(child.trim() + ChildNumberGeneratorSingleton.getInstance().getNumber());
        } else {
            EventCounterSingleton.getInstance().addEvent("1.Nieprawidłowe dodanie dziecka do listy\n");
            return false;
        }

    }

    @Override
    public String getChildren() {
        EventCounterSingleton.getInstance().addEvent("2.wyswieltono liste dzieci\n");
        return children.toString();
    }


    @Override
    public void sortChildren() {
        Collections.sort(children);
        EventCounterSingleton.getInstance().addEvent("3.posortowano liste dzieci\n");
//        children = children.stream().sorted().collect(Collectors.toList());
//        children.sort((s1, s2) -> s1.compareTo(s2));
//        children.sort(String::compareTo);
    }
    @Override
    public void removeDuplicates() {
        EventCounterSingleton.getInstance().addEvent("4.wyczyszczono z duplikatów liste dzieci\n");
//        children = new ArrayList<>(new HashSet<>(children));
        children = children.stream().distinct().collect(Collectors.toList());
    }

    @Override
    public void setNamesToUpperCase() {
        EventCounterSingleton.getInstance().addEvent("5.zmieniono wszystkie litery imion dzieci na duze\n");
        children = children.stream().map(child -> child.toUpperCase()).collect(Collectors.toList());
//        for (int i = 0; i < children.size(); i++) {
//            children.set(i, children.get(i).toUpperCase());
//        }
    }

    @Override
    public void setNamesToLowerCase() {
        EventCounterSingleton.getInstance().addEvent("6.zmieniono wszystkie litery imion dzieci na male\n");
        for (int i = 0; i < children.size(); i++) {
            children.set(i, children.get(i).toLowerCase());
        }
    }

    @Override
    public String toString() {
        return "ChildrenRepository{" +
                "children=" + children +
                '}';
    }

    private boolean isValid(String child) {
        if (child == null || child.isBlank()) {
            return false;
        }
        Pattern pattern = Pattern.compile("[a-z A-Z]+");
        return pattern.matcher(child).matches();
    }

}