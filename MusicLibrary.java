//  Write a Java program to create a class called "MusicLibrary" with a collection of songs and methods to add and remove songs, and to play a random son
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return title + " by " + artist;
    }
}

public class MusicLibrary {
    private List<Song> songs;

    public MusicLibrary() {
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public Song playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("No songs in the library.");
            return null;
        }

        Random rand = new Random();
        int index = rand.nextInt(songs.size());
        Song randomSong = songs.get(index);
        System.out.println("Now playing: " + randomSong);
        return randomSong;
    }

    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();

        // Add some songs to the library
        library.addSong(new Song("Song 1", "Artist 1"));
        library.addSong(new Song("Song 2", "Artist 2"));
        library.addSong(new Song("Song 3", "Artist 3"));

        // Play a random song
        library.playRandomSong();

        // Remove a song from the library
        Song songToRemove = new Song("Song 2", "Artist 2");
        library.removeSong(songToRemove);

        // Play another random song
        library.playRandomSong();
    }
}
