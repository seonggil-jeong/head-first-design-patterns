package chapter1.duck;

import chapter1.duck.fly.impl.FlyNoWay;
import chapter1.duck.quack.impl.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        super.flyBehavior = new FlyNoWay();
        super.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("It's ModelDuck");
    }
}
