package src.main.threads.producerConsumer.ConcurrentModification;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable{
    List<Integer> sharedqueue;

    Producer(){
        sharedqueue = new ArrayList<>();
    }

    @Override
    public void run(){
        synchronized (this) {
            for (int i = 0; i <= 10; i++) {
                if (sharedqueue.size() == 10) {
                    System.out.println("list is full, waiting for product to be consumed");
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    System.out.println("adding products into list to be consumed");
                    sharedqueue.add(i);
                    notify();
                }
            }
        }



    }
}
