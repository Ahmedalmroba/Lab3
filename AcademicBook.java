public class AcademicBook extends Book {
    private String subject;

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public AcademicBook(String title, String auteur, String ISBN, double price, int Stock, String subject) {
        super(title, auteur, ISBN, price,Stock);
        this.subject = subject;

    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String getMediaType() {
        if (getAverageRating() >= 4.5) {
            return "Bestselling AcademicBook";
        } else {
            return "AcademicBook";
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSubject: " + subject;
}
}