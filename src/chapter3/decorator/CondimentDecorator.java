package chapter3.decorator;

import chapter3.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;

    public abstract String getDescription(); // to make All Children of CondimentDecorator implement this method
}
