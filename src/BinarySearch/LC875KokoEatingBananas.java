package BinarySearch;
// LeetCode 875 - Binary Search on answer space.
// Koko can eat at most mid bananas per hour, check if she can finish in given hours.
// Time Complexity: O(n * log(max(piles))) where n = number of piles.

public class LC875KokoEatingBananas {
    public static void main(String[] args) {
        int[] arr={30,11,23,4,20};
        int h=6;
        System.out.println(minEatingSpeed(arr,h));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int result=0;
        int start=1;
        int max =piles[0];
        for(int i:piles){
            if(i>max){
                max=i;
            }
        }
        int end= max;
        while(start<=end){
            int k=start+(end-start)/2;
            if(isPossible(piles,h,k)){
                result=k;
                end=k-1;
            }
            else{
                start=k+1;
            }
        }
        return result;


    }
    public static boolean isPossible(int [] piles,int h,int speed){
        int time=0;
        for(int i=0;i<=piles.length-1;i++){
            if(piles[i]<=speed){
                time+=1;
            }
            if(piles[i]>speed){
                time+=(piles[i]+speed-1)/speed;
            }
            if(time>h){
                return false;
            }
        }
        return true;
    }
}
