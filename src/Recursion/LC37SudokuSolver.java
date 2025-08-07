package Recursion;

import java.util.Arrays;

public class LC37SudokuSolver {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };


        solveSudoku(board);
    }

    public static void solveSudoku(char[][] board) {
        if (Sudoku(board)) {
            displayIt(board);
        }
        else{
            System.out.println("Cannot solve");
        }
    }

    static boolean Sudoku ( char[][] board){
        int row = -1;
        int col = -1;
        int n = board.length;
        boolean empty = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    empty = true;
                    break;
                }
            }
            if (empty) {
                break;
            }
        }
        if (!empty) {
            return true;
        }
        for (char number = '1'; number <= '9'; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (Sudoku(board)) {
                    return true;
                } else {
                    board[row][col] = '.';
                }
            }

        }
        return false;
    }
    static boolean isSafe ( char[][] board, int row, int col, int num){
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }
        for (int j=0;j<board.length;j++) {
            if(board[row][j]==num){
                return false;
            }

        }
        int sqrt = (int) (Math.sqrt(board.length));
        int boxRowStart = row - row % sqrt;
        int boxColStart = col - col % sqrt;
        for (int i = boxRowStart; i < boxRowStart + sqrt; i++) {
            for (int j = boxColStart; j < boxColStart + sqrt; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }



    static void displayIt(char[][] board) {
        for(char[] row:board){
            System.out.println(Arrays.toString(row));

        }

    }
}
