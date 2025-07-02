package Recursion;

import java.util.Scanner;

public class CountSteps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(numberOfSteps(n));
    }
    static int numberOfSteps(int n){
        return Count(n,0);
    }
    static int Count(int n,int count){
        if(n==0){
            return count;
        }
        if(n%2!=0){

            return Count(n-1,count+1);
        }

        else {
            return Count(n/2,count+1);
        }
    }
}
