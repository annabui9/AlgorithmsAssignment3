public class DLNode {

    DLNode previous;
    DLNode next;
    Song song;

    public DLNode(Song song){
        this.previous = null;
        this.next = null;
        this.song = song;
    }
}
