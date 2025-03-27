package chapter3.coffee;

public abstract class Beverage {
    String description = "Unknown Beverage";
    Size size = Size.TALL;


    public Size getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
