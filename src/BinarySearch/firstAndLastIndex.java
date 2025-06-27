package BinarySearch;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

public class firstAndLastIndex {
        public static void main(String args[]) {
            int[] arr={5,7,7,7,7,8,8,10};
//            Scanner sc=new Scanner(System.in);
//            System.out.print("Enter the number of whose starting and ending index you want to find: ");
            int target=11;
            System.out.println(searchRange(arr,target));

        }
        public static int[] searchRange(int []nums, int target) {
            int[] ans = {-1,-1};
            int start = searchIndex(nums,target,true);
            int end=searchIndex(nums,target,false);
            ans[0]=start;
            ans[1]=end;
            return ans;
        }

             static int searchIndex(int []nums,int target,boolean firstIndex){
                 int ans=-1;
                int start=0;
                int end=nums.length-1;
                while(start<=end){
                    int mid=start+(end-start)/2;
                    if(target==nums[mid]){
                       ans=mid;
                       if(firstIndex) {
                           end = mid - 1;
                       }
                       else{
                           start=mid+1;
                       }
                        
                    }

                    else if(target>nums[mid]){
                        start=mid+1;

                    }
                    else{
                        end=mid-1;
                    }
                }
                return ans;
            }


}
