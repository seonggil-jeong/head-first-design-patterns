package chapter9.iterator.waitress;

import chapter9.iterator.menu.Menu;
import chapter9.iterator.menu.object.MenuItem;

import java.util.Iterator;
import java.util.List;

public class Waitress {
    List<Menu> menus;


    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {

        for (Menu menu : menus) {
            printMenu(menu.createIterator());
        }
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
