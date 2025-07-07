package Recursion;
// Variation of maze problem where movement is allowed in three directions:
// right, down, and diagonally (bottom-right).
// Uses recursive calls to explore all possible paths from start to destination.
// Builds path strings by adding 'R', 'D', or 'X' (for diagonal).

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MazeDiagonalAllowed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        System.out.println(findingPath(row,column,""));
    }

    private static List<String> findingPath(int row, int column, String p) {
        if(row==1&&column==1){
            List<String> result=new ArrayList<>();
            result.add(p);
            return result;
        }
        List<String> ans=new ArrayList<>();
        if(row>1&&column>1){
            ans.addAll(findingPath(row-1,column-1,p+'S'));
        }
        if(row>1){
            ans.addAll(findingPath(row-1,column,p+'D'));
        }
        if(column>1){
            ans.addAll(findingPath(row,column-1,p+'R'));

        }
        return ans;
    }
}
