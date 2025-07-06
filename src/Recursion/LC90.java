package Recursion;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class LC90 {
    public static void main(String[] args) {
        int arr[]={2,1,2};
        System.out.println(subsets(arr));

    }

    static List<List<Integer>> subsets(int[] arr) {
        Arrays.sort(arr);
        return findSubset(arr,0,new ArrayList<>());
    }

    static List<List<Integer>> findSubset(int [] arr, int index , List<Integer> current) {

        List<List<Integer>> result =new ArrayList<>();
        if(index==arr.length){

            result.add(current);
            System.out.println(result);
            return result;
        }
        List<Integer> include =new ArrayList<>(current);
        include.add(arr[index]);
        result.addAll(findSubset(arr,index+1, include));

        while(index<arr.length-1 && arr[index]==arr[index+1]){
            index++;
        }
        List<Integer> exclude=new ArrayList<>(current);
        result.addAll(findSubset(arr,index+1,exclude));

        return result;

    }
}
