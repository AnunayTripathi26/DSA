package BinarySearch;
//For revision
import java.util.Scanner;

public class RotatedSorted2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]={4,5,6,7,8,9,10,11,12,13,14,15,0,1,2,2,2,2,2,3,3,3,3};
        System.out.println(rsbt2(arr));
    }
    static int rsbt2(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[start]==arr[mid] && arr[mid]==arr[end]){
                if(arr[start]>arr[start+1]){
                    return arr[start];
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return arr[end-1];
                }
            }
            if(arr[start]<arr[mid] || (arr[mid]==arr[start]&&arr[end]>arr[mid])){
                start=mid;
            }
            else{
                end=mid-1;
            }
        }
        return arr[start];
    }
}
