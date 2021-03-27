package com.sda.collections.basketball;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

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
