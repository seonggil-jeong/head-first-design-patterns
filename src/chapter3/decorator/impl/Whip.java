package chapter3.decorator.impl;

import chapter3.Beverage;
import chapter3.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {


    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
