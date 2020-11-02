
import java.util.Arrays;
import java.util.Random;

public class MineSweeperBasics {


    public char[][] board = new char[12][12];
    public Random rand = new Random();

    private char[][] filledBoard(){
          for (char[] row: board) {
            Arrays.fill(row, '.');
        }
        return board;
    }

    private char[][] putBombs() {
        for (int i = 1; i< 11; i++){
            board[1+rand.nextInt(10)][1+rand.nextInt(10)] = '*';
        }
        return board;
    }

    private char [][] putPoints(){
        for (int i = 1; i< 11; i++){
            for (int j = 1; j<11; j++) {
                int points = 0;

                if (board[i][j+1] == '*'){
                    points = points +1;
                }
                if (board[i][j-1] == '*' ){
                    points = points +1;
                }
                if (board[i+1][j] == '*' ){
                    points = points +1;
                }
                if (board[i-1][j] == '*' ){
                    points = points +1;
                }
                if (board[i+1][j+1] == '*'){
                    points = points +1;
                }
                if (board[i-1][j-1] == '*' ){
                    points = points +1;
                }
                if (board[i+1][j-1] == '*' ){
                    points = points +1;
                }
                if (board[i-1][j+1] == '*' ){
                    points = points +1;
                }


                if(!(board[i][j]=='*')){
                board[i][j]= Integer.toString(points).charAt(0);}

            }
        }
        return board;
    }


    private void printBoard(){
        for (char[] c: board) {
            System.out.println(c);

        }
    }

    public void executeMiner(){
        filledBoard();
        putBombs();
        putPoints();
        printBoard();
    }

}
