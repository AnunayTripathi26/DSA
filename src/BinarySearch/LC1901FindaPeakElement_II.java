/**
 * LeetCode 1901: Find a Peak Element II
 * Approach: Binary Search on Columns (Time: O(m log n))
 * - At each step, pick the middle column
 * - Find the row with the max element in that column
 * - If it's greater than its left and right neighbors → it's a peak
 * - Else, move left or right based on the greater neighbor
 * Returns the position of any one valid peak element.
 */
package BinarySearch;
import java.util.Arrays;
import java.util.Scanner;

public class LC1901FindaPeakElement_II {
    public static void main(String args[]){
        int [][]arr={
                {1,4},
                {3,2}
        };
        System.out.println(Arrays.toString(FindaPeakElement_II(arr)));
    }
    public static int[] FindaPeakElement_II(int [][] arr){
        int row=0;
        int start=0;
        int end=arr[row].length-1;
         while(start<=end){
             int mid=start+(end-start)/2;
             int maxrow=0;
             for(int i=0;i<=arr.length-1;i++){
                 if(arr[i][mid]>arr[maxrow][mid]){
                     maxrow=i;
                 }
             }
             int current=arr[maxrow][mid];
             int leftside;
             if(mid>0){
                 leftside=arr[maxrow][mid-1];
             }
             else{
                 leftside=-1;
             }
             int rightside;
             if(mid<end){
                 rightside=arr[maxrow][mid+1];
             }
             else{
                 rightside=-1;
             }
             if(current>leftside && arr[maxrow][mid]>rightside){
                 return new int[]{maxrow,mid};
             }
             else if(leftside>current){
                 end=mid-1;
             }
             else if(rightside>current){
                 start=mid+1;
             }

         }
         return new int[]{-1,-1};
    }
}
