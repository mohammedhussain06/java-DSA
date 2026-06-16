
public class NQueen {
    public static boolean isSafe(char board[][], int row, int col) {
        //vertically up 
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        //diagonal- left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        //diagonal- right
        for (int i = row -1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char board[][], int row) {
        if (row == board.length) {
            printBoard(board);
            count++;
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                 board[row][j] = 'Q';
                nQueens(board, row + 1);  //function call
                board[row][j] = 'X';     //backtrackingS
            }
        }
    }

    public static boolean  nqueens(char board[][], int row) {
        if (row == board.length) {
            printBoard(board);
            count++;
            return true;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nqueens(board, row + 1)) {
                    return true;
                }  //function call
                board[row][j] = 'X';     //backtrackingS
            }
        }
        return false;
    }

    public static void printBoard(char board[][]) {
        System.out.println("-------Chess board-------");
        for (int row = 0; row < board.length; row++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[row][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;
    public static void main(String args[]) {
        int n = 5;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        //nQueens(board, 0);
        //System.out.println("Total ways to print nQueens = " + count);
        if (nqueens(board, 0)) {
            System.out.println("Solution is possible");
            printBoard(board);
        } else {
            System.out.println("Solution not possible");
        }
    }
}
