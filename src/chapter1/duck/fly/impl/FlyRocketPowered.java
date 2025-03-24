package chapter1.duck.fly.impl;

import chapter1.duck.fly.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Fly With Rocket");
    }
}
