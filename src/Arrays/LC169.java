package Arrays;

public class LC169{
    public static void main(String[] args) {
        //int arr[]={3,2,3};
        int arr[]={1};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        int i=0;
        return findmajority(nums,i);


    }
    public static int findmajority(int[] nums,int i){
        int start=1;
        int count=1;
        while(start< nums.length){
            if(nums[i]==nums[start]){
                start++;
                count++;
            }
            else{
                start++;
            }
        }
        int j=i;
        if(count<=nums.length/2){
            while(j< nums.length-1){
                if(nums[j]!=nums[j+1]){
                    i=j+1;
                    break;
                }
                else{
                    j++;
                }
            }
            return findmajority(nums,i);
        }
        else{
            return nums[i];
        }

    }
}
