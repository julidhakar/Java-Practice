package src.main.immutable;

public class ImmutableSub extends ImmutableSupper{

    private int newValue;

    public ImmutableSub(int newValue){
        super(newValue);
        this.newValue = newValue;
    }

    public int getNewValue() {
        return newValue;
    }

    public void setNewValue(int newValue){
        this.newValue = newValue;                        //setter can set the value and chage the supperclass vlaue
    }

    @Override
    public String toString() {
        return "ImmutableSub{" +
                "newValue=" + newValue +
                '}';
    }
}
