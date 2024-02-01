package arm.stacks;

import arm.interfaces.IRunner;

import java.util.Scanner;
import arm.stacks.LimkedStacks;

public class StacksRunner implements IRunner {
    @Override
    public void run() {
        LimkedStacks stack = new LimkedStacks();
        int choise = 0;
        do {
            Scanner in = new Scanner(System.in);
             choise = in.nextInt();
            System.out.println("CHOOSE AN OPTION");
            switch (choise) {
                case 1:
                    System.out.println("push");
                    stack.push(1);
                    stack.push(22);
                    stack.push(65);
                    stack.push(78);
                    break;
                case 2:
                    System.out.println("pop");
                    stack.pop();
                    System.out.println("poped");
                    break;
                case 3:
                    System.out.println("top");
                    stack.top();
                    System.out.println("element toped");
                    break;
                case 4:
                    System.out.println("size");
                    System.out.println("size is: " + stack.size());
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("the option not exist");
            }
            stack.print();
        }while (choise != 5) ;
    }

    @Override
    public void printMenu() {
        System.out.println("1. push");
        System.out.println("2. pop");
        System.out.println("3. top");
        System.out.println("4. size");
        System.out.println("5. Exit");

    }
}
