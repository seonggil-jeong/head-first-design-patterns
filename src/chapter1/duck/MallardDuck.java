package chapter1.duck;

import chapter1.duck.fly.impl.FlyWithWings;
import chapter1.duck.quack.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super.quackBehavior = new Quack();
        super.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("It's MallardDuck");
    }
}
