package Sorting;

import java.util.Arrays;

public class Selection {

    public static void main(String args[]) {
        int arr[] = {8, 9, 1, 3, 7, 4, 6};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void SelectionSort(int []arr){
        for (int i = 0; i <= arr.length - 1; i++) {
            int lastIndex = arr.length - 1 - i;
            int max = maxIndex(arr, lastIndex);
            Swapping(arr,max,lastIndex);

        }
    }

    static void Swapping(int[] arr, int max, int lastIndex) {
        int temp=arr[max];
        arr[max]=arr[lastIndex];
        arr[lastIndex]=temp;
    }

    static int maxIndex(int[] arr, int last){
        int max=0;
        for(int i=0;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

}




