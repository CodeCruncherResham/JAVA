//  Write a Java program to create a class called "Inventory" with a collection of products and methods to add and remove products, and to check for low inventory.

import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Inventory {
    private List<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public boolean isLowInventory() {
        for (Product product : products) {
            if (product.getQuantity() < 10) {
                return true;
            }
        }
        return false;
    }

    public void displayInventory() {
        System.out.println("Inventory:");
        for (Product product : products) {
            System.out.println(product.getName() + " - Quantity: " + product.getQuantity());
        }
    }
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Add products to the inventory
        inventory.addProduct(new Product("Item 1", 15));
        inventory.addProduct(new Product("Item 2", 8));
        inventory.addProduct(new Product("Item 3", 20));

        // Check if inventory is low
        if (inventory.isLowInventory()) {
            System.out.println("Inventory is low.");
        } else {
            System.out.println("Inventory is not low.");
        }

        // Display the inventory
        inventory.displayInventory();
    }
}
