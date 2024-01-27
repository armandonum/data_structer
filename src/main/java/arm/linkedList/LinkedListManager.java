package arm.linkedList;

public class LinkedListManager implements IManager {
    @Override
    public void run() {
        System.out.println("i am running linkedlistmanager");
    }
    @Override
    public  void printMenu(){
        System.out.println("1 add");
        System.out.println("2. delete");
        System.out.println("3. search");
        System.out.println("4. route");

        }
}
