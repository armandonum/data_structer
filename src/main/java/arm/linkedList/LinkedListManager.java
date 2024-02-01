package arm.linkedList;

import arm.interfaces.IRunner;

import java.util.Scanner;

public class LinkedListManager implements IRunner {
    @Override
    public void run() {
        System.out.println("i am running linkedlistmanager");
        LinkedList list=new LinkedList();
        System.out.println("Linked list size"+ list.size());
int choise=0;
        //read imputs
        do {
            Scanner in = new Scanner(System.in);
            choise = in.nextInt();
            System.out.println("CHOOSE AN OPTION");
            switch (choise) {
                case 1:
                    list.addFirst(54);
                    list.addLast(2);
                    list.addFirst(12);
                    list.addLast(8);

                    break;
                case 2:
                    list.removeLast();
                    list.removeFirst();
                    break;
                case 3:
                    System.out.println("Linked list size " + list.size());

                    break;
                case 4:
                    System.out.println("Linked list last " + list.last().data);
                    System.out.println("Linked list first " + list.first().data);

                    break;
                default:
                    System.out.println("the option not exist");
            }
            list.print();
        }while (choise!=5);
    }
    @Override
    public  void printMenu(){
        System.out.println("1 add");
        System.out.println("2. remove");
        System.out.println("3. size");
        System.out.println("4. first and last");
        System.out.println("5. exit");
    }
}
