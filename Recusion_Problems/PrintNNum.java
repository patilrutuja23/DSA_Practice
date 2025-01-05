import java.util.*;
public class PrintNNum 
{
    public static void printNum(int n)
    {
        if(n>0)
        {
            System.out.println(n);
            printNum(n-1);
        }
    }    
    
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        System.out.println("Numbers are: ");
        printNum(n);
    }
}
