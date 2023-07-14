package src.main.singleton;

public class SingletomTest {

    public static void main(String[] args){
        SinglitonClass obje1 = SinglitonClass.getInstance();
        SinglitonClass object2 = SinglitonClass.getInstance();

        System.out.println(obje1==object2);   //here you see both the objects are same
    }
}
