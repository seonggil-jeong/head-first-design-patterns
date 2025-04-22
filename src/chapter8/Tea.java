package chapter8;

public class Tea extends CaffeineBeverage {

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {

        System.out.println("Adding Lemon");
    }
}
