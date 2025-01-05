import java.util.*;
public class FibonacciSeries 
{
    public static void fibonacci(int n1,int n2,int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n1);
        fibonacci(n2, n1+n2, n-1);
    }
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number: ");
        int n=sc.nextInt();
        System.out.println("fibonacci Series is: ");
        fibonacci(0, 1, n);
        
    }
}

