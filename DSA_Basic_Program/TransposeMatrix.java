import java.util.*;
public class TransposeMatrix
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of row: ");
        int row =sc.nextInt();
        System.out.println("enter size of column: ");
        int col=sc.nextInt();
        System.out.println("Enter elements of matrix: ");
        int[][] mat =new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix is: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix is: ");
        for(int j=0;j<row;j++)
        {
            for(int i=0;i<col;i++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
