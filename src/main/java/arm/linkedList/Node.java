package arm.linkedList;

public class Node<T>  {
   public T data; // value node
    Node<T> next;

    public Node(T data){// this si constructor
        this.data=data;
        this.next=null;
    }
}
