public class Song {

    //required member data attributes
    String title;
    String artist;
    double length;


    // constructor
    public Song(String title, String artist, double length){
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    public String toString(){
        return "Title: " + title + ", Artist: " + artist + ", Length: " + length;
    }

    // getters

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getLength() {
        return length;
    }

    // setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
