package Generics;

public class Generics {

    public static void main(String[] args) throws NoSuchMethodException {
        DemoGeneric<String> demoGeneric = new DemoGeneric<>("Nipun Madumal Silva");
        System.out.println(demoGeneric.getValue());

        DemoGeneric2<String, Integer> demoGeneric2 = new DemoGeneric2<>("Eranga Silva", 22);
        System.out.println(demoGeneric2.getValue1());
        System.out.println(demoGeneric2.getValue2());
    }
}
