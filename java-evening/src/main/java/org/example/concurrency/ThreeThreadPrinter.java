package org.example.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreeThreadPrinter {

    // print numbers 1 - 100 using 3 threads
    // every number should be printed by separate thread from previous one
    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger(1);

        Runnable printer = new Runnable() {
            @Override
            public void run() {
                do {
                    synchronized (counter) {
                        int value = counter.getAndIncrement();
                        if (value >= 100) {
                            break;
                        }
                        System.out.println(Thread.currentThread().getName() + ": " + value);
                        counter.notifyAll();
                        try {
                            counter.wait(); // READ MORE: "cooperative concurrency"
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                } while (true);
            }
        };

        Thread t1 = new Thread(printer, "Thread 1");
        Thread t2 = new Thread(printer, "Thread 2");
        Thread t3 = new Thread(printer, "Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
