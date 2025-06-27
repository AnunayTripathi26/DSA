package Sorting;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int []arr={3,5,2,1,4  };
        CycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void CycleSort(int []arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1){
                int temp=arr[i];
                arr[i]=arr[arr[i]-1];
                arr[temp-1]=temp;
            }
            else{
                i++;
            }
        }
    }
}
