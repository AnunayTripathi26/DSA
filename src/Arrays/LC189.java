package Arrays;

import java.util.Arrays;

public class LC189 {

    public static void main(String[] args) {
        int arr[]={};
        int k=2;
        rotate(arr,k);

    }
    public static void rotate(int[] nums, int k) {

            int count=0;
            for(int j=0;count<nums.length;j++){
                int prev=nums[j];
                int current =j;

                do{
                    int newindex =(current+k)% nums.length;
                    int temp=nums[newindex];
                    nums[newindex]=prev;
                    prev=temp;
                    current=newindex;
                    count++;
                }
                while(j!=current);

            }


        System.out.println(Arrays.toString(nums));

    }

}
