package arm.CircleList;

import arm.interfaces.IManager;
import arm.linkedList.LinkedList;

import java.util.Scanner;

public class CircleListRun implements IManager {
    @Override
    public void run() {
        System.out.println("i am running cicularLinkedList");
        CircularLinkedList ciclelist=new CircularLinkedList();
        System.out.println("circluar Linked list size "+ ciclelist.size());
        int choise=0;
        do{

            Scanner in= new Scanner(System.in);
             choise=in.nextInt();
            System.out.println("CHOOSE AN OPTION");
            switch (choise){
                case 1:
                    ciclelist.insert(54);
                    ciclelist.insert(2);
                    ciclelist.insert(12);
                    ciclelist.insert(8);
                    ciclelist.insert(80);
                    ciclelist.insert(94);

                    break;
                case 2:
                    System.out.println("Linked list size "+ ciclelist.size());
                    break;
                case 3:
                    System.out.println("the clone");
                    ciclelist.clone().print();
                    System.out.println("the original");
                    break;
                default:
                    System.out.println("the option not exist");
            }
            ciclelist.print();
        }while (choise!=4);
    }

    @Override
    public void printMenu() {
        System.out.println("1 insert");
        System.out.println("2. size");
        System.out.println("3. clone");
        System.out.println("4. exit");

    }
}
