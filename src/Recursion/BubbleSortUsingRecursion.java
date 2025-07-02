package Recursion;

import java.util.Arrays;

public class BubbleSortUsingRecursion {
    public static void main(String[] args) {
        int []arr={4,3,2,1};
        System.out.println(Arrays.toString(Bubble(arr,0,1)));
    }

    static int[] Bubble(int[] arr,int i,int j) {
        if(i==arr.length){
            return arr;
        }
        if(j>arr.length-1-i){
            return Bubble(arr,i+1,1);
        }
        else if(arr[j]<arr[j-1]){
            int temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;

        }
        return Bubble(arr,i,j+1);

    }
}
