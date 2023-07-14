package src.main.java8.FunctionalInterface.predicate;

import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args){

        Predicate<Integer> pred =  i -> i<19;
       // System.out.println(pred.test(11));

        Predicate<Integer> pred1 = i -> i>10;

        System.out.println(pred.and(pred1).test(11));


    }
}
