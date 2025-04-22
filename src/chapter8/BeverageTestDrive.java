package chapter8;

public class BeverageTestDrive {

    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();

        CoffeeWithHook coffee = new CoffeeWithHook();
        coffee.prepareRecipe();
    }


}
