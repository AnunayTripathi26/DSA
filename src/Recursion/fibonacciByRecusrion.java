package Recursion;
/**
 * Recursively computes the nth Fibonacci number.
 *
 * Time Complexity: O(2^n) — due to overlapping subproblems
 * Space Complexity: O(n) — due to recursive call stack
 *
 * Sample Input:
 * 5
 *
 * Sample Output:
 * 5
 *
 * Explanation: Fibonacci sequence = 0, 1, 1, 2, 3, 5...
 * fibonacci(5) returns 5 (0-based indexing)
 */

import java.util.Scanner;

public class fibonacciByRecusrion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int index=sc.nextInt();
        System.out.print(fibonacci(index));
    }

     static int fibonacci(int n) {
         /**
          * Returns the nth Fibonacci number using recursion.
          * @param n Index in the Fibonacci sequence
          * @return nth Fibonacci number
          */

         if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
