package org.example;
import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        logger.info("welcome");
        logger.info("1 . linked list");
        LinkedList myList = new LinkedList();
        // agregar elemntos
        myList.append(45);
        myList.append(465);
        myList.printList();
    }
}