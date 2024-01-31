package arm.linkedList;

public interface IDoubleLinkedList<T> {
    int size();
    boolean isEmpty();
    DoubkleEdgeNode<T> first();
    DoubkleEdgeNode<T> last();
    void addFirst(T data);
    void addLast(T data);
    void removeFirst();
   void removeLast();



}
