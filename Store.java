import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Media> mediaList;
    private List<User> userList;

    public Store() {
        this.mediaList = new ArrayList<>();
        this.userList = new ArrayList<>();
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Media> getMediaList() {
        return mediaList;
    }

    public void setMediaList(List<Media> mediaList) {
        this.mediaList = mediaList;
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void displayUsers() {
        System.out.println("Registered Users:");
        for (User user : userList) {
            System.out.println("Username: " + user.getUsername() + ", Email: " + user.getEmail());
        }
    }

    public void addMedia(Media media) {
        mediaList.add(media);
    }

    public void displayMedias() {
        System.out.println("Available Medias:");
        for (Media media : mediaList) {
            System.out.println("Title: " + media.getTitle() + ", ISBN: " + media.getISBN());
        }
    }

    public Book searchBook(String title) {
        for (Media media : mediaList) {
            if (media instanceof Book && media.getTitle().equalsIgnoreCase(title)) {
                return (Book) media;
            }
        }
        return null;
}
}