package BinarySearch;

import java.util.Scanner;

public class floor {
    public static void main(String args[]) {
        int[] arr={2,3,5,9,14,16,18,21,36,55,58,96,111,132,152,164};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of whose ceiling you want to find: ");
        int target=sc.nextInt();
        System.out.println(findFloor(arr,target));

    }
    public static int findFloor(int arr[], int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[0]){
                return -1;
            }
            if(target==arr[mid]){
                return arr[mid];
            }
            else if(target>arr[mid]){
                start=mid+1;

            }
            else{
                end=mid-1;
            }
        }
        return arr[end];
    }
}
