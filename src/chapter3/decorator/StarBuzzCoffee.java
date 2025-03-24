package chapter3.decorator;

import chapter3.Beverage;
import chapter3.Espresso;
import chapter3.decorator.impl.Mocha;
import chapter3.decorator.impl.Whip;

public class StarBuzzCoffee {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());


    }
}
