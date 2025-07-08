package BinarySearch;
// GFG - Painter’s Partition Problem.
// Binary search on maximum board length that any painter can paint.
// Objective: minimize the maximum time taken by a painter.
// Core idea: is it possible to assign boards such that no painter exceeds `mid` time.


public class PaintersPartition {
    public static void main(String[] args) {

        int []arr = {100, 200, 300, 400};
        int k=1;

        System.out.println(minTime(arr,k));
    }
    static int minTime(int[] arr, int k) {
        int result=0;
        int max=0;
        for (int i:arr){
            if(i>max){
                max=i;
            }
        }
        int start= max;
        int sum=0;
        for(int i:arr){
            sum+=i;

        }
        int end=sum;

        while(start<=end){
            int mid=start+(end-start)/2;
            if (isPossible(arr, mid, k)) {
                result=mid;
                end=mid-1;

            }
            else{
                start=mid+1;
            }
        }
        return result;

    }

     static boolean isPossible(int[] arr, int max, int k) {                //int arr[] = {5, 10, 30, 20, 15};
        int total=0;
        int painter=1;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                return false;
            }
            if(arr[i]+total<=max){
                total+=arr[i];
            }
            else{
                painter++;
                total=arr[i];
            }
            if(painter>k){
                return false;
            }
        }
        return true;
    }

}
