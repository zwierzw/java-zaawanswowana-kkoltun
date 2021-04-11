package com.sda.concurrency.synchronization.counter;

public class CounterApp {
    public static void main(String[] args) { //odpalenie maina to w dużym uproszczeniu odpalenie nowego wątku
        //Wspólny counter na którym będą pracować wątki
        SimpleCounter simpleCounter = new SimpleCounter();

        //Watki zwiększające/zmniejszające
        IncrementThread incrementThread = new IncrementThread(simpleCounter);
        DecrementThread decrementThread = new DecrementThread(simpleCounter);

        //Start pracy wątków "pracowników"
        incrementThread.start();
        decrementThread.start();

        //W wątku "kierowniku" zaczkaj aż wątki skończą pracę
        try {
            incrementThread.join(); //chcemy poczekać na zakończenie pracy wątku increment
            decrementThread.join(); //tutaj czekamy na zakóńczenie pracy wątku decrement
        } catch (InterruptedException e) {
            System.out.println("Ktoś mi przerwał czekanie!");
        } finally {
            System.out.println("Czyszczę");
        }

        System.out.println(simpleCounter);

    }
}
