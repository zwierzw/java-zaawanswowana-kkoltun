package com.sda.collections.basketball;

import java.util.function.Predicate;

public class HigherThan180 implements Predicate<Player> {
    @Override
    public boolean test(Player player) {
        return player.getHeight() > 180;
    }
}
