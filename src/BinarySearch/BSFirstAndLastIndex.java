package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BSFirstAndLastIndex {
    public static void main(String args[]){
        int [] arr={5,7,7,7,8,8,10};
        Scanner sc=new Scanner (System.in);
        int target=sc.nextInt();

        System.out.println(Arrays.toString(findIndex(arr,target)));
    }
    static int[] findIndex(int []arr,int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        int firstIndex=BSforFirstAndLastIndex(arr,target,true);
        int lastIndex=-1;
        if(firstIndex!=-1){
            lastIndex=BSforFirstAndLastIndex(arr,target,false);
        }
        return new int[]{firstIndex,lastIndex};
    }

    static int BSforFirstAndLastIndex(int[] arr, int target,boolean FirstIndex) {
        int start=0;
        int end=arr.length-1;
        int result=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                result=mid;
                if(FirstIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }

            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return result;

    }
}
