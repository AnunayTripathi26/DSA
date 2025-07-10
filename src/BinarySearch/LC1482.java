package BinarySearch;
// LeetCode 1482 - Binary Search on days.
// Check if it's possible to make m bouquets using k adjacent flowers within mid days.
// Greedy check inside binary search loop.

public class LC1482 {
    public static void main(String[] args) {
        int[] bloomDay={7,7,7,7,12,7,7};
        int m=2;
        int k=3;
        System.out.println(minDays(bloomDay,  m,  k));

    }

     static int minDays(int[] bloomDay, int m, int k) {
        int result=-1;
        int start=bloomDay[0];
        for(int i:bloomDay){
            if(i<start){
                start=i;
            }
        }
        int end=0;
        for(int i:bloomDay){
            if(i>end){
                end=i;
            }
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isPossible(bloomDay,m,k,mid)){
                result=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return result;
    }
    static boolean isPossible(int [] bloomDay,int m,int k,int days){
        int bouquet=0;
        int flowers=0;
        for(int i=0;i<=bloomDay.length-1;i++){
            if(days>=bloomDay[i]){
                flowers++;
                if(flowers==k){
                    bouquet++;
                    flowers=0;
                }
            }
            else{
                flowers=0;
            }
        }
        if(bouquet<m){
            return false;
        }
        else{
            return true;
        }
    }

}
