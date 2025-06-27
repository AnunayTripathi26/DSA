package Patterns;

public class Fibonacci2 {
    //    public static void main(String args[]){
////        int a=0;
////        int b=1;
////        System.out.println("Enter the value of n :");
////        Scanner sc=new Scanner(System.in);
////        int n=sc.nextInt();                              fibonacci series
////        System.out.print(a+" ");
////        System.out.print(b+" ");
////        for(int i=2;i<=n;i++){
////            int c=a+b;
////            System.out.print(c+" ");
////            a=b;
////            b=c;
////
////        }
//    }
//    public static void main(String args[]) {
//        System.out.println("Enter any 5 digit number");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int i = 1;
//        int reverseno;
//        while (i <= 5) {                            reverse a number
//            reverseno=n%10;
//            n=n/10;
//            System.out.print(reverseno);
//            i++;
//        }
//
//    }
//

//
    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter a 3 digit number : ");
//        int n =sc.nextInt();
        for(int i=100;i<1000;i++){
            armstrong(i);
        }

    }

    public static void armstrong(int n) {
        int a=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            int cube=rem*rem*rem;
            sum+=cube;
        }
        if(sum==a){
            System.out.print(a+",");
        }

    }
}