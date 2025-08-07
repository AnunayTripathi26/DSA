package Arrays;

public class LC58 {
    public static void main(String[] args) {
        String s="Java@123 456 ";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        int i=s.length()-1;
        int count=0;
        if(s.length()==0){
            return 0;
        }
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            count++;
            i--;
        }
        return count;

    }
}
