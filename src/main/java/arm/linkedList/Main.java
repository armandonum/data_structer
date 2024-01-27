package arm.linkedList;

import arm.arrays.Welcome;

public class Main {
    public static void  main(String[] args){
        Welcome welcome=new Welcome();
        welcome.Options();
        int choise=Welcome.Choice();

        if(choise==1){
            IManager manager=ManagerFactory.getManager(1);
            manager.printMenu();
            manager.run();


        }else{
            System.out.println("the option not exist");
        }

    }

}
