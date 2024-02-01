package arm;

import arm.interfaces.IRunner;

public class NullManager implements IRunner {
    @Override
    public void run() {
        System.out.println("wring input or manager not implemented yet");
    }

    @Override
    public void printMenu() {
        System.out.println(" dont have menu");
    }
}
