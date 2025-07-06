package Recursion;

import java.util.ArrayList;
import java.util.List;

public class FindAllSubsets {
    public static void main(String[] args) {
        String og="abc";
        System.out.println(Subsets(og,""));
    }

//    static void subsets(String og,String New) {
//        if(og.isEmpty()){
//            System.out.println(New);
//            return;
//        }
//        char ch=og.charAt(0);
//        subsets(og.substring(1),New+ch);
//        subsets(og.substring(1),New);
//
//
//    }
    static ArrayList<String> Subsets(String og, String New){
        if(og.isEmpty()){
            ArrayList<String> Main= new ArrayList<>();
            Main.add(New);
            return Main;
        }
        char ch=og.charAt(0);
        ArrayList<String> left=Subsets(og.substring(1),New+ch);
        ArrayList<String> right=Subsets(og.substring(1),New);

        left.addAll(right);
        return left;



    }


//     static void subsets(String og, String newone, int i) {
//        if(i==og.length()){
//            System.out.print(newone+" ");
//            return;
//        }
//        char ch=og.charAt(i);
//         subsets(og,newone+ch,i+1);
//         subsets(og,newone,i+1);
//    }


}
