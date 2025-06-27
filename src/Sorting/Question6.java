package Sorting;
//https://leetcode.com/problems/first-missing-positive/description/
public class Question6 {
    public static void main(String[] args) {
        int []arr={0};
        System.out.println(firstMissingPositive(arr));
    }
    public static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]<=0){
                i++;
                continue;
            }
            if(nums[i]<nums.length && nums[i]!=nums[nums[i]-1] ){
                int temp=nums[i];
                nums[i]=nums[nums[i]-1];
                nums[temp-1]=temp;
            }
            else{
                i++;
            }

        }
        int ans=1;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==ans){
               ans++;
            }
        }
        return ans;

    }
}
