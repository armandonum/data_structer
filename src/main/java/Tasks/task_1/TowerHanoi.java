package Tasks.task_1;

import java.util.Stack;

public class TowerHanoi implements ITowerHanoi {
    @Override
    public void moveDisc(Stack<Integer> origin, Stack<Integer> destiny) {
        destiny.push(origin.pop());
    }

    @Override
    public void printStatus(Stack<Integer> origin, Stack<Integer> aux, Stack<Integer> destiny) {
        System.out.println("Origin : " + origin);
        System.out.println("auxiliar : "+ aux);
        System.out.println("destini : "+ destiny);
        System.out.println("-----------------------");
    }




}
