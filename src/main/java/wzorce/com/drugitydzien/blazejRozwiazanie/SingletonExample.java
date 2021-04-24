package wzorce.com.drugitydzien.blazejRozwiazanie;

public class SingletonExample {
    public static void main(String[] args) {
        IChildrenRepository repo = new ChildrenRepositoryBasic();
        repo.addChild("John");
        repo.addChild("John");

        IChildrenRepository repo2 = new ChildrenRepositoryBasic();
        repo2.addChild("John");
        repo2.addChild("John");

        System.out.println(repo2);

        System.out.println(ChildNumberGeneratorSingleton.getInstance().getNumber());

    }


}
