package src.main.java8.FunctionalInterface.consumer;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerTest {

    public static void main(String[] args){

        Consumer<Integer> display = a -> System.out.println(a);

       // display.accept(10);

        Consumer<Integer> modify = a -> System.out.println("value : + " + a*2);

        modify.andThen(display).accept(10);



        Consumer<List<Integer>> listModification = l -> {
            for(int i =0;  i<3; i++){
                l.set(i, l.get(i)*2);
            }
        };

        Consumer<List<Integer>> displayList= l -> l.stream().forEach(a -> System.out.println(a));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(9);

        listModification.andThen(displayList).accept(list);
    }
}
