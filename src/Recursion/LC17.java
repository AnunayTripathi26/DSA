package Recursion;

import java.util.ArrayList;
import java.util.List;

public class LC17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations(""));

    }
    static List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return new ArrayList<>();
        }
        return phonepad(digits,"");

    }

    static List<String> phonepad(String og, String New) {

        if(og.isEmpty()){
            List<String> result=new ArrayList<>();
            result.add(New);
            return result;
        }
        int digit=og.charAt(0)-'0';
        List<String> list=new ArrayList<>();
        if(digit<=6){
            for(int i=(digit-2)*3;i<((digit+1)-2)*3;i++){
                char ch= (char)('a'+i);
                list.addAll((phonepad(og.substring(1),New+ch)));

            }
        }
        else if(digit==7){
            for(int i=(digit-2)*3;i<((((digit+1)-2)*3)+1);i++){
                char ch= (char)('a'+i);
                list.addAll((phonepad(og.substring(1),New+ch)));
            }

        }
        else if(digit==8){
            for(int i=(digit-2)*3+1;i<=(((digit+1)-2)*3);i++){
                char ch= (char)('a'+i);
                list.addAll((phonepad(og.substring(1),New+ch)));
            }
        }
        else{
            for(int i=(digit-2)*3+1;i<=25;i++){
                char ch=(char) ('a'+i);
                list.addAll((phonepad(og.substring(1),New+ch)));
            }

        }
        return list;


    }
}
