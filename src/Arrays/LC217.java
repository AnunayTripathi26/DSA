package Arrays;

import java.util.Arrays;

public class LC217 {
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        System.out.println(containsDuplicate(arr));

    }
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        boolean duplicate=false;
        if(nums.length<=1){
            return false;
        }
        while(i< nums.length-1){
            if(nums[i]!=nums[i+1]){
                i++;
            }
            else{
                duplicate=true;
                i++;

            }

        }
        return duplicate;

    }

}
