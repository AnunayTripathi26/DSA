package Recursion;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class LC1155Variant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the target");
        int target=sc.nextInt();
        System.out.println(RollsToTarget(target,""));
    }
    static List<String> RollsToTarget(int target,String New){
        if(target==0){
            List<String> list=new ArrayList<>();
            list.add(New);
            return list;

        }
        List<String>ans=new ArrayList<>();
        for(int i=1;i<=6&&i<=target;i++){

            ans.addAll(RollsToTarget(target-i,New+i));
        }
        return ans;

    }
}
