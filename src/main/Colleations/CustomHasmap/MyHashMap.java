package src.main.Colleations.CustomHasmap;

public class MyHashMap<K,V> {

    private  static int capacity = 16;

    private Entry<K,V> table[];

    public MyHashMap(){
        this.table = new Entry[capacity];
    }

    public MyHashMap(int capacity){
        this.table = new Entry[capacity];
    }

    public void put(K key, V value){
        int index = index(key);
        Entry<K,V> node = new Entry<>(key,value,null);

        if(table[index] == null){
            table[index] = node;
        }else{
            Entry<K,V> previousNode = null;
            Entry<K,V> currentNode = table[index];
            while(currentNode != null){
                if(currentNode.getKey().equals(key)){
                    currentNode.setValue(value);
                }
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            if(previousNode != null){
                previousNode.setNext(node);

            }

        }

    }
     public V get(K key){
        int index = index(key);
        V value = null;
        Entry<K,V> node = table[index];
            while(node != null){
                if(node.getKey().equals(key)){
                    value = node.getValue();
                    break;
                }else{
                    node = node.getNext();
                }

            }return value;

     }

     public void display(){
        for(int i = 0; i< capacity; i++){
            Entry<K,V> currentNode = table[i];


            if(table[i] != null){
                while(currentNode != null){
                    System.out.println("key : " +  currentNode.getKey() + "value : " + currentNode.getValue());
                    currentNode = currentNode.getNext();

                }
            }
            
        }
     }

    public int index(K key){
        return key.hashCode() % capacity;
    }
}
