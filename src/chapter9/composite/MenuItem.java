package chapter9.composite;

/**
 * Leaf class
 */
public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public MenuComponent getChild(int i) {
        return null; // Leaf nodes do not have children
    }

    @Override
    public void print() {
        System.out.println(getName() + ", " + getPrice() + " -- " + getDescription());
        if (isVegetarian()) {
            System.out.println("(Vegetarian)");
        }
    }
}
