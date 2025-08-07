package Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC73 {
    public static void main(String[] args) {
        int [][] arr={
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        setZeroes(arr);
    }
    public static void setZeroes(int[][] matrix) {
        List<Integer> r=new ArrayList<>();
        List<Integer> c=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    r.add(i);
                    c.add(j);
                }
            }
        }
        for(int i=0;i<r.size();i++){
            settingZero(r.get(i),c.get(i),matrix);
        }
        for(int[] row:matrix){
            System.out.println(Arrays.toString(row));
        }
    }

     static void settingZero(int row, int col, int[][] arr) {
        for(int i=0;i< arr.length;i++){
            if(i==row){
                for(int j=0;j< arr[row].length;j++){
                    arr[i][j]=0;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr[row].length;j++){
                if(j==col){
                    arr[i][j]=0;
                }
            }
        }
    }
}
