package arm.linkedList;

public class DoubkleEdgeNode<T> {
    //private final T data;
    DoubkleEdgeNode<T> prev;
    DoubkleEdgeNode<T> next;
    public T data;
    public DoubkleEdgeNode(T data){
        this.prev=null;
        this.next=null;
        this.data=data;
    }
}
