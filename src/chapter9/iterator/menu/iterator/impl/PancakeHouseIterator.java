package chapter9.iterator.menu.iterator.impl;

import chapter9.iterator.menu.MenuItem;
import chapter9.iterator.menu.iterator.Iterator;

import java.util.List;

public class PancakeHouseIterator implements Iterator {
    private final List<MenuItem> items;
    private int position = 0;


    public PancakeHouseIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size() && items.get(position) != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position++;
        return menuItem;
    }
}
