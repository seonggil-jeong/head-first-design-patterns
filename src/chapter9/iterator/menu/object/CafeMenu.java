package chapter9.iterator.menu.object;

import chapter9.iterator.menu.Menu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {
    Map<String, MenuItem> menuItems = new HashMap<>();


    public CafeMenu() {
        addItem("Veggie Burger", "Veggie Burger with lettuce and tomato", true, 3.99);
        addItem("Soup of the day", "Soup of the day with a side of potato salad", false, 3.69);
        addItem("Burrito", "A large burrito, with whole pinto beans, salsa, and guacamole", true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.put(name, new MenuItem(name, description, vegetarian, price));
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
