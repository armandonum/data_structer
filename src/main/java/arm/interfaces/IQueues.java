package arm.interfaces;

public interface IQueues <T>{

    void enqueue(T e) ;
    // add element to the end of the queue
    T  dequeue();
    // remove the first element from the queue
    T first();
    boolean isEmpty();
    int size();

}
