public class Movies {

        private String title;
        private int rating;

        public Movies()
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

