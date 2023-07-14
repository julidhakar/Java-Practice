package src.main.threads.RaceCondition;

public class BookTicket implements Runnable {

    private int available_ticket = 1;

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " is waiting for ticket");
        if(available_ticket >0){
            System.out.println(Thread.currentThread().getName() + " is going to book the ticket : ");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            available_ticket--;
            System.out.println(Thread.currentThread().getName() + " Booked the ticket");
            System.out.println("available tickets are : " + available_ticket);
        }else{
            System.out.println("tickets not available");
        }

    }
}