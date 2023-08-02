import java.util.ArrayList;

class Item {
    private String name;
    private double price;
    private int index;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}

class Order {
    private String customerName;
    private ArrayList<Item> items;

    public Order(String customerName) {
        this.customerName = customerName;
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void display() {
        System.out.println("Order for " + customerName + ":");
        for (Item item : items) {
            System.out.println(item.getIndex() + " " + item.getName() + " -- $" + item.getPrice());
        }
    }
}

class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk() {
        menu = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addMenuItem(String name, double price) {
        Item newItem = new Item(name, price);
        newItem.setIndex(menu.size());
        menu.add(newItem);
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (Item item : menu) {
            System.out.println(item.getIndex() + " " + item.getName() + " -- $" + item.getPrice());
        }
    }

    public void newOrder() {
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();

        Order newOrder = new Order(name);
        displayMenu();

        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();

        while (!itemNumber.equals("q")) {
            try {
                int index = Integer.parseInt(itemNumber);
                if (index >= 0 && index < menu.size()) {
                    Item selected = menu.get(index);
                    newOrder.addItem(selected);
                } else {
                    System.out.println("Invalid menu item index, please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please try again.");
            }

            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }

        orders.add(newOrder);
        System.out.println("Order added successfully!");
        newOrder.display();
    }

    // NINJA BONUS: addMenuItemByInput method
    public void addMenuItemByInput() {
        System.out.println("Please enter the new menu item name:");
        String name = System.console().readLine();

        System.out.println("Please enter the new menu item price:");
        String priceStr = System.console().readLine();
        try {
            double price = Double.parseDouble(priceStr);
            addMenuItem(name, price);
            System.out.println("New menu item added successfully!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid price, the menu item was not added.");
        }
    }
}
