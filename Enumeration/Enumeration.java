package Enumeration;

public enum Enumeration {
    BLUE("blue"),
    RED("red"),
    YELLOW("yellow");

    private String color;

    Enumeration(String color) {
        this.color = color;
    }

    void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    /**
     * Enums are use to define constant value as Dates, Colors, Months, etc
     * */
}