import java.util.*;
public class SearchPosInArray 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Size of rows: ");
        int row= sc.nextInt();
        System.out.println("Enter Size of Column: ");
        int col= sc.nextInt();
        System.out.println("Enter Elements: ");
        int[][]  num=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                num[i][j]=sc.nextInt();
            }
        } 
        System.out.println("Original Array is:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter element whose position you want find: "); 
        int x=sc.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(num[i][j]==x)
                { 
                    System.out.println("Row is "+i+" Column is "+j);
                }
            }
            
        }
    }
}
