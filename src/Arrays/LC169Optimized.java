package Arrays;

public class LC169Optimized {
    public static void main(String[] args) {
        int arr[]={-3,-3,-3,-3,-4,2};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        int i=0;
        int current=nums[0];
        int count=0;
        while(i<nums.length){
            if(nums[i]==current){
                count++;
                i++;
            }
            else{
                count--;
                i++;
            }
            if(count==0){
                current=nums[i];
            }
       }
        return current;
    }
}
