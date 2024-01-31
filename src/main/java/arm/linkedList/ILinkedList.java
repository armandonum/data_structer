package arm.linkedList;

public interface ILinkedList<T> {
    int size();
    boolean isEmpty();
    Node<T> first();
    Node<T> last();
    void addFirst(int data);
    void addLast(int data);
    void removeFirst();
    void removeLast();
}
