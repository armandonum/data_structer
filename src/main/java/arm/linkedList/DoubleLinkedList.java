package arm.linkedList;

public class DoubleLinkedList<T> implements IDoubleLinkedList<T>{
    private DoubkleEdgeNode<T> head;
    private DoubkleEdgeNode<T> tail;
    public DoubleLinkedList(){
        this.head=new DoubkleEdgeNode<>(null);
        this.tail=new DoubkleEdgeNode<>(null);
//        DoubkleEdgeNode<T> head=new DoubkleEdgeNode<>(null);
//        DoubkleEdgeNode<T> tail=new DoubkleEdgeNode<>(null);
        head.next=tail;
        tail.prev=head;
//        this.head=null;
//        this.tail=null;
    }

    @Override
    public int size() {
        if(isEmpty()){
            return 0;
        }
        int size =0;
        DoubkleEdgeNode<T> current=head.next;
        while(current!=tail){
            size++;
            current=current.next;
        }
        return  size;
    }

    @Override
    public boolean isEmpty() {
        if(head==null){
            return true;
        }
        return false;
    }

    @Override
    public DoubkleEdgeNode<T> first() {
        if(isEmpty()){
            return null;
        }
        return head.next;
    }

    @Override
    public DoubkleEdgeNode<T> last() {

        if(isEmpty()){
            return null;
        }
        return tail.prev;
    }

    @Override
    public void addFirst(T data) {
        DoubkleEdgeNode<T> newNode=new DoubkleEdgeNode<>(data);
        newNode.next=head.next;
        newNode.prev=head;
        head.next.prev=newNode;
        head.next=newNode;

    }

    @Override
    public void addLast(T data) {
        DoubkleEdgeNode<T> newNode=new DoubkleEdgeNode<>(data);
        newNode.prev=tail.prev;
        newNode.next=tail;
        tail.prev.next=newNode;
        tail.prev=newNode;
    }

    @Override
    public void removeFirst() {
        if(isEmpty()){
            head.next=head.next.next;
            head.next.prev=head;
        }

    }

    @Override
    public void removeLast() {
        if(isEmpty()){
            tail.prev=tail.prev.prev;
            tail.prev.next=tail;
        }

    }
    public void print(){
        DoubkleEdgeNode<T> current=head.next;
        while(current!=tail){
            System.out.println(current.data);
            current=current.next;
        }
    }
}
