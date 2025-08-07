package Arrays;

public class LC125 {
    public static void main(String[] args) {
        //String s = "A man, a plan, a canal: Panama";
        String s="";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String New = s.toLowerCase().replaceAll("[^a-zA-z0-9]", "");
        int start = 0;
        int end = New.length()- 1;
        while (start <= end) {
            if (New.charAt(start) == New.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }


        }
        return true;

    }
}
