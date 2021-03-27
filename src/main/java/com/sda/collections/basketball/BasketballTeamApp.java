package com.sda.collections.basketball;

import java.util.*;

public class BasketballTeamApp {
    public static void main(String[] args) {
        BasketballTeam basketballTeam = new BasketballTeam();
        Player leBron = new Player("James", "LeBron", 200);
        basketballTeam.addPlayer(leBron);
        basketballTeam.addPlayer(leBron);


        System.out.println(basketballTeam.getPayers());

        Player leBron2 = new Player("James", "LeBron", 200);
        basketballTeam.addPlayer(leBron2);
        System.out.println(basketballTeam.getPayers());

        System.out.println("Tacy sami: " + leBron.equals(leBron2));
        leBron.hashCode();
        leBron2.hashCode();

        System.out.println(leBron.compareTo(leBron2));


        List<Player> playerList = new ArrayList<>();
        playerList.add(leBron);
        Player gortat = new Player("Marcin", "Gortat", 211);
        playerList.add(gortat);
        Player malysz = new Player("Adam", "Malysz", 170);
        playerList.add(malysz);

        System.out.println("Przed:");
        System.out.println(playerList);

        System.out.println("Po:");
        //naturalny szyk:
        // playerList.sort(null);

        // Collections.sort przyjmie do siebie tylko listy, które implementują comparatora
        Collections.sort(playerList);
        System.out.println(playerList);

        //odwrócony
        System.out.println("Odwrócony szyk");
        playerList.sort(Comparator.reverseOrder());
        System.out.println(playerList);


        //użycie Optionala!
        System.out.println("Użycie Optional");
        basketballTeam.addPlayer(gortat);
        System.out.println(basketballTeam.getHigherThan200());


        System.out.println(basketballTeam.getPlayersHigherThan200());
    }
}
