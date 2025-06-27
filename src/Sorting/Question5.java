package Sorting;

import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
        int []arr={1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    public static int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]!=nums[nums[i]-1]){
                int temp=nums[i];
                nums[i]=nums[nums[i]-1];
                nums[temp-1]=temp;
            }
            else{
                i++;
            }

        }
        int arr[]=new int[2];
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                arr[0]=nums[j];
                arr[1]=j+1;
                break;
            }
        }
        return arr;

    }
}
