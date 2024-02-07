package arm.Queues;

public interface IDobleQueues<T>{
    /**
     * Add an element to the front of the deque
     * @param e
     */
    void addFirst(T e);
    /**
     * Add an element to the end of the deque
     * @param e
     */
    void addLast(T e);
    /**
     * Remove the first element from the deque
     * @return
     */
    T removeFirst();
    /**
     * Remove the last element from the deque
     * @return
     */
    T removeLast();
    /**
     * Return the first element of the deque
     * @return
     */
    T first();
    /**
     * Return the last element of the deque
     * @return
     */
    T last();
    /**
     * Return the number of elements in the deque
     * @return
     */
    boolean isEmpty();
    /**
     * Return the number of elements in the deque
     * @return
     */
    int size();




}
