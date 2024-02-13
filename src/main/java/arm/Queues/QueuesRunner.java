package arm.Queues;
import arm.interfaces.IRunner;
import java.util.Scanner;

public class QueuesRunner implements IRunner {
    @Override
    public void run() {
        linkedLits_DobleQueues<Integer> queue = new linkedLits_DobleQueues<>();
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Choose an option");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the element to insert");
                    queue.addLast(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("The element removed is: " + queue.removeFirst());
                    break;
                case 3:
                    System.out.println("The first element is: " + queue.first());
                    break;
                case 4:
                    System.out.println("The size of the queue is: " + queue.size());
                    break;
                case 5:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (option != 5);
    }

    @Override
    public void printMenu() {
        System.out.println("1. insert element to the queue");
        System.out.println("2. Remove element from the queue");
        System.out.println("3. show first element");
        System.out.println("4. show size of the queue");
        System.out.println("5. Exit");
    }
}
