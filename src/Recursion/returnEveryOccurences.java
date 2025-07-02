package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class returnEveryOccurences {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int target=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<Integer>();
        int []arr={1,2,3,4,5,5,6,7,7,8,9,10,11,11};
        System.out.println(ReturnIndexes(arr,list,0,target));

    }

    static ArrayList<Integer> ReturnIndexes(int[] arr, ArrayList<Integer> list,int index,int target) {
        if(index>arr.length-1){
            return list;
        }
        else if(arr[index]==target){
            list.add(index);
        }
        return ReturnIndexes(arr,list,index+1,target);
    }
}
