package chapter3.decorator.coffee;

import chapter3.decorator.coffee.impl.Mocha;
import chapter3.decorator.coffee.impl.Soy;
import chapter3.decorator.coffee.impl.Whip;

import static chapter3.decorator.coffee.Size.GRANDE;

public class StarBuzzCoffee {

    public static void main(String[] args) {

        Beverage beverage = new Espresso(GRANDE);
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        beverage = new Soy(beverage);
        System.out.println("SIZE: " + beverage.getSize());
        System.out.println(beverage.getDescription() + " $" + beverage.cost());


    }
}
