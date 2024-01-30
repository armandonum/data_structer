package Tasks;

import Tasks.task_1.ITowerHanoi;

import java.util.Stack;

public interface IRun {
    void resolve(int n, ITowerHanoi tower);
    void move(int n, Stack<Integer> source,Stack<Integer> aux, Stack<Integer> destiny, ITowerHanoi tower);
}
