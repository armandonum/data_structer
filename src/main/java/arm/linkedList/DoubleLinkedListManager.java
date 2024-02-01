package arm.linkedList;

import arm.interfaces.IRunner;

import java.util.Scanner;

public class DoubleLinkedListManager implements IRunner {
    @Override
    public void run() {
        System.out.println("i am running Doublelinkedlistmanager");
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<>();
        System.out.println("Double Linked list size"+ doubleLinkedList.size());
        int choise=0;
        //read imputs
        do {
            Scanner in = new Scanner(System.in);
            choise = in.nextInt();
            System.out.println("CHOOSE AN OPTION");
            switch (choise) {
                case 1:
                    doubleLinkedList.addFirst(1);
                    doubleLinkedList.addLast(2);
                    doubleLinkedList.addFirst(369);
                    doubleLinkedList.addLast(89);

                    break;
                case 2:
                    doubleLinkedList.removeLast();
                    doubleLinkedList.removeFirst();
                    break;
                case 3:
                    System.out.println("Linked list size " + doubleLinkedList.size());

                    break;
                case 4:
                    System.out.println("Linked list last " + doubleLinkedList.last().data);
                    System.out.println("Linked list first " + doubleLinkedList.first().data);

                    break;
                case 5:
                    System.out.println("Linked list last " + doubleLinkedList.last().data);
                    break;
                case 6:
                    System.out.println("Linked list previos " + doubleLinkedList.last().prev.data);
                    break;
                default:
                    System.out.println("the option not exist");
            }
            doubleLinkedList.print();
        }while (choise!=7);
    }

    @Override
    public void printMenu() {
        System.out.println("1 add");
        System.out.println("2. remove");
        System.out.println("3. size");
        System.out.println("4. first and last");
        System.out.println("5. last");
        System.out.println("6. previos");
        System.out.println("7. exit");
    }
}

