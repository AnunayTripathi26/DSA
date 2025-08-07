package Arrays;

import java.util.Arrays;

public class LC27 {
    public static void main(String[] args) {
        int arr[]={0,1,2,2,3,0,4,2};
        int val=2;
        System.out.println(removeElement(arr,val));

    }
    public static int removeElement(int[] nums, int val) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            if(nums[start]==val){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                end--;
            }
            else{
                start++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return start;
    }

}
