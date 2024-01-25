package org.example;

import java.util.Scanner;

public class Welcome {
    public static void Message() {
        System.out.println("welcome to the program");
    }

    public static void Options() {
        System.out.println("1. Linked List");
        System.out.println("2. Stacks");
        System.out.println("3. Queues");
        System.out.println("4. Trees");
        System.out.println("5. Graphs");
        System.out.println("6. 1 Sorting");
        System.out.println("7. 2 Sorting");
        System.out.println("8. 3 Sorting");
        System.out.println(" ");
    }

    public static int Choice() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("CHOOSE AN _OPTION");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You selected Linked List.");
                break;
            case 2:
                System.out.println("You selected Stacks.");
                break;
            case 3:
                System.out.println("You selected Queues.");
                break;
            case 4:
                System.out.println("You selected Trees.");
                break;
            case 5:
                System.out.println("You selected Graphs.");
                break;
            case 6:
                System.out.println("You selected 1 Sorting.");
                break;
            case 7:
                System.out.println("You selected 2 Sorting.");
                break;
            case 8:
                System.out.println("You selected 3 Sorting.");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 8.");
        }

        return choice;
    }
}
