public class SLNode {

    Song song;
    SLNode next;
    String data;

    public SLNode(Song song){
        this.song = song;
        this.next = null;
        this.data = "Title: " + song.title + ", Artist: " + song.artist + ", Length: " + song.length;
    }


}
