package Bitmanipulation;

import java.util.Scanner;
public class GetBit {

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int pos=3;
    int  BitMask=1<<pos;
    if(((BitMask & n)==0)){
            System.out.println("Bit was 0");
        }
        else{
            System.out.println("Bit was 1");
        }
    }
}