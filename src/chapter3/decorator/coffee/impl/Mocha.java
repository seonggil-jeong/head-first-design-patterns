package chapter3.decorator.coffee.impl;

import chapter3.decorator.coffee.Beverage;
import chapter3.decorator.coffee.CondimentDecorator;

public class Mocha extends CondimentDecorator {


    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
