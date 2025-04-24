package chapter9.iterator.menu;

import chapter9.iterator.menu.object.MenuItem;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
