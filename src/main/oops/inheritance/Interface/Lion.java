package src.main.oops.inheritance.Interface;

public class Lion implements Animal {

    public static void main(String[] args){
        Animal lion = new Lion();
        lion.food();
        lion.habitat();

    }

    @Override
    public void food() {
        System.out.println("lion eats flesh");
    }

    @Override
    public void habitat() {
        System.out.println("habitat of lion is land");
    }
}
