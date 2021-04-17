package wzorce.com.add;

public class SingletonTask {
    public static void main(String[] args) {
        Customer a = new Customer("John", 34);
        Customer b = new Customer("John", 34);

        NameRepoImpl nameRepo = new NameRepoImpl(5);
        NameRepoImpl nameRepo2 = new NameRepoImpl(5);

//        nie mogę utworzyć obiektu klasy, która jest singletonem, ponieważ konstruktor jest prywatny
//        SingletonSequenceGenerator generator = new SingletonSequenceGenerator();

        SingletonSequenceGenerator generator = SingletonSequenceGenerator.getInstance();
        System.out.println(generator);
        System.out.println(generator.getSequence());
        System.out.println(generator.getSequence());
        System.out.println(generator.getSequence());
        System.out.println(SingletonSequenceGenerator.getInstance().getSequence());

    }

}
