package Arrays;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter "+i+" number");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter number you want to find : ");
        int n = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (numbers[i] == n) {
                System.out.println("number is found at index : "+i);
            }

        }

    }
}
