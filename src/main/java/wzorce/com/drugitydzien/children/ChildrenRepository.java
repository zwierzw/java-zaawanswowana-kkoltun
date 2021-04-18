package wzorce.com.drugitydzien.children;

import java.util.List;

public interface ChildrenRepository {
     boolean addToList(String name);
     List<String> getChildrenList();
     void sortChildren();
     void removeDuplicates();
     void namesToUpperCase();
     void namesToLowerCase();

}
