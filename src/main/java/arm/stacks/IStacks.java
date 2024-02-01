package arm.stacks;

public interface IStacks<E> {
    /**
     * Returns the number of elements in the stack
     * @return number of elements in the stack
     */
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
    void print();
}
