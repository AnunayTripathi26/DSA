package Functions;

import java.util.Scanner;

public class Ques9 {
    public static void printnumbers(int n) {
        int numbers = 0;
        for (int i = 1; i <= n; i++) {
            Scanner sc = new Scanner(System.in);
            numbers = sc.nextInt();
            System.out.println(numbers);


        }
        countpositive(numbers);
    }
    public static void countpositive(int n){
        int count=0;
        if(n<=1){
            count+=1;
            System.out.println(count);
        }



    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter how many numbers you want to enter");
        int limit=sc.nextInt();
        printnumbers(limit);
    }
}
