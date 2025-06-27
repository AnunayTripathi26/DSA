package Sorting;

//https://leetcode.com/problems/find-the-duplicate-number/
                                                           //AMAZON Question
public class Question3 {
    public static void main(String[] args) {
        int []arr={1,3,4,2,2};

        System.out.println(findDisappearedNumbers(arr));
    }
    public static int findDisappearedNumbers(int[] nums) {
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
        int duplicate=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                duplicate=(nums[j]);
            }
        }
        return duplicate;



    }
}
