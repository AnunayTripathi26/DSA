package Recursion;

import java.util.Scanner;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int arr[]={4,5,6,7,8,9,1,2,3};
        System.out.println(Search(arr,target,0,arr.length-1));

    }

    static int Search(int[] arr, int target, int start, int end) {
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }

            if(arr[start]<=arr[mid]){
                if(target>=arr[start]&& target<arr[mid]){
                    return Search(arr,target,start,mid-1);
                }
                else {
                    return Search(arr, target, mid+1, end);
                }
            }
            else{
                if(target>arr[mid]&&target<=arr[end]){
                    return Search(arr,target,mid+1,end);
                }
                else{
                    return Search(arr,target,start,mid-1);
                }
            }


    }

}
