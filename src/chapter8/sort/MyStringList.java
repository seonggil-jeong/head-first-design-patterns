package chapter8.sort;

import java.util.AbstractList;

public class MyStringList extends AbstractList<String> {
    private final String[] values;


    public MyStringList(String[] values) {
        this.values = values;
    }

    @Override
    public String get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }
}
