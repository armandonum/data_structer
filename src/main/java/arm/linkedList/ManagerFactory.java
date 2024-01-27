package arm.linkedList;

public class ManagerFactory {
    public static IManager getManager(int index){
        if(index==1){
            return new LinkedListManager();
        }
        return new NullManager();
    }
}
