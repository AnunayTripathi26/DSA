package Functions;

import java.util.Scanner;

public class Ques8 {
    public static String adult(int a){
        if(a>=18){
            return "Eligible to vote";
        }
        else{
            return "Not eligible to vote";
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age : ");
        int a=sc.nextInt();
        System.out.println(adult(a));
    }
}
