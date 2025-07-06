package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LC1155 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of dices");
        int n=sc.nextInt();
        System.out.println("Enter total no. of faces");
        int k=sc.nextInt();
        System.out.println("Enter the target");
        int target=sc.nextInt();
        System.out.println(RollsToTarget(n,k,target,new ArrayList<>()));
    }

//    static int numRollsToTarget(int n, int k, int target) {
//        final int Mod=100000007;
//        if(target==0&&n==0){
//            return 1;
//        }
//        if(target==0||n==0){
//            return 0;
//        }                                                      //For counting the combination (LC1155)
//        int ans=0;
//        for(int i=1;i<=k && i<=target; i++){
//
//            ans=ans+numRollsToTarget(n-1,k,target-i)%Mod;
//        }
//        return ans;
//
//    }

    static List<List<Integer>> RollsToTarget(int n, int k, int target,List<Integer> current){
        List<List<Integer>> result=new ArrayList<>();
        if(n==0&&target==0){
            result.add(new ArrayList<>(current));
            return result;
        }
        if(n==0||target==0){
            return result;
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=k;i++){
            List<Integer> copy=new ArrayList<>(current);
            copy.add(i);
            ans.addAll(RollsToTarget(n-1,k,target-i,copy));

        }
        return ans;
    }
}
