package Generics;

public class DemoGeneric<T> {
    private T value;

    public DemoGeneric() {
    }

    public DemoGeneric(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
