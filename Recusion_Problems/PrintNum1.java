import java.util.*;
public class PrintNum1 
{
    public static void printNum(int n)
    {
        if(n>0)
        {
            printNum(n-1);
            System.out.println(n);
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