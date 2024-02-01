package arm;

import arm.CircleList.CircleListRun;
import arm.linkedList.DoubleLinkedListManager;
import arm.linkedList.LinkedListManager;
import arm.interfaces.IRunner;
import arm.stacks.ArrayStackRunner;
import arm.stacks.StacksRunner;

public class ManagerFactory {
    public static IRunner getManager(String structureID){

        if(structureID.equals("A")){
            return new LinkedListManager();
        }else if(structureID.equals("A-1")){
                return new DoubleLinkedListManager();
        }else if(structureID.equals("B")){
            return new CircleListRun();
        }else if(structureID.equals("C")){
            return new StacksRunner();
        }
        return new NullManager();
    }
}
