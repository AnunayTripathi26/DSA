package Recursion;

import java.util.ArrayList;
import java.util.List;

public class LC46 {
    public static void main(String[] args) {
        int []nums={1,2,3};
        System.out.println(permute(nums));

    }
    public static List<List<Integer>> permute(int[] nums) {
        boolean [] used=new boolean[nums.length];
        List<List<Integer>> result =new ArrayList<>();
        permuting(nums,used,new ArrayList<>(),result);
        return result;
    }

    static void permuting(int[] nums, boolean[] used,List<Integer> path,List<List<Integer>> result) {
        if(path.size()==nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i< nums.length;i++){
            if(!used[i]){
                used[i]=true;
                path.add(nums[i]);
                permuting(nums,used,path,result);
                used[i]=false;
                path.remove(path.size()-1);
            }
        }


    }
}
