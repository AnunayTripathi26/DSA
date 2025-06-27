package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BSin2DUNSORTEDarray {
    public static void main(String args[]){
        int [][]arr={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        System.out.println(Arrays.toString(Searching(arr,target)));
    }

    static int[] Searching(int[][] arr, int target) {
        int row=0;
        int column=arr.length-1;
        while(row<=arr.length-1&& column>=0){
            if(arr[row][column]==target){
                return new int[]{row,column};
            }
            else if(arr[row][column]<target){
                row++;
            }
            else{
                column--;
            }
        }
        return new int[]{-1,-1};
    }
}
