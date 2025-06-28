/*
LeetCode: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
Problem: 154. Find Minimum in Rotated Sorted Array II
Difficulty: Hard

Approach:
Modified Binary Search with special handling for duplicates.
- If arr[mid] > arr[end], the minimum is in the right half.
- If arr[mid] < arr[end], the minimum is in the left half (including mid).
- If arr[mid] == arr[end], we cannot be sure, so safely reduce search space with end--

Time Complexity: O(log n) on average, O(n) in worst case (when many duplicates)
Space Complexity: O(1)
*/

package BinarySearch;

public class LC154MinimumInRotatedSortedArrayWithDuplicates {
    public static void main(String args[]){
        int arr[]={2,2,2,0,1,2};
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
            else if(arr[mid]>arr[end] ){
                start=mid+1;
            }
            else if(arr[mid]==arr[end]){
                end--;
            }
            else{
                end=mid-1;
            }
        }
        return arr[start];
    }
}
