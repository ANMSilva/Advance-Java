package Annotations;

import java.lang.reflect.Method;

public class Annotations {

    /**
     * A form of metadata
     * provide data about a program that is not a part of the program itself
     * Annotations.Annotations have no direct effect on the operation of the code they annotate.
     *
     * ###################### Usages ######################
     * information for the compiler - can be used by the compiler to detect errors or suppress warnings
     * compile-time and deployment-time processing
     * runtime processing
     * */

    public static void main(String[] args) throws Exception {

//        Car car = new Car("BMW", 100, "Blue", "M3");
//        System.out.println(car.getName());
//        System.out.println(car.model);
//        System.out.println(car.getColor());


        testFunctionForAnnotation();

        Annotations annotations = new Annotations();
        Method testMethod = annotations.getClass().getMethod("testFunctionForAnnotation");

        //fetch the annotation
        //in other case give me any annotation called CustomAnnotation applied within this function
        CustomAnnotation customAnnotation =  testMethod.getAnnotation(CustomAnnotation.class);
        System.out.println("Value within annotation : " + customAnnotation.value());

    }

    @CustomAnnotation(value = 10)
    public static void testFunctionForAnnotation() {
        System.out.println("This is test function for annotation");
    }
}
