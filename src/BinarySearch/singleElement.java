package BinarySearch;
//https://leetcode.com/problems/single-element-in-a-sorted-array/description/
public class singleElement {
    public static void main(String[] args) {
//        int nums[]={1,1,2,3,3,4,4,8,8};
        int nums[]={1};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {
      int start=0;                                             //[1,1,2,3,3,4,4,8,8]
      int end=nums.length-1;
      while(start<=end){
          int mid=start+(end-start)/2;
          if(nums.length==1 || nums[0]!=nums[1]){
              return nums[0];
          }
//          if(nums[0]!=nums[1]){
//              return nums[0];
//          }
          if(nums[nums.length-1]!=nums[nums.length-2]){
              return nums[nums.length-1];
          }
          if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
              return mid;
          }
          if(mid%2==0 && nums[mid]!=nums[mid+1] || mid%2==1 && nums[mid]!=nums[mid-1]){
              end=mid;
          }
          if(mid%2==0 && nums[mid]==nums[mid+1] || mid%2==1 && nums[mid]==nums[mid-1]){
              start=mid+1;
          }
      }
      return -1;
    }
}
