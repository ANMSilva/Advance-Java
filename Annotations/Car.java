package Annotations;

public class Car extends Vehicle {

    public String model;

    public Car(String name, int speed, String color, String model) {
        super(name, speed, color);
        this.model = model;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    @Override
    public String getName() {
        return super.getName() + " " + model;
    }

    /**
     * @Override vs @Overload
     *
     * @Override
     * Occurs when a subclass provides a specific implementation for a method defined in its parent class.
     * Involves inheritance (between parent and child classes)
     * Must be identical (same method name, parameters, and return type) to the parent method.
     * The overriding method cannot have a more restrictive access modifier than the overridden method.
     * 	Run-time polymorphism (method is decided at runtime).
     *
     * @Overload
     * Occurs when two or more methods in the same class have the same name but different parameter lists (number, type, or order of parameters).
     * Happens within the same class (or possibly in a subclass if inherited).
     * Must differ in the parameter list (different number, type, or order of parameters).
     * No such restriction since overloading happens in the same class.
     * Compile-time polymorphism (method is decided at compile time).
     * */

}
