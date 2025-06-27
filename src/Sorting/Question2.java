package Sorting;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/1450920800/
import java.util.ArrayList;
import java.util.List;
                                                                            //GOOGLE QUESTION  
public class Question2 {
    public static void main(String[] args) {
        int []arr={4,3,2,7,8,2,3,1};

        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
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
        List<Integer> ans=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                ans.add(j+1);
            }
        }
        return ans;



    }
}
