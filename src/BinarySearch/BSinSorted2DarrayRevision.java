package BinarySearch;

import java.util.*;

public class BSinSorted2DarrayRevision {
    public static void main(String args[]){
        int [][]arr={
                {2,5,9,10},
                {11,21,51,101},
                {121,151,501,1021},
                {2002,2051,2101,2151}
        };
        Scanner sc = new Scanner(System.in);
        int target=sc.nextInt();
        System.out.println(Arrays.toString(Searching(arr,target)));
    }
    static int[] BSsortedMatrix(int [][]arr,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(arr[row][mid]==target){
                return new int[]{row,mid};
            }
            else if(arr[row][mid]<target){
                cStart=mid+1;
            }
            else{
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};

    }

    static int[] Searching(int[][] arr, int target) {
        int rows=arr.length;
        int column=arr[0].length;
        if(rows==1){
            return BSsortedMatrix(arr,rows,0,column-1,target);
        }
        int rowStart=0;
        int cMid=column/2;
        int rowEnd=arr.length-1;
        while(rowStart<rowEnd-1){
            int mid=rowStart+(rowEnd-rowStart)/2;
            if(arr[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            else if(arr[mid][cMid]<target){
                rowStart=mid;
            }
            else{
                rowEnd=mid;
            }
        }
        if(arr[rowStart][cMid]<=target && target<=arr[rowStart][0]){
            return BSsortedMatrix(arr,rowStart,cMid,column-1,target);
        }
        else if(arr[rowStart][cMid]>target && target>=arr[rowStart][0]){
            return BSsortedMatrix(arr,rowStart,0,cMid-1,target);
        }
        else if(arr[rowEnd][cMid]<=target && arr[rowEnd][column-1]>=target){
            return BSsortedMatrix(arr,rowEnd,cMid,column-1,target);
        }
        else{
            return BSsortedMatrix(arr,rowEnd,0,cMid-1,target);
        }



    }
}
