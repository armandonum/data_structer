package Tasks;

import Tasks.task_1.ITowerHanoi;
import Tasks.task_1.TowerHanoi;
import Tasks.task_1.TowerHanoiRun;
import jdk.internal.misc.InnocuousThread;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 3;
        ITowerHanoi towerA = new TowerHanoi();
        TowerHanoiRun tower=new TowerHanoiRun();
        tower.resolve(number,towerA);
    }


}
