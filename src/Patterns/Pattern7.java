package Patterns;

import java.util.Scanner;
public class Pattern7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);              //Floyd's Triangle
        int n=sc.nextInt();
        int number=1;
        int i,j,k;
        for (i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(number+" ");
                number+=1;
            }
            System.out.println();
        }
    }

}

