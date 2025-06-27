package Sorting;

public class question1 {
    public static void main(String[] args) {
        int []arr={9,6,4,2,3,5,7,0,1};

        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i && nums[i]<nums.length){
                int temp=nums[i];
                nums[i]=nums[nums[i]];
                nums[temp]=temp;
            }
            else{
                i++;
            }
        }
        int j=0;
        while(j<nums.length){
            if(nums[j]!=j){
                return j;
            }
            else j++;
        }
        return nums.length;

    }
}
