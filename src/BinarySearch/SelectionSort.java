package BinarySearch;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={5,3,4,1,2};
        selection(arr);
    }

    static void selection(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int last=arr.length-1-i;
            int Max=GetMaxIndex(arr,0,last);
            Swap(arr,Max,last);

        }
        System.out.println(Arrays.toString(arr));
    }


    static void Swap(int[] arr, int max, int last) {
        int temp=arr[last];
        arr[last]=arr[max];
        arr[max]=temp;
    }

    static int GetMaxIndex(int[] arr, int start, int end) {
        for(int i=0;i<=end;i++){
            if(arr[start]<arr[i]){
                int temp=arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
            }
        }
        return start;

    }
}
