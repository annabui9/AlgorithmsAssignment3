public class GenericSLNode<T> {

    GenericSLNode<T> next;
    T data;

    public GenericSLNode(T object){

        this.next = null;
        this.data = object;
    }
}
