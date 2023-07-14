package src.main.java8.FunctionalInterface.consumer;

import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerTest {

    public static void main(String[] args){

        BiConsumer<Integer, Integer> modify = (a, b) -> {

         /*   if(a>b){
                System.out.println( a + " is gratter thn " + b);
            }else{
                System.out.println(b + " is gratter thn " + a);
            } */

            System.out.println(a*2 + " : " + b*3);

        };

        BiConsumer<Integer, Integer> display = (a,b) ->{
            System.out.println(a + " : " + b);
        };


        modify.andThen(display).accept(10,20);
    }
}
