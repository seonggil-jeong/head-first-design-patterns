package chapter8.cafe;

public abstract class CaffeineBeverageWithHook {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        } else {
            System.out.println("No condiments added");
        }
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // This is a hook method
    protected boolean customerWantsCondiments() {
        return true;
    }


}
