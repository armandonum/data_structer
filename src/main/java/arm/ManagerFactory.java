package arm;

import arm.linkedList.LinkedListManager;
import arm.interfaces.IManager;

public class ManagerFactory {
    public static IManager getManager(String structureID){

        if(structureID.equals("A")){
            return new LinkedListManager();
        }
        return new NullManager();
    }
}
