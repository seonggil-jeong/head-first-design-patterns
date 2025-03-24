package chapter3.decorator;

import chapter3.Beverage;
import chapter3.Size;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;

    @Override
    public Size getSize() {
        return beverage.getSize();
    }

    public abstract String getDescription(); // to make All Children of CondimentDecorator implement this method
}
