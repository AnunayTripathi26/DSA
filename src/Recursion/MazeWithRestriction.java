package Recursion;
// Recursive approach to find paths from top-left to bottom-right in a grid.
// Movement allowed only to the right and down.
// Useful for understanding basic backtracking and path-building logic.
// Returns all valid directional strings like "RRDD".

import java.util.ArrayList;
import java.util.List;

public class MazeWithRestriction {
    public static void main(String[] args) {
        boolean [][] maze={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        System.out.println(FindPath(maze,0,0,""));
    }

    static List<String> FindPath(boolean[][] maze, int row, int col,String path) {
        if(row==maze.length-1&&col==maze[0].length-1){
            List<String> result=new ArrayList<>();
            result.add(path);
            return result;
        }
        List<String> ans=new ArrayList<>();
        if(!maze[row][col]){
            return ans;
        }
        if(row<maze.length-1){
            ans.addAll(FindPath(maze,row+1,col,path+'D'));
        }
        if(col<maze[0].length-1){
            ans.addAll(FindPath(maze,row,col+1,path+'R'));
        }
        return ans;
    }
}
