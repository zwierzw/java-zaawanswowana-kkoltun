package com.sda.concurrency.synchronization.counter;

public class DecrementThread extends Thread {

    private SimpleCounter counter;

    public DecrementThread(SimpleCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            counter.decrement();
        }

    }
}
