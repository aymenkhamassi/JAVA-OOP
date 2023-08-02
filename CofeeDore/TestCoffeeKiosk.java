public class TestCoffeeKiosk {
    public static void main(String[] args) {
        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();

        // Adding menu items
        coffeeKiosk.addMenuItem("banana", 2.00);
        coffeeKiosk.addMenuItem("coffee", 1.50);
        coffeeKiosk.addMenuItem("latte", 4.50);
        coffeeKiosk.addMenuItem("cappuccino", 3.00);
        coffeeKiosk.addMenuItem("muffin", 4.00);

        // Displaying the menu
        coffeeKiosk.displayMenu();

        // Placing new orders
        coffeeKiosk.newOrder();

        // NINJA BONUS: Adding a menu item manually by admin
        coffeeKiosk.addMenuItemByInput();
    }
}
