//  Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews, and methods for adding and retrieving reviews.

import java.util.ArrayList;
import java.util.List;

class Movie {
    private String title;
    private String director;
    private List<String> actors;
    private List<String> reviews;

    // Constructor
    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
        this.actors = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    // Method to add an actor
    public void addActor(String actor) {
        actors.add(actor);
    }

    // Method to add a review
    public void addReview(String review) {
        reviews.add(review);
    }

    // Method to get the title of the movie
    public String getTitle() {
        return title;
    }

    // Method to get the director of the movie
    public String getDirector() {
        return director;
    }

    // Method to get the list of actors in the movie
    public List<String> getActors() {
        return actors;
    }

    // Method to get the list of reviews for the movie
    public List<String> getReviews() {
        return reviews;
    }

    public static void main(String[] args) {
        // Create a Movie object
        Movie movie = new Movie("Inception", "Christopher Nolan");

        // Add actors
        movie.addActor("Leonardo DiCaprio");
        movie.addActor("Joseph Gordon-Levitt");
        movie.addActor("Ellen Page");

        // Add reviews
        movie.addReview("Excellent movie!");
        movie.addReview("Mind-blowing visuals!");

        // Display movie details
        System.out.println("Title: " + movie.getTitle());
        System.out.println("Director: " + movie.getDirector());
        System.out.println("Actors: " + movie.getActors());
        System.out.println("Reviews: " + movie.getReviews());
    }
}
