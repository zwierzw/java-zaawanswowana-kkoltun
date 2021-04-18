package wzorce.com.add.efektUboczny;

import java.util.Arrays;

public class EfektUboczny {
    public static void main(String[] args) {
        Child john = new Child("John", "Rambo");
        System.out.println(john);
//        Child[] children = new Child[1];
//        children[0] = john;
//        System.out.println(Arrays.toString(children));
//
//        john.setSurname("Terminator");
//
//        System.out.println(Arrays.toString(children));
//
        ChildrenRepo repo = new ChildrenRepo();
        repo.addChild(john);
        System.out.println(repo);

        System.out.println(john);

    }
}
