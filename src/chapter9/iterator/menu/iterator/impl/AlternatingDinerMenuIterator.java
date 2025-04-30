package chapter9.iterator.menu.iterator.impl;

import chapter9.iterator.menu.object.MenuItem;

import java.util.Iterator;

public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {
    private final MenuItem[] items;
    private int position = 0;
    private final boolean isEven = true;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position += 2; // Skip every other item
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("cannot remove menu item");
    }
}
