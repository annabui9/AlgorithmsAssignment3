public class SLList {

    SLNode head;
    SLNode tail;

    public SLList(){
        head = null;
    }

    public void addy(Song s){
        SLNode newNode = new SLNode(s);

        if(head == null){ // if list is empty
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode; // update pointer
            tail = newNode; // update Tail
        }
    }

    public void removy(int pos){

        // empty list
        if(pos < 0 || head == null){
            return;
        }

        // remove head
        if(pos ==0){
            head = head.next;

            // if list is now empty
            if(head == null){
                tail = null;
            }
            return;
        }

        // removing node in list

        SLNode current = head; // start at head

        for(int i = 0; i < pos - 1 && current.next != null; i++) {
            current = current.next; // (because we know not removing head, go to next
        }

        if(current.next == null){ //if nothing to be removed
            return;
        }

        if(current.next.next == null){ // if tail is removed
            tail = current;
        }


        current.next = current.next.next; // remove node by pointing to node after target

    }

    public String toString(){
        String allNodes = "";
        SLNode current = head; // start at head

        while(current != null){
            allNodes = allNodes + current.data + "\n"; //print
            current = current.next; // next node
        }

        return allNodes;
    }


}
