// Write a Java program to create a class with methods to search for flights and hotels, and to book and cancel reservations.

import java.util.*;

// Flight class representing a flight
class Flight {
    private String flightNumber;
    private String origin;
    private String destination;
    private Date departureDate;
    private Date arrivalDate;

    // Constructor
    public Flight(String flightNumber, String origin, String destination, Date departureDate, Date arrivalDate) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
    }

    // Getters and setters
    // Add getters and setters as needed

    // toString method to display flight information
    @Override
    public String toString() {
        return "Flight Number: " + flightNumber + ", Origin: " + origin + ", Destination: " + destination +
               ", Departure Date: " + departureDate + ", Arrival Date: " + arrivalDate;
    }
}

// Hotel class representing a hotel
class Hotel {
    private String hotelName;
    private String location;
    private int numberOfRooms;
    private double pricePerNight;

    // Constructor
    public Hotel(String hotelName, String location, int numberOfRooms, double pricePerNight) {
        this.hotelName = hotelName;
        this.location = location;
        this.numberOfRooms = numberOfRooms;
        this.pricePerNight = pricePerNight;
    }

    // Getters and setters
    // Add getters and setters as needed

    // toString method to display hotel information
    @Override
    public String toString() {
        return "Hotel Name: " + hotelName + ", Location: " + location + ", Number of Rooms: " + numberOfRooms +
               ", Price Per Night: $" + pricePerNight;
    }
}

// ReservationManager class to manage flight and hotel reservations
class ReservationManager {
    private List<Flight> flights;
    private List<Hotel> hotels;

    // Constructor
    public ReservationManager() {
        flights = new ArrayList<>();
        hotels = new ArrayList<>();
    }

    // Method to search for flights
    public List<Flight> searchFlights(String origin, String destination, Date departureDate) {
        // Implement flight search logic based on origin, destination, and departure date
        // Return a list of matching flights
        return new ArrayList<>();
    }

    // Method to search for hotels
    public List<Hotel> searchHotels(String location, Date checkInDate, Date checkOutDate) {
        // Implement hotel search logic based on location, check-in date, and check-out date
        // Return a list of matching hotels
        return new ArrayList<>();
    }

    // Method to book a flight
    public void bookFlight(Flight flight) {
        // Implement booking logic for a flight
    }

    // Method to book a hotel
    public void bookHotel(Hotel hotel) {
        // Implement booking logic for a hotel
    }

    // Method to cancel a flight reservation
    public void cancelFlightReservation(Flight flight) {
        // Implement cancellation logic for a flight reservation
    }

    // Method to cancel a hotel reservation
    public void cancelHotelReservation(Hotel hotel) {
        // Implement cancellation logic for a hotel reservation
    }
    public static void main(String[] args) {
        // Create a ReservationManager object
        ReservationManager manager = new ReservationManager();

        // Example: Search for flights
        List<Flight> flights = manager.searchFlights("New York", "Los Angeles", new Date());
        for (Flight flight : flights) {
            System.out.println(flight);
        }

        // Example: Search for hotels
        List<Hotel> hotels = manager.searchHotels("Los Angeles", new Date(), new Date());
        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }

        // Example: Book a flight
        Flight flightToBook = new Flight("AA123", "New York", "Los Angeles", new Date(), new Date());
        manager.bookFlight(flightToBook);

        // Example: Book a hotel
        Hotel hotelToBook = new Hotel("Hilton", "Los Angeles", 100, 150.00);
        manager.bookHotel(hotelToBook);

        // Example: Cancel a flight reservation
        manager.cancelFlightReservation(flightToBook);

        // Example: Cancel a hotel reservation
        manager.cancelHotelReservation(hotelToBook);
    }
}
