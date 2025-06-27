package Functions;

import java.util.Scanner;

public class Ques2 {
    public static int  calcPro(int a , int b){
        return a*b;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number");
        int a =sc.nextInt();
        System.out.println("Enter second number");
        int b =sc.nextInt();
        System.out.println("Product of two numbers is :"+ calcPro(a,b));
    }
}
