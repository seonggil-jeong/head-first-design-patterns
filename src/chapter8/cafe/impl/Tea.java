package chapter8.cafe.impl;

import chapter8.cafe.CaffeineBeverage;

public class Tea extends CaffeineBeverage {

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {

        System.out.println("Adding Lemon");
    }
}
