package MediaLib;

public class Books {
    private String title;
    private int rating;
    public Books()
    {
        rating = 0;
        title = "";
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }
}
