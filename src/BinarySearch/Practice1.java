package BinarySearch;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        int new_number=0;
        while(number>0){
            int rem= number%10;
            new_number= (new_number*10) + rem;
            number=number/10;
        }
        System.out.println(new_number);

    }
}
