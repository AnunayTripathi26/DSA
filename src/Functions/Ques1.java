package Functions;

//function to add two numbers and return the sum


import java.util.Scanner;

public class Ques1 {
    public static int Calcsum(int a , int b){
        int sum=a+b;
        return sum;


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Sum of two numbers is : "+ Calcsum(a,b));



    }
}
