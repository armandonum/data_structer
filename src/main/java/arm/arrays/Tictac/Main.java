package arm.arrays.Tictac;

public class Main {
    public static void main(String[] args){
        Tictac game=new Tictac();
        game.printBoard();
        game.markBoard(1,1);
        game.markBoard(0,2);
        game.markBoard(1,2);
        game.markBoard(0,1);
        game.markBoard(1,0);
    }
}
