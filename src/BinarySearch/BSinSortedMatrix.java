package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BSinSortedMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int arr[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(search(arr,target)));

    }
    static int [] binarySearch(int [][]arr,int row,int cstart,int cEnd,int target){
        while(cstart<=cEnd){
            int mid=cstart+(cEnd-cstart)/2;
            if(arr[row][mid]==target){
                return new int[]{row,mid};
            }
            else if(arr[row][mid]>target){
                cEnd=mid-1;
            }
            else{
                cstart=mid+1;
            }
        }
        return new int[]{-1,-1};
    }

    static int [] search(int arr[][],int target){
        int rows=arr.length;
        int col=arr[0].length;
        if(rows==1){
            return binarySearch(arr,rows,0,col-1,target);
        }
        int rowStart=0;
        int rowEnd=arr.length-1;
        int Cmid=col/2;
        while(rowStart<(rowEnd-1)){
            int mid=rowStart+(rowEnd-rowStart)/2;
            if(arr[mid][Cmid]==target){
                return new int[]{mid,Cmid};
            }
            else if(arr[mid][Cmid]>target){
                rowEnd=mid;

            }
            else{
                rowStart=mid;
            }
        }
        if(arr[rowStart][Cmid]<=target && target<=arr[rowStart][col-1]){
            return binarySearch(arr,rowStart,Cmid+1,arr.length-1,target);
        }
        else if(arr[rowStart][Cmid]>target){
            return binarySearch(arr,rowStart,0,Cmid-1,target);
        }
        else if(arr[rowEnd][Cmid]<=target && arr[rowEnd][col-1]>=target ){
            return binarySearch(arr,rowEnd,Cmid+1,arr.length-1,target);
        }
        else{
            return binarySearch(arr,rowEnd,0,Cmid-1,target);
        }


    }
}
