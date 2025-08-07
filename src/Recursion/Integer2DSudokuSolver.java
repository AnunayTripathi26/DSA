package Recursion;

import java.util.Arrays;

public class Integer2DSudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        solveSudoku(board);
    }

    public static void solveSudoku(int[][] board) {
        if (Sudoku(board)) {
            displayIt(board);
        }
        else{
            System.out.println("Cannot solve");
        }
    }

    static boolean Sudoku ( int[][] board){
            int row = -1;
            int col = -1;
            int n = board.length;
            boolean empty = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == 0) {
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
            for (int number = 1; number <= 9; number++) {
                if (isSafe(board, row, col, number)) {
                    board[row][col] = number;
                    if (Sudoku(board)) {
                        return true;
                    } else {
                        board[row][col] = 0;
                    }
                }

            }
            return false;
    }
    static boolean isSafe ( int[][] board, int row, int col, int num){
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



     static void displayIt(int[][] board) {
         for(int[] row:board){
             System.out.println(Arrays.toString(row));

         }

    }
}