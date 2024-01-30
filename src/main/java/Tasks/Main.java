package Tasks;

import Tasks.task_1.TowerHanoi;
import jdk.internal.misc.InnocuousThread;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    int numDics = 3;
    TowerHanoi towerA = new TowerHanoi("A");
    TowerHanoi towerB = new TowerHanoi("B");
    TowerHanoi towerC = new TowerHanoi("C");
    for (int i = numDics; i > 0; i--) {
        towerA.addDisc(i);
    }

    towerA.printStatus();
    towerB.printStatus();
    towerC.printStatus();
    System.out.println("Initial status");

    towerA.resolveHanoiRecursive(numDics, towerB, towerC);
    System.out.println("Final status");
}
}
