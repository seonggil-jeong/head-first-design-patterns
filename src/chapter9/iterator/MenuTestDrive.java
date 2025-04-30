package chapter9.iterator;

import chapter9.iterator.menu.object.CafeMenu;
import chapter9.iterator.menu.object.DinerMenu;
import chapter9.iterator.menu.object.PancakeHouseMenu;
import chapter9.iterator.waitress.Waitress;

import java.util.ArrayList;

public class MenuTestDrive {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(new ArrayList<>() {{
            add(pancakeHouseMenu);
            add(dinerMenu);
            add(cafeMenu);
        }});

        waitress.printMenu();
    }
}