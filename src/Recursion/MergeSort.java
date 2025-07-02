package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int []arr={10,9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(Merge(arr)));
   }

    static int[] Merge(int[] arr) {
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int []left=Merge(Arrays.copyOfRange(arr,0,mid));
        int [] right=Merge(Arrays.copyOfRange(arr,mid,arr.length));

        return SortAndMergeArrays(left,right);


    }

    static int[] SortAndMergeArrays(int[] left, int[] right) {
        int [] merge=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]>right[j]){
                merge[k]=right[j];
                j++;
            }
            else{
                merge[k]=left[i];
                i++;
            }
            k++;
        }
        while(i<left.length){
            merge[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            merge[k]=right[j];
            j++;
            k++;
        }
        return merge;
    }



}
