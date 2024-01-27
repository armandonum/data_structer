package labs.lab_1;

public class Main {
    public static void main(String[] ar){
        GameEntry entry=new GameEntry("JHON",100);
        ScoreBoard scoreBoard=new ScoreBoard(5);
        scoreBoard.addEntry(entry);
        scoreBoard.addEntry(new GameEntry("mary",200));
        scoreBoard.addEntry(new GameEntry("mike",150));
        scoreBoard.addEntry(new GameEntry("ssss",125));
        scoreBoard.addEntry(new GameEntry("bada",85));



        scoreBoard.print();
        //System.out.println(entry);
    }
}
