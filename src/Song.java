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

    //to String
    public String toString(){
        return "Title: " + title + ", Artist: " + artist + ", Length: " + length;
    }

}
