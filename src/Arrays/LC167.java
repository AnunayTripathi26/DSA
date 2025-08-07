package Arrays;

import java.util.Arrays;

public class LC167 {
    public static void main(String[] args) {
//        int[] arr={2,7,11,15};
//        int target=9;
//        int [] arr={2,3,4};
//        int target=6;
        int [] arr={-1,0};
        int target=-1;
        System.out.println(Arrays.toString(twoSum(arr,target)));

    }
    public static int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end= numbers.length-1;
        while(start<end){
            if(numbers[start]+numbers[end]==target){
                return new int[]{start+1,end+1};
            }
            else if(numbers[start]+numbers[end]>target){
                end--;
            }
            else{
                start++;
            }
        }
        return new int[]{-1,-1};
    }
}
