package Recursion;

import java.nio.file.Path;
import java.util.Scanner;

public class MazeProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(PathCounter(r,c));
        PathFinder("", r, c);
    }

     static int PathCounter(int r, int c) {
        if(r==1||c==1){
            return 1;
        }
        int down=PathCounter(r-1,c);
        int right=PathCounter(r,c-1);
        return down+right;
    }
    static void PathFinder(String p,int r, int c){
        if(r==0||c==0){
            System.out.println("Invalid Maze");
            return;
        }
        if(r==1&&c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            PathFinder(p+'D',r-1,c);
        }
        if(c>1){
            PathFinder(p+'R',r,c-1);
        }

    }
}
