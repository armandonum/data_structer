package Tasks;

import Tasks.task_1.ITowerHanoi;
import Tasks.task_1.TowerHanoi;
import Tasks.task_1.TowerHanoiRun;
<<<<<<< HEAD
import Tasks.task_2.bubledSortRun;

=======
import jdk.internal.misc.InnocuousThread;
>>>>>>> origin/main
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CHOICE A OPTION");
        System.out.println("1. Tower of Hanoi");
        System.out.println("2. Bubled Sort");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Enter the number of discs");
                int number = sc.nextInt();
                ITowerHanoi towerA = new TowerHanoi();
                TowerHanoiRun tower=new TowerHanoiRun();
                tower.resolve(number,towerA);
                break;
            case 2:
                bubledSortRun sort=new bubledSortRun();
                sort.run();
                break;
            default:
                System.out.println("Invalid option");
                break;
        }


    }


}
