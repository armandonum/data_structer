package arm.interfaces;

public interface IDeQueues <D>{
    int size();
    // return the number of elements in the deque
    boolean isEmpty();
    // return true if the deque is empty
    D first();
    D last();
    void addFirst(D e);
    // add an element to the front of the deque
    void addLast(D e);
    // add an element to the back of the deque
    D removeFirst();
    // remove and return the first element from the deque
    D removeLast();
    // remove and return the last element from the deque
}
