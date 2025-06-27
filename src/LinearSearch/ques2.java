package LinearSearch;

import java.util.Scanner;

public class ques2 {
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
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts) {
        int max=0;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;


    }
}

