
package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortUsingRecursion {
    public static void main(String[] args) {
        int []arr={3,2,1,6,5};
        System.out.println(Arrays.toString(Selection(arr,0,1,arr.length-1,0)));


    }

    static int[] Selection(int[] arr, int i,int j,int lastindex,int max) {
        if(i==arr.length-1){
            return arr;
        }

        if(j>arr.length-1-i){
            int temp=arr[lastindex];
            arr[lastindex]=arr[max];
            arr[max]=temp;
            return Selection(arr,i+1,1,arr.length-1-i,0);
        }

        if(arr[max]<arr[j]){
            max=j;

        }
        return Selection(arr,i,j+1,arr.length-1-i,max);

    }

}
