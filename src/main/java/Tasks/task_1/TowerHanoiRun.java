package Tasks.task_1;

import Tasks.IRun;

import java.util.Stack;

public class TowerHanoiRun implements IRun {

    @Override
    public void resolve(int n, ITowerHanoi tower) {
Stack<Integer> source = new Stack<>();
Stack<Integer> aux = new Stack<>();
Stack<Integer> destiny = new Stack<>();
        for (int i = n; i >=1; i--) {
            source.push(i);
        }
        tower.printStatus(source,aux,destiny);
        move(n,source,aux,destiny,tower);
        System.out.println("hanoi tower solved");
    }

    @Override
    public void move(int n, Stack<Integer> source, Stack<Integer> aux, Stack<Integer> destiny, ITowerHanoi tower) {
if(n>0){
    move(n-1,source,destiny,aux,tower);
    tower.moveDisc(source,destiny);
    tower.printStatus(source,aux,destiny);
    move(n-1,aux,source,destiny,tower);

}
    }
}
