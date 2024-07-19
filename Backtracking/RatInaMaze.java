package Backtracking;

public class RatInaMaze {
    static void ratInaMaze(int maze[][],int row,int column,String str){
        if(row == maze.length || column == maze.length)
        return ;
        if(row == maze.length-1 && column== maze.length-1)
        System.out.println(str);
       

        //condition to tackle 
        if(maze[row][column]==0)
        return;
        //down
        ratInaMaze(maze, row+1, column, str+"D");
        //right 
        ratInaMaze(maze, row, column+1, str+"R");
    }
    public static void main(String[] args) {
        int maze [][] = {
            {1,0,0,0},{1,1,0,1},{0,1,0,0},{1,1,1,1}
        };
        ratInaMaze(maze, 0, 0, "");
    }
}
