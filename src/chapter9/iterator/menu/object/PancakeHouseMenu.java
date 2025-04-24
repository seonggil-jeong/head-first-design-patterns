package chapter9.iterator.menu.object;

import chapter9.iterator.menu.Menu;
import chapter9.iterator.menu.iterator.impl.PancakeHouseIterator;
import chapter9.iterator.menu.object.MenuItem;

import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu {
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = List.of(
                new MenuItem("K&B Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99),
                new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99),
                new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49),
                new MenuItem("Waffles", "Waffles with your choice of blueberries or strawberries", true, 3.59)
        );
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.add(new MenuItem(name, description, vegetarian, price));
    }

    public Iterator<MenuItem> createIterator() {
        return new PancakeHouseIterator(menuItems);
    }
}
