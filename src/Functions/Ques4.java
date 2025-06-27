package Functions;

import java.util.Scanner;

public class Ques4 {
    public static int calcAverage(int a,int b,int c){
        int Average=(a+b+c)/3;
        return Average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Enter third number");
        int c=sc.nextInt();
        System.out.println("Average of the three numbers entered is :" + calcAverage(a,b,c) );



    }
}
