package arm.Queues;

import arm.linkedList.LinkedList;

public class linkedLits_DobleQueues<T> implements IDobleQueues<T>{
private LinkedList<T> list;
public linkedLits_DobleQueues() {
    list = new LinkedList<>();
}


    @Override
    public void addFirst(T e) {
list.addFirst(e);
    }

    @Override
    public void addLast(T e) {
list.addLast(e);
    }

    @Override
    public T removeFirst() {
        if(list.isEmpty()){
            System.out.println("The list is empty");
        }
        T element = list.first().data;
        list.removeFirst();

        return element;
    }

    @Override
    public T removeLast() {
        if(list.isEmpty()){
            System.out.println("The list is empty");
        }
        T element = list.last().data;
        list.removeLast();
            return element;

    }

    @Override
    public T first() {
        if(list.isEmpty()){
            System.out.println("The list is empty");
        }
        return list.first().data;
    }

    @Override
    public T last() {
        if(list.isEmpty()){
            System.out.println("The list is empty");
        }
        return list.last().data;
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }
}
