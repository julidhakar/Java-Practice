package src.main.java8.lambdaExpression.convertListInToMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertListToMapTest {

    public static void main(String[] args){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"hh"));
        list.add(new Employee(2,"bb"));
        list.add(new Employee(0,"kjkj"));
        list.add(new Employee(10,"uyu"));

        System.out.println(list);
        Map<Integer,String> map = new HashMap<>();

        list.forEach((n) -> map.put(n.getEmpid(),n.getName()));
        System.out.println(map);
    }
}
