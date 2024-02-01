package arm.stacks;

public class ArrayStacks<T> implements IStacks<T>{
private final T[] array;
private static final int CAPACITY=1000;
private int s=-1;
public ArrayStacks(){
    array=(T[]) new Object[CAPACITY];
}
public ArrayStacks(int capacity){
    array=(T[]) new Object[capacity];
}



    @Override
    public int size() {
        return s+1;
    }

    @Override
    public boolean isEmpty() {
        return s==-1;
    }

    @Override
    public void push(T o) {
    if(size()==array.length){
      //  throw new IllegalStateException("Stack is full");
    System.out.println("Stack is full");
    return;
    }
    array[++s]=o;
    }

    @Override
    public T top() {
        if(isEmpty()){
            return null;
        }
        return array[s];
    }

    @Override
    public T pop() {
        if(isEmpty()){
            return null;
        }
        T data=array[s];
        array[s]=null;
        s--;
        return data;
    }

    @Override
    public void print() {
    if(isEmpty()){
        System.out.println("Stack is empty");
        return;
    }
        for(int i = size()-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
