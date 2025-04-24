package chapter9.iterator.waitress;

import chapter9.iterator.menu.Menu;
import chapter9.iterator.menu.object.DinerMenu;
import chapter9.iterator.menu.object.MenuItem;
import chapter9.iterator.menu.object.PancakeHouseMenu;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;


    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeHouseIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeHouseIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            System.out.println(item.getName() + ", ");
            System.out.println("------------------");
            System.out.println(item.getPrice() + " $ ");
            System.out.println(item.getDescription());
        }
    }
}
