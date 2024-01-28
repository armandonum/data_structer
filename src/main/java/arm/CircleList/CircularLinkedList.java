package arm.CircleList;

public class CircularLinkedList<T> implements ICircleList <T>{
    Node<T> head;

    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
        }
        int size = 1;
        Node<T> current = head.next;
        while (current != null && current != head) {
            size++;
            current = current.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public void insert(T data) {
        Node<T> newNode=new Node<>(data);
        if(isEmpty() ) {
            head = newNode;
            head.next = head;
        }else {
            Node<T> current=head;
            while (current.next!=head){
                current=current.next;
            }
            current.next=newNode;
            newNode.next=head;
            }
    }

    @Override
    public void print() {
        if(isEmpty() ){
            System.out.println("the circular list is empty");
            return;
        }
        Node<T> current=head;
        do{
            System.out.println(current.data+" ");
            current=current.next;
        }while (current!=head);
        System.out.println();

    }

    @Override
    public ICircleList<T> clone() {
        CircularLinkedList<T> cloneList = new CircularLinkedList<>();
        if (head == null) {
        return cloneList;
    }
        Node<T> current=head;
        do {
            cloneList.insert(current.data);
            current = current.next;
        }while (current!= head);
        return cloneList;
    }
}
