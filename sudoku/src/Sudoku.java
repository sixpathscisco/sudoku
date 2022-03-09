
public class Sudoku {

    public static void print(int[][] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
                if((j+1) % ((int) Math.sqrt(board.length)) == 0) {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
            if((i+1) % ((int) Math.sqrt(board.length)) == 0) {
                System.out.print("\n");
            }
        }
    }

}