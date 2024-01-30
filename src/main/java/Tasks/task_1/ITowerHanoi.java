package Tasks.task_1;

import java.util.Stack;

public interface ITowerHanoi {

void moveDisc(Stack<Integer> origin, Stack<Integer> destiny);
void printStatus(Stack<Integer> origin, Stack<Integer> aux, Stack<Integer> destiny);


//    void printStatus();
//    void resolveHanoi(int numDisc, ITowerHanoi destiny, ITowerHanoi aux);
//
//    void resolveHanoiRecursive(int numDisc, ITowerHanoi aux, ITowerHanoi destiny);
//
//
//
//
//    void moveDisc(TowerHanoi destiny);
//
//    void addDisc(int disc);
}
