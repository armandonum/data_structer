package arm.stacks;

import arm.linkedList.LinkedList;

public class LimkedStacks<T> implements IStacks<T> {

    private LinkedList<T> list = new LinkedList<>();

    @Override
    public void push(T data) {
        list.addFirst(data);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public T top() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.first().data;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T datas = list.first().data;
        list.removeFirst();
        return datas;
    }

    @Override
    public void print() {
        list.print();
    }
}
