package arm.Queues;

public interface IQueues <T>{
    int size();
    boolean isEmpty();


    void enqueue(T e) ;
    // add element to the end of the queue
    T  dequeue();
    // remove the first element from the queue
    T first();


}
