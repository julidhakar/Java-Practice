package src.main.Colleations.CustomHasmap;

public class MyHashMapTest {

    public static void main(String[] args){
        MyHashMap<Integer, String> myHashMap = new MyHashMap<>(16);

        myHashMap.put(1,"abc");
        myHashMap.put(1,"xyz");
        myHashMap.put(2,"nvskjnvs");
        myHashMap.display();
    }
}
