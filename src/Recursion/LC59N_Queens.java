package Recursion;

import java.util.Scanner;

public class LC59N_Queens {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(totalNQueens(n));
    }
    public static int totalNQueens(int n) {

        boolean visited[][]=new boolean[n][n];
        return findingWays(n,0,visited);
    }

    static int findingWays(int n, int row,boolean[][]visited) {
        if(row==n){
            return 1;
        }
        int count=0;
        for(int col = 0; col <n; col++){
            if(isSafe(row, col,visited)){
                visited[row][col]=true;
                count=count+findingWays(n,row+1,visited);
                visited[row][col]=false;
            }
        }
        return count;

    }
    static boolean isSafe(int r,int c,boolean[][] visited){
        for(int i=0;i<visited.length;i++){
            if(visited[i][c]==true){
                return false;
            }
        }
        for(int i=0;i<visited.length;i++){
            if(visited[r][i]==true){
                return false;
            }
        }
        int leftDiagonal=Math.min(r,c);
        for(int i=1;i<=leftDiagonal;i++){
            if(visited[r-i][c-i]==true){
                return false;
            }
        }
        int rightDiagonal=Math.min(r,visited.length-1-c);
        for(int i=1;i<=rightDiagonal;i++){
            if(visited[r-i][c+i]==true){
                return false;
            }
        }
        return true;
    }
}
