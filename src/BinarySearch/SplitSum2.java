package BinarySearch;

import java.util.Scanner;

public class SplitSum2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int arr[]={7,2,5,8,10};
        System.out.println(splitSum(arr,m));
    }
    static int splitSum(int arr[], int m){
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            start=Math.max(start,arr[i]);
            end+=arr[i];
        }
        while(start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;
            for(int i:arr){
                if(i+sum>mid){
                    sum=i;
                    pieces++;
                }
                else{
                    sum+=i;
                }
            }
            if(pieces<=m){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
