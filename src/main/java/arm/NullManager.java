package arm;

import arm.interfaces.IManager;

public class NullManager implements IManager {
    @Override
    public void run() {
        System.out.println("wring input or manager not implemented yet");
    }

    @Override
    public void printMenu() {
        System.out.println(" dont have menu");
    }
}
