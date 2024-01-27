package arm.linkedList;

import arm.interfaces.IManager;

public class LinkedListManager implements IManager {
    @Override
    public void run() {
        System.out.println("i am running linkedlistmanager");
        LinkedList list=new LinkedList();
        System.out.println("Linked list size"+ list.size());
        // print menu

        //read imputs
        list.addFirst(54);
        list.addLast(2);
        list.addFirst(12);
        list.addLast(8);
        System.out.println("Linked list size "+ list.size());


        list.print();
        System.out.println("Linked list last "+ list.last().data);
        System.out.println("Linked list first "+ list.first().data);

    }
    @Override
    public  void printMenu(){
        System.out.println("1 add");
        System.out.println("2. delete");
        System.out.println("3. search");
        System.out.println("4. route");

    }
}
