public class Maze {

    public static void main(String[] args) {
        System.out.println("Count of possible path are: "+ count(3, 3));

        path("", 3, 3);
        System.out.println("");

        pathDia("", 3, 3);

        System.out.println("Count of path with diagonal: "+countWithDia(3, 3));
    }

    public static int count(int row, int col) {
        if(row == 1 || col == 1) {
            return 1;
        }
        int left = count(row-1, col);
        int right = count(row, col-1);
        return left+right;
    }

    // for getting path for answer
    public static void path(String p, int row, int col) {
        if(row==1 && col==1) {
            System.out.println(p);
            return;
        }
        if(row>1) {
            path(p+'D', row-1, col);
        }
        if(col>1) {
            path(p+'R', row, col-1);
        }
    }

    

    //if diagonally allowed
    public static void pathDia(String p, int row, int col) {
        if(row==1 && col==1) {
            System.out.println(p);
            return;
        }
        if(row>1) {
            pathDia(p+'D', row-1, col);
        }
        if(col>1) {
            pathDia(p+'R', row, col-1);
        }
        if(row>1 && col>1) {
            pathDia(p+"'Dia'", row-1, col-1);
        }
    }
    // Count for Path with diagonal
    public static int countWithDia(int row, int col) {
        if(row==1 || col==1) {
            return 1;
        }
        int right = countWithDia(row-1, col);
        int down = countWithDia(row, col-1);
        int diagonal = countWithDia(row-1, col-1);
        return right+down+diagonal;
    }
}
