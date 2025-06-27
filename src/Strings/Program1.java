package Strings;
import java.util.*;

public class Program1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        String array[]=new String[size];
        int length=0;
        for(int i=0;i<size;i++){
            array[i]=sc.next();
        }
        for(int i=0;i<size;i++){
            length=length+array[i].length();
        }
        System.out.println(length);
    }
}
