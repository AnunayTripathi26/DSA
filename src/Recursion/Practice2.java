package Recursion;

import java.util.Scanner;

public class Practice2 {
    public static void calcfact(int i,int n,int fact){
        if(i==n){
            fact=fact*i;
            System.out.println(fact);
            return;
        }
        fact=fact*i;
        calcfact(i+1,n,fact);

    }
    public static void main(String args[]){
        int fact=1;
        int i=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        calcfact(i,n,fact);

    }
}
