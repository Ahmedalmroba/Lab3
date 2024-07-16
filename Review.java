public class Review {
    private String username;
    private int rating;
    private String comments;

    public Review(String username, int rating, String comments) {
        this.username = username;
        this.rating = rating;
        this.comments = comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public int getRating() {
        return rating;
    }

    public String getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "Username: " + username +
                "\nRating: " + rating +
                "\nComments: " + comments;
}
}