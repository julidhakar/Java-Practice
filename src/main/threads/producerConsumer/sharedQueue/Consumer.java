package src.main.threads.producerConsumer.sharedQueue;

import java.util.Random;

public class Consumer implements Runnable{

    @Override
    public void run(){


            synchronized (SharedQueue.queue) {
                while(true) {
                if (SharedQueue.queue.size() == 10) {
                    System.out.println("queue is full");
                    try {
                        SharedQueue.queue.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                while (SharedQueue.queue.size() < 10) {
                    Random r = new Random();
                    SharedQueue.queue.add(r.nextInt());
                    System.out.println("item added" + r);
                    SharedQueue.queue.notify();
                }




          /*  while(SharedQueue.queue.size() !=0){
                if(SharedQueue.queue.size() ==0) {
                    System.out.println("queue is empty, waiting on product to be added");
                    try {
                        SharedQueue.queue.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }else {
                    int i = SharedQueue.queue.remove();
                    System.out.println("item consumed from queue is" + i);
                    SharedQueue.queue.notify();
                }
            }
                */
            }
        }
    }
}
