package Tasks.task_1;

import java.util.Stack;

public class TowerHanoi implements ITowerHanoi {
    @Override
    public void moveDisc(Stack<Integer> origin, Stack<Integer> destiny) {
        destiny.push(origin.pop());
    }

    @Override
    public void printStatus(Stack<Integer> origin, Stack<Integer> aux, Stack<Integer> destiny) {
        System.out.println("Origin : " +origin);
        System.out.println("auxiliar : "+aux);
        System.out.println("destini : "+ destiny);
        System.out.println("-----------------------");
    }


//    private Stack<Integer> numDiscos = new Stack<>();
//    private String name;
//
//    public TowerHanoi(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public void printStatus() {
//        System.out.println("Tower " + name + " : " + numDiscos);
//    }
//
//    @Override
//    public void resolveHanoi(int numDisc, ITowerHanoi destiny, ITowerHanoi aux) {
//        resolveHanoiRecursive(numDisc, aux, destiny);
//    }
//
//    @Override
//    public void resolveHanoiRecursive(int numDisc, ITowerHanoi aux, ITowerHanoi destiny) {
//        if (numDisc > 0) {
//            resolveHanoiRecursive(numDisc - 1, this, aux);
//            moveDisc((TowerHanoi) destiny);
//            printStatus();
//            aux.resolveHanoiRecursive(numDisc - 1, destiny, this);
//        }
//    }
//
//
//
//    @Override
//    public void moveDisc(TowerHanoi destiny) {
//        if (!numDiscos.isEmpty()) {
//            int disc = numDiscos.pop();
//            destiny.addDisc(disc);
//        }
//    }
//
//
//    @Override
//    public void addDisc(int disc) {
//        numDiscos.push(disc);
//
//    }


}
