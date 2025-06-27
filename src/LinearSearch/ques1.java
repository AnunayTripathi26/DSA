package LinearSearch;

import java.util.Scanner;

public class ques1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter array elements:");
        int []nums= {12,654,1789,1,22};
//        System.out.println(countDigit(6545639));

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        System.out.println(findnumber(nums));

    }
    static int findnumber(int[] nums){
        int count=0;
        for(int i = 0; i <nums.length; i++){
            int num=nums[i];
            if(even(num)){
                count++;
            }

        }
        return count;
    }
    static boolean even(int num){
        return countDigit(num)%2==0;
    }
    static int countDigit(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }


}
