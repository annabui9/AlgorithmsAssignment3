public class GenericDLNode<T> {

    GenericDLNode<T> previous;
    GenericDLNode<T> next;
    T data;

    public GenericDLNode(T object){
        this.previous = null;
        this.next = null;
        this.data = object;
    }
}
