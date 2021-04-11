package com.sda.concurrency.threads;

import java.util.concurrent.TimeUnit;

public class SleepingRunnable implements Runnable {
    private String name;
    private int seconds;

    public SleepingRunnable(String name, int seconds) {
        this.name = name;
        this.seconds = seconds;
    }

    @Override
    public void run() {
        //Zmodyfikuj run tak, aby wątek 4 razy przesypiał 5 sekund i wyświetlał swoje imię.
        try {
            for (int i = 0; i < 5; i++) {
                //Nowocześniejsze spanie
                TimeUnit.SECONDS.sleep(seconds);
                //Thread.sleep(1000 * seconds);
                System.out.println("Wątek " + name + " #" + i);
            }
        } catch (InterruptedException e) {
            System.out.println("Ktoś mnie obudził :c ");
        }
    }


}
