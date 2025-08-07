package Arrays;

import java.util.Arrays;

public class LC88 {
    public static void main(String[] args) {
//        int[] arr1={1,2,3,0,0,0};
//        int[] arr2={2,5,6};
        int[] arr1={0};
        int[]arr2={1};
//        int n=arr2.length;
//        int m=arr1.length-n;
        int m=0;
        int n=1;
        merge(arr1,m,arr2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0) {
            System.out.println(Arrays.toString(nums1));
            return;
        }
        if(m==0){
            for(int i=0;i<n;i++){
                nums1[i]=nums2[i];
            }
            System.out.println(Arrays.toString(nums1));
            return;
        }
        int i=0;
        int j=0;
        while(i<m){
            if(nums1[i]<=nums2[j]){
                i++;
            }
            else{
                int temp=nums1[i];
                nums1[i]=nums2[j];
                nums2[j]=temp;
                i++;
                j++;
            }
        }
        int k=m;
        for(int l=0;l<n;l++){
            nums1[k]=nums2[l];
            k++;
            if(k==m+n){
                break;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
