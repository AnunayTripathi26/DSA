package Strings;

import java.util.Scanner;
//Reversing a string
public class Program3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String sen = sc.next();
        String result="";
        for(int i=sen.length()-1;i>=0;i--){
            result+=sen.charAt(i);


        }
        System.out.println(result);
    }
}
