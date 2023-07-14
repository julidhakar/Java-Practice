package src.main.java8.lambdaExpression;

public class FunInterfaceTest {

    public static void main(String[] args){

        FunnInterface obj = (a,b) -> {
            int x = a+b;
            System.out.println("sum is : " + x);
            return x;
        };

        obj.sum(5, 6);
        obj.display();
    }
}
