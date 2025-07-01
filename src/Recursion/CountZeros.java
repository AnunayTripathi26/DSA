/**
 * Recursively counts the number of zero digits in a number.
 *
 * Example:
 * Input: 1020300
 * Output: 3
 */

package Recursion;

import java.util.Scanner;

public class CountZeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n =sc.nextInt();
        System.out.println(Zeros(n,0));

    }

    static int Zeros(int n, int count) {
        if(n==0){
            return count;
        }
        if(n%10==0){
            return Zeros(n/10,count+1);
        }
        else{
            return Zeros(n/10,count);
        }
    }

}
