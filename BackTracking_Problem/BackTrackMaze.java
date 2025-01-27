
import java.util.Arrays;

public class BackTrackMaze {

    public static void main(String[] args) {
        boolean[][] board = {{true,  true,  false, true},
                        {true,  true,  true,  true},
                        {false, true,  true, true},
                        {true,  true,  true,  true}};
    
        path("", board, 0,0);

        int[][] path = new int[board.length][board[0].length];
        pathDraw("", board, 0, 0, path, 1);
    }

    public static void path(String p, boolean[][] maze, int row, int col) {
        if(row == maze.length-1 && col == maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if(maze[row][col] == false) {
            return;
        }
        maze[row][col] = false;

        if(row < maze.length-1) {
            path(p+'D', maze, row+1, col);
        }
        if(col < maze[0].length-1) {
            path(p+'R', maze, row, col+1);
        }
        if(row < 0) {
            path(p+'U', maze, row-1, col);
        }
        if(col < 0) {
            path(p+'L', maze, row, col-1);
        }

        maze[row][col] = true;
             
   }


//    for printing in matrix form

    public static void pathDraw(String p, boolean[][] maze, int row, int col, int path[][], int step) {
        if(row == maze.length-1 && col == maze[0].length-1) {
            path[row][col] = step;
            for(int[] arr: path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("Path: " + p);
            System.out.println("");
            return;
        }
        if(maze[row][col] == false) {
            return;
        }
        maze[row][col] = false;
        path[row][col] = step;

        if(row < maze.length-1) {
            pathDraw(p+'D', maze, row+1, col, path, step+1);
        }
        if(col < maze[0].length-1) {
            pathDraw(p+'R', maze, row, col+1, path, step+1);
        }
        if(row < 0) {
            pathDraw(p+'U', maze, row-1, col, path, step+1);
        }
        if(col < 0) {
            pathDraw(p+'L', maze, row, col-1, path, step+1);
        }

        maze[row][col] = true;
        path[row][col] = 0;
    }
    
  
}
