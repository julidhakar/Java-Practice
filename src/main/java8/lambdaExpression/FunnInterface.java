package src.main.java8.lambdaExpression;

@FunctionalInterface
public interface FunnInterface {

    public int sum(int a, int b);

    default void display(){
        System.out.println("hello there");
    }
}
