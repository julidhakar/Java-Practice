package src.main.threads.producerConsumer.ConcurrentModification;

public class Consumer implements Runnable{

     Producer prod;

    Consumer(Producer prod){
        this.prod = prod;
    }

    @Override
    public void run(){

        synchronized (this.prod){
            if(prod.sharedqueue.size()==0){
                System.out.println("queue is empty, waiting for item to be added");
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else{
                for(Integer i : prod.sharedqueue){
                    System.out.println("product consumed : " + prod.sharedqueue.remove(i));
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                notify();
            }
        }

    }

    public static class ProducerConsumerDriver {

        public static void main(String[] args){
            Runnable runnable = new Producer();
            Runnable runnable1 = new Consumer((Producer) runnable);

            Thread producer = new Thread(runnable);
            Thread consumer = new Thread(runnable1);
            producer.start();

            consumer.start();

        }
    }
}
