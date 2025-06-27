package BinarySearch;

import java.util.Scanner;

public class RotatedSorted {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]={4,5,6,7,8,9,10,11,0,1,2,2,2,2,2,3,3,3,3};
        System.out.println(rsbt(arr));
    }

    static int rsbt(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return arr[mid];

            }
            else if(arr[mid]<arr[mid-1]){
                return arr[mid-1];
            }
            else if(arr[start]==arr[mid]&& arr[mid]==arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end;
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
