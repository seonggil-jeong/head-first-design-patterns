package chapter8;

public class Coffee {

    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addCondiments();
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    void brewCoffeeGrinds() {
        System.out.println("Dripping coffee through filter");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
