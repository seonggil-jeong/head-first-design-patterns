package chapter7.adapter;

import chapter7.adapter.duck.Duck;
import chapter7.adapter.turkey.Turkey;

public class DuckAdapter implements Turkey {
    private final Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
