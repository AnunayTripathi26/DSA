/*
LeetCode: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
Difficulty: Medium
Approach: Pivot-based Binary Search
Time: O(log n)
Space: O(1)
*/

package BinarySearch;

public class LC153MinimumInRotatedSortedArray {
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2,3};
        System.out.println(findMin(arr));
    }
    public static int findMin(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid>0 && arr[mid]<arr[mid-1]){
                return arr[mid];
            }
            else if ( mid<arr.length-1 && arr[mid]>arr[mid+1]){
                return arr[mid+1];
            }
            else if(arr[mid]>arr[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return arr[start];
    }
}
