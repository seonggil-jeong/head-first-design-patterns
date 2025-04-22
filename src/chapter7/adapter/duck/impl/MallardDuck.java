package chapter7.adapter.duck.impl;

import chapter7.adapter.duck.Duck;

public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
