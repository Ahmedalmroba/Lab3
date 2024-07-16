public class Book extends Media {
    private int Stock;
    private int[] reviews;
    private int reviewCount;

    public Book(String title, String auteur, String ISBN, double price, int Stock) {
        super(title, auteur, ISBN, price);
        this.Stock = Stock;
        this.reviews = new int[100]; // Assuming a maximum of 100 reviews
        this.reviewCount = 0;
    }

    public int getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(int reviewCount) {
        this.reviewCount = reviewCount;
    }

    public int[] getReviews() {
        return reviews;
    }

    public void setReviews(int[] reviews) {
        this.reviews = reviews;
    }

    public int getStock() {
        return Stock;
    }


    public void setStock(int stock) {
        Stock = stock;
    }

    public void addReview(int rating) {
        if (reviewCount < reviews.length) {
            reviews[reviewCount] = rating;
            reviewCount++;
        }
    }

    public double getAverageRating() {
        if (reviewCount == 0) {
            return 0.0;
        }

        int totalRating = 0;
        for (int i = 0; i < reviewCount; i++) {
            totalRating += reviews[i];
        }

        return (double) totalRating / reviewCount;
    }

    public void purchase(User user) {
        if (Stock > 0) {
            user.addToCart(this);
            Stock--;
            System.out.println("Book purchased: " + getTitle());
        } else {
            System.out.println("Sorry, this book is out of stock.");
        }
    }

    public boolean isBestseller() {
        return getAverageRating() >= 4.5;
    }

    public void restock(int quantity) {
        Stock += quantity;
        System.out.println("Book restocked: " + getTitle() + ". New quantity in stock: " + Stock);
    }

    @Override
    public String getMediaType() {
        if (isBestseller()) {
            return "Bestselling Book";
        } else {
            return "Book";
        }
    }

    @Override
    public String toString() {
        StringBuilder reviewsString = new StringBuilder();
        for (int i = 0; i < reviewCount; i++) {
            reviewsString.append(reviews[i]).append(" ");
        }

        return super.toString() +
                "\nQuantity in Stock: " + Stock +
                "\nReviews: " + reviewsString;
}
}