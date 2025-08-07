package Arrays;

import java.util.Arrays;

public class LC88Optimized {
    public static void main(String[] args) {
//        int[] arr1={1,2,3,0,0,0};
//        int[] arr2={2,5,6};
        int[] arr1={0};
        int[] arr2={1};
//        int[] arr1={4,0,0,0,0,0};
//        int[]arr2={1,2,3,5,6};
        int n=arr2.length;
        int m=arr1.length-n;
//        int m=0;
//        int n=1;
        merge(arr1,m,arr2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int p1=m-1;
        int p2=n-1;
        int p=m+n-1;
        while(p1!=-1 && p2!=-1){
            if(nums1[p1]>=nums2[p2]){
                nums1[p]=nums1[p1];
                p1--;
                p--;
            }
            else{
                nums1[p]=nums2[p2];
                p2--;
                p--;
            }
        }
        if(p2>=0){
            for(int i=0;i<=p2;i++){
                nums1[i]=nums2[i];
            }
        }
        System.out.println(Arrays.toString(nums1));

    }
}
