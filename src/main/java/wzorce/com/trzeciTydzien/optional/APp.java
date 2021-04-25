package wzorce.com.trzeciTydzien.optional;

import java.util.Optional;
import java.util.function.Consumer;

public class APp {
    public static void main(String[] args) {
        Repo repo = new Repo("dane w repo");

//        Repo repo = new Repo(null);

        if(repo.getData() != null)
        System.out.println(repo.getData());

        Optional<String> dataOptional = repo.getOptionalData();
        if (dataOptional.isPresent()){
            System.out.println("Print from optional");
            System.out.println(dataOptional.get());
        }

        //void accept(T t);
        Consumer<String> consumer = data -> System.out.println(data + "Hello from lambda");
        dataOptional.isPresent();

        repo.getOptionalData().ifPresent(data -> System.out.println(data + "Hello from lambda"));

    }
}
