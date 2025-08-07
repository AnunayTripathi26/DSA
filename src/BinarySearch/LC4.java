package BinarySearch;

public class LC4 {
    public static void main(String[] args) {
//        int arr1[]={7,12,14,15};
//        int arr2[]={1,2,3,4,9,11};
        int [] arr1={1,2};
        int [] arr2={3,4};

        int m=arr1.length;
        int n=arr2.length;
        System.out.println(findMedianSortedArrays(arr1,arr2));

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            int [] temp=nums1;
            nums1=nums2;
            nums2=temp;

        }
        int m=nums1.length;
        int n=nums2.length;
        int left=(m+n+1)/2;
        return BSforMedian(nums1,nums2,left,m,n);

    }

    public static double BSforMedian(int[] arr1, int[] arr2, int left,int m,int n) {
        double median;
        int l1,l2,r1,r2;
        int start=0;
        int end=arr1.length;
        while(start<=end){
            int mid1=start+(end-start)/2;
            int mid2=left-mid1;
            if(mid1>0){
                l1=arr1[mid1-1];
            }
            else{
                l1=Integer.MIN_VALUE;
            }
            if(mid2>0){
                l2=arr2[mid2-1];
            }
            else{
                l2=Integer.MIN_VALUE;
            }
            if(mid1<arr1.length){
                r1=arr1[mid1];
            }
            else{
                r1=Integer.MAX_VALUE;
            }
            if(mid2<arr2.length){
                r2=arr2[mid2];
            }
            else{
                r2=Integer.MAX_VALUE;
            }

            if(l1<=r2&&l2<=r1){
                if((m+n)%2==0){
                    median=((Math.max(l1,l2))+(Math.min(r1,r2)))/2.0;
                    return median;
                }
                else{
                    median=Math.max(l1,l2);
                    return median;
                }

            }
            if(l1>r2){
                end=mid1-1;
            }
            if(l2>r1){
                start=mid1+1;
            }
        }
        return 0.0;
    }
}
