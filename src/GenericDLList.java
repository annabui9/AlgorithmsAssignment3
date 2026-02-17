public class GenericDLList<T> {
    GenericDLNode<T> head;
    GenericDLNode<T> tail;

    public GenericDLList(){
        head = null;
    }

    public void addy(T object){

        GenericDLNode<T> newNode = new GenericDLNode<>(object); // create new node

        if(head == null){ // if list is empty
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
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
            if(head != null){
                head.previous = null;
            }else{
                tail = null;
            }
            return;
        }

        // removing nodes from list

        GenericDLNode<T> current = head; // start at node

        for(int i = 0; i < pos && current.next != null; i++){
            current = current.next;
        }

        if(current == null){ // out of bounds
            return;
        }

        GenericDLNode<T> pred = current.previous;
        GenericDLNode<T> succ = current.next;

        if(pred != null){ // if pred exist
            pred.next = succ; // point to succ (skipping node to be removed)
        }
        if(succ != null){  // if succ exists
            succ.previous = pred; // point to pred (skipping node to be removed)
        }

        if(current.next == null){ // if tail is removed
            tail = pred;
        }

    }

    public String toString(){
        String allNodes = "";
        GenericDLNode current = head; // start at head

        while(current != null){
            allNodes = allNodes + current.data + "\n"; //print
            current = current.next; // next node
        }

        return allNodes;
    }
}
