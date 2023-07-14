package src.main.java8.lambdaExpression.collectionLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorting {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(10);
        list.add(2);
        list.add(7);

        Collections.sort(list,(o1,o2) -> (o1>o2) ? -1 : (o1<o2) ? 1 : 0);
        System.out.println(list);

        Collections.sort(list,(o1,o2) -> (o1<o2) ? -1 : (o1>o2) ? 1 :0);

        System.out.println(list);

    }
}
