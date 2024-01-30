package Tasks.task_1;

public interface ITowerHanoi {


    void printStatus();
    void resolveHanoi(int numDisc, ITowerHanoi destiny, ITowerHanoi aux);

    void resolveHanoiRecursive(int numDisc, ITowerHanoi aux, ITowerHanoi destiny);




    void moveDisc(TowerHanoi destiny);

    void addDisc(int disc);
}
