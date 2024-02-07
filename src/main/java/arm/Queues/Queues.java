package arm.Queues;

public class Queues<T> implements IQueues<T> {
    private final T[] array;
    private static final int CAPACITY = 100;
    private int s = -1;

    public Queues() {
        array = (T[]) new Object[CAPACITY];
    }

    public Queues(int capacity) {
        array = (T[]) new Object[capacity];
    }


    @Override
    public int size() {
        return s + 1;
    }

    @Override
    public boolean isEmpty() {
        return s == -1;
    }

    @Override
    public void enqueue(T e) {
        if (size() == array.length) {
            //throw new IllegalStateException("Queue is full");
            System.out.println("Queue is full");
        }
        array[++s] = e;

    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        var element = array[0];
        for (int i = 0; i < s; i++) {
            array[i] = array[i + 1];
        }
        s--;
        return element;
    }

    @Override
    public T first() {
        if (isEmpty()) {
            return null;
        }
        return array[0];
    }
}
