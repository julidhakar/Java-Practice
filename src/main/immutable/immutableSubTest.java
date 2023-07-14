package src.main.immutable;

public class immutableSubTest {

    public static void main(String[] args){
        ImmutableSub immutableSub = new ImmutableSub(4);
        ImmutableSupper immutableSupper = (ImmutableSupper)immutableSub;
        System.out.println(immutableSub);
        System.out.println(immutableSupper);
        immutableSub.setNewValue(8);
        System.out.println(immutableSub);
        System.out.println(immutableSupper);

    }
}
