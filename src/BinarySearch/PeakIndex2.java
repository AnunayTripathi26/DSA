package BinarySearch;

import java.util.Scanner;

public class PeakIndex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={1,1,3,1};
        System.out.println(PI2(arr));
    }
    static int PI2(int [] nums){
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]> nums[mid+1] && nums[mid]> nums[mid-1]){
                return nums[mid];
            }
            else if(nums[mid]> nums[start]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return -1;
    }

}