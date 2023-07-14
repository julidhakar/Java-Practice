package src.main.java8.lambdaExpression.CreateThreadUsingLambda;

public class CreateThread {

    public static void main(String[] args){

        Runnable mythread = () -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                }

        };
        Thread t1 = new Thread(mythread);
        Thread t2 = new Thread(mythread);
        t1.start();
        t2.start();
    }
}
