package BinarySearch;

import java.util.Scanner;

public class binarySearch {
    public static void main(String args[]){
        int []arr={-5,-3,-2,0,3,5,19,20,28,26,48};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number you want to find: ");
        int target=sc.nextInt();
        System.out.println(Binarysearch(arr,target));
    }
    static int Binarysearch(int []arr, int target){
        int start=0;
        int end=arr.length-1;
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

}
