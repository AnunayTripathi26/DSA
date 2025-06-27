package Bitmanipulation;

import java.util.Scanner;
public class ClearBit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=2;
        int BitMask=1<<pos;
        BitMask=~(BitMask);
        int newNumber=BitMask&n;
        System.out.println(newNumber);
    }
}
