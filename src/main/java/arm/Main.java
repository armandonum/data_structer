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

    }

}
