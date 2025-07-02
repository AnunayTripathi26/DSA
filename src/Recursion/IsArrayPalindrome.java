package Recursion;

public class IsArrayPalindrome {
    public static void main(String[] args) {
        int []arr={1,2,2,1};
        System.out.println(isPalin(arr,0,arr.length-1));
    }

    static boolean isPalin(int[] arr, int start, int end) {
        if(start>=end){
            return true;
        }
        else if(arr[start]==arr[end]){
            return isPalin(arr,start+1,end-1);
        }
        else{
            return false;
        }

    }
}
