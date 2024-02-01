package arm;

import arm.interfaces.IRunner;

public class Main {
    public static void  main(String[] args){
        Welcome welcome=new Welcome();
        welcome.Options();
        String choise=Welcome.Choice();
        // input reader
        IRunner manager= ManagerFactory.getManager(choise);
        manager.printMenu();
        manager.run();
//        if(choise.equals("A")){
//            IManager manager= ManagerFactory.getManager("A");
//            manager.printMenu();
//            manager.run();
//        }else if(choise.equals("A-1")){
//            IManager manager=ManagerFactory.getManager("A-1");
//            manager.printMenu();
//            manager.run();
//        }else if(choise.equals("B")){
//            IManager manager=ManagerFactory.getManager("B");
//            manager.printMenu();
//            manager.run();
//
//        }

    }

}
