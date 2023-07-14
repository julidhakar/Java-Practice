package src.main.threads.syncheronization;

public class BookTicketSyncTest {

    public static void main(String[] args){
        Runnable runnable = new BookTicketSync();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();;
        t2.start();
    }
}
