package Sorting;

import java.util.Arrays;

public class Bubble {

    public static void main(String args[]){
//        int arr[]={8,9,1,3,7,4,6};
//        int arr[]={1,2,3,4,5,6,7,8,9};
        int arr[]={-1,-5,-7,-8};
        boolean isSwapped=false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<=arr.length-1-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    isSwapped=true;
                }

            }
            if (isSwapped==false){
                break;
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
