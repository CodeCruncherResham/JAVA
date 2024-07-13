//Write a Java program to create class called "TrafficLight" with attributes for color and duration, and methods to change the color and check for red or green.

public class TrafficLight {
    private String color;
    private int duration;

    // Constructor
    public TrafficLight(String initialColor, int initialDuration) {
        this.color = initialColor;
        this.duration = initialDuration;
    }

    // Method to change the color of the traffic light
    public void changeColor(String newColor) {
        this.color = newColor;
    }

    // Method to check if the traffic light is currently red
    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    // Method to check if the traffic light is currently green
    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    // Getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a TrafficLight object
        TrafficLight trafficLight = new TrafficLight("red", 60);

        // Display the initial state
        System.out.println("Initial color: " + trafficLight.getColor());
        System.out.println("Is it currently red? " + trafficLight.isRed());
        System.out.println("Is it currently green? " + trafficLight.isGreen());

        // Change the color to green
        trafficLight.changeColor("green");

        // Display the updated state
        System.out.println("\nUpdated color: " + trafficLight.getColor());
        System.out.println("Is it currently red? " + trafficLight.isRed());
        System.out.println("Is it currently green? " + trafficLight.isGreen());
    }
}
