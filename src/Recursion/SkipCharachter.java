package Recursion;

public class SkipCharachter {
    public static void main(String[] args) {
        String orig="baccad";
        String newOne="";
        skipping(orig,newOne);
    }

    static void skipping(String orig, String newOne) {
        if(orig.isEmpty()){
            System.out.println(newOne);
            return;
        }
        char ch=orig.charAt(0);
        if(ch=='a'){
            skipping(orig.substring(1),newOne);
        }
        else{
            skipping(orig.substring(1),newOne+ch);
        }

//        while(i<=orig.length()){
//            if (orig.charAt(i) == 'a') {
//                i++;
//            }
//            else{
//                newOne=newOne+orig.charAt(i);
//                i++;
//            }
//        }

    }
}
