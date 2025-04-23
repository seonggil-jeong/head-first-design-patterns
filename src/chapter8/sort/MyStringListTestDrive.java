package chapter8.sort;

public class MyStringListTestDrive {

    public static void main(String[] args) {
        String[] values = {"Hello", "World", "Java", "Programming"};
        MyStringList list = new MyStringList(values);

        System.out.println("Size of the list: " + list.size());
        System.out.println("Element at index 2: " + list.get(2));

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
    }
}
