package src.main.threads.threadimplementationUsingRunnable;

public class MyRunnableThreadTest {

    public static void main(String[] args){
        Runnable runnable = new MyRunnableThread();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        t1.start();
        t2.start();
        t3.start();
    }
}
