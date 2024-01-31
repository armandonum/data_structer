package arm.interfaces;

public interface IStacks <E>{
    int size();
    // return the number of elements in the stack
    boolean isEmpty();
    // return true if the stack is empty
    void push(E e);
    // add element e to the top of the stack

    E top();
    // return the top element of the stack, without removing it
    E pop();
    // remove and return the top element from the stack
}
