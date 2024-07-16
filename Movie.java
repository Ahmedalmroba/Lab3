import java.util.List;

public class Movie extends Media {
    private int duration;

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void watch(User user) {
        user.getPurchasedMedia().add(this);
        System.out.println("User " + user.getUsername() + " watched the media: " + this.getTitle());

    }

    public void recommendSimilarMovies(List<Movie> movieCatalog) {
        System.out.println("Recommended similar movies based on the director " + getAuthor() + ":");
        for (Movie movie : movieCatalog) {
            if (!movie.getTitle().equals(getTitle()) && movie.getAuthor().equals(getAuthor())) {
                System.out.println(movie.getTitle());
            }
        }
    }

    @Override
    public String getMediaType() {
        if (duration >= 120) {
            return "Long Movie";
        } else {
            return "Movie";
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nDuration: " + duration + " minutes";
}
}