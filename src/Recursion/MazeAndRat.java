package Recursion;
// Solved GFG's Rat in a Maze - 1 using recursion and backtracking.
// The rat starts from (0, 0) and needs to reach (n-1, n-1).
// It can move in all four directions: up, down, left, and right.
// Uses a visited matrix to prevent cycles and revisiting cells.
// Returns all valid paths in **lexicographical order** as per GFG requirement.

import java.util.ArrayList;

public class MazeAndRat {
    public static void main(String[] args) {
        int maze[][] = {
                {1,1,0,0,1},
                {1,1,1,1,0},
                {1,1,1,0,1},
                {0,0,1,0,0},
                {1,1,1,1,1}
        };
        System.out.println(ratInMaze(maze));
    }

    static ArrayList<String> ratInMaze(int[][] maze) {
        int n=maze.length;
        boolean[][] visited=new boolean[n][n];
        return Rat(maze, 0, 0, "",visited);

    }

    private static ArrayList<String> Rat(int[][] maze, int r, int c, String way,boolean[][] visited) {
        ArrayList<String> Path=new ArrayList<>();
        if(r<0||c<0||r>maze.length-1||c>maze[0].length-1||visited[r][c]){
            return Path;
        }
        if(maze[r][c]==0){
            return Path;
        }
        if(r==maze.length-1&&c==maze[0].length-1){
            Path.add(way);
            return Path;
        }
        visited[r][c]=true;
        if(r<maze.length-1){
            Path.addAll(Rat(maze,r+1,c,way+'D',visited));
        }
        if(c<maze[0].length-1){
            Path.addAll(Rat(maze,r,c+1,way+'R',visited));
        }
        if(r>0){
            Path.addAll(Rat(maze,r-1,c,way+'U',visited));
        }
        if(c>0){
            Path.addAll(Rat(maze,r,c-1,way+'L',visited));
        }
        visited[r][c]=false;
        return Path;
    }
}
