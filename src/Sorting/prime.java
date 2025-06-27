package Sorting;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        boolean answer=isPrime(number);
        System.out.println(answer);
    }

     static boolean isPrime(int n) {
        int fact=2;
        int count=0;
        while(fact<=n){
            if(n%fact==0){
                count++;
            }
            fact++;
        }
        if (count>2){
            return false;
        }
        return true;
    }
}
