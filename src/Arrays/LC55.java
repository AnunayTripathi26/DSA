package Arrays;

public class LC55 {
    public static void main(String[] args) {
        int[] nums={2,3,1,1,4};
        System.out.println(canJump(nums));

    }
    public static boolean canJump(int[] nums) {
        int start=0;

        while(start<nums.length-1){
            int end=nums[start]-1;
            if(nums[start]+nums[start+end]==nums.length-1){
                return true;
            }
            if(nums[start]+nums[start+end]<nums.length-1){
                start=end;
            }
            else{
                return false;
            }

        }
        return false;

    }

}
