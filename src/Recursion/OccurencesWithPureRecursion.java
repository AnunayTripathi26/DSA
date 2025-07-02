package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class OccurencesWithPureRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int arr[]={1,2,3,4,5,6,7,7,7,7,8,9,9,10,11,11};
        System.out.println(FindOccurences(arr,target,0));
    }

    static ArrayList<Integer> FindOccurences(int[] arr, int target, int index) {
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> alloccurences=FindOccurences(arr,target,index+1);
        list.addAll(alloccurences);
        return list;
    }
}
