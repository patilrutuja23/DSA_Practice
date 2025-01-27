
import javax.print.DocFlavor;

public class MazeWithObstacal {
    public static void main(String[] args) {
        boolean[][] board = {{true,true,true},
                        {true,true,true},
                        {false,true,true}};
        path("", board, 0, 0);

        System.out.println("");
        alldir("", board,  0, 0);
    }

    public static void path(String p, boolean[][] maze, int row, int col) {
        if(row == maze.length-1 && col == maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if(maze[row][col] == false) {
            return;
        }
        if(row < maze.length-1) {
            path(p+'D', maze, row+1, col);
        }
        if(col < maze[0].length-1) {
            path(p+'R', maze, row, col+1);
        }
    }

    // if all diecction are allowed 
    public static void alldir(String p, boolean[][] maze, int row, int col) {
        if(row == maze.length-1 && col == maze[0].length-1) {
            System.out.println(p);
            return;
        }
        if(maze[row][col] == false) {
            return;
        }
        if(row < maze.length-1) {
            alldir(p+'D', maze, row+1, col);
        }
        if(col < maze[0].length-1) {
            alldir(p+'R', maze, row, col+1);
        }
        if(row < maze.length-1 && col < maze[0].length-1) {
            alldir(p+"'Dia'", maze, row+1, col+1);
        }
        // if(col > 0) {
        //     alldir(p+'L', maze, row, "col-1");
        // }
    }
}
