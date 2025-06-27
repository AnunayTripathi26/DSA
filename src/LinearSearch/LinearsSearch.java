package LinearSearch;

import java.util.Scanner;

public class LinearsSearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows of the array :");
        int rows = sc.nextInt();
        System.out.print("Enter the columns of the array :");
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
            System.out.println(linearsearch(arr,rows,columns));
//        System.out.print("Enter the number you want to find :");
//        int num=sc.nextInt();
//        for(int i=0;i<n;i++){
//            if(arr[i]==num){
//                System.out.println("Entered number is at index:"+i);
//                return;
//            }



    }
    public static boolean linearsearch(int [][]arr,int rows,int columns) {
        System.out.print("Enter the number you want to find :");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < rows; i++) {
           for(int j=0;j<columns;j++){
               if(arr[i][j]==num){
                   System.out.println("Element found at index"+i+","+j);
                   return true;
               }
            }

        }
        return false;
    }


}

