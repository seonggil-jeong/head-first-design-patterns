package chapter3.decorator;

import chapter3.Beverage;
import chapter3.Espresso;
import chapter3.decorator.impl.Mocha;
import chapter3.decorator.impl.Soy;
import chapter3.decorator.impl.Whip;

import static chapter3.Size.GRANDE;
import static chapter3.Size.TALL;

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
