package Functions;

import java.util.Scanner;

public class Ques10 {
    public static int calculate(int a,int b){
        int power=1;
        for (int i=1;i<=b;i++){
            power=power*a;
        }
        return power;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x=sc.nextInt();
        System.out.print("Enter the power : ");
        int n=sc.nextInt();
        System.out.println(calculate(x,n));
    }
}
