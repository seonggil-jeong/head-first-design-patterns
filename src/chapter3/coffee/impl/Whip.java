package chapter3.coffee.impl;

import chapter3.coffee.Beverage;
import chapter3.coffee.CondimentDecorator;

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
