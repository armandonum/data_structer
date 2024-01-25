package org.example;



public class Main {

    public static void main(String[] args) {

        System.out.println("WELCOME");

        Welcome welcome=new Welcome();
        welcome.Message();
        welcome.Options();
        int choice=welcome.Choice();

        if(choice==1){
            System.out.println("1 . linked list");
            LinkedList myList = new LinkedList();
            myList.append(1);
            myList.append(2);
            myList.append(3);
            System.out.print("LINKEDLINST: ");
            myList.printList();

        }else if(choice==2){
            System.out.println("2. Stacks");
        }else if(choice==3){
            System.out.println("3. Queues");
        }



    }
}