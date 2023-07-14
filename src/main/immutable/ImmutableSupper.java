package src.main.immutable;

//subclass will change the value by providing setter method
public class ImmutableSupper {
    private final int value;

    public ImmutableSupper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Immutable{" +
                "value=" + value +
                '}';
    }
}
