package Annotations;

public class Vehicle {

    private String name;
    private int speed;
    private String color;

    public Vehicle(String name, int speed, String color) {
        this.name = name;
        this.speed = speed;
        this.color = color;
    }

    public Vehicle() {
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
