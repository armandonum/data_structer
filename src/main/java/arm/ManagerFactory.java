package arm;

import arm.CircleList.CircleListRun;
import arm.linkedList.LinkedListManager;
import arm.interfaces.IManager;

public class ManagerFactory {
    public static IManager getManager(String structureID){

        if(structureID.equals("A")){
            return new LinkedListManager();
        }else if(structureID.equals("B")){
            return new CircleListRun();
        }
        return new NullManager();
    }
}
