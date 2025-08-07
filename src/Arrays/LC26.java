package Arrays;

import java.util.Arrays;

public class LC26 {
    public static void main(String[] args) {
       //int[] arr={0,0,1,1,1,2,2,3,3};
        int[] arr={1,1,1,2,2,3};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        int start=0;
        int end=1;
        int c=0;
        if(nums.length==0){
            return 0;
        }
        while(end!= nums.length){
            if(nums[start]==nums[end]){
                end++;
            }
            else{
                start++;
                if(start%2==0){
                    nums[start] = nums[end];
                    end++;
                }
                else{
                    end++;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return start+1;

    }
}
