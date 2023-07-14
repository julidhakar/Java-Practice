package src.main.singleton;

public class SinglitonClass {

    private static  SinglitonClass instance = null;

    private SinglitonClass(){

    }

    /*
    public static SinglitonClass getInstance() {
        synchronized (SinglitonClass.class) {
            if (instance == null) {
                instance = new SinglitonClass();
            }
            return instance;
        }
    }  */

    //doubly lock

    public static SinglitonClass getInstance() {
        if(instance == null){
            synchronized (SinglitonClass.class){
                if(instance == null){
                    instance = new SinglitonClass();
                }
            }

        }return instance;
    }
}
