public class MediaLib {
    public static void main(String[] args)
    {
        System.out.print("Welcome to your media library. ");

        Song song1 = new Song();
        Books book1 = new Books();
        Movies movies1 = new Movies();

        song1.setTitle("SAD!");
        song1.setRating(8);
        System.out.println(song1.getTitle() + " with a score of " + song1.getRating() + " out of 10");

        book1.setTitle("Of Mice and Men");
        book1.setRating(1);
        System.out.println(book1.getTitle() + " with a score of " + book1.getRating() + " out of 10");

        movies1.setTitle("The Dark Knight");
        movies1.setRating(10);
        System.out.println(movies1.getTitle() + " with a score of " + movies1.getRating() + " out of 10");


    }
}
