public class Song {
    private String title;
    private int rating;
    private double price;
    private boolean favorite;

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

    public double getPrice() {
        return price;
    }

    public Song(String t, double p){
        this.title = t;
        this.price = p;
    }

    public Song(String t, double p, int r){
        this.title = t;
        this.price = p;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addToFavorites(){
        favorite = true;
    }
}
