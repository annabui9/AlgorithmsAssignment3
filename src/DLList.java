public class DLList {

    DLNode head;
    DLNode tail;

    public DLList(){
        head = null;
    }

    public void addy(Song s){

        DLNode newNode = new DLNode(s); // create new node

        if(head == null){ // if list is empty
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode; // old tail next is new node
            newNode.previous = tail; // points previous for newNode to old tail
            tail = newNode; // points tail to newNode
        }
    }

    public void removy(int pos){
        // empty list
        if(pos < 0 || head == null){
            return;
        }

        // remove head
        if(pos == 0){
            head = head.next;
            if(head != null){ // not empty list after removal
                head.previous = null;
            }else{ // removed = empty list
                tail = null;
            }
            return;
        }

        // removing nodes from list

        DLNode current = head; // start at node

        for(int i = 0; i < pos && current.next != null; i++){
            current = current.next; // know we don't remove head so start at next, iterate until pos
        }

        if(current == null){ // out of bounds
            return;
        }

        DLNode pred = current.previous;
        DLNode succ = current.next;

        if(pred != null){ // if pred exist
            pred.next = succ; // point to succ (skipping node to be removed ->)
        }
        if(succ != null){  // if succ exists
            succ.previous = pred; // point to pred (skipping node to be removed <-)
        }

        if(current.next == null){ // if tail is removed
            tail = pred;
        }

    }

    @Override
    public String toString(){
        String allNodes = "";
        DLNode current = head; // start at head

        while(current != null){
            allNodes = allNodes + current.song.toString() + "\n"; //print
            current = current.next; // next node
        }

        return allNodes;
    }


}
