package BinarySearch;

import java.util.Scanner;

public class SmallestLetter {
    public static void main(String args[]) {
        char[] arr={'a','b','f','g','r','t','w','y'};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of whose ceiling you want to find: ");
        char target=sc.next().charAt(0);
        System.out.println(findCeiling(arr,target));

    }
    public static char findCeiling(char arr[],char target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
//            if(target>arr[arr.length-1]){
//                return arr[0];
//            }
//            if(target==arr[mid]){
//                return arr;
//            }
            if(target<arr[mid]){
                end=mid-1;

            }
            else{
                start=mid+1;
            }
        }
        return arr[start% arr.length];
    }
}
