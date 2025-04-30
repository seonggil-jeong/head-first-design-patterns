package chapter9.composite;

public class MenuCompositeTestDrive {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("Lunch MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true, 2.99));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla ice cream",
                true, 1.59));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }
}
