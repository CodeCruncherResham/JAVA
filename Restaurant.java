// Write a Java program to create a class called "Restaurant" with attributes for menu items, prices, and ratings, and methods to add and remove items, and to calculate average rating.

import java.util.*;

class Restaurant {
    private Map<String, Double> menu; // Menu items and their prices
    private List<Integer> ratings; // Ratings given by customers

    // Constructor
    public Restaurant() {
        menu = new HashMap<>();
        ratings = new ArrayList<>();
    }

    // Method to add an item to the menu
    public void addItem(String itemName, double price) {
        menu.put(itemName, price);
    }

    // Method to remove an item from the menu
    public void removeItem(String itemName) {
        menu.remove(itemName);
    }

    // Method to rate the restaurant
    public void rateRestaurant(int rating) {
        ratings.add(rating);
    }

    // Method to calculate the average rating
    public double calculateAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }
        return (double) sum / ratings.size();
    }

    // Method to display the menu
    public void displayMenu() {
        System.out.println("Menu:");
        for (Map.Entry<String, Double> entry : menu.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // Create a Restaurant object
        Restaurant restaurant = new Restaurant();

        // Add menu items
        restaurant.addItem("Pizza", 10.99);
        restaurant.addItem("Burger", 8.99);
        restaurant.addItem("Pasta", 12.99);

        // Display the menu
        restaurant.displayMenu();

        // Rate the restaurant
        restaurant.rateRestaurant(5);
        restaurant.rateRestaurant(4);
        restaurant.rateRestaurant(3);

        // Calculate and display the average rating
        System.out.println("Average Rating: " + restaurant.calculateAverageRating());
    }
}
