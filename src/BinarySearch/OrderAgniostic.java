package BinarySearch;

import java.util.Scanner;

public class OrderAgniostic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number you want to find: ");
        int target=sc.nextInt();
//        int []arr={-5,-3,-2,0,3,5,19,20,28,26,48};
        int[]arr={99,65,45,44,22,11,1,0,-1,-5};

        System.out.println(BinaryAgniosticBS(arr,target));
    }
    static int BinaryAgniosticBS(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        boolean isASC=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isASC){
                if(arr[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(arr[mid]<target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
