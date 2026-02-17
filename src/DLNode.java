public class DLNode {

    DLNode previous;
    DLNode next;
    String data;

    public DLNode(Song song){
        this.previous = null;
        this.next = null;
        this.data = "Title: " + song.title + ", Artist: " + song.artist + ", Length: " + song.length;
    }
}
