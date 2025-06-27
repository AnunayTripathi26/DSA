package BinarySearch;

import java.util.Scanner;

public class RotatedSortedArraysMyself {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={4,5,6,7,0,1,2,3};
        int target=sc.nextInt();
        System.out.println( findPivot(arr,target));
    }

    static int findPivot(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        int pivot=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid>0&&arr[mid]<arr[mid-1]){
                pivot=mid;
                break;
            }
            else if(mid<arr.length-1&&arr[mid]>arr[mid+1]){
                pivot=mid+1;
                break;
            }
            else if(arr[mid]>arr[arr.length-1]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        if(pivot==0){
            return BinarySearch(arr,target,0,arr.length-1);
        }
        else if(target>=arr[0]){
            return BinarySearch(arr,target,0,pivot-1);
        }
        else{
           return BinarySearch(arr,target,pivot,arr.length-1);
        }
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
// Previously submitted leetcode solution
//public  int search(int[] nums, int target) {
//    int pivot=findPeakIndex(nums);
//    if(pivot==-1){
//        return Binarysearch(nums,target,0,nums.length-1);
//    }
//    if(target==nums[pivot]){
//        return pivot;
//    }
//    if(target>=nums[0]){
//        return Binarysearch(nums,target,0,pivot-1);
//    }
//
//    return Binarysearch(nums,target,pivot+1,nums.length-1);
//
//
//}
//static int Binarysearch(int []arr, int target,int start,int end){
//    while(start<=end){
//        int mid=start+(end-start)/2;
//        if(target<arr[mid]){
//            end=mid-1;
//        }
//        else if(target>arr[mid]){
//            start=mid+1;
//        }
//        else{
//            return mid;
//        }
//    }
//    return -1;
//}
//public static int findPeakIndex(int nums[]){
//    int start=0;
//    int end=nums.length-1;
//    while(start<=end){
//        int mid=start+(end-start)/2;
//        if(mid<end&& nums[mid]>nums[mid+1]){
//            return mid;
//        }
//        if(mid>start&& nums[mid]<nums[mid-1]){
//            return mid-1;
//        }
//        if(nums[mid]<=nums[start]){
//            end=mid-1;
//        }
//        else{
//            start=mid+1;
//        }
//    }
//    return -1;
//}
