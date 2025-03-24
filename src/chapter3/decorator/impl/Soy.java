package chapter3.decorator.impl;


import chapter3.Beverage;
import chapter3.decorator.CondimentDecorator;

import static chapter3.Size.*;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        if (beverage.getSize() == TALL) {
            return beverage.cost() + .10;
        } else if (beverage.getSize() == GRANDE) {
            return beverage.cost() + .15;
        } else if (beverage.getSize() == VENTI) {
            return beverage.cost() + .20;
        } else {
            return beverage.cost();
        }
    }

    @Override
    public String getDescription() {
        return null;
    }
}
