// Write a Java program to create a class called "Airplane" with a flight number, destination, and departure time attributes, and methods to check flight status and delay.

import java.time.LocalTime;

class Airplane {
    private String flightNumber;
    private String destination;
    private LocalTime departureTime;
    private boolean delayed;

    public Airplane(String flightNumber, String destination, LocalTime departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.delayed = false;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public boolean isDelayed() {
        return delayed;
    }

    public void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }

    public void checkFlightStatus() {
        if (delayed) {
            System.out.println("Flight " + flightNumber + " to " + destination + " is delayed.");
        } else {
            System.out.println("Flight " + flightNumber + " to " + destination + " is on time.");
        }
    }

    public void delayFlight() {
        delayed = true;
        System.out.println("Flight " + flightNumber + " to " + destination + " is delayed.");
    }

    public static void main(String[] args) {
        Airplane airplane = new Airplane("ABC123", "New York", LocalTime.of(9, 30));

        airplane.checkFlightStatus(); // Check initial flight status

        // Simulate delay
        airplane.delayFlight();

        // Check updated flight status
        airplane.checkFlightStatus();
    }
}
