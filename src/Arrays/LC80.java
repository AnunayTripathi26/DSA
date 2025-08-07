package Arrays;

import java.util.Arrays;

public class LC80 {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3};
        System.out.println(removeDuplicates2(arr));
    }
    public static int removeDuplicates2(int[] nums) {
        int start=2;
        int end=2;
        if(nums.length==1){
            return 1;
        }
        if(nums.length==2){
            return 2;
        }
        while(end!= nums.length){
            if(nums[end]!=nums[start-2]){
                nums[start]=nums[end];
                start++;
                end++;
            }
            else{
                end++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return start;

    }
}
