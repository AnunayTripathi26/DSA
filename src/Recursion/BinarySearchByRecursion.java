package Recursion;
/**
 * Recursively performs binary search on a sorted array.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(log n) due to recursion stack
 *
 * Sample Input:
 * 5
 *
 * Sample Output:
 * 4
 * (Index of 5 in the array)
 */
import java.util.Scanner;

public class BinarySearchByRecursion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int []arr={1,2,3,4,5,6,7,8,9,10,11};
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
        else if(arr[mid]<target){
            return Search(arr,target,mid+1,end);
        }
        else{
            return Search(arr,target,start,mid-1);
        }

    }

}

