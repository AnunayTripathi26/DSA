package BinarySearch;

import java.util.Scanner;

public class rotatedArray {
    public static void main(String[] args) {
       int []arr= {4,5,6,7,8,0,1,2,3};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a target:");
        int target=sc.nextInt();
        System.out.println(search(arr,target));
       }
    public static int search(int[] nums, int target) {
       int pivot=findPeakIndex(nums);
       if(pivot==-1){
           return Binarysearch(nums,target,0,nums.length-1);
       }
       if(target==nums[pivot]){
           return pivot;
       }
       if(target>=nums[0]){
           return Binarysearch(nums,target,0,pivot-1);
       }

           return Binarysearch(nums,target,pivot+1,nums.length-1);


    }
    static int Binarysearch(int []arr, int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static int findPeakIndex(int nums[]){
       int start=0;
       int end=nums.length-1;
       while(start<=end){
           int mid=start+(end-start)/2;
           if(mid<end&& nums[mid]>nums[mid+1]){
               return mid;
           }
           if(mid>start&& nums[mid]<nums[mid-1]){
               return mid-1;
           }
           if(nums[mid]<=nums[start]){
               end=mid-1;
           }
           else{
               start=mid+1;
           }
       }
       return -1;
    }


}
