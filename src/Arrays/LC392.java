package Arrays;

public class LC392 {
    public static void main(String[] args) {
        String s="abc";
        String t = "";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        //boolean result=false;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
//                result=true;
                j++;
                i++;
            }
            else{
//                result=false;
                j++;
            }

        }
        if(i==s.length()){
            return true;
        }
        return false;

    }
}
