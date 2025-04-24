package chapter9.iterator.menu.iterator.impl;

import chapter9.iterator.menu.MenuItem;
import chapter9.iterator.menu.iterator.Iterator;

public class DinerMenuIterator implements Iterator {
    private final MenuItem[] items;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public MenuItem next() {
        return items[position++];
    }
}

