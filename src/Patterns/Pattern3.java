package Patterns;

import java.util.Scanner;

class Pattern3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i;
        int j;
        for(i=n;i>=1;i--){
            for(j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
