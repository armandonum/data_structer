package arm;

import java.util.Scanner;

public class Welcome {
    public static void Message() {
        System.out.println("welcome to the program");
    }

    public static void Options() {
        System.out.println("A. Linked List");
        System.out.println("A-1. Double Linked List");

        System.out.println("B. CircularList");
        System.out.println("C. Stacks");
        System.out.println("D. Queues");
        System.out.println("E. Trees");
        System.out.println("F. Graphs");
        System.out.println("G. 1 Sorting");
        System.out.println("H. 2 Sorting");
        System.out.println("I. 3 Sorting");
        System.out.println(" ");
    }

    public static String Choice() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("CHOOSE AN _OPTION");

        String choice = scanner.nextLine();
        switch (choice) {
            case "A":
                System.out.println("You selected Linked List.");
                break;
            case "A-1":
                System.out.println("You selected Double Linked List.");
            case "B":
                System.out.println("You selected Circular List.");
                break;
            case "C":
                System.out.println("You selected Stacks.");
                break;
            case "D":
                System.out.println("You selected Queues.");
                break;
            case "E":
                System.out.println("You selected Threes.");
                break;
            case "F":
                System.out.println("You selected 1 Graphs.");
                break;
            case "G":
                System.out.println("You selected 2 Sorting.");
                break;
            case "H":
                System.out.println("You selected 3 Sorting.");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 8.");
        }

        return choice;
    }
}
