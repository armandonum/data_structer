package labs.lab_1;

import javax.swing.plaf.synth.SynthDesktopIconUI;

public class ScoreBoard {
    private GameEntry[] board;
    public ScoreBoard(int capacity){
        board=new GameEntry[capacity];
    }

    public void addEntry(GameEntry entry){

        for(int i=0; i<board.length;i++){
            if(board[i]==null){
                board[i]=entry;
                break;
            }
            if(entry.score> board[i].score) {
                for (int j = board.length - 1; j < i; j--) {
                    board[j] = board[j - 1];
                }
                board[i]=entry;
                break;
            }
        }

    }
    public void print(){
        for(var GameEntry: board ){
            System.out.println(GameEntry);
        }
    }
}
