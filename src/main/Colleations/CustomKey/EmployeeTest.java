package src.main.Colleations.CustomKey;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EmployeeTest {

    public static void main(String[] args){
        Map<Employee, String> hashmap = new HashMap<>();
        hashmap.put(new Employee(1,"abc"), "cjlcldda");
        hashmap.put(new Employee(2,"xyz"), "sdnjacnlanclancla");
        hashmap.put(new Employee(1,"ljclkdj"), "jdkjHKJASD");
        hashmap.put(new Employee(1,"abc"), "fjhekjhejvhjf");  //same key hence value cjlcldda is overridden by jdkjHKJASD
        System.out.println(hashmap);
        System.out.println("size of map : " + hashmap.size());

     /*   for(Map.Entry<Employee, String> entry: hashmap.entrySet()){
            entry.getKey();
            if(hashmap.containsKey(1)){
                hashmap.get(1);
            }
        } */

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        if(set.contains(1))
            for(Integer i : set){
                System.out.println(i);
            }
    }
}
