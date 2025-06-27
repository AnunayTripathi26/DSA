package BinarySearch;
//https://leetcode.com/problems/find-in-mountain-array/description/
import java.util.Scanner;

public class find_InMountainArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={0,2,1,0};
        int target=sc.nextInt();
        System.out.println(search(arr,target));

    }
    public static int search(int arr[],int target){
        int mid=peakIndexInMountainArray(arr);
        int firstTry=Binarysearch(arr,target,0,mid);
        if(firstTry!=-1){
            return firstTry;
        }
        else{
            firstTry=Binarysearch(arr,target,mid,arr.length-1);
            return firstTry;
        }

    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //It means you are in decreasing side of an array
                //so mid might be a possible answer but there us a possibility that answer lies in left of mid
                //so make end=mid
                end=mid;
            }
            else{
                start=mid+1;
                //means that you are in increasing side or ascending order
                //mid+1 is greater than mid so start the search from mid+1
                //because we know mid is of know use as we want to find peak or largest element
            }
        }
        return start; //you can return end also because at last both will point to the peak element

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
}
