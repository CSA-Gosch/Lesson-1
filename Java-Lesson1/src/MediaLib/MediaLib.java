package MediaLib;

public class MediaLib {
    public static void main(String[] args)
    {
        double totalCost=0;
        int numSongs = 0;

        System.out.print("Welcome to your media library. ");

        Song song1 = new Song();
        ++numSongs;
        Song song2 = new Song("Bruh", 9.99);
        ++numSongs;
        totalCost = song2.getPrice() + totalCost;
        Song song3 = new Song("Bruh", 9.99);
        ++numSongs;
        totalCost = song3.getPrice() + totalCost;
        Song song4 = new Song("Bruh", 9.99, 8);
        ++numSongs;
        totalCost = song4.getPrice() + totalCost;
        Song song5 = new Song("Bruh", 9.99, 9);
        ++numSongs;
        totalCost = song5.getPrice() + totalCost;
        Song song6 = new Song("Bruh", 9.99, 2);
        ++numSongs;
        totalCost = song6.getPrice() + totalCost;
        Song song7 = new Song("Bruh", 9.99, 1);
        ++numSongs;
        totalCost = song7.getPrice() + totalCost;
        Song song8 = new Song("Bruh", 9.99);
        ++numSongs;
        totalCost = song8.getPrice() + totalCost;

        Books book1 = new Books();

        Movies movies1 = new Movies();
        movies1.setDuration(80.5);




        song1.setTitle("SAD!");
        song1.setRating(8);
        System.out.println(song1.getTitle() + " with a score of " + song1.getRating() + " out of 10");

        book1.setTitle("Of Mice and Men");
        book1.setRating(1);
        System.out.println(book1.getTitle() + " with a score of " + book1.getRating() + " out of 10");

        movies1.setTitle("The Dark Knight");
        movies1.setRating(10);
        System.out.println(movies1.getTitle() + " with a score of " + movies1.getRating() + " out of 10");

        System.out.println("The total cost: $" + totalCost + "\nThis many songs: " + numSongs);

        System.out.println("The duration of your movie is " + movies1.getDuration() + " minutes");
    }
}
