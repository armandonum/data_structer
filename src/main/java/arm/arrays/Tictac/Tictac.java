package arm.arrays.Tictac;

public class Tictac {
    public static final int x=1, O=-1;
    public static final int EMPTY=0;
    private final int[][] board=new int[3][3];

    private int player;

    public Tictac(){
        initBoard();
        player=x;
    }
    private  void initBoard(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j]=EMPTY;
            }
        }
    }
private boolean isWin(int player){
   return( (board[0][0]+board[0][1]+board[0][2]==player*3)||
            (board[1][0]+board[1][1]+board[1][2]==player*3)||
            (board[2][0]+board[2][1]+board[2][2]==player*3)||
            (board[0][0]+board[1][0]+board[2][0]==player*3)||
            (board[0][1]+board[1][1]+board[2][1]==player*3)||
            (board[0][2]+board[1][2]+board[2][2]==player*3)||
            (board[0][0]+board[1][1]+board[2][2]==player*3)||
            (board[2][0]+board[1][1]+board[0][2]==player*3));

}




    public void markBoard(int i, int j) {
        if ((i < 0) || (i > 2) || (j < 0) || (j > 2)) {
            System.out.println("!invalid board position");
            return;
        }
        if (board[i][j] != EMPTY) {
            System.out.printf("!board position (%d, %d) is already occupied\n", i, j);
            return;
        }
        board[i][j] = player;
        printBoard();

        if (isWin(player)) {
            System.out.printf("player %d wins\n", player);
            return;
        }
        player = -player;
    }
        public void printBoard(){
            System.out.println("Board");
            for(int i=0;i<3;i++){
                System.out.printf("|");
                for(int j=0;j<3;j++){
                    if (board[i][j]==x){
                        System.out.print("X|");
                    }
                    else if (board[i][j]==O){
                        System.out.print("O|");
                    }
                    else{
                        System.out.print(" |");
                    }
                }
                System.out.println();
            }

    }



}
