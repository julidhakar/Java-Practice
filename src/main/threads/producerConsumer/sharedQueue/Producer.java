package src.main.threads.producerConsumer.sharedQueue;

import java.util.Random;

public class Producer implements Runnable{

    @Override
    public void run() {


            synchronized (SharedQueue.queue) {
                while (true) {

                if (SharedQueue.queue.isEmpty()) {
                    System.out.println("queue is empty");
                    try {
                        SharedQueue.queue.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                while (SharedQueue.queue.size() != 0) {
                    SharedQueue.queue.remove();
                    System.out.println("item consumed");
                    SharedQueue.queue.notify();
                }


          /*  while(SharedQueue.queue.size() < 10){

                if(SharedQueue.queue.size()==10) {
                    System.out.println("queue is full, waiting on product consumption");
                    try {
                        SharedQueue.queue.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }else {
                    Random r = new Random();
                    SharedQueue.queue.add(r.nextInt());
                    System.out.println("item added to the list");
                    SharedQueue.queue.notify();
                }
            }
                */
            }
        }
    }


}
