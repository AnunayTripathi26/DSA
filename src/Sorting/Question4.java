package Sorting;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
                                                  //MICROSOFT AND AMAZON QUESTION
import java.util.ArrayList;
import java.util.List;

public class Question4 {
    public static void main(String[] args) {
        int []arr={4,3,2,7,8,2,3,1};

        System.out.println(findDuplicates(arr));

    }
    public static List<Integer> findDuplicates(int[] nums) {
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
        List<Integer> ans=new ArrayList<Integer>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                ans.add(nums[j]);
            }
        }
        return ans;

    }
}
