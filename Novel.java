public class Novel extends Book {
    private String genre;

    public Novel(String title, String auteur, String ISBN, double price, int Stock,String genre) {
        super(title, auteur, ISBN, price,Stock);
        this.genre = genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String getMediaType() {
        if (getAverageRating() >= 4.5) {
            return "Bestselling Novel";
        } else {
            return "Novel";
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nGenre: " +genre;
}
}