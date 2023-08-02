public class OrderTest {
    public static void main(String[] args) {
        // Create 2 orders for unspecified guests (without specifying a name)
        Order order1 = new Order();
        Order order2 = new Order();

        // Create 3 orders using the overloaded constructor to give each a name for the order.
        Order order3 = new Order("Cindhuri");
        Order order4 = new Order("John");
        Order order5 = new Order("Alex");

        // Create some items
        Item item1 = new Item("drip coffee", 1.50);
        Item item2 = new Item("cappuccino", 3.50);
        Item item3 = new Item("muffin", 2.00);
        Item item4 = new Item("bagel", 1.50);

        // Add items to the orders using the addItem method
        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item3);
        order2.addItem(item4);

        order3.addItem(item1);
        order3.addItem(item2);
        order3.addItem(item4);

        order4.addItem(item2);
        order4.addItem(item3);

        order5.addItem(item1);
        order5.addItem(item3);

        // Set some orders to ready and print the status message
        order2.setReady(true);
        order4.setReady(true);

        System.out.println(order2.getStatusMessage());
        System.out.println(order4.getStatusMessage());

        // Print the total for order1
        System.out.println("Total for order1: $" + order1.getOrderTotal());

        // Display all orders
        System.out.println("Order 1:");
        order1.display();

        System.out.println("Order 2:");
        order2.display();

        System.out.println("Order 3:");
        order3.display();

        System.out.println("Order 4:");
        order4.display();

        System.out.println("Order 5:");
        order5.display();
    }
}
