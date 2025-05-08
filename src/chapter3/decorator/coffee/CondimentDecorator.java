package chapter3.decorator.coffee;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;

    @Override
    public chapter3.decorator.coffee.Size getSize() {
        return beverage.getSize();
    }

    public abstract String getDescription(); // to make All Children of CondimentDecorator implement this method
}
