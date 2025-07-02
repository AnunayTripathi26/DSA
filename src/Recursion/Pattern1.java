package Recursion;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        Pattern2(row,0);
    }

    static void Pattern(int row, int col) {
        if(row==0){
            return;
        }
        if(row>col){
            System.out.print("* ");
            Pattern(row,col+1);
        }

        else{
            System.out.println();
            Pattern(row-1,0);
        }

    }
    static void Pattern2(int row,int col){
        if(row==0){
            return;
        }
        if(row>col){

            Pattern2(row,col+1);
            System.out.print("* ");
        }

        else{

            Pattern2(row-1,0);
            System.out.println();
        }
    }
}


