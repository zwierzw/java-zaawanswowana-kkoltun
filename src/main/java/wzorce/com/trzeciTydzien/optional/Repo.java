package wzorce.com.trzeciTydzien.optional;

import java.util.Optional;

public class Repo {
    private String data;

    public Repo(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

//stosujemy tam, gdzie możemy spodziewać się null, zastępujemy taką metodę zmetodą zwracającą optional
    //Przykładowo nie będziemy stosowali optional w klasie Child na metodzie getName(), tam nadal typem zwracanym będzie String
    public Optional<String> getOptionalData() {
//        //Używamy, kiedy wiemy, że data jest null
//        if (data == null) {
//            return Optional.empty();
//        }
//
//        //kiedy wiemy, że data nie jest null
//        //rzuci wyjątkiem, kiedy data będzie null
//        if (data != null) {
//            return Optional.of(data);
//        }

        //tutaj obsługujemy oba przypadki, zarówna dla nul jak i nie nulla
        return Optional.ofNullable(data);
    }
}
