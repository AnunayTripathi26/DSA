package Patterns;
//https://leetcode.com/problems/palindrome-number/submissions/1456393454/

public class Palindrome {
    public static void main(String[] args) {
        int n=121;
        System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome(int x) {
        int newNumber=0;
        int ogNumber=x;
        while(x>0){

            newNumber=(x%10)+(newNumber*10);
            x=x/10;
        }
        if(x<0){
            return false;
        }
        if(newNumber==ogNumber){
            return true;
        }
        return false;


    }
}
