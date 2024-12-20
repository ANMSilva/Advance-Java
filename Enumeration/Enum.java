package Enumeration;

public class Enum {

    public static void main(String[] args) {
        Enumeration e = Enumeration.BLUE;

        System.out.println("Blue enum name : " + e.name());
        System.out.println("Blue enum value : " + e.getColor());

        for (Enumeration en : Enumeration.values()) {
            System.out.println(en.name());
        }
    }

}
