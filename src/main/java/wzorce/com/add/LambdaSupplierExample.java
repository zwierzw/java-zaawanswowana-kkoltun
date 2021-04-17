package wzorce.com.add;

import java.util.function.Supplier;

public class LambdaSupplierExample {
    public static void main(String[] args) {

//        @FunctionalInterface
//        public interface Supplier<T> {
//
//            /**
//             * Gets a result.
//             *
//             * @return a result
//             */
//            T get();
//        }

        Supplier<String> stringSupplier;
        //1. Skopiuj argumenty
        //2. Postaw znaczek lambda
        //3. Dostarcz implementację

        stringSupplier = () -> "Hello";
        stringSupplier = () -> "";
        stringSupplier = () -> {
            return "Hello";
        };
        stringSupplier = () -> "234234";

        String result = stringSupplier.get();
        System.out.println(result);

    }
}
