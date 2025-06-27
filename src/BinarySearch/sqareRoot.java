package BinarySearch;

import java.util.Scanner;

public class sqareRoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();                                    //suppose n=8
        System.out.println(mySqrt(n));                          //SQUARE ROOT OF 8 IS 2.828.....mid=4,end=3,mid=1,start=2,mid=2,3
    }
    public static int mySqrt(int x) {
        int start=0;
        int end=x;
        while(start<=end){
            int mid=start+(end-start)/2;
            if((Math.sqrt(x))==mid){
                return mid;
            }
            if((Math.sqrt(x))>mid){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end;
    }

}
                              //BAD VERSION (LEET CODE)

//package BinarySearch;
////https://leetcode.com/problems/first-bad-version/description/
//public class badVersion {
//    public static void main(String[] args) {
//
//
//    }
//    public int firstBadVersion(int n) {
//        int start=1;
//        int end=n;
//        while(start<=end){
//            int mid=start+(end-start)/2;
//            if(n==1){                                           //  1,2,3
//                return n;
//            }
//            if(isBadVersion(mid)){
//                if(isBadVersion(mid-1)){
//                    end=mid-1;
//                }
//                end=mid;
//            }
//            if(n>mid){
//                start=mid+1;
//            }
//            else{
//                end=mid-1;
//            }
//        }
//
//    }
//
//}

