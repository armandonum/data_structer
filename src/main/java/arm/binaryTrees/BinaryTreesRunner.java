package arm.binaryTrees;

import arm.interfaces.IRunner;
import java.util.Scanner;

public class BinaryTreesRunner implements IRunner {
    @Override
    public void run() {
        BinaryTree tree = new BinaryTree();
        int[] array= {10, 5, 15, 3, 7, 13, 18, 1};
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Choose an option");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                        for(int i:array){
                    tree.insert(i);
                       }
                        //mostrar los elementos agregados
                    for(int i:array){
                        System.out.println(i);
                    }
                    break;
                case 2:

                    System.out.println("The element is: " + tree.search(scanner.nextInt()));
                    break;
                case 3:

                    tree.delete(scanner.nextInt());
                    break;
                case 4:
                    System.out.println("The height is: " + tree.height());
                    break;
                case 5:
                    System.out.println("The size of the tree is: " + tree.size());
                    break;
                case 6:
                    System.out.println("The inOrder of the tree is: ");
                    tree.inOrder(tree.getRoot());

                    System.out.println();
                    break;
                case 7:
                    System.out.println("The preOrder of the tree is: ");
                    int[] preOrder = tree.preOrder(tree.getRoot());
                    for (int i : preOrder) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;
                case 8:
                    System.out.println("The postOrder of the tree is: ");
                    int[] postOrder = tree.postOrder(tree.getRoot());
                    for (int i : postOrder) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;
                case 9:
                    System.out.println("");
                    break;
                default:
                    System.out.println("Invalid option");
            }

        } while (option != 9);



    }

    @Override
    public void printMenu() {
        System.out.println("1. insert element to the tree");
        System.out.println("2. search element in the tree");
        System.out.println("3. delete element from the tree");
        System.out.println("4. show height of the tree");
        System.out.println("5. show size of the tree");
        System.out.println("6. show inOrder of the tree");
        System.out.println("7. show preOrder of the tree");
        System.out.println("8. show postOrder of the tree");
        System.out.println("9. Exit");
    }
}
