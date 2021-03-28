package com.sda.collections.basketball;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BasketballTeam {

    private Set<Player> team = new HashSet<>();

    public void addPlayer(Player player){
        team.add(player);
    }

    public Set<Player> getPayers(){
        return team;
    }

    public Optional<Player> getHigherThan200 (){
        for (Player player : team){
            if (player.getHeight() >200){
                return Optional.of(player);
            }
        }
        return Optional.empty();
    }

    //Użycie lambdy
    public Set<Player> getHigherThan180ForLoop() {
        Predicate<Player> playerPredicate = new HigherThan180();
        Set<Player> passed = new HashSet<>();
        for (Player player : team) {
            if (playerPredicate.test(player)) {
                passed.add(player);
            }
        }
        return passed;
    }

    //użycie strumienia
    public Set<Player> getHigherThan180ForStream() {
        Predicate<Player>  higherThan180 = new HigherThan180();
        Set<Player> passed = new HashSet<>();

        passed = team.stream()
                .filter(higherThan180)
                .collect(Collectors.toSet());

        return passed;
    }

    //Połączenie strumienia i lambd, najkrótsza wersja
    public Set<Player> getHigherThan180ForStreamAbbreviation() {
       return team.stream()
               .filter(player -> player.getHeight() >180)
               .collect(Collectors.toSet());
    }

    //demo - co można z tym robić
    public Set<String> getPlayerNames() {
//        Function<Player,String> getName = player -> player.getFirstName();
        return team.stream()
                .filter(player -> player.getHeight() >180)
                .map(player -> player.getFirstName())
                .collect(Collectors.toSet());
    }



    public Set<Player> getPlayersHigherThan200 (){
        Set<Player> foundPlayers = new HashSet<>();
        for (Player player : team){
            if (player.getHeight() >200){
                foundPlayers.add(player);
            }
        }
        return foundPlayers;
    }

    @Override
    public String toString() {
        return "BasketballTeam{" +
                "team=" + team +
                '}';
    }
}
