package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BSin2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int arr[][]={
                {10,20,30,40},
                {15,25,35},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(twoDimBS(arr,target)));
    }

    static int [] twoDimBS(int[][] arr,int target) {
        int row=0;
        int column=arr.length-1;
        while(row<arr.length && column>=0){
            int mid=row+(column-row)/2;
            if(arr[row][column]==target){
                return new int[]{row,column};
            }
            if(arr[row][column]<target){
                row++;
            }
            else{
                column--;
            }

        }
        return new int[]{-1,-1};
    }
}
