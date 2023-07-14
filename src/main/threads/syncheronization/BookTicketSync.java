package src.main.threads.syncheronization;

public class BookTicketSync implements Runnable {

    private int available_ticket = 1;

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is waiting for ticket");
        synchronized (this) {
            if (available_ticket > 0) {
                System.out.println(Thread.currentThread().getName() + " is going to book the ticket");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                available_ticket--;
                System.out.println("ticket is booked for : " + Thread.currentThread().getName());
                System.out.println("available tickets : " + available_ticket);
            } else {
                System.out.println("sorry there is no available ticket : " + Thread.currentThread().getName());
            }
        }


    }


}
