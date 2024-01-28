package arm;

import arm.interfaces.IManager;

public class Main {
    public static void  main(String[] args){
        Welcome welcome=new Welcome();
        welcome.Options();
        String choise=Welcome.Choice();
        // input reader
        if(choise.equals("A")){
            IManager manager= ManagerFactory.getManager("A");
            manager.printMenu();
            manager.run();
        }else if(choise.equals("B")){
            IManager manager=ManagerFactory.getManager("B");
            manager.printMenu();
            manager.run();

        }

    }

}
