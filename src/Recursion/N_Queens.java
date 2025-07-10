package Recursion;

import java.util.ArrayList;
import java.util.List;

public class N_Queens {
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }
    public static List<List<String>> solveNQueens(int n) {
        // Initializes the chess board as a 2D boolean array
        boolean [][]board=new boolean[n][n];
        // Starts the recursive placement from the 0th row
        int row=0;
        return queens(board,row);

    }

    static List<List<String>> queens(boolean[][] arr, int row) {
        List<List<String>> result=new ArrayList<>();
        // Base case: all queens are placed
        if(row==arr.length){
            result.add(show(arr,""));
            return result;

        }
        // Try placing queen in each column of the current row
        for(int col=0;col<arr.length;col++){
            if(isSafe(arr,row,col)){
                // Place the queen if safe
                arr[row][col]=true;
                // Recurse to the next row
                result.addAll(queens(arr,row+1));
                // Backtrack
                arr[row][col]=false;
            }


        }
        return result;
    }

     static List<String> show(boolean[][] arr,String New){
         // Converts the boolean board into a list of strings representing the board state
        List<String> display=new ArrayList<>();
        for(boolean[] row:arr){
            String s="";
            for(boolean col:row){
                if(col){
                    s=s+'Q';
                }
                else{
                    s=s+".";
                }
            }
            display.add(s);
        }

        return display;
    }

    static boolean isSafe(boolean[][] arr, int row, int col) {
        // Check vertically upwards
        for(int i=0;i<=row;i++){
            if(arr[i][col]==true){
                return false;
            }
        }
        int leftDiagonal=Math.min(row,col);
        // Check top-left diagonal
        for(int i=1;i<=leftDiagonal;i++){
            if(arr[row-i][col-i]==true){
                return false;
            }

        }
        int rightDiagonal=Math.min(row,arr.length-1-col);
        // Check top-right diagonal
        for(int i=1;i<=rightDiagonal;i++){
            if(arr[row-i][col+i]==true){
                return false;
            }
        }
        return true;// Safe to place queen
    }
}
