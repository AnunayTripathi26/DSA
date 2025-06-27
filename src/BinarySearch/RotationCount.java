package BinarySearch;

import java.util.Scanner;

public class RotationCount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]={15,8,2,3,6,12};
        System.out.println(rotationCount(arr));
    }
    static int rotationCount(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid+1;

            }
            else if(arr[mid]<arr[mid-1]){
                return mid;
            }
            else if(arr[start]==arr[mid]&& arr[mid]==arr[end]){
                if(arr[start]>arr[start+1]){
                    return start+1;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end+1;
                }
                end--;
            }
            else if(arr[start]<arr[mid] || (arr[start]==arr[mid]&& arr[mid]<arr[end])){
                start=mid+1;
            }
            else {
                end=mid-1;
            }


        }
        return -1;
    }
}
