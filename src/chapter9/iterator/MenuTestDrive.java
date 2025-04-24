package chapter9.iterator;

import chapter9.iterator.menu.DinerMenu;
import chapter9.iterator.menu.PancakeHouseMenu;
import chapter9.iterator.waitress.Waitress;

public class MenuTestDrive {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();

        waitress.printMenu();
    }
}
