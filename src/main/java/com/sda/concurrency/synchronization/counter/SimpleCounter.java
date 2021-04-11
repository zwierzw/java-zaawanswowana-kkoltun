package com.sda.concurrency.synchronization.counter;

import java.util.concurrent.atomic.AtomicInteger;

public class SimpleCounter {
    private AtomicInteger value = new AtomicInteger(); //ten int rozszerza funkcjonalność inta, jeden wątek drugiemu nie będzie na pewno przeszkadzał

    synchronized void increment(){ //dodanie synchrozied sprawia że wątki są zsynchronizowane
        value.incrementAndGet();
    }

    synchronized void decrement(){ //analgoicznie jak wyżej
        value.decrementAndGet();
    }

    public int getValue() {
        return value.get();
    }

    @Override
    public String toString() {
        return "SimpleCounter{" +
                "value=" + value +
                '}';
    }
}
