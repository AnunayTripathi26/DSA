package BinarySearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class mountainArray {
    public static void main(String args[]){
        int arr[]={0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));

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
}
