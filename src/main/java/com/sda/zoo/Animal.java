package com.sda.zoo;

public abstract class Animal {
    private boolean eatsMeat;

    abstract void eat(String something);

    boolean doYouEatMeat(){
        return eatsMeat;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "eatsMeat=" + eatsMeat +
                '}';
    }
}
