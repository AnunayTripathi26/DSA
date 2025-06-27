package Strings;
import java.util.*;
public class Program4 {

        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int n=sc.nextInt();
            int nums[]=new int[n];
            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            int target=sc.nextInt();
            for(int i=0;i<n;i++){
                if(nums[i]+nums[i+1]==target){
                    System.out.println("["+i+","+i+1+"]");
                }
            }
        }

}
