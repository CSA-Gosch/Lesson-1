public class Movies {

        private String title;
        private int rating;
        private double duration;
//        private int

        public Movies()
        {
            rating = 0;
            title = "";
        }
    public Movies(String t, double d){
        this.title = t;
        this.duration = d;
    }

    public Movies(String t, double d, int r){
        this.title = t;
        this.duration = d;
        this.rating = r;
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

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}

