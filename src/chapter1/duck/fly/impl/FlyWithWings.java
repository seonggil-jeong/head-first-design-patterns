package chapter1.duck.fly.impl;

import chapter1.duck.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("can fly");
    }
}
