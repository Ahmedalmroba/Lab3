import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String email;
    private List<Media> purchasedMedia;
    private List<Media> shoppingCart;

    public User(String username){

    }

    public void setShoppingCart(List<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void setPurchasedMedia(List<Media> purchasedMedia) {
        this.purchasedMedia = purchasedMedia;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.purchasedMedia = new ArrayList<>();
        this.shoppingCart = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public List<Media> getPurchasedMedia() {
        return purchasedMedia;
    }

    public List<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void addToCart(Media media) {
        shoppingCart.add(media);
        System.out.println("Added " + media.getTitle() + " to the shopping cart.");
    }

    public void removeFromCart(Media media) {
        shoppingCart.remove(media);
        System.out.println("Removed " + media.getTitle() + " from the shopping cart.");
    }

    public void checkout() {
        for (Media media : shoppingCart) {
            if (media.getPrice() > 0) {
                purchasedMedia.add(media);
                media.getPrice();
                System.out.println("Purchased " + media.getTitle() + ".");
            } else {
                System.out.println("Sorry, " + media.getTitle() + " is out of stock and cannot be purchased.");
            }
        }
        shoppingCart.clear();
}
}