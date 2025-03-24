package chapter3;

import static chapter3.Size.TALL;

public abstract class Beverage {
    String description = "Unknown Beverage";
    Size size = TALL;


    public Size getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
