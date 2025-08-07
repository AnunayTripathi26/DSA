package Matrix;

import java.beans.Introspector;
import java.util.ArrayList;
import java.util.List;

public class LC54 {
    public static void main(String[] args) {
        int[][]arr={
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}
        };
        System.out.println(spiralOrder(arr));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        return Logic(matrix,0, matrix.length-1,0,matrix[0].length-1,new ArrayList<>());
    }

     static List<Integer> Logic(int[][] arr, int top, int bottom, int left,int right,List<Integer> ans) {
        if(top>bottom||left>right){
            return ans;
        }
        for(int i=left;i<=right;i++){
            ans.add(arr[top][i]);
        }
        for(int i=top+1;i<=bottom;i++){
            ans.add(arr[i][right]);
        }
        if(top!=bottom) {
            for (int i = right - 1; i >= left; i--) {
                ans.add(arr[bottom][i]);
            }
        }
        if(left!=right) {
            for (int i = bottom - 1; i > top; i--) {
                ans.add(arr[i][left]);
            }
        }
        return Logic(arr,top+1,bottom-1,left+1,right-1,ans);

    }
}
