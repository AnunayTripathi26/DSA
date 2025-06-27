package Functions;

import java.util.Scanner;

public class Ques11 {
    public static int CalculateGCM(int a, int b) {

        int gcm = 0;
        if (a > b) {
            for (int i = 2; i <= a; i++) {
                if (b % i == 0) {
                    if (a % i == 0) {
                        gcm = i;
                    }
                }
            }
        }
        else{
                for (int i = 2; i <= b; i++) {
                    if (a % i == 0) {
                        if (b % i == 0) {
                            gcm = i;
                        }
                    }
                }
            }
            return gcm;
        }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number : ");
            int a = sc.nextInt();
            System.out.print("Enter the second number : ");
            int b = sc.nextInt();
            System.out.println("HCF of " + a + " and " + b + " is " + CalculateGCM(a, b));
        }

}
