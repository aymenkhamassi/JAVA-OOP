import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {

        // Create Item objects
        Item item1 = new Item("mocha", 3.50);
        Item item2 = new Item("latte", 4.00);
        Item item3 = new Item("drip coffee", 2.50);
        Item item4 = new Item("cappuccino", 4.50);

        // Create Order objects
        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        // Print order1
        System.out.println("Order 1:");
        System.out.println("Name: " + order1.name);
        System.out.println("Total: " + order1.total);
        System.out.println("Ready: " + order1.ready);

        // Add item1 to order2's item list and increment the order's total
        order2.items.add(item1);
        order2.total += item1.price;

        // order3 ordered a cappuccino. Add the cappuccino to their order list and update their tab.
        order3.items.add(item4);
        order3.total += item4.price;

        // order4 added a latte. Update accordingly.
        order4.items.add(item2);
        order4.total += item2.price;

        // Update Cindhuri’s order status to ready
        order1.ready = true;

        // Sam ordered more drinks - 2 lattes. Update their order as well.
        order4.items.add(item2);
        order4.total += (item2.price * 2);

        // Update Jimmy's order status to ready
        order2.ready = true;

        // Print order1 again after updating
        System.out.println("\nOrder 1 (after update):");
        System.out.println("Name: " + order1.name);
        System.out.println("Total: " + order1.total);
        System.out.println("Ready: " + order1.ready);

        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
    
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}
