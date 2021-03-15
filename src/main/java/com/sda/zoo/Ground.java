package com.sda.zoo;

public class Ground {
    void runOnGround(RunBehaviour runBehaviour, double speed){
        System.out.println(runBehaviour.toString() + " biega po ziemi");
        runBehaviour.run(speed);
    }

}
