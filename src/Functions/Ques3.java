package Functions;

import java.util.Scanner;

//Factorial of a number
public class Ques3 {
    public static int calcFactorial(int a) {
        int factorial = 1;
        for (int i = a; i >= 1; i--) {

            factorial = factorial * i;

        }
        return factorial;
    }
        public static void main (String [] args ){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number to calculate factorial");
            int a = sc.nextInt();
            System.out.println("Factorial the number entered is :"+calcFactorial(a));;

        }

}
