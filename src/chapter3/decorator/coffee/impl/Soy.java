package chapter3.decorator.coffee.impl;


import chapter3.decorator.coffee.Beverage;
import chapter3.decorator.coffee.CondimentDecorator;
import chapter3.decorator.coffee.Size;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        if (beverage.getSize() == Size.TALL) {
            return beverage.cost() + .10;
        } else if (beverage.getSize() == Size.GRANDE) {
            return beverage.cost() + .15;
        } else if (beverage.getSize() == Size.VENTI) {
            return beverage.cost() + .20;
        } else {
            return beverage.cost();
        }
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
