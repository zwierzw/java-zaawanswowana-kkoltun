package wzorce.com.trzeciTydzien;

import java.util.Arrays;

public class Arguments {
    //program arguments w ustawiegniach konfiguracyjnych, startowych, to co tam wpiszemy trafia do tablicy args

    public static void main(String[] args) {
        System.out.println(args);
        System.out.println(args.length);
        System.out.println(Arrays.toString(args));
    }


}
