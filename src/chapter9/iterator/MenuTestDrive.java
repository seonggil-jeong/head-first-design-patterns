package chapter9.iterator;

import chapter9.iterator.menu.object.DinerMenu;
import chapter9.iterator.menu.object.PancakeHouseMenu;
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
