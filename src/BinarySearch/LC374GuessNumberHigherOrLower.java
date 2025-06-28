package BinarySearch;

import java.util.Scanner;

public class LC374GuessNumberHigherOrLower {
    static Scanner sc=new Scanner(System.in);
    static int target=sc.nextInt();
    public static void main(String args[]){
        int n=sc.nextInt();
        System.out.println(guessNumber(n));
    }
    static int guess(int guess){
        if(target==guess){
            return 0;
        }
        else if(guess>target){
            return -1;
        }
        else{
            return 1;
        }
    }

    static int guessNumber(int n) {
        int start=0;
        int end=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(guess(mid)==0){
                return mid;
            }
            else if(guess(mid)==-1){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return -1;
    }
}
