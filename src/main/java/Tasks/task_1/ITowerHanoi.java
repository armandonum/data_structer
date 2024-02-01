package Tasks.task_1;

import java.util.Stack;

public interface ITowerHanoi {

void moveDisc(Stack<Integer> origin, Stack<Integer> destiny);
void printStatus(Stack<Integer> origin, Stack<Integer> aux, Stack<Integer> destiny);


}
