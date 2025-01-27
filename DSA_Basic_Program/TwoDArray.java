import java.util.*;
public class TwoDArray 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size row elements: ");
        int row=sc.nextInt();
        System.out.println("Enter size column elements: ");
        int col=sc.nextInt();
        int[][] num = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                num[i][j]=sc.nextInt();
            }
        }
        System.out.println("2D Array is: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(num[i][j]+" ");;
            }
            System.out.println();
        }
    }
}
