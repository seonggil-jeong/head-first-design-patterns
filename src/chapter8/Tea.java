package chapter8;

public class Tea {

    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    void addLemon() {
        System.out.println("Adding Lemon");
    }
}
