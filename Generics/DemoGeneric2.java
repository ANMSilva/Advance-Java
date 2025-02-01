package Generics;

public class DemoGeneric2<T, U> {
    private T value1;
    private U value2;

    public DemoGeneric2() {
    }

    public DemoGeneric2(T value1, U value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public U getValue2() {
        return value2;
    }

    public void setValue2(U value2) {
        this.value2 = value2;
    }
}
