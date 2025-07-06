package Recursion;
import java.util.ArrayList;
import java.util.List;

public class LC78 {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(subsets(arr));

    }

    static List<List<Integer>> subsets(int[] arr) {
        return findSubset(arr,0);
    }

    static List<List<Integer>> findSubset(int [] arr, int index) {
        if(index==arr.length){
            List<List<Integer>> outer=new ArrayList<>();
            outer.add(new ArrayList<>());
            return outer;
        }
        List<List<Integer>> subsets=findSubset(arr,index+1);
        int current=arr[index];

        List<List<Integer>> result=new ArrayList<>();
        for(List<Integer> subset:subsets){
            List<Integer> copy=new ArrayList<>(subset);
            copy.add(current);
            result.add(copy);

        }
        subsets.addAll(result);
        return subsets;

    }



}
