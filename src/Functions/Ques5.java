package Functions;

import java.util.Scanner;

public class Ques5 {
    public static  int oddsum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;


            }
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        System.out.println("Sum of odd numbers from 1 to "+n+" is : "+oddsum(n));
    }
}
