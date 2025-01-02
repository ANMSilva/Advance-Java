package Autoboxing;

public class Autoboxing {

    public static void main(String[] args) {

        /**
         * Autoboxing in Java is the automatic conversion of a primitive data type (like int, double, etc.)
         * into its corresponding wrapper class (like Integer, Double, etc.) by the compiler.
         * It simplifies code by eliminating the need to explicitly wrap primitive values.
         *
         * How Autoboxing working :
         * When a primitive value is assigned to a variable of a wrapper class type,
         * Java automatically "boxes" the primitive value into its corresponding wrapper class.
         * */

        int primitiveValue = 5;
        Integer boxedValue = primitiveValue; // Autoboxing

        /**
         * Unboxing
         * The reverse process, where a wrapper class object is automatically converted back to its corresponding primitive type, is called unboxing.
         * */

        Integer boxedValue2 = 10; // Autoboxing
        int primitiveValue2 = boxedValue; // Unboxing

        Integer boxedValue3 = null;
        int primitiveValue3 = boxedValue; // Throws NullPointerException

        /******************************************************************************************************************************************/
        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b); // true (cached values)

        Integer c = 1000;
        Integer d = 1000;
        System.out.println(c == d); // false (different objects)

        /**
         * Why? Java caches Integer objects in the range -128 to 127.
         * */


        /**
         * Best Practices
         * Use primitives when performance is critical.
         * Use wrapper classes when working with generic collections or APIs that require objects.
         * Be cautious about null values when dealing with wrapper classes to avoid NullPointerException.
         * */
    }

}
