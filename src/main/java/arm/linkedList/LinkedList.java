package arm.linkedList;

public class LinkedList<T> implements ILinkedList<T> {
    Node<T> head;
    @Override
    public int size() {
        if(isEmpty()){
            return 0;
        }
        int size=0;
        Node<T> current=head;
        while (current!= null){
            size++;
            current=current.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public Node<T> first() {
        return head;
    }

    @Override
    public Node<T> last() {
        Node<T> current=head;
        while (current!=null){
            if(current.next==null){
                return current;
            }
            current=current.next;
        }
        return current;
    }

    @Override
    public void addFirst(T data) {
        Node<T> newNode=new Node<T>(data);
        if(isEmpty()){
            head=newNode;
            return;
        }
        newNode.next=head;
        head   =newNode;
    }

    @Override
    public void addLast(T data) {
        Node<T> lastNode=last();
        if(lastNode==null){
            head =new Node<T>(data);
            return;
        }
        lastNode.next=new Node<T>(data);
    }

    @Override
    public void removeFirst() {
        if(isEmpty()){
            System.out.println("the list is empty ");
            return;
        }
        head=head.next;
    }
    @Override
    public void removeLast(){
        if(isEmpty()){
            System.out.println("the list is empty ");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node<T> current=head;
        Node<T> previous=null;
        while (current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
    }
    public void print(){
        Node<T> current=head;
        while (current!=null) {
            System.out.println(current.data);
            current=current.next;
        }
    }
}
