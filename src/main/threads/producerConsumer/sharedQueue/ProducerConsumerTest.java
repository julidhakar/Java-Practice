package src.main.threads.producerConsumer.sharedQueue;

public class ProducerConsumerTest {

    public static void main(String[] args){
        Consumer consumer = new Consumer();
        Producer producer = new Producer();

        Thread t1 = new Thread(consumer);
        Thread t2 = new Thread(producer);
        t1.start();
        t2.start();
    }
}
