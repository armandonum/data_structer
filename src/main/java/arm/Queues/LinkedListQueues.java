package arm.Queues;

import arm.linkedList.LinkedList;

public class LinkedListQueues<T> implements IQueues<T>{
    private LinkedList<T> list;
    public LinkedListQueues(){
        list=new LinkedList<>();
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
    public void enqueue(T e) {
        list.addLast(e);
    }

    @Override
    public T dequeue() {
        if(isEmpty()){
            return null;
        }
        T element=list.first().data;
        list.removeFirst();
        return element;
    }

    @Override
    public T first() {
        if(isEmpty()){
            return null;
        }
        return list.first().data;
    }
}
