public class Song {
    private String title;
    private int rating;

    public Song()
    {
        rating = 0;
        title = "";
    }

    public int getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
