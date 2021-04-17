package wzorce.com.add;

import java.util.function.Predicate;

public class Predykat {
    public static void main(String[] args) {
//        public interface Predicate<T> {
//
//            /**
//             * Evaluates this predicate on the given argument.
//             *
//             * @param t the input argument
//             * @return {@code true} if the input argument matches the predicate,
//             * otherwise {@code false}
//             */
//            boolean test(T t);

        String john = "John";
        Predicate<String> predicate;
        //1. Skopiuj argumenty
        //2. Postaw znaczek lambda
        //3. Dostarcz implementację

        predicate = (String name) -> name.equals("John");
        predicate = name -> name.equals("john");
        System.out.println(predicate.test(john));
    }
}
