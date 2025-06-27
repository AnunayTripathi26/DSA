package Functions;

import java.util.Scanner;

public class Ques7 {
    public static double Circumference(double r){
        return (2*3.14*r);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        double r=sc.nextDouble();
        System.out.println("Circumference of the circle is : "+Circumference(r));

    }
}
