package LinkedList;

public class LC202 {
    public static void main(String[] args) {
        int n=19;
        System.out.println(isHappy(n));

    }
    public static boolean isHappy(int n) {
        int fast=n;
        int slow=n;
        do{
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        }while(fast!=slow);
        if(fast==1){
            return true;
        }
        return false;


    }
    public static int  findSquare(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem*rem;
            n=n/10;
        }
        return sum;

    }
}
