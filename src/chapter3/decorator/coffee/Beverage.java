package chapter3.decorator.coffee;


import static chapter3.decorator.coffee.Size.TALL;

public abstract class Beverage {
    String description = "Unknown Beverage";
    chapter3.decorator.coffee.Size size = TALL;


    public Size getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
