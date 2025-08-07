package Matrix;

import java.util.Arrays;

public class LC289 {
    public static void main(String[] args) {
        int arr[][]={
                {0,1,0},
                {0,0,1},
                {1,1,1},
                {0,0,0}
        };

        gameOfLife(arr);

    }
    public static void gameOfLife(int[][] board) {
        int m=board.length;
        int n=board[0].length;
        boolean[][] life=new boolean[m][n];
        for(int i=0;i<life.length;i++){
            for(int j=0;j<life[i].length;j++){
                if(board[i][j]==1){
                    life[i][j]=true;
                }
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==1){
                    int live= LiveOrDead(i,j,board,0);
                    if(live<2 ||live>3){
                        life[i][j]=false;
                    }
                }
                if(board[i][j]==0){
                    int live=LiveOrDead(i,j,board,0);
                    if(live==3){
                        life[i][j]=true;
                    }
                }
            }
        }
        for(int i=0;i<life.length;i++){
            for(int j=0;j<life[i].length;j++){
                if(life[i][j]==true){
                    board[i][j]=1;
                }
                else{
                    board[i][j]=0;
                }
            }
        }
        for(int[] row:board){
            System.out.println(Arrays.toString(row));
        }


    }

    static int LiveOrDead(int r, int c, int[][] arr,int live) {
        if (r < 0 || c < 0 || r == arr.length || c == arr[r].length) {
            return live;
        }
        int[][] directions = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, -1}, {0, 1},
                {1, -1}, {1, 0}, {1, 1}
        };
        for (int[] dir : directions) {
            int row = r + dir[0];
            int col = c + dir[1];
            if (row>=0 && row<arr.length &&col>=0 &&col<arr[0].length) {
                if(arr[row][col]==1){
                    live++;
                }
            }
        }
        return live;
    }
}
