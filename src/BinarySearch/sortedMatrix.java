package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class sortedMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number of rows");
//        int rows=sc.nextInt();
//        System.out.println("Enter the number of columns");
//        int columns =sc.nextInt();
        int matrix[][]={{2,4,8}
                ,{10,12,16},
                {18,20,22}

        };
//        int matrix[][]=new int[rows][columns];
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<columns;j++){
//                matrix[i][j]=sc.nextInt();
//            }
//        }
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<columns;j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
        System.out.print("Enter the number you want to find : ");
        int target=sc.nextInt();
        System.out.println(Arrays.toString(search(matrix,target)));

    }
    static int[] search(int matrix[][],int target){
        int row=0;
        int column=matrix.length-1;
        while(row<matrix.length && column>=0){
            if(target==matrix[row][column]){
                return new int[]{row,column};
            }
            if(target>matrix[row][column]){
                row++;
            }
            else{
                column--;
            }
        }
        return new int[]{-1,-1};
    }

}
