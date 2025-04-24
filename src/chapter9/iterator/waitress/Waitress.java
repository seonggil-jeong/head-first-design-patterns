package chapter9.iterator.waitress;

import chapter9.iterator.menu.DinerMenu;
import chapter9.iterator.menu.MenuItem;
import chapter9.iterator.menu.PancakeHouseMenu;
import chapter9.iterator.menu.iterator.Iterator;
import chapter9.iterator.menu.iterator.impl.PancakeHouseIterator;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;


    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeHouseIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeHouseIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            System.out.println(item.getName() + ", ");
            System.out.println("------------------");
            System.out.println(item.getPrice() + " -- ");
            System.out.println(item.getDescription());
        }
    }
}
