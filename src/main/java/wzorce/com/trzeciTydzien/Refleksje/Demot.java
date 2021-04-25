package wzorce.com.trzeciTydzien.Refleksje;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Demot {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {


        FootballPlayer player = new FootballPlayer("John", "Rambo");
        System.out.println(player);

        //pobieramy pola klasy
        Field[] fields = player.getClass().getDeclaredFields();
        System.out.println(Arrays.asList(fields));

        //pobieram konkretne pole z klasy FootballPlayer
        Field surname = player.getClass().getDeclaredField("name");
        //zmiana modyfikator dostępu
        surname.setAccessible(true);
        //ustawiamy nową wartość
//        surname.set(player, "psikus");

        String result = (String) surname.get(player);
        System.out.println(result);


//        System.out.println(player);


    }
}
