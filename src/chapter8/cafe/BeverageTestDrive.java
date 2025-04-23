package chapter8.cafe;

import chapter8.cafe.impl.CoffeeWithHook;
import chapter8.cafe.impl.Tea;

public class BeverageTestDrive {

    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();

        CoffeeWithHook coffee = new CoffeeWithHook();
        coffee.prepareRecipe();
    }


}
