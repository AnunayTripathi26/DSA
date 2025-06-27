package BinarySearch;
import java.util.*;
public class maxWealth {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {2,3,4},
                {5,6,7}
        };
        for(int i=0;i<arr.length;i++){

            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println(richestCustomer(arr));
    }
    static int richestCustomer(int[][] arr){

        int wealth=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
            if(sum>wealth){
                wealth=sum;
            }


        }
        return wealth;
    }


}
