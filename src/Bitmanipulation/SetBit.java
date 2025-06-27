package Bitmanipulation;

import java.util.Scanner;

public class SetBit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=1;
        int Bitmask=1<<pos;
        int newNumber=Bitmask|n;
        System.out.println(newNumber);
    }
}
