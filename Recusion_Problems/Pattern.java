public class Pattern {
    public static void main(String[] arg) {
        triangle1(4, 0);
        triangle2(4, 0);
    }

    public static void triangle1(int row, int col) {
        if(row == 0) {
            return;
        }
        if(row > col) {
            System.out.print("* ");
            triangle1(row, col+1);
        }
        else {
            System.out.println();
            triangle1(row-1, 0);
        }
    }

    public static void triangle2(int row, int col) {
        if(row == 0) {
            return;
        }
        if(row > col) {
            
            triangle2(row, col+1);
            System.out.print("* ");
        }
        else {
            
            triangle2(row-1, 0);
            System.out.println();
        }
    }
}

