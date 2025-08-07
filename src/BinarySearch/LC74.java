package BinarySearch;

import java.util.Scanner;

public class LC74 {
    public static void main(String[] args) {
//        int arr[][]={
//                {1,3,5,7},
//                {10,11,16,20},
//                {23,30,34,60}
//        };
//        int arr[][]={
//                {1},
//                {3},
//                {5}
//        };
        int arr[][]={
                {}
        };
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        System.out.println(searchMatrix(arr, target));

    }
    static boolean BS(int[][]matrix,int start,int end,int target,int row){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(matrix[row][mid]==target){
                return true;
            }
            if(target<matrix[row][mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;

    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rowStart=0;
        int rowEnd=matrix.length-1;
        if(matrix.length==1){
            return BS(matrix,0,matrix[0].length-1,target,0);
        }
        int colMid=matrix[0].length/2;
        while(rowStart<rowEnd-1){
            int rowMid=rowStart+(rowEnd-rowStart)/2;
            if(matrix[rowMid][colMid]==target){
                return true;
            }
            if(matrix[rowMid][colMid]<target){
                rowStart=rowMid;
            }
            else{
                rowEnd=rowMid;
            }
        }
        if(target<=matrix[rowStart][colMid]&&target>=matrix[rowStart][0]){
            return BS(matrix,0, colMid, target,rowStart);
        }
        if(target>matrix[rowStart][colMid]&&target<=matrix[rowStart][matrix[rowStart].length-1]){
            return BS(matrix,colMid+1,matrix[rowStart].length-1,target,rowStart);
        }
        if(target<=matrix[rowEnd][colMid]&&target>=matrix[rowEnd][0]){
            return BS(matrix,0,colMid,target,rowEnd);
        }
        if(target>matrix[rowEnd][colMid]&&target<=matrix[rowEnd][matrix[rowEnd].length-1]){
            return BS(matrix,colMid+1,matrix[rowEnd].length-1,target,rowEnd);
        }
        return false;

    }
}
