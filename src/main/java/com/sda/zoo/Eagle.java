package com.sda.zoo;

public class Eagle implements FlyBehavior{

    @Override
    public void fly (double height){
        System.out.println("Eagle flying at " + height);
    }

}
