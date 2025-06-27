package BinarySearch;

public class DuplicateElementsRA {
    public static void main(String[] args) {
//        int []arr= {4,5,6,7,8,9,0,1,2,3};
        int[] arr = {2,2,2,9, 2, 2, 2};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a target:");
//        int target = sc.nextInt();
        System.out.println(duplicateValueFindPivot(arr));
    }

    public static int search(int[] arr, int target) {

        int pivot = duplicateValueFindPivot(arr);
        if (pivot == -1) {
            return Binarysearch(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] == target) {
            return pivot;
        }
        if (arr[0] <= target) {
            return Binarysearch(arr, target, 0, pivot - 1);
        } else {
            return Binarysearch(arr, target, pivot + 1, arr.length - 1);
        }

    }

    public static int Binarysearch(int arr[], int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    //    public static int findPivot(int arr[]){
//        int start=0;
//        int end=arr.length-1;
//        while(start<=end){
//            int mid=start+(end-start)/2;
//            if(mid<end && arr[mid]>arr[mid+1]){
//                return mid;
//            }
//            if(mid>start && arr[mid-1]>arr[mid]){
//                return mid-1;                            //int []arr= {4,5,6,7,0,1,2,3};
//            }
//            if(arr[start]<=arr[mid]){
//                start=mid+1;
//            }
//            else{
//                end=mid;
//            }
//        }
//        return -1;
//    }
//
    public static int duplicateValueFindPivot(int arr[]) {           //Find pivot or peak element for rotated array with duplicate values
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid - 1] > arr[mid]) {
                return mid - 1;                            //int []arr= {4,5,6,7,0,1,2,3};
            }
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                if (arr[start] > arr[start + 1]) {
                    return start + 1;
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end++;


            } else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[end] < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }


        }
        return -1;


    }
}