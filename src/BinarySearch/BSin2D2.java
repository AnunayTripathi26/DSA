package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BSin2D2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int arr[][]={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(twoDimBS2(arr,target)));
    }

     static int[] twoDimBS2(int[][] arr, int target) {
        int r=0;
        int c=arr.length-1;
        while(r<arr.length&&c>=0){
            int mid=r+(c-r)/2;
            if(target==arr[r][c]){
                return new int[]{r,c};
            }
            else if(target>arr[r][c]){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
