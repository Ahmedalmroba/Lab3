import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*
        Media media = new Media("Computer Network", "ahmed", "111101",20 );
        System.out.println(media.toString());
        media.setTitle(" Network");
        System.out.println("Updated Title: " + media.getTitle());
        media.setPrice(15);
        System.out.println("Updated Price:" + media.getPrice());
        System.out.println("Media Type: " + media.getMediaType());
        System.out.println("...................................................");*/

      /*  Book book = new Book("Computer Network", "ahmed", "145514552", 18.5, 5);
        book.addReview(5);
        book.addReview(4);
        book.addReview(5);
        System.out.println(book.toString());
        if (book.isBestseller()) {
            System.out.println("This book is a bestseller!");
        } else {
            System.out.println("This book is not a bestseller.");}
        book.restock(10);
        System.out.println(book.toString());
        System.out.println("...................................................");*/
       /* User user = new User("ahmed", "ahmed.almroba@gmail.com");
        Book book = new Book("Computer Network", "ahmed", "111101", 13, 5);

        Movie movie = new Movie("Computer Network", "ahmed", "111101", 12, 2);

        user.addToCart(book);
        user.addToCart(movie);
        List<Media> shoppingCart = user.getShoppingCart();
        System.out.println("User's Shopping Cart:");
        for (Media media : shoppingCart) {
            System.out.println(media.getTitle());}
        user.checkout();
        List<Media> purchasedMedia = user.getPurchasedMedia();
        System.out.println("\nUser's Purchased Media:");
        for (Media media : purchasedMedia) {
            System.out.println(media.getTitle());
            System.out.println("...................................................");}*/

       /* Review review = new Review("ahmed", 5, "good product.");

        System.out.println("Review Details:");
        System.out.println(review);
        System.out.println("..........................................");*/

        /*Store store = new Store();

        User user1 = new User("ahmed", "ahmed.almroba@");

        store.addUser(user1);

        Book book1 = new Book("Computer Network", " ahmed", "111146", 13, 5);

        store.addMedia(book1);
        store.displayUsers();
        store.displayMedias();
        String searchTitle = "Computer Network";
        Book foundBook = store.searchBook(searchTitle);
        if (foundBook != null) {
            System.out.println("\nFound Book:");
            System.out.println("Title: " + foundBook.getTitle() + ", ISBN: " + foundBook.getISBN());
        } else {
            System.out.println("\nBook not found: " + searchTitle);}
             System.out.println("..........................................");*/

     /*   List<Music> musicCatalog = new ArrayList<>();
        Music music1 = new Music("Shape of You", "Ed Sheeran", "9780061120085", 9.99, "Ed Sheeran");
        musicCatalog.add(music1);
        System.out.println("Music :");
        for (Music music : musicCatalog) {
            System.out.println(music);
        }
        User user = new User("ahmed", "ahmed.almroba@gmail.com");

        System.out.println("\nListening to music:");
        music1.listen(user);
        String artist = " Sheeran";
        List<Music> playlist = Music.generatePlaylist(musicCatalog, artist);
        System.out.println("\nPlaylist for " + artist + ":");
        for (Music music : playlist) {
            System.out.println(music.getTitle());
            System.out.println("..........................................");}*/
      /*  AcademicBook academicBook = new AcademicBook("  Computer Science", "ahmed", "1111101", 39, 10,"Array");

        System.out.println("Media Type: " + academicBook.getMediaType());
        System.out.println("Book Information: " + academicBook.toString());*/

      /*  System.out.println("..........................................");}
        Movie movie1 = new Movie("Inception", "Christopher Nolan", "9780123456789", 9.99, 148);

        User user1 = new User("ahmed","ahmed.almroba@gmail.com");

        movie1.watch(user1);
        List<Movie> movieCatalog = new ArrayList<>();
        movieCatalog.add(movie1);
        movie1.recommendSimilarMovies(movieCatalog);*/
System.out.println("........................................................");

        Novel novel1 = new Novel("Pride ", "Jane ", "111", 14, 10, "Rom");

        // Access and print the details of the novel

        System.out.println("Media Type: " + novel1.getMediaType());
        System.out.println("Average Rating: " + novel1.getAverageRating());

        System.out.println(novel1.toString());

    }}






