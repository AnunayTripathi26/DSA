package Recursion;

import java.util.Scanner;

public class Practice1 {
    public static void calcSum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        calcSum(i+1,n,sum);

    }
    public static void main(String args[]){
        int sum=0;
        int i=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        calcSum(i,n,sum);

    }
}
