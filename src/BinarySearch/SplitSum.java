package BinarySearch;

import java.util.Scanner;

public class SplitSum {
    public static void main(String[] args) {
        int arr[]={7,2,5,8,10};
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        System.out.println(splitsum(arr,m));

    }

    static int splitsum(int[] arr, int m) {
        int start=0;
        int end=0;
        for(int nums=0;nums<arr.length;nums++){
            start=Math.max(start,arr[nums]);
            end+=arr[nums];
        }
        while(start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;
           for(int nums:arr){
               if(nums+sum>mid){
                   pieces++;
                   sum=nums;
               }
               else{
                   sum=sum+nums;
               }
           }
           if(pieces<=m){
               end=mid;
           }
           else{
               start=mid+1;
           }
        }
        return end;
    }
}
