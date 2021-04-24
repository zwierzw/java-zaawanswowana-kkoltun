package wzorce.com.drugitydzien.blazejRozwiazanie;

import java.util.List;

public interface IChildrenRepository {

    boolean addChild(String child);

    String getChildren();

    void sortChildren();

    void removeDuplicates();

    void setNamesToUpperCase();

    void setNamesToLowerCase();
}
