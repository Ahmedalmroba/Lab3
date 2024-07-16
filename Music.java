import java.util.ArrayList;
import java.util.List;

public class Music extends Media {
    private String artist;

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Music(String title, String author, String ISBN, double price, String artist) {
        super(title, author, ISBN,price);
        this.artist = artist;

    }

    public String getArtist() {
        return artist;
    }

    public void listen(User user) {
        System.out.println(user.getUsername() + " is listening to " + getTitle() + " by " + artist);
    }

    public static List<Music> generatePlaylist(List<Music> musicCatalog, String artist) {
        List<Music> playlist = new ArrayList<>();
        for (Music music : musicCatalog) {
            if (music.getArtist().equals(artist)) {
                playlist.add(music);
            }
        }
        return playlist;
    }

    @Override
    public String getMediaType() {
        if (getPrice() >= 10) {
            return "Premium Music";
        } else {
            return "Music";
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nArtist: " +artist;
}
}