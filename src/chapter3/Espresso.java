package chapter3;

import static chapter3.Size.TALL;

public class Espresso extends Beverage {

    public Espresso(Size size) {
        super.size = size;
        super.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
