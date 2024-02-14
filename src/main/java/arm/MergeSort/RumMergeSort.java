package arm.MergeSort;

import arm.interfaces.IRunner;
import java.util.Scanner;
import arm.MergeSort.MergeSort;

public class RumMergeSort implements IRunner {
    @Override
    public void run() {
        MergeSort mergeSort = new MergeSort();
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Choose an option");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    int[] array = {10, 5, 15, 3, 7, 13, 18, 1};
                    mergeSort.mergeSort(array);
                    for (int i : array) {
                        System.out.println(i);
                    }
                    break;
                    case 2:
                        // quickSort
                        int[] array2 = {10, 5, 15, 3, 7, 13, 18, 1};
                        mergeSort.quickSort(array2);
                        for (int i : array2) {
                            System.out.println(i);
                        }
                        break;

            }
        } while (option != 0);

    }

    @Override
    public void printMenu() {
        System.out.println("1. MergeSort");
        System.out.println("2. QuickSort");



    }
}
