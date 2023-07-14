package src.main.threads.RaceCondition;

public class BookTicketTest {

    public static void main(String[] args){
        Runnable runnable = new BookTicket();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
    }
}
