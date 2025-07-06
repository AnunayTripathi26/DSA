package Recursion;

public class Permutation {
    public static void main(String[] args) {
        String s="abc";
        permutation(s,"");
    }

    static void permutation(String og, String New) {
        if(og.isEmpty()){
            System.out.println(New);
            return ;
        }
        char ch=og.charAt(0);
        for(int i=0;i<=New.length();i++){
            String f=New.substring(0,i);
            String s=New.substring(i,New.length());
            permutation(og.substring(1),f+ch+s);
        }

    }
}
