package BinarySearch;

import java.util.Scanner;

public class Mountainarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={1,2,3,4,5,10,11,12,9,8,7,6};
        System.out.println(bs(arr));

    }
    static int bs(int []arr){
        int start=0;
        int end=arr.length-1;
        while(start!=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return arr[start];
    }
}
