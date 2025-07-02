package Recursion;

import java.util.Arrays;

public class MergeSortPureRecursion {
    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
        System.out.println(Arrays.toString(Merge(arr,0,arr.length-1)));
    }
    static int[] Merge(int [] arr,int start,int end){
         if(start==end){
             return arr;
         }
         int mid=start+(end-start)/2;
          Merge(arr,start,mid);
          Merge(arr,mid+1,end);
          return mergeSortedParts(arr,start,mid,end);

    }

    static int[] mergeSortedParts(int[] arr, int start, int mid, int end) {
        int []merge=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                merge[k]=arr[i];
                i++;
            }
            else{
                merge[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            merge[k]=arr[i];
            i++;
            k++;
        }
        while(j<=end){
            merge[k]=arr[j];
            j++;
            k++;
        }
        for(int a=0;a<=merge.length-1;a++){
            arr[start+a]=merge[a];
        }
        return arr;

    }
}
