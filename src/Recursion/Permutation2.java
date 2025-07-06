package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation2 {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(permutation2(s,""));
    }

    private static ArrayList<String> permutation2(String og, String New) {
        if(og.isEmpty()){
            ArrayList<String> result=new ArrayList<>();
            result.add(New);
            return result;

        }
        char ch=og.charAt(0);
        ArrayList<String> processed=new ArrayList<>();
        for(int i=0;i<=New.length();i++){
            String f=New.substring(0,i);
            String s=New.substring(i,New.length());
            processed.addAll(permutation2(og.substring(1),f+ch+s));
        }
        return processed;
    }
}
